USE t_3gabs_10;

#插入省份
insert into province(province_name,province_simple_name,province_spell_name) values('北京市','京','beijing');
insert into province(province_name,province_simple_name,province_spell_name) values('上海市','沪','shanghai');
insert into province(province_name,province_simple_name,province_spell_name) values('天津市','津','tianjin');
insert into province(province_name,province_simple_name,province_spell_name) values('重庆市','渝','chongqing');
insert into province(province_name,province_simple_name,province_spell_name) values('河北省','冀','hebei');
insert into province(province_name,province_simple_name,province_spell_name) values('山西省','晋','shanxi');
insert into province(province_name,province_simple_name,province_spell_name) values('辽宁省','辽','liaoning');
insert into province(province_name,province_simple_name,province_spell_name) values('吉林省','吉','jilin');
insert into province(province_name,province_simple_name,province_spell_name) values('黑龙江省','黑','heilongjiang');
insert into province(province_name,province_simple_name,province_spell_name) values('江苏省','苏','jiangsu');
insert into province(province_name,province_simple_name,province_spell_name) values('浙江省','浙','zhejiang');
insert into province(province_name,province_simple_name,province_spell_name) values('安徽省','皖','anhui');
insert into province(province_name,province_simple_name,province_spell_name) values('福建省','闽','fujian');
insert into province(province_name,province_simple_name,province_spell_name) values('江西省','赣','jiangxi');
insert into province(province_name,province_simple_name,province_spell_name) values('山东省','鲁','shandong');
insert into province(province_name,province_simple_name,province_spell_name) values('河南省','豫','henan');
insert into province(province_name,province_simple_name,province_spell_name) values('湖北省','鄂','hubei');
insert into province(province_name,province_simple_name,province_spell_name) values('湖南省','湘','hunan');
insert into province(province_name,province_simple_name,province_spell_name) values('广东省','粤','guangdong');
insert into province(province_name,province_simple_name,province_spell_name) values('内蒙古自治区','蒙','neimeng');
insert into province(province_name,province_simple_name,province_spell_name) values('广西壮族自治区','桂','guangxi');
insert into province(province_name,province_simple_name,province_spell_name) values('海南省','琼','hainan');
insert into province(province_name,province_simple_name,province_spell_name) values('四川省','川','sichuan');
insert into province(province_name,province_simple_name,province_spell_name) values('西藏自治区','藏','xizang');
insert into province(province_name,province_simple_name,province_spell_name) values('云南省','云','yunnan');
insert into province(province_name,province_simple_name,province_spell_name) values('贵州省','贵','guizhou');
insert into province(province_name,province_simple_name,province_spell_name) values('宁夏回族自治区','宁','ningxia');
insert into province(province_name,province_simple_name,province_spell_name) values('新疆维吾尔自治区','新','xinjiang');
insert into province(province_name,province_simple_name,province_spell_name) values('甘肃省','甘','gansu');
insert into province(province_name,province_simple_name,province_spell_name) values('青海省','青','qinghai');
insert into province(province_name,province_simple_name,province_spell_name) values('陕西省','陕','shanxi');
insert into province(province_name,province_simple_name,province_spell_name) values('台湾省','台','taiwan');
insert into province(province_name,province_simple_name,province_spell_name) values('香港特别行政区','港','xianggang');
insert into province(province_name,province_simple_name,province_spell_name) values('澳门特别行政区','澳','aomen');

#插入城市
insert into city(city_name,province_id,city_spell_name) values('北京',1,'beijing');
insert into city(city_name,province_id,city_spell_name) values('上海',2,'shanghai');
insert into city(city_name,province_id,city_spell_name) values('重庆',4,'chongqing');
insert into city(city_name,province_id,city_spell_name) values('天津',3,'tianjin');
insert into city(city_name,province_id,city_spell_name) values('石家庄',5,'shijiazhuang');
insert into city(city_name,province_id,city_spell_name) values('秦皇岛',5,'qinhuangdao');
insert into city(city_name,province_id,city_spell_name) values('太原',6,'taiyuan');
insert into city(city_name,province_id,city_spell_name) values('长治',6,'chagnzhi');
insert into city(city_name,province_id,city_spell_name) values('运城',6,'yuncheng');
insert into city(city_name,province_id,city_spell_name) values('呼和浩特',20,'huhehaote');
insert into city(city_name,province_id,city_spell_name) values('包头',20,'baotou');
insert into city(city_name,province_id,city_spell_name) values('海拉尔',20,'hailaer');
insert into city(city_name,province_id,city_spell_name) values('锡林浩特',20,'xilinhaote');
insert into city(city_name,province_id,city_spell_name) values('长春',8,'changchun');
insert into city(city_name,province_id,city_spell_name) values('吉林',8,'jilin');
insert into city(city_name,province_id,city_spell_name) values('延吉',8,'yanji');
insert into city(city_name,province_id,city_spell_name) values('沈阳',7,'shenyang');
insert into city(city_name,province_id,city_spell_name) values('大连',7,'dalian');
insert into city(city_name,province_id,city_spell_name) values('丹东',7,'dandong');
insert into city(city_name,province_id,city_spell_name) values('锦州',7,'jinzhou');
insert into city(city_name,province_id,city_spell_name) values('朝阳',7,'chaoyang');
insert into city(city_name,province_id,city_spell_name) values('哈尔滨',9,'haerbin');
insert into city(city_name,province_id,city_spell_name) values('齐齐哈尔',9,'qiqihaer');
insert into city(city_name,province_id,city_spell_name) values('佳木斯',9,'jiamusi');
insert into city(city_name,province_id,city_spell_name) values('牡丹江',9,'mudanjiang');
insert into city(city_name,province_id,city_spell_name) values('郑州',16,'zhengzhou');
insert into city(city_name,province_id,city_spell_name) values('洛阳',16,'luoyang');
insert into city(city_name,province_id,city_spell_name) values('南阳',16,'nanyang');
insert into city(city_name,province_id,city_spell_name) values('杭州',11,'hangzhou');
insert into city(city_name,province_id,city_spell_name) values('宁波',11,'ningbo');
insert into city(city_name,province_id,city_spell_name) values('温州',11,'wenzhou');
insert into city(city_name,province_id,city_spell_name) values('黄岩',11,'huangyan');
insert into city(city_name,province_id,city_spell_name) values('义乌',11,'yiwu');
insert into city(city_name,province_id,city_spell_name) values('衢州',11,'quzhou');
insert into city(city_name,province_id,city_spell_name) values('舟山',11,'zhoushan');
insert into city(city_name,province_id,city_spell_name) values('合肥',12,'hefei');
insert into city(city_name,province_id,city_spell_name) values('黄山',12,'huangshan');
insert into city(city_name,province_id,city_spell_name) values('安庆',12,'anqing');
insert into city(city_name,province_id,city_spell_name) values('福州',13,'fuzhou');
insert into city(city_name,province_id,city_spell_name) values('厦门',13,'xiamen');
insert into city(city_name,province_id,city_spell_name) values('晋江',13,'jinjiang');
insert into city(city_name,province_id,city_spell_name) values('武夷山',13,'wuyishan');
insert into city(city_name,province_id,city_spell_name) values('南昌',14,'nanchang');
insert into city(city_name,province_id,city_spell_name) values('九江',14,'jiujiang');
insert into city(city_name,province_id,city_spell_name) values('赣州',14,'ganzhou');
insert into city(city_name,province_id,city_spell_name) values('景德镇',14,'jingdezhen');
insert into city(city_name,province_id,city_spell_name) values('广州',19,'guangzhou');
insert into city(city_name,province_id,city_spell_name) values('深圳',19,'shenzhen');
insert into city(city_name,province_id,city_spell_name) values('湛江',19,'zhanjiang');
insert into city(city_name,province_id,city_spell_name) values('珠海',19,'zhuhai');
insert into city(city_name,province_id,city_spell_name) values('汕头',19,'shantou');
insert into city(city_name,province_id,city_spell_name) values('梅县',19,'meixian');
insert into city(city_name,province_id,city_spell_name) values('长沙',18,'changsha');
insert into city(city_name,province_id,city_spell_name) values('常德',18,'changde');
insert into city(city_name,province_id,city_spell_name) values('张家界',18,'zhangjiajie');
insert into city(city_name,province_id,city_spell_name) values('衡阳',18,'hengyang');
insert into city(city_name,province_id,city_spell_name) values('银川',27,'yinchuan');
insert into city(city_name,province_id,city_spell_name) values('济南',15,'jinan');
insert into city(city_name,province_id,city_spell_name) values('青岛',15,'qingdao');
insert into city(city_name,province_id,city_spell_name) values('烟台',15,'yantai');
insert into city(city_name,province_id,city_spell_name) values('潍坊',15,'weifang');
insert into city(city_name,province_id,city_spell_name) values('威海',15,'weihai');
insert into city(city_name,province_id,city_spell_name) values('临沂',15,'linyi');
insert into city(city_name,province_id,city_spell_name) values('济宁',15,'jining');
insert into city(city_name,province_id,city_spell_name) values('昆明',25,'kunming');
insert into city(city_name,province_id,city_spell_name) values('景洪',25,'jinghong');
insert into city(city_name,province_id,city_spell_name) values('丽江',25,'lijiang');
insert into city(city_name,province_id,city_spell_name) values('大理',25,'dali');
insert into city(city_name,province_id,city_spell_name) values('芒市',25,'mangshi');
insert into city(city_name,province_id,city_spell_name) values('中甸',25,'zhongdian');
insert into city(city_name,province_id,city_spell_name) values('保山',25,'baoshan');
insert into city(city_name,province_id,city_spell_name) values('拉萨',24,'lasa');
insert into city(city_name,province_id,city_spell_name) values('西安',31,'xian');
insert into city(city_name,province_id,city_spell_name) values('汉中',31,'hanzhong');
insert into city(city_name,province_id,city_spell_name) values('延安',31,'yanan');
insert into city(city_name,province_id,city_spell_name) values('乌鲁木齐',28,'wulumuqi');
insert into city(city_name,province_id,city_spell_name) values('伊宁',28,'yining');
insert into city(city_name,province_id,city_spell_name) values('喀什',28,'kashi');
insert into city(city_name,province_id,city_spell_name) values('库尔勒',28,'kuerle');
insert into city(city_name,province_id,city_spell_name) values('阿克苏',28,'akesu');
insert into city(city_name,province_id,city_spell_name) values('阿勒泰',28,'aletai');
insert into city(city_name,province_id,city_spell_name) values('和田',28,'hetian');
insert into city(city_name,province_id,city_spell_name) values('库车',28,'kuche');
insert into city(city_name,province_id,city_spell_name) values('且末',28,'qiemo');
insert into city(city_name,province_id,city_spell_name) values('塔城',28,'tacheng');
insert into city(city_name,province_id,city_spell_name) values('阿尔玛塔',28,'aermata');
insert into city(city_name,province_id,city_spell_name) values('海口',22,'haikou');
insert into city(city_name,province_id,city_spell_name) values('三亚',22,'sanya');
insert into city(city_name,province_id,city_spell_name) values('武汉',17,'wuhan');
insert into city(city_name,province_id,city_spell_name) values('襄樊',17,'xiangfan');
insert into city(city_name,province_id,city_spell_name) values('沙市',17,'shashi');
insert into city(city_name,province_id,city_spell_name) values('宜昌',17,'yichang');
insert into city(city_name,province_id,city_spell_name) values('恩施',17,'enshi');
insert into city(city_name,province_id,city_spell_name) values('贵阳',26,'guiyang');
insert into city(city_name,province_id,city_spell_name) values('铜仁',26,'tongren');
insert into city(city_name,province_id,city_spell_name) values('成都',23,'chengdu');
insert into city(city_name,province_id,city_spell_name) values('万县',23,'wanxian');
insert into city(city_name,province_id,city_spell_name) values('泸州',23,'luzhou');
insert into city(city_name,province_id,city_spell_name) values('宜宾',23,'yibin');
insert into city(city_name,province_id,city_spell_name) values('广元',23,'guangyuan');
insert into city(city_name,province_id,city_spell_name) values('绵阳',23,'jinyang');
insert into city(city_name,province_id,city_spell_name) values('西昌',23,'xichang');
insert into city(city_name,province_id,city_spell_name) values('九寨沟',23,'jiuzhaigou');
insert into city(city_name,province_id,city_spell_name) values('兰州',29,'lanzhou');
insert into city(city_name,province_id,city_spell_name) values('敦煌',29,'dunhuang');
insert into city(city_name,province_id,city_spell_name) values('南宁',21,'nanning');
insert into city(city_name,province_id,city_spell_name) values('桂林',21,'guilin');
insert into city(city_name,province_id,city_spell_name) values('柳州',21,'liuzhou');
insert into city(city_name,province_id,city_spell_name) values('北海',21,'beihai');
insert into city(city_name,province_id,city_spell_name) values('南京',10,'nanjing');
insert into city(city_name,province_id,city_spell_name) values('常州',10,'changzhou');
insert into city(city_name,province_id,city_spell_name) values('徐州',10,'xuzhou');
insert into city(city_name,province_id,city_spell_name) values('连云港',10,'lianyungang');
insert into city(city_name,province_id,city_spell_name) values('南通',10,'nantong');
insert into city(city_name,province_id,city_spell_name) values('盐城',10,'yancheng');
insert into city(city_name,province_id,city_spell_name) values('无锡',10,'wuxi');
insert into city(city_name,province_id,city_spell_name) values('廊坊',5,'langfang');

#插入机场
insert into airport(airport_id,airport_name,province_id,city_id,airport_full_name,airport_code) values(1,'首都',1,1,'北京-首都机场','PEK');
insert into airport(airport_id,airport_name,province_id,city_id,airport_full_name,airport_code) values(2,'虹桥',2,2,'上海-虹桥机场','SHA');
insert into airport(airport_id,airport_name,province_id,city_id,airport_full_name,airport_code) values(3,'浦东',2,2,'上海-浦东机场','PVG');
insert into airport(airport_id,airport_name,province_id,city_id,airport_full_name,airport_code) values(4,'江北',4,3,'重庆-江北机场','CKG');
insert into airport(airport_id,airport_name,province_id,city_id,airport_full_name,airport_code) values(5,'滨海',3,4,'天津-滨海机场','TSN');
insert into airport(airport_id,airport_name,province_id,city_id,airport_full_name,airport_code) values(6,'正定',5,5,'石家庄-正定机场','SJW');
insert into airport(airport_id,airport_name,province_id,city_id,airport_full_name,airport_code) values(7,'山海关',5,6,'秦皇岛-山海关机场','SHP');
insert into airport(airport_id,airport_name,province_id,city_id,airport_full_name,airport_code) values(8,'武宿',6,7,'太原-武宿机场','TYN');
insert into airport(airport_id,airport_name,province_id,city_id,airport_full_name,airport_code) values(9,NULL,6,8,'长治-长治机场','CIH');
insert into airport(airport_id,airport_name,province_id,city_id,airport_full_name,airport_code) values(10,NULL,6,9,'运城-运城机场','YCU');
insert into airport(airport_id,airport_name,province_id,city_id,airport_full_name,airport_code) values(11,'白塔',20,10,'呼和浩特-白塔机场','HET');
insert into airport(airport_id,airport_name,province_id,city_id,airport_full_name,airport_code) values(12,'包头',20,11,'包头-包头机场','BAV');
insert into airport(airport_id,airport_name,province_id,city_id,airport_full_name,airport_code) values(13,'东山',20,12,'海拉尔-东山机场','HLD');
insert into airport(airport_id,airport_name,province_id,city_id,airport_full_name,airport_code) values(14,NULL,20,13,'锡林浩特-锡林浩特机场','XIL');
insert into airport(airport_id,airport_name,province_id,city_id,airport_full_name,airport_code) values(15,'大房身',8,14,'长春-大房身机场','CGQ');
insert into airport(airport_id,airport_name,province_id,city_id,airport_full_name,airport_code) values(16,'二台子',8,15,'吉林-二台子机场','JIL');
insert into airport(airport_id,airport_name,province_id,city_id,airport_full_name,airport_code) values(17,NULL,8,16,'延吉-延吉机场','YNJ');
insert into airport(airport_id,airport_name,province_id,city_id,airport_full_name,airport_code) values(18,'桃仙',7,17,'沈阳-桃仙机场','SHE');
insert into airport(airport_id,airport_name,province_id,city_id,airport_full_name,airport_code) values(19,'周水子',7,18,'大连-周水子机场','DLC');
insert into airport(airport_id,airport_name,province_id,city_id,airport_full_name,airport_code) values(20,'浪头',7,19,'丹东-浪头机场','DDG');
insert into airport(airport_id,airport_name,province_id,city_id,airport_full_name,airport_code) values(21,'锦州',7,20,'锦州-锦州机场','JNZ');
insert into airport(airport_id,airport_name,province_id,city_id,airport_full_name,airport_code) values(22,NULL,7,21,'朝阳-朝阳机场','CHG');
insert into airport(airport_id,airport_name,province_id,city_id,airport_full_name,airport_code) values(23,'阎家岗',9,22,'哈尔滨-阎家岗机场','HRB');
insert into airport(airport_id,airport_name,province_id,city_id,airport_full_name,airport_code) values(24,'三家子',9,23,'齐齐哈尔-三家子机场','NDG');
insert into airport(airport_id,airport_name,province_id,city_id,airport_full_name,airport_code) values(25,'东郊',9,24,'佳木斯-东郊机场','JMU');
insert into airport(airport_id,airport_name,province_id,city_id,airport_full_name,airport_code) values(26,'海浪',9,25,'牡丹江-海浪机场','MDG');
insert into airport(airport_id,airport_name,province_id,city_id,airport_full_name,airport_code) values(27,'新郑',16,26,'郑州-新郑机场','CGO');
insert into airport(airport_id,airport_name,province_id,city_id,airport_full_name,airport_code) values(28,'洛阳',16,27,'洛阳-洛阳机场','LYA');
insert into airport(airport_id,airport_name,province_id,city_id,airport_full_name,airport_code) values(29,'姜营',16,28,'南阳-姜营机场','NNY');
insert into airport(airport_id,airport_name,province_id,city_id,airport_full_name,airport_code) values(30,'萧山',11,29,'杭州-萧山机场','HGH');
insert into airport(airport_id,airport_name,province_id,city_id,airport_full_name,airport_code) values(31,'栎社',11,30,'宁波-栎社机场','NGB');
insert into airport(airport_id,airport_name,province_id,city_id,airport_full_name,airport_code) values(32,'永强',11,31,'温州-永强机场','WNZ');
insert into airport(airport_id,airport_name,province_id,city_id,airport_full_name,airport_code) values(33,'路桥',11,32,'黄岩-路桥机场','HYN');
insert into airport(airport_id,airport_name,province_id,city_id,airport_full_name,airport_code) values(34,'义乌',11,33,'义乌-义乌机场','YIW');
insert into airport(airport_id,airport_name,province_id,city_id,airport_full_name,airport_code) values(35,NULL,11,34,'衢州-衢州机场','JUZ');
insert into airport(airport_id,airport_name,province_id,city_id,airport_full_name,airport_code) values(36,'朱家尖',11,35,'舟山-朱家尖机场','HSN');
insert into airport(airport_id,airport_name,province_id,city_id,airport_full_name,airport_code) values(37,'骆岗',12,36,'合肥-骆岗机场','HFE');
insert into airport(airport_id,airport_name,province_id,city_id,airport_full_name,airport_code) values(38,'屯溪',12,37,'黄山-屯溪机场','TXN');
insert into airport(airport_id,airport_name,province_id,city_id,airport_full_name,airport_code) values(39,'大龙山',12,38,'安庆-大龙山机场','AQG');
insert into airport(airport_id,airport_name,province_id,city_id,airport_full_name,airport_code) values(40,'长乐',13,39,'福州-长乐机场','FOC');
insert into airport(airport_id,airport_name,province_id,city_id,airport_full_name,airport_code) values(41,'高崎',13,40,'厦门-高崎机场','XMN');
insert into airport(airport_id,airport_name,province_id,city_id,airport_full_name,airport_code) values(42,'泉州',13,41,'晋江-泉州机场','JJN');
insert into airport(airport_id,airport_name,province_id,city_id,airport_full_name,airport_code) values(43,'武夷山',13,42,'武夷山-武夷山机场','WUS');
insert into airport(airport_id,airport_name,province_id,city_id,airport_full_name,airport_code) values(44,'昌北',14,43,'南昌-昌北机场','KHN');
insert into airport(airport_id,airport_name,province_id,city_id,airport_full_name,airport_code) values(45,'九江',14,44,'九江-九江机场','JIU');
insert into airport(airport_id,airport_name,province_id,city_id,airport_full_name,airport_code) values(46,'黄金',14,45,'赣州-黄金机场','KOW');
insert into airport(airport_id,airport_name,province_id,city_id,airport_full_name,airport_code) values(47,NULL,14,46,'景德镇-景德镇机场','JDZ');
insert into airport(airport_id,airport_name,province_id,city_id,airport_full_name,airport_code) values(48,'白云',19,47,'广州-白云机场','CAN');
insert into airport(airport_id,airport_name,province_id,city_id,airport_full_name,airport_code) values(49,'宝安',19,48,'深圳-宝安机场','SZX');
insert into airport(airport_id,airport_name,province_id,city_id,airport_full_name,airport_code) values(50,'湛江',19,49,'湛江-湛江机场','ZHA');
insert into airport(airport_id,airport_name,province_id,city_id,airport_full_name,airport_code) values(51,'三灶',19,50,'珠海-三灶机场','ZUH');
insert into airport(airport_id,airport_name,province_id,city_id,airport_full_name,airport_code) values(52,'外砂',19,51,'汕头-外砂机场','SWA');
insert into airport(airport_id,airport_name,province_id,city_id,airport_full_name,airport_code) values(53,'梅县',19,52,'梅县-梅县机场','MXZ');
insert into airport(airport_id,airport_name,province_id,city_id,airport_full_name,airport_code) values(54,'黄花',18,53,'长沙-黄花机场','CSX');
insert into airport(airport_id,airport_name,province_id,city_id,airport_full_name,airport_code) values(55,'桃花源',18,54,'常德-桃花源机场','CDG');
insert into airport(airport_id,airport_name,province_id,city_id,airport_full_name,airport_code) values(56,'荷花',18,55,'张家界-荷花机场','DYG');
insert into airport(airport_id,airport_name,province_id,city_id,airport_full_name,airport_code) values(57,NULL,18,56,'衡阳-衡阳机场','HNY');
insert into airport(airport_id,airport_name,province_id,city_id,airport_full_name,airport_code) values(58,'河东',27,57,'银川-河东机场','INC');
insert into airport(airport_id,airport_name,province_id,city_id,airport_full_name,airport_code) values(59,'遥墙',15,58,'济南-遥墙机场','TNA');
insert into airport(airport_id,airport_name,province_id,city_id,airport_full_name,airport_code) values(60,'流亭',15,59,'青岛-流亭机场','TAO');
insert into airport(airport_id,airport_name,province_id,city_id,airport_full_name,airport_code) values(61,'莱沂',15,60,'烟台-莱沂机场','YNT');
insert into airport(airport_id,airport_name,province_id,city_id,airport_full_name,airport_code) values(62,NULL,15,61,'潍坊-潍坊机场','WEF');
insert into airport(airport_id,airport_name,province_id,city_id,airport_full_name,airport_code) values(63,NULL,15,62,'威海-威海机场','WEH');
insert into airport(airport_id,airport_name,province_id,city_id,airport_full_name,airport_code) values(64,'临沂',15,63,'临沂-临沂机场','LYI');
insert into airport(airport_id,airport_name,province_id,city_id,airport_full_name,airport_code) values(65,'济宁',15,64,'济宁-济宁机场','JNG');
insert into airport(airport_id,airport_name,province_id,city_id,airport_full_name,airport_code) values(66,'巫家坝',25,65,'昆明-巫家坝机场','KMG');
insert into airport(airport_id,airport_name,province_id,city_id,airport_full_name,airport_code) values(67,'景洪版纳',25,66,'景洪-景洪版纳机场','JHG');
insert into airport(airport_id,airport_name,province_id,city_id,airport_full_name,airport_code) values(68,'三义',25,67,'丽江-三义机场','LJG');
insert into airport(airport_id,airport_name,province_id,city_id,airport_full_name,airport_code) values(69,'大理',25,68,'大理-大理机场','DLU');
insert into airport(airport_id,airport_name,province_id,city_id,airport_full_name,airport_code) values(70,NULL,25,69,'芒市-芒市机场','LUM');
insert into airport(airport_id,airport_name,province_id,city_id,airport_full_name,airport_code) values(71,'中甸',25,70,'中甸-中甸机场','DIG');
insert into airport(airport_id,airport_name,province_id,city_id,airport_full_name,airport_code) values(72,NULL,25,71,'保山-保山机场','BSD');
insert into airport(airport_id,airport_name,province_id,city_id,airport_full_name,airport_code) values(73,'贡嘎',24,72,'拉萨-贡嘎机场','LXA');
insert into airport(airport_id,airport_name,province_id,city_id,airport_full_name,airport_code) values(74,'咸阳',31,73,'西安-咸阳机场','SIA');
insert into airport(airport_id,airport_name,province_id,city_id,airport_full_name,airport_code) values(75,NULL,31,74,'汉中-汉中机场','HZG');
insert into airport(airport_id,airport_name,province_id,city_id,airport_full_name,airport_code) values(76,NULL,31,75,'延安-延安机场','ENY');
insert into airport(airport_id,airport_name,province_id,city_id,airport_full_name,airport_code) values(77,'地窝堡',28,76,'乌鲁木齐-地窝堡机场','URC');
insert into airport(airport_id,airport_name,province_id,city_id,airport_full_name,airport_code) values(78,'伊宁',28,77,'伊宁-伊宁机场','YIN');
insert into airport(airport_id,airport_name,province_id,city_id,airport_full_name,airport_code) values(79,'喀什',28,78,'喀什-喀什机场','KHG');
insert into airport(airport_id,airport_name,province_id,city_id,airport_full_name,airport_code) values(80,NULL,28,79,'库尔勒-库尔勒机场','KRL');
insert into airport(airport_id,airport_name,province_id,city_id,airport_full_name,airport_code) values(81,'阿克苏',28,80,'阿克苏-阿克苏机场','AKU');
insert into airport(airport_id,airport_name,province_id,city_id,airport_full_name,airport_code) values(82,NULL,28,81,'阿勒泰-阿勒泰机场','AAT');
insert into airport(airport_id,airport_name,province_id,city_id,airport_full_name,airport_code) values(83,'和田',28,82,'和田-和田机场','HTN');
insert into airport(airport_id,airport_name,province_id,city_id,airport_full_name,airport_code) values(84,NULL,28,83,'库车-库车机场','KCA');
insert into airport(airport_id,airport_name,province_id,city_id,airport_full_name,airport_code) values(85,'且末',28,84,'且末-且末机场','IQN');
insert into airport(airport_id,airport_name,province_id,city_id,airport_full_name,airport_code) values(86,NULL,28,85,'塔城-塔城机场','TCG');
insert into airport(airport_id,airport_name,province_id,city_id,airport_full_name,airport_code) values(87,NULL,28,86,'阿尔玛塔-阿尔玛塔机场','ALA');
insert into airport(airport_id,airport_name,province_id,city_id,airport_full_name,airport_code) values(88,'美兰',22,87,'海口-美兰机场','HAK');
insert into airport(airport_id,airport_name,province_id,city_id,airport_full_name,airport_code) values(89,'凤凰',22,88,'三亚-凤凰机场','SYX');
insert into airport(airport_id,airport_name,province_id,city_id,airport_full_name,airport_code) values(90,'天河',17,89,'武汉-天河机场','WUH');
insert into airport(airport_id,airport_name,province_id,city_id,airport_full_name,airport_code) values(91,'刘集',17,90,'襄樊-刘集机场','XFN');
insert into airport(airport_id,airport_name,province_id,city_id,airport_full_name,airport_code) values(92,NULL,17,91,'沙市-沙市机场','SHS');
insert into airport(airport_id,airport_name,province_id,city_id,airport_full_name,airport_code) values(93,'三峡',17,92,'宜昌-三峡机场','YIH');
insert into airport(airport_id,airport_name,province_id,city_id,airport_full_name,airport_code) values(94,NULL,17,93,'恩施-恩施机场','ENH');
insert into airport(airport_id,airport_name,province_id,city_id,airport_full_name,airport_code) values(95,'龙洞堡',26,94,'贵阳-龙洞堡机场','KWE');
insert into airport(airport_id,airport_name,province_id,city_id,airport_full_name,airport_code) values(96,NULL,26,95,'铜仁-铜仁机场','TEN');
insert into airport(airport_id,airport_name,province_id,city_id,airport_full_name,airport_code) values(97,'双流',23,96,'成都-双流机场','CTU');
insert into airport(airport_id,airport_name,province_id,city_id,airport_full_name,airport_code) values(98,'梁平',23,97,'万县-梁平机场','WXN');
insert into airport(airport_id,airport_name,province_id,city_id,airport_full_name,airport_code) values(99,'蓝田',23,98,'泸州-蓝田机场','LZO');
insert into airport(airport_id,airport_name,province_id,city_id,airport_full_name,airport_code) values(100,'莱坝',23,99,'宜宾-莱坝机场','YBP');
insert into airport(airport_id,airport_name,province_id,city_id,airport_full_name,airport_code) values(101,NULL,23,100,'广元-广元机场','GYS');
insert into airport(airport_id,airport_name,province_id,city_id,airport_full_name,airport_code) values(102,NULL,23,101,'绵阳-绵阳机场','MIG');
insert into airport(airport_id,airport_name,province_id,city_id,airport_full_name,airport_code) values(103,'青山',23,102,'西昌-青山机场','XIC');
insert into airport(airport_id,airport_name,province_id,city_id,airport_full_name,airport_code) values(104,'黄龙',23,103,'九寨沟-黄龙机场','JZH');
insert into airport(airport_id,airport_name,province_id,city_id,airport_full_name,airport_code) values(105,'中川',29,104,'兰州-中川机场','LHW');
insert into airport(airport_id,airport_name,province_id,city_id,airport_full_name,airport_code) values(106,NULL,29,105,'敦煌-敦煌机场','DNH');
insert into airport(airport_id,airport_name,province_id,city_id,airport_full_name,airport_code) values(107,'吴墟',21,106,'南宁-吴墟机场','NNG');
insert into airport(airport_id,airport_name,province_id,city_id,airport_full_name,airport_code) values(108,'两江',21,107,'桂林-两江机场','KWL');
insert into airport(airport_id,airport_name,province_id,city_id,airport_full_name,airport_code) values(109,'白莲',21,108,'柳州-白莲机场','LZH');
insert into airport(airport_id,airport_name,province_id,city_id,airport_full_name,airport_code) values(110,'福成',21,109,'北海-福成机场','BHY');
insert into airport(airport_id,airport_name,province_id,city_id,airport_full_name,airport_code) values(111,'禄口',10,110,'南京-禄口机场','NKG');
insert into airport(airport_id,airport_name,province_id,city_id,airport_full_name,airport_code) values(112,'牵牛',10,111,'常州-牵牛机场','CZX');
insert into airport(airport_id,airport_name,province_id,city_id,airport_full_name,airport_code) values(113,'观音',10,112,'徐州-观音机场','XUE');
insert into airport(airport_id,airport_name,province_id,city_id,airport_full_name,airport_code) values(114,'白塔埠',10,113,'连云港-白塔埠机场','LYG');
insert into airport(airport_id,airport_name,province_id,city_id,airport_full_name,airport_code) values(115,'兴东',10,114,'南通-兴东机场','NTG');
insert into airport(airport_id,airport_name,province_id,city_id,airport_full_name,airport_code) values(116,'南洋',10,115,'盐城-南洋机场','YNZ');
insert into airport(airport_id,airport_name,province_id,city_id,airport_full_name,airport_code) values(117,'硕放',10,116,'无锡-硕放机场','WUX');

#插入网点
insert into branch(branch_name,province_id,city_id,branch_telephone1,branch_fax,branch_address,branch_type) values('北海营业部',21,109,'07793053356','0779-3053468 ','广西北海市北部湾西路民航大厦附楼 2 楼 邮编(330006)','C');
insert into branch(branch_name,province_id,city_id,branch_telephone1,branch_fax,branch_address,branch_type) values('北京营业部',1,1,'4008100999',NULL,'北京市西长安街15号西单民航大厦','A');
insert into branch(branch_name,province_id,city_id,branch_telephone1,branch_fax,branch_address,branch_type) values('长春营业部',8,14,'043188966565','0431-88966363 ','长春市解放大路2677号 光大大厦1101室 邮编(130061)','B');
insert into branch(branch_name,province_id,city_id,branch_telephone1,branch_fax,branch_address,branch_type) values('长沙营业部',18,53,'073184498888','0731-84495555 ','长沙市芙蓉中路一段204号锦绣华天一楼 邮编(410008)','B');
insert into branch(branch_name,province_id,city_id,branch_telephone1,branch_fax,branch_address,branch_type) values('成都营业部',23,96,'4008100999',NULL,'成都市武侯区航空路1号国航世纪中心A座 邮编(610041)','B');
insert into branch(branch_name,province_id,city_id,branch_telephone1,branch_fax,branch_address,branch_type) values('重庆营业部',4,3,'4008100999','023-67853531','重庆市江北区建新北路30号 邮编(400020)','A');
insert into branch(branch_name,province_id,city_id,branch_telephone1,branch_fax,branch_address,branch_type) values('大连营业部',7,18,'041184801161','0411-84801164','大连市沙河口区中山路578号国航大厦 邮编(116021)','B');
insert into branch(branch_name,province_id,city_id,branch_telephone1,branch_fax,branch_address,branch_type) values('福州营业部',13,39,'059187604862',' 0591-87604865','福州市鼓楼区金泉路31号 邮编(350001)','B');
insert into branch(branch_name,province_id,city_id,branch_telephone1,branch_fax,branch_address,branch_type) values('广州营业部',19,47,'02083637528','020-83637567','广州市越华路118号军供大厦南座首层 邮编(510030)','A');
insert into branch(branch_name,province_id,city_id,branch_telephone1,branch_fax,branch_address,branch_type) values('桂林营业部',21,107,'07732866567','0773-2812567','桂林市滨江南路大宇大饭店西1楼 邮编(541001)','C');
insert into branch(branch_name,province_id,city_id,branch_telephone1,branch_fax,branch_address,branch_type) values('贵阳营业部',26,94,'08515810092','0851-5872786','贵阳市遵义路9号海关大楼1楼','C');
insert into branch(branch_name,province_id,city_id,branch_telephone1,branch_fax,branch_address,branch_type) values('海口营业部',22,87,'089868593275','0898-68593277','海口市玉沙路5号国贸中心一楼 邮编(570203)','C');
insert into branch(branch_name,province_id,city_id,branch_telephone1,branch_fax,branch_address,branch_type) values('杭州营业部',11,29,'057185068387','0571-85061296 ','杭州市体育场路390号 邮编(310006)','B');
insert into branch(branch_name,province_id,city_id,branch_telephone1,branch_fax,branch_address,branch_type) values('哈尔滨营业部',9,22,'045182336161','0451-82305664 ','哈尔滨市南岗区丽顺街11号 邮编(150040)','B');
insert into branch(branch_name,province_id,city_id,branch_telephone1,branch_fax,branch_address,branch_type) values('呼和浩特营业部',20,10,'04716964103','0535-6253867 ','呼和浩特市锡林北路35号 邮编(010070)','C');
insert into branch(branch_name,province_id,city_id,branch_telephone1,branch_fax,branch_address,branch_type) values('九寨沟营业部',23,103,'08377243763','0837-7243799 ','阿坝州松潘县川主寺镇藏药泉山庄 邮编(623300)','C');
insert into branch(branch_name,province_id,city_id,branch_telephone1,branch_fax,branch_address,branch_type) values('兰州营业部',29,104,'09318877362','0931-8877365 ','兰州饭店东楼4层 ','C');
insert into branch(branch_name,province_id,city_id,branch_telephone1,branch_fax,branch_address,branch_type) values('昆明营业部',25,65,'08713159171','0871-3159164 ','昆明市青年路448号华尔顿大厦一楼 邮编(650021)','C');
insert into branch(branch_name,province_id,city_id,branch_telephone1,branch_fax,branch_address,branch_type) values('南昌营业部',14,43,'07912189737','0791-2189747 ','南昌市八一大道357号财富广场一楼 ','C');
insert into branch(branch_name,province_id,city_id,branch_telephone1,branch_fax,branch_address,branch_type) values('南宁营业部',21,106,'07715512850','0771-5512859 ','广西南宁市桂春路15号','C');
insert into branch(branch_name,province_id,city_id,branch_telephone1,branch_fax,branch_address,branch_type) values('南京营业部',10,110,'02584815540','025-84819810 ','南京市玄武区黄埔路2号黄埔大厦1楼 邮编(210016)','B');
insert into branch(branch_name,province_id,city_id,branch_telephone1,branch_fax,branch_address,branch_type) values('青岛营业部',15,59,' 053281979781','0532-85976179 ','青岛市延安三路111号 邮编(266071)','B');
insert into branch(branch_name,province_id,city_id,branch_telephone1,branch_fax,branch_address,branch_type) values('上海营业部',2,2,'4008100999','021-68354107 ','上海南京西路1515号嘉里中心307室 邮编(200040)','A');
insert into branch(branch_name,province_id,city_id,branch_telephone1,branch_fax,branch_address,branch_type) values('沈阳营业部',7,17,'02423180409','024-23188877 ','沈阳市和平区青年大街386号华阳国际大厦1795室 邮编(110003)','B');
insert into branch(branch_name,province_id,city_id,branch_telephone1,branch_fax,branch_address,branch_type) values('深圳营业部',19,48,'075582932499','0755-82932557 ','深圳市福田区农林路鑫竹苑大厦A栋首层 邮编(518040)','A');
insert into branch(branch_name,province_id,city_id,branch_telephone1,branch_fax,branch_address,branch_type) values('天津营业部',3,4,'02283311666',NULL,'天津市和平区南京路103号 邮编(300050)','A');
insert into branch(branch_name,province_id,city_id,branch_telephone1,branch_fax,branch_address,branch_type) values('乌鲁木齐营业部',28,76,'09914647188','0991-4886815 ','乌鲁木齐市南湖路163号城建大厦一楼 邮编(830063)','B');
insert into branch(branch_name,province_id,city_id,branch_telephone1,branch_fax,branch_address,branch_type) values('温州营业部',11,31,'057788668222','0577-88665255 ','温州市划龙桥路23号宏鼎大厦 邮编(325000)','C');
insert into branch(branch_name,province_id,city_id,branch_telephone1,branch_fax,branch_address,branch_type) values('武汉营业部',17,89,'02768852225','027-68852249 ','武汉市江汉北路97号湖北民航大酒店 邮编(430021)','B');
insert into branch(branch_name,province_id,city_id,branch_telephone1,branch_fax,branch_address,branch_type) values('汉阳营业部',17,89,'02784878888','027-84266990 ','汉阳大道98号(钟家村都市兰亭) ','C');
insert into branch(branch_name,province_id,city_id,branch_telephone1,branch_fax,branch_address,branch_type) values('武昌营业部',17,89,' 02787838888','027-86649227 ','武昌区中北路54号宏城金都大厦一楼(姚家岭车站深发展银行武汉分行旁)','C');
insert into branch(branch_name,province_id,city_id,branch_telephone1,branch_fax,branch_address,branch_type) values('西安营业部',31,73,'02968686999','029-84241448 ','西安市唐延路3号唐延国际中心一层南户 邮编(710075)','B');
insert into branch(branch_name,province_id,city_id,branch_telephone1,branch_fax,branch_address,branch_type) values('厦门营业部',13,40,'05925084382','0592-5084384','厦门市湖滨东路湖光大厦 邮编(361004)','B');
insert into branch(branch_name,province_id,city_id,branch_telephone1,branch_fax,branch_address,branch_type) values('延吉营业部',8,16,'04332902801','0433-2902804 ','延吉市局子街1161号延弘大厦一楼中国国际航空股份有限公司延吉营业部 邮编(133000)','C');
insert into branch(branch_name,province_id,city_id,branch_telephone1,branch_fax,branch_address,branch_type) values('烟台营业部',15,60,'05356586759','0535-6587797 ','烟台市芝罘区南山路53号天鸿凯旋城四号楼1704单元','C');
insert into branch(branch_name,province_id,city_id,branch_telephone1,branch_fax,branch_address,branch_type) values('廊坊营业部',5,117,'03162095751',NULL,' 廊坊市新华路尚都金茂大厦A座308室','C');
insert into branch(branch_name,province_id,city_id,branch_telephone1,branch_fax,branch_address,branch_type) values('石家庄营业部',5,5,'031186666969',NULL,' 河北省石家庄市广安大街美东国际大厦10-1,106商铺 邮编(50011)','B');
insert into branch(branch_name,province_id,city_id,branch_telephone1,branch_fax,branch_address,branch_type) values('太原营业部',31,7,'03513091171',' ','太原市解放路103号 中盛国际大厦9层  邮编(30009)','B');
insert into branch(branch_name,province_id,city_id,branch_telephone1,branch_fax,branch_address,branch_type) values('郑州营业部',16,26,'037165781116','   ',' 郑州市花园路36号郑州国贸中心4号写字楼A座907室 邮编(450008)','B');
insert into branch(branch_name,province_id,city_id,branch_telephone1,branch_fax,branch_address,branch_type) values('拉萨营业部',24,72,'08916819777','0891-6811179 ','营业部 拉萨市北京中路48号邮编(850000)','C');
insert into branch(branch_name,province_id,city_id,branch_telephone1,branch_fax,branch_address,branch_type) values('三亚营业部',22,88,'089888392716',NULL,' 机场路33号凤凰大酒店8217房间 邮编(572000)','B');
insert into branch(branch_name,province_id,city_id,branch_telephone1,branch_fax,branch_address,branch_type) values('合肥营业部',12,36,'05512853999',NULL,'安徽省合肥市寿春路356号徽商国际大厦一楼国航合肥营业部 邮编(230001)','B');

#插入舱位等级
insert into cabin_class(cabin_class_name,cabin_class_char,refund_charge,limit_condition,cabin_discount,plane_cabin_type,mileage_factor) values('头等舱公布运价','F',0.05,'TGZ',1.8,'F',1.5);
insert into cabin_class(cabin_class_name,cabin_class_char,refund_charge,limit_condition,cabin_discount,plane_cabin_type,mileage_factor) values('头等舱折扣价','A',0.05,'TG-',1.5,'F',1.5);
insert into cabin_class(cabin_class_name,cabin_class_char,refund_charge,limit_condition,cabin_discount,plane_cabin_type,mileage_factor) values('会员里程兑换舱位(头等舱)','O',1.0,'---',0.0,'F',0.0);
insert into cabin_class(cabin_class_name,cabin_class_char,refund_charge,limit_condition,cabin_discount,plane_cabin_type,mileage_factor) values('公务舱公布运价','C',0.05,'TGZ',1.5,'C',1.3);
insert into cabin_class(cabin_class_name,cabin_class_char,refund_charge,limit_condition,cabin_discount,plane_cabin_type,mileage_factor) values('公务舱折扣价','D',0.05,'TG-',1.2,'C',1.3);
insert into cabin_class(cabin_class_name,cabin_class_char,refund_charge,limit_condition,cabin_discount,plane_cabin_type,mileage_factor) values('会员里程兑换舱位(公务舱)','I',1.0,'---',0.0,'C',0.0);
insert into cabin_class(cabin_class_name,cabin_class_char,refund_charge,limit_condition,cabin_discount,plane_cabin_type,mileage_factor) values('经济舱公布运价','Y',0.05,'TGZ',1.0,'Y',1.0);
insert into cabin_class(cabin_class_name,cabin_class_char,refund_charge,limit_condition,cabin_discount,plane_cabin_type,mileage_factor) values('经济舱折扣价(0.95)','B',0.05,'TG-',0.95,'Y',1.0);
insert into cabin_class(cabin_class_name,cabin_class_char,refund_charge,limit_condition,cabin_discount,plane_cabin_type,mileage_factor) values('经济舱折扣价(0.9)','M',0.05,'TG-',0.9,'Y',1.0);
insert into cabin_class(cabin_class_name,cabin_class_char,refund_charge,limit_condition,cabin_discount,plane_cabin_type,mileage_factor) values('经济舱折扣价(0.85)','H',0.1,'TG-',0.85,'Y',1.0);
insert into cabin_class(cabin_class_name,cabin_class_char,refund_charge,limit_condition,cabin_discount,plane_cabin_type,mileage_factor) values('经济舱折扣价(0.80)','K',0.1,'TG-',0.80,'Y',1.0);
insert into cabin_class(cabin_class_name,cabin_class_char,refund_charge,limit_condition,cabin_discount,plane_cabin_type,mileage_factor) values('经济舱折扣价(0.75)','L',0.3,'TG-',0.75,'Y',0.5);
insert into cabin_class(cabin_class_name,cabin_class_char,refund_charge,limit_condition,cabin_discount,plane_cabin_type,mileage_factor) values('经济舱折扣价(0.70)','Q',0.3,'TG-',0.70,'Y',0.5);
insert into cabin_class(cabin_class_name,cabin_class_char,refund_charge,limit_condition,cabin_discount,plane_cabin_type,mileage_factor) values('经济舱折扣价(0.65)','G',0.3,'TG-',0.65,'Y',0.5);
insert into cabin_class(cabin_class_name,cabin_class_char,refund_charge,limit_condition,cabin_discount,plane_cabin_type,mileage_factor) values('国际国内散客联程','S',0.3,'TG-',0.60,'Y',0.5);
insert into cabin_class(cabin_class_name,cabin_class_char,refund_charge,limit_condition,cabin_discount,plane_cabin_type,mileage_factor) values('会员里程兑换舱位(经济舱)','X',1.0,'---',0.0,'Y',0.0);
insert into cabin_class(cabin_class_name,cabin_class_char,refund_charge,limit_condition,cabin_discount,plane_cabin_type,mileage_factor) values('经济舱折扣价(0.55)','V',0.3,'T--',0.55,'Y',0.5);
insert into cabin_class(cabin_class_name,cabin_class_char,refund_charge,limit_condition,cabin_discount,plane_cabin_type,mileage_factor) values('经济舱折扣价(0.50)','U',0.3,'T--',0.50,'Y',0.5);
insert into cabin_class(cabin_class_name,cabin_class_char,refund_charge,limit_condition,cabin_discount,plane_cabin_type,mileage_factor) values('经济舱折扣价(0.45)','Z',0.3,'T--',0.45,'Y',0.5);
insert into cabin_class(cabin_class_name,cabin_class_char,refund_charge,limit_condition,cabin_discount,plane_cabin_type,mileage_factor) values('国内联程','W',0.3,'T--',0.40,'Y',0.5);
insert into cabin_class(cabin_class_name,cabin_class_char,refund_charge,limit_condition,cabin_discount,plane_cabin_type,mileage_factor) values('AD、ID兑换舱位(0.35)','R',1.0,'---',0.35,'Y',0.0);
insert into cabin_class(cabin_class_name,cabin_class_char,refund_charge,limit_condition,cabin_discount,plane_cabin_type,mileage_factor) values('AD、ID兑换舱位(0.3)','N',1.0,'---',0.3,'Y',0.0);
insert into cabin_class(cabin_class_name,cabin_class_char,refund_charge,limit_condition,cabin_discount,plane_cabin_type,mileage_factor) values('国际国内团队联程/特殊销售价格(0.25)','T',1.0,'---',0.25,'Y',0.0);
insert into cabin_class(cabin_class_name,cabin_class_char,refund_charge,limit_condition,cabin_discount,plane_cabin_type,mileage_factor) values('国际国内团队联程/特殊销售价格(0.20)','E',1.0,'---',0.20,'Y',0.0);

#插入飞机
insert into plane(plane_num,plane_model,plane_manufacturer,f_cabin_seats,c_cabin_seats,y_cabin_seats,seats_img_uri) values('B-2161','B737-800','美国波音飞机制造公司',8,0,159,'data\\plane_pic\\B737_800.gif');
insert into plane(plane_num,plane_model,plane_manufacturer,f_cabin_seats,c_cabin_seats,y_cabin_seats,seats_img_uri) values('B-2509','B737-800','美国波音飞机制造公司',8,0,159,'data\\plane_pic\\B737_800.gif');
insert into plane(plane_num,plane_model,plane_manufacturer,f_cabin_seats,c_cabin_seats,y_cabin_seats,seats_img_uri) values('B-2510','B737-800','美国波音飞机制造公司',8,0,159,'data\\plane_pic\\B737_800.gif');
insert into plane(plane_num,plane_model,plane_manufacturer,f_cabin_seats,c_cabin_seats,y_cabin_seats,seats_img_uri) values('B-2511','B737-800','美国波音飞机制造公司',8,0,159,'data\\plane_pic\\B737_800.gif');
insert into plane(plane_num,plane_model,plane_manufacturer,f_cabin_seats,c_cabin_seats,y_cabin_seats,seats_img_uri) values('B-2641','B737-800','美国波音飞机制造公司',8,0,159,'data\\plane_pic\\B737_800.gif');
insert into plane(plane_num,plane_model,plane_manufacturer,f_cabin_seats,c_cabin_seats,y_cabin_seats,seats_img_uri) values('B-2642','B737-800','美国波音飞机制造公司',8,0,159,'data\\plane_pic\\B737_800.gif ');
insert into plane(plane_num,plane_model,plane_manufacturer,f_cabin_seats,c_cabin_seats,y_cabin_seats,seats_img_uri) values('B-2643','B737-800','美国波音飞机制造公司',8,0,159,'data\\plane_pic\\B737_800.gif ');
insert into plane(plane_num,plane_model,plane_manufacturer,f_cabin_seats,c_cabin_seats,y_cabin_seats,seats_img_uri) values('B-2645','B737-800','美国波音飞机制造公司',8,0,159,'data\\plane_pic\\B737_800.gif ');
insert into plane(plane_num,plane_model,plane_manufacturer,f_cabin_seats,c_cabin_seats,y_cabin_seats,seats_img_uri) values('B-2648','B737-800','美国波音飞机制造公司',8,0,159,'data\\plane_pic\\B737_800.gif ');
insert into plane(plane_num,plane_model,plane_manufacturer,f_cabin_seats,c_cabin_seats,y_cabin_seats,seats_img_uri) values('B-2671','B737-800','美国波音飞机制造公司',8,0,159,'data\\plane_pic\\B737_800.gif ');
insert into plane(plane_num,plane_model,plane_manufacturer,f_cabin_seats,c_cabin_seats,y_cabin_seats,seats_img_uri) values('B-2672','B737-800','美国波音飞机制造公司',8,0,159,'data\\plane_pic\\B737_800.gif');
insert into plane(plane_num,plane_model,plane_manufacturer,f_cabin_seats,c_cabin_seats,y_cabin_seats,seats_img_uri) values('B-2673','B737-800','美国波音飞机制造公司',8,0,159,'data\\plane_pic\\B737_800.gif ');
insert into plane(plane_num,plane_model,plane_manufacturer,f_cabin_seats,c_cabin_seats,y_cabin_seats,seats_img_uri) values('B-2690','B737-800','美国波音飞机制造公司',8,0,159,'data\\plane_pic\\B737_800.gif ');
insert into plane(plane_num,plane_model,plane_manufacturer,f_cabin_seats,c_cabin_seats,y_cabin_seats,seats_img_uri) values('B-5167','B737-800','美国波音飞机制造公司',8,0,159,'data\\plane_pic\\B737_800.gif ');
insert into plane(plane_num,plane_model,plane_manufacturer,f_cabin_seats,c_cabin_seats,y_cabin_seats,seats_img_uri) values('B-5168','B737-800','美国波音飞机制造公司',8,0,159,'data\\plane_pic\\B737_800.gif ');
insert into plane(plane_num,plane_model,plane_manufacturer,f_cabin_seats,c_cabin_seats,y_cabin_seats,seats_img_uri) values('B-5169','B737-800','美国波音飞机制造公司',8,0,159,'data\\plane_pic\\B737_800.gif ');
insert into plane(plane_num,plane_model,plane_manufacturer,f_cabin_seats,c_cabin_seats,y_cabin_seats,seats_img_uri) values('B-5170','B737-800','美国波音飞机制造公司',8,0,159,'data\\plane_pic\\B737_800.gif ');
insert into plane(plane_num,plane_model,plane_manufacturer,f_cabin_seats,c_cabin_seats,y_cabin_seats,seats_img_uri) values('B-5171','B737-800','美国波音飞机制造公司',8,0,159,'data\\plane_pic\\B737_800.gif ');
insert into plane(plane_num,plane_model,plane_manufacturer,f_cabin_seats,c_cabin_seats,y_cabin_seats,seats_img_uri) values('B-5172','B737-800','美国波音飞机制造公司',8,0,159,'data\\plane_pic\\B737_800.gif ');
insert into plane(plane_num,plane_model,plane_manufacturer,f_cabin_seats,c_cabin_seats,y_cabin_seats,seats_img_uri) values('B-5173','B737-800','美国波音飞机制造公司',8,0,159,'data\\plane_pic\\B737_800.gif ');
insert into plane(plane_num,plane_model,plane_manufacturer,f_cabin_seats,c_cabin_seats,y_cabin_seats,seats_img_uri) values('B-5175','B737-800','美国波音飞机制造公司',8,0,159,'data\\plane_pic\\B737_800.gif ');
insert into plane(plane_num,plane_model,plane_manufacturer,f_cabin_seats,c_cabin_seats,y_cabin_seats,seats_img_uri) values('B-5176','B737-800','美国波音飞机制造公司',8,0,159,'data\\plane_pic\\B737_800.gif');
insert into plane(plane_num,plane_model,plane_manufacturer,f_cabin_seats,c_cabin_seats,y_cabin_seats,seats_img_uri) values('B-5177','B737-800','美国波音飞机制造公司',8,0,159,'data\\plane_pic\\B737_800.gif ');
insert into plane(plane_num,plane_model,plane_manufacturer,f_cabin_seats,c_cabin_seats,y_cabin_seats,seats_img_uri) values('B-5178','B737-800','美国波音飞机制造公司',8,0,159,'data\\plane_pic\\B737_800.gif ');
insert into plane(plane_num,plane_model,plane_manufacturer,f_cabin_seats,c_cabin_seats,y_cabin_seats,seats_img_uri) values('B-5179','B737-800','美国波音飞机制造公司',8,0,159,'data\\plane_pic\\B737_800.gif ');
insert into plane(plane_num,plane_model,plane_manufacturer,f_cabin_seats,c_cabin_seats,y_cabin_seats,seats_img_uri) values('B-5311','B737-800','美国波音飞机制造公司',8,0,159,'data\\plane_pic\\B737_800.gif ');
insert into plane(plane_num,plane_model,plane_manufacturer,f_cabin_seats,c_cabin_seats,y_cabin_seats,seats_img_uri) values('B-5312','B737-800','美国波音飞机制造公司',8,0,159,'data\\plane_pic\\B737_800.gif ');
insert into plane(plane_num,plane_model,plane_manufacturer,f_cabin_seats,c_cabin_seats,y_cabin_seats,seats_img_uri) values('B-5313','B737-800','美国波音飞机制造公司',8,0,159,'data\\plane_pic\\B737_800.gif ');
insert into plane(plane_num,plane_model,plane_manufacturer,f_cabin_seats,c_cabin_seats,y_cabin_seats,seats_img_uri) values('B-5326','B737-800','美国波音飞机制造公司',8,0,159,'data\\plane_pic\\B737_800.gif ');
insert into plane(plane_num,plane_model,plane_manufacturer,f_cabin_seats,c_cabin_seats,y_cabin_seats,seats_img_uri) values('B-5328','B737-800','美国波音飞机制造公司',8,0,159,'data\\plane_pic\\B737_800.gif ');
insert into plane(plane_num,plane_model,plane_manufacturer,f_cabin_seats,c_cabin_seats,y_cabin_seats,seats_img_uri) values('B-5341','B737-800','美国波音飞机制造公司',8,0,159,'data\\plane_pic\\B737_800.gif ');
insert into plane(plane_num,plane_model,plane_manufacturer,f_cabin_seats,c_cabin_seats,y_cabin_seats,seats_img_uri) values('B-5342','B737-800','美国波音飞机制造公司',8,0,159,'data\\plane_pic\\B737_800.gif ');
insert into plane(plane_num,plane_model,plane_manufacturer,f_cabin_seats,c_cabin_seats,y_cabin_seats,seats_img_uri) values('B-5343','B737-800','美国波音飞机制造公司',8,0,159,'data\\plane_pic\\B737_800.gif ');
insert into plane(plane_num,plane_model,plane_manufacturer,f_cabin_seats,c_cabin_seats,y_cabin_seats,seats_img_uri) values('B-5397','B737-800','美国波音飞机制造公司',8,0,159,'data\\plane_pic\\B737_800.gif ');
insert into plane(plane_num,plane_model,plane_manufacturer,f_cabin_seats,c_cabin_seats,y_cabin_seats,seats_img_uri) values('B-5422','B737-800','美国波音飞机制造公司',8,0,159,'data\\plane_pic\\B737_800.gif ');
insert into plane(plane_num,plane_model,plane_manufacturer,f_cabin_seats,c_cabin_seats,y_cabin_seats,seats_img_uri) values('B-5423','B737-800','美国波音飞机制造公司',8,0,159,'data\\plane_pic\\B737_800.gif ');
insert into plane(plane_num,plane_model,plane_manufacturer,f_cabin_seats,c_cabin_seats,y_cabin_seats,seats_img_uri) values('B-5425','B737-800','美国波音飞机制造公司',8,0,159,'data\\plane_pic\\B737_800.gif ');
insert into plane(plane_num,plane_model,plane_manufacturer,f_cabin_seats,c_cabin_seats,y_cabin_seats,seats_img_uri) values('B-5431','B737-800','美国波音飞机制造公司',8,0,159,'data\\plane_pic\\B737_800.gif ');
insert into plane(plane_num,plane_model,plane_manufacturer,f_cabin_seats,c_cabin_seats,y_cabin_seats,seats_img_uri) values('B-5436','B737-800','美国波音飞机制造公司',8,0,159,'data\\plane_pic\\B737_800.gif ');
insert into plane(plane_num,plane_model,plane_manufacturer,f_cabin_seats,c_cabin_seats,y_cabin_seats,seats_img_uri) values('B-5437','B737-800','美国波音飞机制造公司',8,0,159,'data\\plane_pic\\B737_800.gif ');
insert into plane(plane_num,plane_model,plane_manufacturer,f_cabin_seats,c_cabin_seats,y_cabin_seats,seats_img_uri) values('B-5438','B737-800','美国波音飞机制造公司',8,0,159,'data\\plane_pic\\B737_800.gif ');
insert into plane(plane_num,plane_model,plane_manufacturer,f_cabin_seats,c_cabin_seats,y_cabin_seats,seats_img_uri) values('B-5497','B737-800','美国波音飞机制造公司',8,0,159,'data\\plane_pic\\B737_800.gif ');
insert into plane(plane_num,plane_model,plane_manufacturer,f_cabin_seats,c_cabin_seats,y_cabin_seats,seats_img_uri) values('B-5500','B737-800','美国波音飞机制造公司',8,0,159,'data\\plane_pic\\B737_800.gif ');
insert into plane(plane_num,plane_model,plane_manufacturer,f_cabin_seats,c_cabin_seats,y_cabin_seats,seats_img_uri) values('B-5507','B737-800','美国波音飞机制造公司',8,0,159,'data\\plane_pic\\B737_800.gif ');
insert into plane(plane_num,plane_model,plane_manufacturer,f_cabin_seats,c_cabin_seats,y_cabin_seats,seats_img_uri) values('B-5508','B737-800','美国波音飞机制造公司',8,0,159,'data\\plane_pic\\B737_800.gif ');
insert into plane(plane_num,plane_model,plane_manufacturer,f_cabin_seats,c_cabin_seats,y_cabin_seats,seats_img_uri) values('B-5509','B737-800','美国波音飞机制造公司',8,0,159,'data\\plane_pic\\B737_800.gif');
insert into plane(plane_num,plane_model,plane_manufacturer,f_cabin_seats,c_cabin_seats,y_cabin_seats,seats_img_uri) values('B-5510','B737-800','美国波音飞机制造公司',8,0,159,'data\\plane_pic\\B737_800.gif ');
insert into plane(plane_num,plane_model,plane_manufacturer,f_cabin_seats,c_cabin_seats,y_cabin_seats,seats_img_uri) values('B-5519','B737-800','美国波音飞机制造公司',8,0,159,'data\\plane_pic\\B737_800.gif ');
insert into plane(plane_num,plane_model,plane_manufacturer,f_cabin_seats,c_cabin_seats,y_cabin_seats,seats_img_uri) values('B-2467','B747-400C','美国波音飞机制造公司',10,24,246,'data\\plane_pic\\B747_400C.gif');
insert into plane(plane_num,plane_model,plane_manufacturer,f_cabin_seats,c_cabin_seats,y_cabin_seats,seats_img_uri) values('B-2468','B747-400C','美国波音飞机制造公司',10,24,246,'data\\plane_pic\\B747_400C.gif');
insert into plane(plane_num,plane_model,plane_manufacturer,f_cabin_seats,c_cabin_seats,y_cabin_seats,seats_img_uri) values('B-2469','B747-400C','美国波音飞机制造公司',10,24,246,'data\\plane_pic\\B747_400C.gif');
insert into plane(plane_num,plane_model,plane_manufacturer,f_cabin_seats,c_cabin_seats,y_cabin_seats,seats_img_uri) values('B-2470','B747-400C','美国波音飞机制造公司',10,24,246,'data\\plane_pic\\B747_400C.gif');
insert into plane(plane_num,plane_model,plane_manufacturer,f_cabin_seats,c_cabin_seats,y_cabin_seats,seats_img_uri) values('B-2471','B747-400C','美国波音飞机制造公司',10,24,246,'data\\plane_pic\\B747_400C.gif');
insert into plane(plane_num,plane_model,plane_manufacturer,f_cabin_seats,c_cabin_seats,y_cabin_seats,seats_img_uri) values('B-2443','B747-400','美国波音飞机制造公司',10,42,292,'data\\plane_pic\\B747_400.gif');
insert into plane(plane_num,plane_model,plane_manufacturer,f_cabin_seats,c_cabin_seats,y_cabin_seats,seats_img_uri) values('B-2445','B747-400','美国波音飞机制造公司',10,42,292,'data\\plane_pic\\B747_400.gif');
insert into plane(plane_num,plane_model,plane_manufacturer,f_cabin_seats,c_cabin_seats,y_cabin_seats,seats_img_uri) values('B-2447','B747-400','美国波音飞机制造公司',10,42,292,'data\\plane_pic\\B747_400.gif');
insert into plane(plane_num,plane_model,plane_manufacturer,f_cabin_seats,c_cabin_seats,y_cabin_seats,seats_img_uri) values('B-2472','B747-400','美国波音飞机制造公司',10,42,292,'data\\plane_pic\\B747_400.gif');
insert into plane(plane_num,plane_model,plane_manufacturer,f_cabin_seats,c_cabin_seats,y_cabin_seats,seats_img_uri) values('B-2557','B767-300','美国波音飞机制造公司',10,26,189,'data\\plane_pic\\B767_300.gif');
insert into plane(plane_num,plane_model,plane_manufacturer,f_cabin_seats,c_cabin_seats,y_cabin_seats,seats_img_uri) values('B-2558','B767-300','美国波音飞机制造公司',10,26,189,'data\\plane_pic\\B767_300.gif');
insert into plane(plane_num,plane_model,plane_manufacturer,f_cabin_seats,c_cabin_seats,y_cabin_seats,seats_img_uri) values('B-2559','B767-300','美国波音飞机制造公司',10,26,189,'data\\plane_pic\\B767_300.gif');
insert into plane(plane_num,plane_model,plane_manufacturer,f_cabin_seats,c_cabin_seats,y_cabin_seats,seats_img_uri) values('B-2560','B767-300','美国波音飞机制造公司',10,26,189,'data\\plane_pic\\B767_300.gif');
insert into plane(plane_num,plane_model,plane_manufacturer,f_cabin_seats,c_cabin_seats,y_cabin_seats,seats_img_uri) values('B-6326','A321-200','欧洲空中客车工业公司',12,0,173,'data\\plane_pic\\A321.gif');
insert into plane(plane_num,plane_model,plane_manufacturer,f_cabin_seats,c_cabin_seats,y_cabin_seats,seats_img_uri) values('B-6327','A321-200','欧洲空中客车工业公司',12,0,173,'data\\plane_pic\\A321.gif');
insert into plane(plane_num,plane_model,plane_manufacturer,f_cabin_seats,c_cabin_seats,y_cabin_seats,seats_img_uri) values('B-6363','A321-200','欧洲空中客车工业公司',12,0,173,'data\\plane_pic\\A321.gif');
insert into plane(plane_num,plane_model,plane_manufacturer,f_cabin_seats,c_cabin_seats,y_cabin_seats,seats_img_uri) values('B-6383','A321-200','欧洲空中客车工业公司',12,0,173,'data\\plane_pic\\A321.gif');
insert into plane(plane_num,plane_model,plane_manufacturer,f_cabin_seats,c_cabin_seats,y_cabin_seats,seats_img_uri) values('B-6385','A321-200','欧洲空中客车工业公司',12,0,173,'data\\plane_pic\\A321.gif');
insert into plane(plane_num,plane_model,plane_manufacturer,f_cabin_seats,c_cabin_seats,y_cabin_seats,seats_img_uri) values('B-6555','A321-200','欧洲空中客车工业公司',12,0,173,'data\\plane_pic\\A321.gif');
insert into plane(plane_num,plane_model,plane_manufacturer,f_cabin_seats,c_cabin_seats,y_cabin_seats,seats_img_uri) values('B-6593','A321-200','欧洲空中客车工业公司',12,0,173,'data\\plane_pic\\A321.gif');
insert into plane(plane_num,plane_model,plane_manufacturer,f_cabin_seats,c_cabin_seats,y_cabin_seats,seats_img_uri) values('B-6595','A321-200','欧洲空中客车工业公司',12,0,173,' data\\plane_pic\\A321.gif');
insert into plane(plane_num,plane_model,plane_manufacturer,f_cabin_seats,c_cabin_seats,y_cabin_seats,seats_img_uri) values('B-6596','A321-200','欧洲空中客车工业公司',12,0,173,'data\\plane_pic\\A321.gif');
insert into plane(plane_num,plane_model,plane_manufacturer,f_cabin_seats,c_cabin_seats,y_cabin_seats,seats_img_uri) values('B-6597','A321-200','欧洲空中客车工业公司',12,0,173,'data\\plane_pic\\A321.gif');
insert into plane(plane_num,plane_model,plane_manufacturer,f_cabin_seats,c_cabin_seats,y_cabin_seats,seats_img_uri) values('B-6605','A321-200','欧洲空中客车工业公司',12,0,173,'data\\plane_pic\\A321.gif');
insert into plane(plane_num,plane_model,plane_manufacturer,f_cabin_seats,c_cabin_seats,y_cabin_seats,seats_img_uri) values('B-6632','A321-200','欧洲空中客车工业公司',12,0,173,'data\\plane_pic\\A321.gif');
insert into plane(plane_num,plane_model,plane_manufacturer,f_cabin_seats,c_cabin_seats,y_cabin_seats,seats_img_uri) values('B-6073','A330-200','欧洲空中客车工业公司',0,36,215,'data\\plane_pic\\A330_200_251.gif');
insert into plane(plane_num,plane_model,plane_manufacturer,f_cabin_seats,c_cabin_seats,y_cabin_seats,seats_img_uri) values('B-6075','A330-200','欧洲空中客车工业公司',0,36,215,'data\\plane_pic\\A330_200_251.gif');
insert into plane(plane_num,plane_model,plane_manufacturer,f_cabin_seats,c_cabin_seats,y_cabin_seats,seats_img_uri) values('B-6076','A330-200','欧洲空中客车工业公司',0,36,215,'data\\plane_pic\\A330_200_251.gif');
insert into plane(plane_num,plane_model,plane_manufacturer,f_cabin_seats,c_cabin_seats,y_cabin_seats,seats_img_uri) values('B-6079','A330-200','欧洲空中客车工业公司',0,36,215,'data\\plane_pic\\A330_200_251.gif');
insert into plane(plane_num,plane_model,plane_manufacturer,f_cabin_seats,c_cabin_seats,y_cabin_seats,seats_img_uri) values('B-6080','A330-200','欧洲空中客车工业公司',0,36,215,'data\\plane_pic\\A330_200_251.gif');
insert into plane(plane_num,plane_model,plane_manufacturer,f_cabin_seats,c_cabin_seats,y_cabin_seats,seats_img_uri) values('B-6090','A330-200','欧洲空中客车工业公司',0,36,215,'data\\plane_pic\\A330_200_251.gif');
insert into plane(plane_num,plane_model,plane_manufacturer,f_cabin_seats,c_cabin_seats,y_cabin_seats,seats_img_uri) values('B-6091','A330-200','欧洲空中客车工业公司',0,36,215,'data\\plane_pic\\A330_200_251.gif');
insert into plane(plane_num,plane_model,plane_manufacturer,f_cabin_seats,c_cabin_seats,y_cabin_seats,seats_img_uri) values('B-6092','A330-200','欧洲空中客车工业公司',0,36,215,' data\\plane_pic\\A330_200_251.gif');
insert into plane(plane_num,plane_model,plane_manufacturer,f_cabin_seats,c_cabin_seats,y_cabin_seats,seats_img_uri) values('B-6093','A330-200','欧洲空中客车工业公司',0,36,215,'data\\plane_pic\\A330_200_251.gif');
insert into plane(plane_num,plane_model,plane_manufacturer,f_cabin_seats,c_cabin_seats,y_cabin_seats,seats_img_uri) values('B-6113','A330-200','欧洲空中客车工业公司',0,12,271,'data\\plane_pic\\A330_200_283.gif');
insert into plane(plane_num,plane_model,plane_manufacturer,f_cabin_seats,c_cabin_seats,y_cabin_seats,seats_img_uri) values('B-6115','A330-200','欧洲空中客车工业公司',0,12,271,'data\\plane_pic\\A330_200_283.gif');
insert into plane(plane_num,plane_model,plane_manufacturer,f_cabin_seats,c_cabin_seats,y_cabin_seats,seats_img_uri) values('B-6117','A330-200','欧洲空中客车工业公司',0,12,271,'data\\plane_pic\\A330_200_283.gif');
insert into plane(plane_num,plane_model,plane_manufacturer,f_cabin_seats,c_cabin_seats,y_cabin_seats,seats_img_uri) values('B-6130','A330-200','欧洲空中客车工业公司',0,12,271,'data\\plane_pic\\A330_200_283.gif');
insert into plane(plane_num,plane_model,plane_manufacturer,f_cabin_seats,c_cabin_seats,y_cabin_seats,seats_img_uri) values('B-6131','A330-200','欧洲空中客车工业公司',0,12,271,'data\\plane_pic\\A330_200_283.gif');
insert into plane(plane_num,plane_model,plane_manufacturer,f_cabin_seats,c_cabin_seats,y_cabin_seats,seats_img_uri) values('B-6132','A330-200','欧洲空中客车工业公司',0,12,271,'data\\plane_pic\\A330_200_283.gif');
insert into plane(plane_num,plane_model,plane_manufacturer,f_cabin_seats,c_cabin_seats,y_cabin_seats,seats_img_uri) values('B-6505','A330-200','欧洲空中客车工业公司',0,12,271,'data\\plane_pic\\A330_200_283.gif');
insert into plane(plane_num,plane_model,plane_manufacturer,f_cabin_seats,c_cabin_seats,y_cabin_seats,seats_img_uri) values('B-6511','A330-300','欧洲空中客车工业公司',0,36,275,'data\\plane_pic\\A330_300.gif');
insert into plane(plane_num,plane_model,plane_manufacturer,f_cabin_seats,c_cabin_seats,y_cabin_seats,seats_img_uri) values('B-6512','A330-300','欧洲空中客车工业公司',0,36,275,'data\\plane_pic\\A330_300.gif');
insert into plane(plane_num,plane_model,plane_manufacturer,f_cabin_seats,c_cabin_seats,y_cabin_seats,seats_img_uri) values('B-6513','A330-300','欧洲空中客车工业公司',0,36,275,'data\\plane_pic\\A330_300.gif');
insert into plane(plane_num,plane_model,plane_manufacturer,f_cabin_seats,c_cabin_seats,y_cabin_seats,seats_img_uri) values('B-2059','B777-200','美国波音飞机制造公司',0,49,296,'data\\plane_pic\\B777_200_2cang.gif');
insert into plane(plane_num,plane_model,plane_manufacturer,f_cabin_seats,c_cabin_seats,y_cabin_seats,seats_img_uri) values('B-2060','B777-200','美国波音飞机制造公司',0,49,296,'data\\plane_pic\\B777_200_2cang.gif');
insert into plane(plane_num,plane_model,plane_manufacturer,f_cabin_seats,c_cabin_seats,y_cabin_seats,seats_img_uri) values('B-2061','B777-200','美国波音飞机制造公司',0,49,296,'data\\plane_pic\\B777_200_2cang.gif');
insert into plane(plane_num,plane_model,plane_manufacturer,f_cabin_seats,c_cabin_seats,y_cabin_seats,seats_img_uri) values('B-2063','B777-200','美国波音飞机制造公司',0,49,296,'data\\plane_pic\\B777_200_2cang.gif');
insert into plane(plane_num,plane_model,plane_manufacturer,f_cabin_seats,c_cabin_seats,y_cabin_seats,seats_img_uri) values('B-2064','B777-200','美国波音飞机制造公司',12,49,253,'data\\plane_pic\\B777_200_3cang.gif');
insert into plane(plane_num,plane_model,plane_manufacturer,f_cabin_seats,c_cabin_seats,y_cabin_seats,seats_img_uri) values('B-2065','B777-200','美国波音飞机制造公司',12,49,253,'data\\plane_pic\\B777_200_3cang.gif');
insert into plane(plane_num,plane_model,plane_manufacturer,f_cabin_seats,c_cabin_seats,y_cabin_seats,seats_img_uri) values('B-2066','B777-200','美国波音飞机制造公司',12,49,253,'data\\plane_pic\\B777_200_3cang.gif');
insert into plane(plane_num,plane_model,plane_manufacturer,f_cabin_seats,c_cabin_seats,y_cabin_seats,seats_img_uri) values('B-2067','B777-200','美国波音飞机制造公司',12,49,253,'data\\plane_pic\\B777_200_3cang.gif');
insert into plane(plane_num,plane_model,plane_manufacturer,f_cabin_seats,c_cabin_seats,y_cabin_seats,seats_img_uri) values('B-2068','B777-200','美国波音飞机制造公司',12,49,253,'data\\plane_pic\\B777_200_3cang.gif');
insert into plane(plane_num,plane_model,plane_manufacturer,f_cabin_seats,c_cabin_seats,y_cabin_seats,seats_img_uri) values('B-2069','B777-200','美国波音飞机制造公司',12,49,253,'data\\plane_pic\\B777_200_3cang.gif');
insert into plane(plane_num,plane_model,plane_manufacturer,f_cabin_seats,c_cabin_seats,y_cabin_seats,seats_img_uri) values('B-2499','B767-300ER','美国波音飞机制造公司',0,30,200,'data\\plane_pic\\B767_300_ER.gif');

#插入航线
insert into route(route_id,from_airport_id,to_airport_id,route_distance,route_base_price) values(1,1,2,1088,816.0);
insert into route(route_id,from_airport_id,to_airport_id,route_distance,route_base_price) values(2,2,1,1088,816.0);
insert into route(route_id,from_airport_id,to_airport_id,route_distance,route_base_price) values(3,1,3,1088,816.0);
insert into route(route_id,from_airport_id,to_airport_id,route_distance,route_base_price) values(4,3,1,1088,816.0);
insert into route(route_id,from_airport_id,to_airport_id,route_distance,route_base_price) values(5,1,4,1492,1119.0);
insert into route(route_id,from_airport_id,to_airport_id,route_distance,route_base_price) values(6,4,1,1492,1119.0);
insert into route(route_id,from_airport_id,to_airport_id,route_distance,route_base_price) values(7,1,11,431,323.25);
insert into route(route_id,from_airport_id,to_airport_id,route_distance,route_base_price) values(8,11,1,431,323.25);
insert into route(route_id,from_airport_id,to_airport_id,route_distance,route_base_price) values(9,1,54,1363,1022.25);
insert into route(route_id,from_airport_id,to_airport_id,route_distance,route_base_price) values(10,54,1,1363,1022.25);
insert into route(route_id,from_airport_id,to_airport_id,route_distance,route_base_price) values(11,1,74,941,705.75);
insert into route(route_id,from_airport_id,to_airport_id,route_distance,route_base_price) values(12,74,1,941,705.75);
insert into route(route_id,from_airport_id,to_airport_id,route_distance,route_base_price) values(13,1,73,2603,1952.25);
insert into route(route_id,from_airport_id,to_airport_id,route_distance,route_base_price) values(14,73,1,2603,1952.25);
insert into route(route_id,from_airport_id,to_airport_id,route_distance,route_base_price) values(15,1,77,2464,1848.0);
insert into route(route_id,from_airport_id,to_airport_id,route_distance,route_base_price) values(16,77,1,2464,1848.0);
insert into route(route_id,from_airport_id,to_airport_id,route_distance,route_base_price) values(17,1,89,2542,1906.5);
insert into route(route_id,from_airport_id,to_airport_id,route_distance,route_base_price) values(18,89,1,2542,1906.5);
insert into route(route_id,from_airport_id,to_airport_id,route_distance,route_base_price) values(19,1,12,563,422.25);
insert into route(route_id,from_airport_id,to_airport_id,route_distance,route_base_price) values(20,12,1,563,422.25);
insert into route(route_id,from_airport_id,to_airport_id,route_distance,route_base_price) values(21,1,110,2188,1641.0);
insert into route(route_id,from_airport_id,to_airport_id,route_distance,route_base_price) values(22,110,1,2188,1641.0);
insert into route(route_id,from_airport_id,to_airport_id,route_distance,route_base_price) values(23,1,97,1541,1155.75);
insert into route(route_id,from_airport_id,to_airport_id,route_distance,route_base_price) values(24,97,1,1541,1155.75);
insert into route(route_id,from_airport_id,to_airport_id,route_distance,route_base_price) values(25,1,19,442,331.5);
insert into route(route_id,from_airport_id,to_airport_id,route_distance,route_base_price) values(26,19,1,442,331.5);
insert into route(route_id,from_airport_id,to_airport_id,route_distance,route_base_price) values(27,1,20,650,487.5);
insert into route(route_id,from_airport_id,to_airport_id,route_distance,route_base_price) values(28,20,1,650,487.5);
insert into route(route_id,from_airport_id,to_airport_id,route_distance,route_base_price) values(29,1,56,1345,1008.75);
insert into route(route_id,from_airport_id,to_airport_id,route_distance,route_base_price) values(30,56,1,1345,1008.75);
insert into route(route_id,from_airport_id,to_airport_id,route_distance,route_base_price) values(31,1,48,1907,1430.25);
insert into route(route_id,from_airport_id,to_airport_id,route_distance,route_base_price) values(32,48,1,1907,1430.25);
insert into route(route_id,from_airport_id,to_airport_id,route_distance,route_base_price) values(33,1,49,1966,1474.5);
insert into route(route_id,from_airport_id,to_airport_id,route_distance,route_base_price) values(34,49,1,1966,1474.5);
insert into route(route_id,from_airport_id,to_airport_id,route_distance,route_base_price) values(35,97,15,2367,1775.25);
insert into route(route_id,from_airport_id,to_airport_id,route_distance,route_base_price) values(36,15,97,2367,1775.25);
insert into route(route_id,from_airport_id,to_airport_id,route_distance,route_base_price) values(37,97,48,1236,927.0);
insert into route(route_id,from_airport_id,to_airport_id,route_distance,route_base_price) values(38,48,97,1236,927.0);
insert into route(route_id,from_airport_id,to_airport_id,route_distance,route_base_price) values(39,2,48,1210,907.5);
insert into route(route_id,from_airport_id,to_airport_id,route_distance,route_base_price) values(40,48,2,1210,907.5);
insert into route(route_id,from_airport_id,to_airport_id,route_distance,route_base_price) values(41,2,97,1669,1251.75);
insert into route(route_id,from_airport_id,to_airport_id,route_distance,route_base_price) values(42,97,2,1669,1251.75);
insert into route(route_id,from_airport_id,to_airport_id,route_distance,route_base_price) values(43,48,23,2785,2088.75);
insert into route(route_id,from_airport_id,to_airport_id,route_distance,route_base_price) values(44,23,48,2785,2088.75);
insert into route(route_id,from_airport_id,to_airport_id,route_distance,route_base_price) values(45,49,2,1221,915.75);
insert into route(route_id,from_airport_id,to_airport_id,route_distance,route_base_price) values(46,2,49,1221,915.75);

#插入航班
insert into flight(flight_id,flight_num,fl_departure_date,fl_arrival_date,route_id,plane_id,f_seats_remain,b_seats_remain,e_seats_remain,current_classes,current_discount,full_price,current_price,tax1_price,tax2_price,current_order) 
values('N201010251201','TL1201','2010-10-25 10:25:00','2010-10-25 12:15:00',1,3,0,0,100,'F,C,Y',1.0,1020.00,1020.00,50.00,40.00,1);

insert into flight(flight_id,flight_num,fl_departure_date,fl_arrival_date,route_id,plane_id,f_seats_remain,b_seats_remain,e_seats_remain,current_classes,current_discount,full_price,current_price,tax1_price,tax2_price,current_order) 
values('N201010251202','TL1202','2010-10-25 13:00:00','2010-10-25 15:05:00',2,3,0,0,100,'F,C,Y',1.0,1020.00,1020.00,50.00,40.00,1);

insert into flight(flight_id,flight_num,fl_departure_date,fl_arrival_date,route_id,plane_id,f_seats_remain,b_seats_remain,e_seats_remain,current_classes,current_discount,full_price,current_price,tax1_price,tax2_price,current_order) 
values('N201010251301','TL1301','2010-10-25 08:30:00','2010-10-25 11:25:00',31,38,0,0,100,'F,C,Y',1.0,1020.00,1020.00,50.00,40.00,1);

insert into flight(flight_id,flight_num,fl_departure_date,fl_arrival_date,route_id,plane_id,f_seats_remain,b_seats_remain,e_seats_remain,current_classes,current_discount,full_price,current_price,tax1_price,tax2_price,current_order) 
values('N201010251302','TL1302','2010-10-25 10:25:00','2010-10-25 12:15:00',32,57,0,0,100,'F,C,Y',1.0,1020.00,1020.00,50.00,40.00,1);

insert into flight(flight_id,flight_num,fl_departure_date,fl_arrival_date,route_id,plane_id,f_seats_remain,b_seats_remain,e_seats_remain,current_classes,current_discount,full_price,current_price,tax1_price,tax2_price,current_order) 
values('N201010261204','TL1204','2010-10-26 10:25:00','2010-10-26 12:15:00',4,67,0,0,100,'F,C,Y',1.0,1020.00,1020.00,50.00,40.00,1);

insert into flight(flight_id,flight_num,fl_departure_date,fl_arrival_date,route_id,plane_id,f_seats_remain,b_seats_remain,e_seats_remain,current_classes,current_discount,full_price,current_price,tax1_price,tax2_price,current_order) 
values('N201010271205','TL1205','2010-10-27 10:25:00','2010-10-27 12:15:00',5,78,0,0,100,'F,C,Y',1.0,1020.00,1020.00,50.00,40.00,1);

insert into flight(flight_id,flight_num,fl_departure_date,fl_arrival_date,route_id,plane_id,f_seats_remain,b_seats_remain,e_seats_remain,current_classes,current_discount,full_price,current_price,tax1_price,tax2_price,current_order) 
values('N201010281331','TL1331','2010-10-28 10:25:00','2010-10-28 12:15:00',7,71,0,0,100,'F,C,Y',1.0,1020.00,1020.00,50.00,40.00,1);

insert into flight(flight_id,flight_num,fl_departure_date,fl_arrival_date,route_id,plane_id,f_seats_remain,b_seats_remain,e_seats_remain,current_classes,current_discount,full_price,current_price,tax1_price,tax2_price,current_order) 
values('N201010291332','TL1332','2010-10-29 10:25:00','2010-10-29 12:15:00',8,32,0,0,100,'F,C,Y',1.0,1020.00,1020.00,50.00,40.00,1);

insert into flight(flight_id,flight_num,fl_departure_date,fl_arrival_date,route_id,plane_id,f_seats_remain,b_seats_remain,e_seats_remain,current_classes,current_discount,full_price,current_price,tax1_price,tax2_price,current_order) 
values('N201010291305','TL1305','2010-10-29 10:25:00','2010-10-29 12:15:00',43,93,0,0,100,'F,C,Y',1.0,1020.00,1020.00,50.00,40.00,1);

#插入用户
insert into user(user_login_name,user_password,user_name,user_state,
                           user_creation_date,user_last_login_time,user_total_login_times,user_total_login_seconds
                           ) values('tangliang','8d3661369177a7524c5b9128b5bc2c67','唐亮','E',now(),now(),1,0);

insert into user(user_login_name,user_password,user_name,user_state,
                           user_creation_date,user_last_login_time,user_total_login_times,user_total_login_seconds
                           ) values('liling','8d3661369177a7524c5b9128b5bc2c67','张三丰','E',now(),now(),1,0);

insert into user(user_login_name,user_password,user_name,user_state,
                           user_creation_date,user_last_login_time,user_total_login_times,user_total_login_seconds
                           ) values('13810381040','8d3661369177a7524c5b9128b5bc2c67','郭靖','E',now(),now(),1,0);

insert into user(user_login_name,user_password,user_name,user_state,
                           user_creation_date,user_last_login_time,user_total_login_times,user_total_login_seconds
                           ) values('15142810980','8d3661369177a7524c5b9128b5bc2c67','黄蓉','E',now(),now(),1,0);


insert into membership(memb_card_num,memb_password, memb_lastname_ch,memb_firstname_ch,memb_lastname_sp,
                           memb_firstname_sp, memb_gender,memb_birthday,memb_certif_type,memb_certif_num,
                           memb_telephone1,memb_address,memb_reg_date,memb_email,
                           memb_rank,memb_account_stage,memb_account_mileage,memb_available_mileage,
                           memb_available_stage
                           ) values(
                 'TL00000001','8d3661369177a7524c5b9128b5bc2c67','唐','亮','TANG','LIANG','M','1980-01-21','身份证','510130198001214687',
                 '13810381038','海淀区，北三环西路甲18号钟鼎大厦B座7层',curdate(),'tangliang@tarena.com.cn','普卡会员',
                  0,0,0,0);

#插入乘客
insert into passenger(psg_name,psg_certif_type, psg_certif_num,psg_type,ref_memb_id,ref_user_id) 
values( '唐亮','身份证','510130198001214687','A',1 ,1);

insert into passenger(psg_name,psg_certif_type, psg_certif_num, psg_type,ref_user_id) 
values( '张晓明','身份证','430721198308215069','A',1);

insert into passenger(psg_name,psg_certif_type, psg_certif_num, psg_type,ref_user_id) 
values( '王艳红','身份证','430324198504206088','C',2);

insert into passenger(psg_name,psg_certif_type, psg_certif_num,psg_type, ref_user_id) 
values( '陈涛','身份证','510110198407115523','I',2);

#插入联系人
insert into contact(cont_name,cont_telephone,ref_user_id) values('唐亮','13810381040',1);
insert into contact(cont_name,cont_telephone,ref_user_id) values('张三','13810882088',2);
insert into contact(cont_name,cont_telephone,ref_user_id) values('李四','13830405060',3);

#插入订阅类型
insert into subscription(sub_id,sub_name) values(1,'机票信息');
insert into subscription(sub_id,sub_name) values(2,'促销信息');
insert into subscription(sub_id,sub_name) values(3,'里程奖励');
insert into subscription(sub_id,sub_name) values(4,'合作商户信息');
insert into subscription(sub_id,sub_name) values(5,'会员信用卡信息');

#更新用户
update user set ref_psgs_id='1,2' where user_id=1;
update user set ref_psgs_id='3,4' where user_id=2;

update user set ref_contacts_id='1' where user_id=1;
update user set ref_contacts_id='2' where user_id=2;
update user set ref_contacts_id='3' where user_id=3;

update user set user_subscriptions_id='1,2,3' where user_id=1;
update user set user_subscriptions_id='2,3,4' where user_id=2;
update user set user_subscriptions_id='2,4,5' where user_id=3;
update user set user_subscriptions_id='1,3' where user_id=4;

commit;
