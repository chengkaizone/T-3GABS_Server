DROP DATABASE IF EXISTS t_3gabs_10;
CREATE DATABASE t_3gabs_10 CHARACTER SET = GBK;
USE t_3gabs_10;



#ʡ�ݱ�1
DROP TABLE IF EXISTS province;
CREATE TABLE province(
        province_id int PRIMARY KEY AUTO_INCREMENT,               #ʡ�ݱ��
        province_name varchar(20) NOT NULL UNIQUE,                     #ʡ������
        province_simple_name varchar(10) NOT NULL UNIQUE ,       #ʡ�ݼ��
        province_spell_name  varchar(20)   NOT NULL                         #ʡ��ƴ��
);

#���б�2
DROP TABLE IF EXISTS city;
CREATE TABLE city(
        city_id int PRIMARY KEY AUTO_INCREMENT,            #���б��
        city_name varchar(20) NOT NULL UNIQUE,	           #��������
        province_id int NOT NULL REFERENCES province(province_id) ON DELETE RESTRICT,     #����ʡ��
        city_spell_name varchar(20) NOT NULL         #����ƴ��
);

#Ӫҵ�����3
DROP TABLE IF EXISTS branch;
CREATE TABLE branch(
        branch_id int PRIMARY KEY AUTO_INCREMENT,            #������
        branch_name   varchar(200) NOT NULL UNIQUE,              #��������
        province_id int NOT NULL REFERENCES province(province_id) ON DELETE RESTRICT, #��������ʡ�ݱ��
        city_id int NOT NULL REFERENCES city(city_id) ON DELETE RESTRICT,  #�������ڳ��б��
        branch_telephone1 varchar(20),  #����绰1
	branch_telephone2 varchar(20),  #����绰2
        branch_fax varchar(20),   #���㴫�� 
        branch_address varchar(200),   #�����ַ
        branch_type char(1) NOT NULL,  #�������� : 'A','B','C'
        branch_state char(1) NOT NULL DEFAULT 'O' # ����״̬ : 'O':open ; 'C' : close; 'S' :suspend 
) TYPE=InnoDB;

#������4
DROP TABLE IF EXISTS airport;
CREATE TABLE airport(
        airport_id int PRIMARY KEY AUTO_INCREMENT,  #�������
        airport_name  varchar(20) ,  #�������ƣ��׶�����
        province_id int REFERENCES province(province_id) ON DELETE RESTRICT, #��������ʡ��
        city_id int REFERENCES city(city_id) ON DELETE RESTRICT, #������������
        airport_full_name varchar(20) NOT NULL, #����ȫ��������-�׶�����
        airport_code char(3) NOT NULL UNIQUE,  #��������(������)
        departure_routes_num int DEFAULT 0 , #������������
        arrival_routes_num int DEFAULT 0,  #���ﺽ������
        airport_grand char(2),  #�����ȼ��� '4E','4D',...
        departure_flight_num_per_week int DEFAULT 0,  #ÿ����ۺ�����
        arrival_flight_num_per_week int  DEFAULT 0  #ÿ�ܵ��ۺ�����
);

#���߱�5
DROP TABLE IF EXISTS route;
CREATE TABLE route(
        route_id int PRIMARY KEY AUTO_INCREMENT, #���߱��
        from_airport_id int REFERENCES airport(airport_id) ON DELETE RESTRICT, #���߳�������
        to_airport_id int REFERENCES airport(airport_id) ON DELETE RESTRICT, #���ߵ������
        route_distance int NOT NULL, #���߾���
        route_base_price double NOT NULL,  #���߻�׼�۸�=���߾���*0.75
        return_route_id int ,  #���̺��߱��
        flight_num_per_week int,  #�ú���ÿ�ܺ�����
        UNIQUE (from_airport_id, to_airport_id)
) ;


#�û���6
DROP TABLE IF EXISTS user;
CREATE TABLE user(
        user_id int PRIMARY KEY AUTO_INCREMENT,    #�û����
        user_login_name  varchar(20) NOT NULL UNIQUE, #�û���¼��
        user_password char(32) ,  #�û�����MD5��
        user_name  varchar(20) NOT NULL,  #�û���ʵ����
        user_state char(1) NOT NULL DEFAULT 'D',  #�û�״̬ : 'E':enable ; 'D':disable;
        user_passenger_type char(1), #�û��˿����ͣ� ��A��������  ��C������ͯ  ��I����Ӥ��
        user_telephone varchar(20), #�û��绰
	user_certif_type varchar(20), #�û�֤������
	user_certif_num varchar(40), #�û�֤������
        user_email varchar(100), #�û�����
        user_creation_date datetime NOT NULL,  #�û�����ʱ��
        user_last_login_time datetime NOT NULL,  #�û����һ�ε�¼ʱ��
        user_total_login_times int NOT NULL,  #�û��ܹ���¼����
        user_total_login_seconds int NOT NULL,  #�û��ܹ���¼ʱ������λ���룩
        ref_psgs_id varchar(200) , #�û������˿ͱ�ż���:'1002,1015,1027'
	ref_contacts_id varchar(200),  #�û�������ϵ�˱�ż��ϡ�1001��1002��1003��
	user_subscriptions_id varchar(200),  #�û����ö������ͱ�š�1001��1002��1003��
        ref_memb_id int REFERENCES membership(memb_id) ON DELETE SET NULL  #�û�������Ա���
) TYPE=InnoDB;


#��Ա��7
DROP TABLE IF EXISTS membership;
CREATE TABLE membership(
        memb_id int PRIMARY KEY AUTO_INCREMENT,  #��Ա���
        memb_card_num  varchar(20) NOT NULL,  #��Ա����
        memb_password char(32),   # ��Ա����
        memb_lastname_ch varchar(20) NOT NULL, #��Ա��(����)
        memb_firstname_ch varchar(20) NOT NULL, #��Ա��(����)
        memb_lastname_sp varchar(20) NOT NULL, #��Ա��(ƴ��)
        memb_firstname_sp varchar(20) NOT NULL, #��Ա��(ƴ��)
        memb_gender char(1) ,  #��Ա�Ա�:'M','F'
        memb_birthday date , # ��Ա����
        memb_certif_type varchar(20) NOT NULL,  #��Ա֤������
        memb_certif_num varchar(40) NOT NULL, # ��Ա֤������
        memb_telephone1 varchar(20), #��Ա�ƶ��绰
        memb_telephone2 varchar(20), #��Ա�̶��绰
        memb_address varchar(100) NOT NULL,  #��Ա��ַ
        memb_post_code varchar(20), #��Ա�ʱ�
        memb_reg_date date NOT NULL, #��Աע������
        memb_email varchar(100) NOT NULL,  #��Ա����
        memb_rank varchar(10) ,  #��Ա�ȼ�:'��ʯ��Ա','�𿨻�Ա','������Ա','�տ���Ա'
        memb_account_stage int,  #��Ա�ܺ���
        memb_account_mileage int,  # ��Ա�����
        memb_available_mileage int,  # ��Ա�������
        memb_available_stage   int  #��Ա���ú���
) TYPE=InnoDB;


#�˿ͱ�8
DROP TABLE IF EXISTS passenger;
CREATE TABLE passenger(
        psg_id int PRIMARY KEY AUTO_INCREMENT, #�˿ͱ��
        psg_name  varchar(20) NOT NULL,  #�˿�����
        psg_certif_type varchar(20) NOT NULL,  #�˿�֤������
        psg_certif_num varchar(40) NOT NULL,  #�˿�֤������
	psg_type char(1) NOT NULL,  #�˿����ͣ� ��A��������  ��C������ͯ  ��I����Ӥ��
        ref_memb_id int REFERENCES membership(memb_id) ON DELETE SET NULL, #������Ա���
        ref_user_id int REFERENCES user(user_id) ON DELETE CASCADE	# �����û����

) TYPE=InnoDB;

#��ϵ�˱�9
DROP TABLE IF EXISTS contact;
CREATE TABLE contact(
	cont_id int PRIMARY KEY AUTO_INCREMENT,  #��ϵ�˱��
	cont_name varchar(20) NOT NULL,      #��ϵ������
	cont_telephone varchar(20) NOT NULL,  #��ϵ�˵绰
	ref_user_id int REFERENCES user(user_id) ON DELETE CASCADE  # �����û����
) TYPE=InnoDB;


#��λ�ȼ���10
DROP TABLE IF EXISTS cabin_class;
CREATE TABLE cabin_class(
        cabin_class_id int PRIMARY KEY AUTO_INCREMENT, #��λ�ȼ����
        cabin_class_name varchar(40) NOT NULL UNIQUE, #��λ�ȼ�����
        cabin_class_char char(1) NOT NULL UNIQUE, #��λ�ȼ��ַ���'Y',X',B','F','C',......
        refund_charge double NOT NULL, #��Ʊ�����ѹ涨
        limit_condition char(3) NOT NULL,  # ������������TGZ�� �������ˣ��ɸ��ڣ���ǩת
        cabin_discount double NOT NULL , #��λ�ۿ�
        plane_cabin_type char(1) NOT NULL, #�ɻ���λ���ͣ�'F','C','Y'
        mileage_factor double NOT NULL #��̻���ϵ��
) ;

#�ɻ���11
DROP TABLE IF EXISTS plane;
CREATE TABLE plane(
        plane_id int PRIMARY KEY AUTO_INCREMENT, #�ɻ���ţ�ҵ���޹�Ψһ��ţ�
        plane_num varchar(10) NOT NULL UNIQUE,  #�ɻ������ţ��й���Ψһ��ţ�
        plane_model varchar(40) NOT NULL, #�ɻ�����
        plane_manufacturer varchar(40), #�ɻ����쳧��
        max_continue_voyage int ,#����������
        f_cabin_seats int NOT NULL, #ͷ�Ȳ���λ��
        c_cabin_seats int NOT NULL, #�������λ��
        y_cabin_seats int NOT NULL, #���ò���λ��
        seats_img_uri varchar(200) #��λ����ͼƬλ��
) ;

#����ƻ���12
DROP TABLE IF EXISTS flight_plan;
CREATE TABLE flight_plan(
        fp_id int PRIMARY KEY AUTO_INCREMENT, #����ƻ����
        flight_num varchar(10) NOT NULL UNIQUE, #������:TL1202
        fp_start_date date NOT NULL, #����ƻ���ʼ����
        fp_end_date date NOT NULL, #����ƻ���������
        route_id int REFERENCES route(route_id) ON DELETE RESTRICT, #ִ�к��߱��
        fp_departure_time varchar(10) NOT NULL,  #���ʱ��:'23:10'
        fp_arrival_time varchar(10)  NOT NULL ,   #����ʱ��:'N01:25' (N������һ��)
        fp_scheduler int NOT NULL DEFAULT 127,  #�������
        fp_base_price double NOT NULL  #�����׼Ʊ��, �ں��߻�׼Ʊ�ۻ���������25%������
) TYPE=InnoDB;


#�����13
DROP TABLE IF EXISTS flight;
CREATE TABLE flight(
        flight_id varchar(20) PRIMARY KEY ,   #������ 'N201008251202' '����-��-��-��-�����'
        flight_num varchar(10) NOT NULL,   #����� 'TL1202'
        fl_departure_date datetime NOT NULL,   #�������ʱ��
        fl_arrival_date datetime NOT NULL,    #���ൽ��ʱ��
        route_id int REFERENCES route(route_id) ON DELETE RESTRICT,  #ִ�к��߱��
        plane_id int REFERENCES plane(plane_id) ON DELETE RESTRICT, #ִ�зɻ����
        f_seats_remain int  NOT NULL,    #ͷ�Ȳ�ʣ����λ��
        b_seats_remain int NOT NULL,    #�����ʣ����λ
        e_seats_remain int NOT NULL,   #���ò�ʣ����λ
        current_classes varchar(60) NOT NULL , #��ǰ��ѡ��λ����:'F,Y,B,C,Q,U'
        full_price  double NOT NULL,    #���ò�ȫ��
	current_discount double NOT NULL ,  #��ǰ��Ͳ�λ�ۿ�
        current_price double NOT NULL,  #��ǰ��ͼ۸�
        tax1_price double NOT NULL,      #����˰
        tax2_price double NOT NULL ,   #ȼ��˰
        current_order int NOT NULL DEFAULT 0   #��ǰ��Ʊ����
) TYPE=InnoDB;



#��Ա���ϸ�ڱ� 14
DROP TABLE IF EXISTS mileage_detail;
CREATE TABLE mileage_detail(
        mileage_id BIGINT PRIMARY KEY ,  #��̱�� ������
        memb_id int NOT NULL REFERENCES membership(memb_id) ON DELETE CASCADE,    #��Ա���_id
        mileage_type  varchar(20) NOT NULL ,#������ͣ�'�������','�������','�������','�������','����������'
        mileage_describe varchar(100) ,#���������'TL1202 �������׶�������-�Ϻ������Ż�����Y �ա�,'�ɹ�Ԥ�� ��������������� ��׼�󴲷�2��'
        stage_date date,  #�������
        account_mileage int NOT NULL #�ۻ�����
) TYPE=InnoDB;



#��Ʊ���� 15
DROP TABLE IF EXISTS ticket_order;
CREATE TABLE ticket_order(
        order_id BIGINT PRIMARY KEY , #������� ������
        user_id int  REFERENCES user(user_id) ON DELETE SET NULL, #�û����
        order_money double NOT NULL , #�������
        order_date datetime NOT NULL,#Ԥ������
        order_state char(1), #����״̬ ���ȴ�֧����E��������ȡ����C��������ʧЧ��D����������֧����P����
        payment_record varchar(200), #֧����¼�����ÿ�֧�� ����
 	flight_id varchar(20) NOT NULL ,  #������
        passenger_id int NOT NULL REFERENCES passenger(passenger_id) ON DELETE RESTRICT ,  #�˿ͱ��
        contact_id int NOT NULL REFERENCES contact(cont_id) ON DELETE RESTRICT ,  #��ϵ�˱��
	cabin_class_id int NOT NULL REFERENCES cabin_class(cabin_class_id) ON DELETE RESTRICT , #��λ���
        seats_order int NOT NULL,  #�������
        ticket_price double NOT NULL, #��Ʊ�۸�
        append_tax1 double NOT NULL, #���������
        append_tax2 double NOT NULL #ȼ��˰
) TYPE=InnoDB;


#��Ʊ�� 16
DROP TABLE IF EXISTS ticket;
CREATE TABLE ticket(
        ticket_id BIGINT PRIMARY KEY,   #��Ʊ��� ������
        flight_num varchar(10) NOT NULL,    #�����
        route_id int NOT NULL REFERENCES route(route_id) ON DELETE RESTRICT,    #���߱��
        departure_datetime datetime NOT NULL,    #���ʱ��
        arrival_datatime  datetime NOT NULL,      #����ʱ��
        psg_name varchar(40) NOT NULL,       #�˿�����
        psg_id_number varchar(40) NOT NULL,     #�˿�֤������
        cabin_class char(1) NOT NULL,         #��λ�ȼ� 'Y'
        ticket_date datetime NOT NULL,        #��Ʊ����ʱ��
        ticket_price double NOT NULL,          #��Ʊ�۸�
        tax1_price  double NOT NULL,           #����˰
        tax2_price  double NOT NULL,           #ȼ��˰
        total_price   double NOT NULL,          #��Ʊ�ܼ۸�
        seats_order int NOT NULL,   #����˳���: 76
        change_state char(1) ,    #��ǩ״̬(��Y�����ɸ�ǩ��N�������ɸ�ǩ)
        refund_ticket_charge double ,   #��Ʊ��������
        restrictions varchar(100) ,    #��������:'���ɸ�ǩ����Ʊ��ȡ30%������'
        agent_info varchar(20) ,     #��������Ϣ
        payment_type varchar(20) ,   #֧������:'���ÿ�֧��','�ֽ�֧��','�绰֧��','����ת��'
        payment_ref  varchar(200),      #֧����¼
        business_record_id  BIGINT ,  #Ӫҵ��¼
        terminal_type varchar(20) ,   #�ն����ͱ��: 'COU123' ��Ա123; 'WEB001' web 001������, 'AGE123' ������123, 'CAC104'��������104
        terminal_ip varchar(20)      #�ն�IP
) TYPE=InnoDB;
     
#Ӫҵ��¼��17
DROP TABLE IF EXISTS business_record;
CREATE TABLE business_record(
        bus_rec_id BIGINT PRIMARY KEY,  #Ӫҵ��¼��� ����
        bus_rec_type varchar(10) NOT NULL,   #Ӫҵ��¼���� :'��Ʊ','��Ʊ','��ǩ',......
        bus_rec_date datetime NOT NULL,   #Ӫҵ����ʱ��
        bus_rec_money double NOT NULL,     #Ӫҵ���:����Ϊ���룬����Ϊ֧��
        ref_user int REFERENCES user(id) ON DELETE RESTRICT,   # �����û�
        ref_ticket_id BIGINT,    #������Ʊ���
        rec_state int NOT NULL,       #��¼����״̬: 0:δ����; 1:һ���ѽ���; 2:�����ѽ���; 3:�����ѽ���
        terminal_type varchar(20) ,   #�ն�����
        terminal_ip varchar(20)        #�ն�IP
) TYPE=InnoDB;


#�������ͱ�18
DROP TABLE IF EXISTS subscription;
CREATE TABLE subscription(
	sub_id int PRIMARY KEY AUTO_INCREMENT,  #�������ͱ��
	sub_name varchar(20) UNIQUE NOT NULL  #������������
);




      