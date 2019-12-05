-- 创建表
drop database if exists test1;
create database if not exists test1 DEFAULT CHARSET utf8 COLLATE utf8_general_ci;
use test1;
create table if not exists test2
(
	编号 char(4) primary key,
	学号 char(10) unique not null,
	姓名 char(4),
	性别 VARCHAR(2),
	学院 VARCHAR(10),
	联系电话 char(11),
	QQ char(15)
)ENGINE=Innodb DEFAULT CHARSET=utf8;
-- 增加新字段：组别、兴趣爱好、专业表
ALTER table test2 add 组别 VARCHAR(4);
ALTER table test2 add 兴趣爱好 VARCHAR(20);
ALTER table test2 add 专业 char(8);
-- 1.插入一条报名信息：张三，2017112101，男（其余为空）
Insert Into test2 (编号, 姓名, 学号, 性别) values('01','张三','2017112101','男');
-- 2. 根据修改学号为“2017112101”学生的姓名为“李四”
update test2 set 姓名 = '李四' where 学号 = '2017112101';
-- 5.删除学号为“2017112101”的学生信息及关联信息
DELETE from test2 where 学号 = '2017112101';
-- 添加时间
ALTER table test2 add 时间 datetime NOT NULL DEFAULT NOW();

-- 插入多条信息
Insert Into test2 (编号, 学号, 姓名, 性别, 学院,专业, 联系电话, QQ, 组别, 兴趣爱好) values
('02', '2017221109', '王五', '男', '计算机与信息学院','20172211','12893929939','98889989','开发组', '变魔术'); 
Insert Into test2 (编号, 学号, 姓名, 性别, 学院,专业, 联系电话, QQ, 组别, 兴趣爱好) values
('03', '2017112203', '李二', '男', '计算机与信息学院','20171122','12123429939','988123489','硬件组', '打篮球'); 
Insert Into test2 (编号, 学号, 姓名, 性别, 学院,专业, 联系电话, QQ, 组别, 兴趣爱好) values
('01', '2017221104', '张够胆', '女', '计算机与信息学院','20172211','12891212339','9129989','开发组', '打篮球'); 
Insert Into test2 (编号, 学号, 姓名, 性别, 学院,专业, 联系电话, QQ, 组别, 兴趣爱好) values
('05', '2017112209', '李莫愁', '男', '计算机与信息学院','20171122','12812212939','133889989','开发组', '全才') ;
Insert Into test2 (编号, 学号, 姓名, 性别, 学院,专业, 联系电话, QQ, 组别, 兴趣爱好) values
('04', '2017221102', '张三', '男', '计算机与信息学院','20172211','12821212339','9212989','开发组', '打篮球') , ('06', '2017221106', '张鼠胆', '女', '计算机与信息学院','20172211','12321212339','91293232','硬件组', '跳舞'); 
Insert Into test2 (编号, 学号, 姓名, 性别, 学院,专业, 联系电话, QQ, 组别, 兴趣爱好) values ('07', '2017121204', '张牛牛', '男', '计算机与信息学院','20171212','12321246439','923456232','硬件组', '跳舞'); 
Insert Into test2 (编号, 学号, 姓名, 性别, 学院,专业, 联系电话, QQ, 组别, 兴趣爱好) values ('08', '2018112331', '胡说', '女', '计算机与信息学院','20181123','12323336439','923333232','硬件组', '打游戏'); 
-- 6.查找报名开发组的所有学生学号和姓名
SELECT 学号, 姓名 from test2 where 组别 = '开发组';
-- 7.查找开发组和硬件组的报名人数
SELECT count(编号) from test2 where 组别 = '硬件组';
SELECT count(编号) from test2 where 组别 = '开发组';
INSERT Into `admin` (账号,姓名,编号,密码,邮箱) VALUES('admin','lily','01','123456','1236@qq.com')
,('admin2','mike','02','123456','tree@ctgu.edu.cn');
-- 3.修改账号为“admin”的管理员密码为“adminadmin”
UPDATE `admin` set 账号 = 'admin',密码 = 'adminadmin' ;
-- 4.修改邮箱为“tree@ctgu.edu.cn”的管理员密码为“admin”，姓名为“tree”
UPDATE `admin` set 姓名 = 'tree',密码 = 'admin' where 邮箱 = 'tree@ctgu.edu.cn';

-- 8.查找近24小时报名的学生的姓名
SELECT * FROM test2 WHERE DATEDIFF(NOW(),时间) < 1;

SELECT 兴趣爱好,count(*) as 最频繁的兴趣爱好 FROM test2 GROUP BY 兴趣爱好 ORDER BY count(*) DESC;

--  14.查找出所有姓“王”的学生姓名和学号
SELECT 姓名,学号 FROM test2 WHERE 姓名 like '王%';
-- 	15.计算出所有学生的平均报名时间（距离报名开始时间，可任意指定）
SELECT AVG(DATEDIFF(时间,'2019-7-17')) as 平均报名时间 FROM test2;
-- 创建专业表
create table if not exists profession
(
		编号 char(4) primary key,
		专业 char(8),
		姓名 char(4),
		学号 char(10) unique not null,
		成绩 int not null
)ENGINE=Innodb DEFAULT CHARSET=utf8;

INSERT INTO profession (编号, 专业, 姓名,学号, 成绩) values ('01', '20171122','李二', '2017112203',94), ('02', '20171122','李莫愁', '2017112209',91),('03', '20172211','张够胆', '2017221104',93),('04', '20171122','王五', '2017221109',92),('05', '20172211','张三', '2017221102',59),('06', '20172211','张鼠胆', '2017221106',61),('07', '20171212','张牛牛', '2017121204',92),('08', '20181123','胡说', '2018112331',77);
 
-- 9.查找各兴趣关键字出现的频率，并按从大到小排序
	SELECT `兴趣爱好`,COUNT(*) from test2 GROUP BY `兴趣爱好` order by count(*)desc;
-- 查找出现频率最高的关键字，并找出相应学生的姓名

SELECT DISTINCT 姓名, 兴趣爱好 from test2 where 兴趣爱好 = (select 兴趣爱好 from test2 group by 兴趣爱好 order by count(*) desc limit 1);

-- 根据学号前四位查找不同年级学生的报名人数，从大到小排序
SELECT left(学号, 4)as 年级, count(*) as 总人数 from test2 GROUP BY left(学号, 4) order by count(*) desc;

-- 根绝学号前七位找出报名人数排前三的专业和报名人数 

select left (学号, 7)as 专业,count(*) as 总人数 from profession GROUP BY left
(学号,7)ORDER BY 总人数 desc limit 3;

-- 查找出报名开发组和硬件组的男生女生人数，并计算占总人数的相应比例
-- select count(*) as 硬件组 from test2 where 组别 = '硬件组' and 性别 = '女' union select count(*) as 硬件组 from test2 where 组别 = '硬件组' and 性别 = '男' union
-- select count(*) as 开发组 from test2 where 组别 = '开发组' and 性别 = '女' union select count(*)  as 开发组 from test2 where 组别 = '开发组' and 性别 = '男';
-- SELECT count(*
	
	SELECT sum(CASE when 组别 = '开发组' and 性别 = '男' then 1 else 0 end)as 开发组男生,sum(CASE when 组别 = '开发组' and 性别 = '男' then 1 else 0 end)/count(*) as 开发组男生占比,sum(CASE when 组别 = '开发组' and 性别 = '女' then 1 else 0 end)as 开发组女生,sum(CASE when 组别 = '开发组' and 性别 = '女' then 1 else 0 end)/count(*) as 开发组女生占比,sum(CASE when 组别 = '硬件组' and 性别 = '男' then 1 else 0 end)as 硬件组男生,sum(CASE when 组别 = '硬件组' and 性别 = '男' then 1 else 0 end)/count(*) as 硬件组男生占比,sum(CASE when 组别 = '硬件组' and 性别 = '女' then 1 else 0 end)as 硬件组女生,sum(CASE when 组别 = '硬件组' and 性别 = '女' then 1 else 0 end)/count(*) as 硬件组女生占比 from test2;

