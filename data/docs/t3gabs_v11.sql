DROP DATABASE IF EXISTS t_3gabs_10;
CREATE DATABASE t_3gabs_10 CHARACTER SET = GBK;
USE t_3gabs_10;



#省份表1
DROP TABLE IF EXISTS province;
CREATE TABLE province(
        province_id int PRIMARY KEY AUTO_INCREMENT,               #省份编号
        province_name varchar(20) NOT NULL UNIQUE,                     #省份名称
        province_simple_name varchar(10) NOT NULL UNIQUE ,       #省份简称
        province_spell_name  varchar(20)   NOT NULL                         #省份拼音
);

#城市表2
DROP TABLE IF EXISTS city;
CREATE TABLE city(
        city_id int PRIMARY KEY AUTO_INCREMENT,            #城市编号
        city_name varchar(20) NOT NULL UNIQUE,	           #城市名称
        province_id int NOT NULL REFERENCES province(province_id) ON DELETE RESTRICT,     #所属省份
        city_spell_name varchar(20) NOT NULL         #城市拼音
);

#营业网点表3
DROP TABLE IF EXISTS branch;
CREATE TABLE branch(
        branch_id int PRIMARY KEY AUTO_INCREMENT,            #网点编号
        branch_name   varchar(200) NOT NULL UNIQUE,              #网点名称
        province_id int NOT NULL REFERENCES province(province_id) ON DELETE RESTRICT, #网点所在省份编号
        city_id int NOT NULL REFERENCES city(city_id) ON DELETE RESTRICT,  #网点所在城市编号
        branch_telephone1 varchar(20),  #网点电话1
	branch_telephone2 varchar(20),  #网点电话2
        branch_fax varchar(20),   #网点传真 
        branch_address varchar(200),   #网点地址
        branch_type char(1) NOT NULL,  #网点类型 : 'A','B','C'
        branch_state char(1) NOT NULL DEFAULT 'O' # 网点状态 : 'O':open ; 'C' : close; 'S' :suspend 
) TYPE=InnoDB;

#机场表4
DROP TABLE IF EXISTS airport;
CREATE TABLE airport(
        airport_id int PRIMARY KEY AUTO_INCREMENT,  #机场编号
        airport_name  varchar(20) ,  #机场名称：首都机场
        province_id int REFERENCES province(province_id) ON DELETE RESTRICT, #机场所属省份
        city_id int REFERENCES city(city_id) ON DELETE RESTRICT, #机场所属城市
        airport_full_name varchar(20) NOT NULL, #机场全名：北京-首都机场
        airport_code char(3) NOT NULL UNIQUE,  #机场代码(三字码)
        departure_routes_num int DEFAULT 0 , #出发航线条数
        arrival_routes_num int DEFAULT 0,  #到达航线条数
        airport_grand char(2),  #机场等级： '4E','4D',...
        departure_flight_num_per_week int DEFAULT 0,  #每周离港航班数
        arrival_flight_num_per_week int  DEFAULT 0  #每周到港航班数
);

#航线表5
DROP TABLE IF EXISTS route;
CREATE TABLE route(
        route_id int PRIMARY KEY AUTO_INCREMENT, #航线编号
        from_airport_id int REFERENCES airport(airport_id) ON DELETE RESTRICT, #航线出发机场
        to_airport_id int REFERENCES airport(airport_id) ON DELETE RESTRICT, #航线到达机场
        route_distance int NOT NULL, #航线距离
        route_base_price double NOT NULL,  #航线基准价格=航线距离*0.75
        return_route_id int ,  #返程航线编号
        flight_num_per_week int,  #该航线每周航班数
        UNIQUE (from_airport_id, to_airport_id)
) ;


#用户表6
DROP TABLE IF EXISTS user;
CREATE TABLE user(
        user_id int PRIMARY KEY AUTO_INCREMENT,    #用户编号
        user_login_name  varchar(20) NOT NULL UNIQUE, #用户登录名
        user_password char(32) ,  #用户密码MD5码
        user_name  varchar(20) NOT NULL,  #用户真实姓名
        user_state char(1) NOT NULL DEFAULT 'D',  #用户状态 : 'E':enable ; 'D':disable;
        user_passenger_type char(1), #用户乘客类型： ‘A’：成人  ‘C’：儿童  ‘I’：婴儿
        user_telephone varchar(20), #用户电话
	user_certif_type varchar(20), #用户证件类型
	user_certif_num varchar(40), #用户证件号码
        user_email varchar(100), #用户邮箱
        user_creation_date datetime NOT NULL,  #用户创建时间
        user_last_login_time datetime NOT NULL,  #用户最后一次登录时间
        user_total_login_times int NOT NULL,  #用户总共登录次数
        user_total_login_seconds int NOT NULL,  #用户总共登录时长（单位：秒）
        ref_psgs_id varchar(200) , #用户关联乘客编号集合:'1002,1015,1027'
	ref_contacts_id varchar(200),  #用户关联联系人编号集合‘1001，1002，1003’
	user_subscriptions_id varchar(200),  #用户设置订阅类型编号‘1001，1002，1003’
        ref_memb_id int REFERENCES membership(memb_id) ON DELETE SET NULL  #用户关联会员编号
) TYPE=InnoDB;


#会员表7
DROP TABLE IF EXISTS membership;
CREATE TABLE membership(
        memb_id int PRIMARY KEY AUTO_INCREMENT,  #会员编号
        memb_card_num  varchar(20) NOT NULL,  #会员卡号
        memb_password char(32),   # 会员密码
        memb_lastname_ch varchar(20) NOT NULL, #会员姓(中文)
        memb_firstname_ch varchar(20) NOT NULL, #会员名(中文)
        memb_lastname_sp varchar(20) NOT NULL, #会员姓(拼音)
        memb_firstname_sp varchar(20) NOT NULL, #会员名(拼音)
        memb_gender char(1) ,  #会员性别:'M','F'
        memb_birthday date , # 会员生日
        memb_certif_type varchar(20) NOT NULL,  #会员证件类型
        memb_certif_num varchar(40) NOT NULL, # 会员证件号码
        memb_telephone1 varchar(20), #会员移动电话
        memb_telephone2 varchar(20), #会员固定电话
        memb_address varchar(100) NOT NULL,  #会员地址
        memb_post_code varchar(20), #会员邮编
        memb_reg_date date NOT NULL, #会员注册日期
        memb_email varchar(100) NOT NULL,  #会员邮箱
        memb_rank varchar(10) ,  #会员等级:'钻石会员','金卡会员','银卡会员','普卡会员'
        memb_account_stage int,  #会员总航段
        memb_account_mileage int,  # 会员总里程
        memb_available_mileage int,  # 会员可用里程
        memb_available_stage   int  #会员可用航段
) TYPE=InnoDB;


#乘客表8
DROP TABLE IF EXISTS passenger;
CREATE TABLE passenger(
        psg_id int PRIMARY KEY AUTO_INCREMENT, #乘客编号
        psg_name  varchar(20) NOT NULL,  #乘客姓名
        psg_certif_type varchar(20) NOT NULL,  #乘客证件类型
        psg_certif_num varchar(40) NOT NULL,  #乘客证件号码
	psg_type char(1) NOT NULL,  #乘客类型： ‘A’：成人  ‘C’：儿童  ‘I’：婴儿
        ref_memb_id int REFERENCES membership(memb_id) ON DELETE SET NULL, #关联会员编号
        ref_user_id int REFERENCES user(user_id) ON DELETE CASCADE	# 关联用户编号

) TYPE=InnoDB;

#联系人表9
DROP TABLE IF EXISTS contact;
CREATE TABLE contact(
	cont_id int PRIMARY KEY AUTO_INCREMENT,  #联系人编号
	cont_name varchar(20) NOT NULL,      #联系人姓名
	cont_telephone varchar(20) NOT NULL,  #联系人电话
	ref_user_id int REFERENCES user(user_id) ON DELETE CASCADE  # 关联用户编号
) TYPE=InnoDB;


#舱位等级表10
DROP TABLE IF EXISTS cabin_class;
CREATE TABLE cabin_class(
        cabin_class_id int PRIMARY KEY AUTO_INCREMENT, #舱位等级编号
        cabin_class_name varchar(40) NOT NULL UNIQUE, #舱位等级名称
        cabin_class_char char(1) NOT NULL UNIQUE, #舱位等级字符：'Y',X',B','F','C',......
        refund_charge double NOT NULL, #退票手续费规定
        limit_condition char(3) NOT NULL,  # 限制条件：‘TGZ’ 代表：可退，可改期，可签转
        cabin_discount double NOT NULL , #舱位折扣
        plane_cabin_type char(1) NOT NULL, #飞机舱位类型：'F','C','Y'
        mileage_factor double NOT NULL #里程积累系数
) ;

#飞机表11
DROP TABLE IF EXISTS plane;
CREATE TABLE plane(
        plane_id int PRIMARY KEY AUTO_INCREMENT, #飞机编号（业务无关唯一编号）
        plane_num varchar(10) NOT NULL UNIQUE,  #飞机机身编号（中国民航唯一编号）
        plane_model varchar(40) NOT NULL, #飞机机型
        plane_manufacturer varchar(40), #飞机制造厂商
        max_continue_voyage int ,#最大续航里程
        f_cabin_seats int NOT NULL, #头等舱座位数
        c_cabin_seats int NOT NULL, #公务舱座位数
        y_cabin_seats int NOT NULL, #经济舱座位数
        seats_img_uri varchar(200) #座位布局图片位置
) ;

#航班计划表12
DROP TABLE IF EXISTS flight_plan;
CREATE TABLE flight_plan(
        fp_id int PRIMARY KEY AUTO_INCREMENT, #航班计划编号
        flight_num varchar(10) NOT NULL UNIQUE, #航班编号:TL1202
        fp_start_date date NOT NULL, #航班计划开始日期
        fp_end_date date NOT NULL, #航班计划结束日期
        route_id int REFERENCES route(route_id) ON DELETE RESTRICT, #执行航线编号
        fp_departure_time varchar(10) NOT NULL,  #起飞时刻:'23:10'
        fp_arrival_time varchar(10)  NOT NULL ,   #到达时刻:'N01:25' (N代表下一天)
        fp_scheduler int NOT NULL DEFAULT 127,  #航班班期
        fp_base_price double NOT NULL  #航班基准票价, 在航线基准票价基础上上下25%浮动。
) TYPE=InnoDB;


#航班表13
DROP TABLE IF EXISTS flight;
CREATE TABLE flight(
        flight_id varchar(20) PRIMARY KEY ,   #航班编号 'N201008251202' '类型-年-月-日-航班号'
        flight_num varchar(10) NOT NULL,   #航班号 'TL1202'
        fl_departure_date datetime NOT NULL,   #航班起飞时间
        fl_arrival_date datetime NOT NULL,    #航班到达时间
        route_id int REFERENCES route(route_id) ON DELETE RESTRICT,  #执行航线编号
        plane_id int REFERENCES plane(plane_id) ON DELETE RESTRICT, #执行飞机编号
        f_seats_remain int  NOT NULL,    #头等舱剩余座位数
        b_seats_remain int NOT NULL,    #公务舱剩余座位
        e_seats_remain int NOT NULL,   #经济舱剩余座位
        current_classes varchar(60) NOT NULL , #当前可选舱位代码:'F,Y,B,C,Q,U'
        full_price  double NOT NULL,    #经济舱全价
	current_discount double NOT NULL ,  #当前最低舱位折扣
        current_price double NOT NULL,  #当前最低价格
        tax1_price double NOT NULL,      #机场税
        tax2_price double NOT NULL ,   #燃油税
        current_order int NOT NULL DEFAULT 0   #当前出票次序
) TYPE=InnoDB;



#会员里程细节表 14
DROP TABLE IF EXISTS mileage_detail;
CREATE TABLE mileage_detail(
        mileage_id BIGINT PRIMARY KEY ,  #里程编号 毫秒数
        memb_id int NOT NULL REFERENCES membership(memb_id) ON DELETE CASCADE,    #会员编号_id
        mileage_type  varchar(20) NOT NULL ,#里程类型：'航段里程','奖励里程','促销里程','消费里程','合作伙伴里程'
        mileage_describe varchar(100) ,#里程描述：'TL1202 北京（首都机场）-上海（虹桥机场）Y 舱’,'成功预订 三亚香格里拉饭店 标准大床房2晚'
        stage_date date,  #里程日期
        account_mileage int NOT NULL #累积航程
) TYPE=InnoDB;



#机票订单 15
DROP TABLE IF EXISTS ticket_order;
CREATE TABLE ticket_order(
        order_id BIGINT PRIMARY KEY , #订单编号 毫秒数
        user_id int  REFERENCES user(user_id) ON DELETE SET NULL, #用户编号
        order_money double NOT NULL , #订单金额
        order_date datetime NOT NULL,#预订日期
        order_state char(1), #订单状态 ‘等待支付（E）’，‘取消（C）’，‘失效（D）’，‘已支付（P）’
        payment_record varchar(200), #支付记录‘信用卡支付 ：’
 	flight_id varchar(20) NOT NULL ,  #航班编号
        passenger_id int NOT NULL REFERENCES passenger(passenger_id) ON DELETE RESTRICT ,  #乘客编号
        contact_id int NOT NULL REFERENCES contact(cont_id) ON DELETE RESTRICT ,  #联系人编号
	cabin_class_id int NOT NULL REFERENCES cabin_class(cabin_class_id) ON DELETE RESTRICT , #舱位编号
        seats_order int NOT NULL,  #订座序号
        ticket_price double NOT NULL, #机票价格
        append_tax1 double NOT NULL, #机场建设费
        append_tax2 double NOT NULL #燃油税
) TYPE=InnoDB;


#机票表 16
DROP TABLE IF EXISTS ticket;
CREATE TABLE ticket(
        ticket_id BIGINT PRIMARY KEY,   #机票编号 毫秒数
        flight_num varchar(10) NOT NULL,    #航班号
        route_id int NOT NULL REFERENCES route(route_id) ON DELETE RESTRICT,    #航线编号
        departure_datetime datetime NOT NULL,    #起飞时间
        arrival_datatime  datetime NOT NULL,      #到达时间
        psg_name varchar(40) NOT NULL,       #乘客姓名
        psg_id_number varchar(40) NOT NULL,     #乘客证件号码
        cabin_class char(1) NOT NULL,         #舱位等级 'Y'
        ticket_date datetime NOT NULL,        #出票日期时间
        ticket_price double NOT NULL,          #机票价格
        tax1_price  double NOT NULL,           #机场税
        tax2_price  double NOT NULL,           #燃油税
        total_price   double NOT NULL,          #机票总价格
        seats_order int NOT NULL,   #订座顺序号: 76
        change_state char(1) ,    #改签状态(‘Y’：可改签‘N’：不可改签)
        refund_ticket_charge double ,   #退票手续费率
        restrictions varchar(100) ,    #限制条件:'不可改签，退票收取30%手续费'
        agent_info varchar(20) ,     #代理商信息
        payment_type varchar(20) ,   #支付类型:'信用卡支付','现金支付','电话支付','网上转帐'
        payment_ref  varchar(200),      #支付记录
        business_record_id  BIGINT ,  #营业记录
        terminal_type varchar(20) ,   #终端类型编号: 'COU123' 柜员123; 'WEB001' web 001服务器, 'AGE123' 代理商123, 'CAC104'呼叫中心104
        terminal_ip varchar(20)      #终端IP
) TYPE=InnoDB;
     
#营业记录表17
DROP TABLE IF EXISTS business_record;
CREATE TABLE business_record(
        bus_rec_id BIGINT PRIMARY KEY,  #营业记录编号 毫秒
        bus_rec_type varchar(10) NOT NULL,   #营业记录类型 :'购票','退票','改签',......
        bus_rec_date datetime NOT NULL,   #营业发生时间
        bus_rec_money double NOT NULL,     #营业金额:正数为收入，负数为支出
        ref_user int REFERENCES user(id) ON DELETE RESTRICT,   # 关联用户
        ref_ticket_id BIGINT,    #关联机票编号
        rec_state int NOT NULL,       #记录结算状态: 0:未结算; 1:一级已结算; 2:二级已结算; 3:三级已结算
        terminal_type varchar(20) ,   #终端类型
        terminal_ip varchar(20)        #终端IP
) TYPE=InnoDB;


#订阅类型表18
DROP TABLE IF EXISTS subscription;
CREATE TABLE subscription(
	sub_id int PRIMARY KEY AUTO_INCREMENT,  #订阅类型编号
	sub_name varchar(20) UNIQUE NOT NULL  #订阅类型名称
);




      