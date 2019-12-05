-- 创建表

drop database if exists test1;
CREATE DATABASE IF NOT EXISTS test1 DEFAULT CHARSET utf8 COLLATE utf8_general_ci;
use test1;
create table if not exists test1
(
	编号 char(4) primary key,
	学号 char(10) unique not null,
	姓名 char(4),
	性别 VARCHAR(2),
	学院 VARCHAR(10),
	联系电话 char(11),
	QQ char(15)
)ENGINE=Innodb DEFAULT CHARSET=utf8;

CREATE TABLE IF NOT EXISTS `admin`
(
账号 varchar(20) not null,
姓名 char(4) not null,
编号 char(4) primary key,
密码 varchar(20) not null,
邮箱 VARCHAR(20) not null,
组别 char(3)
)ENGINE=Innodb DEFAULT CHARSET=utf8;

select * from test2 where 组别 = '硬件组';

select * from test2 where 组别 = '开发组';