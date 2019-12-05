drop database if exists javaweb;
create database if not exists javaweb DEFAULT charset utf8 collate utf8_general_ci;
use javaweb;

drop table if exists `admin`;
create table if not exists `admin`
(
`id` int not null auto_increment comment '编号',
`name` char(20)  not null comment '姓名',
`password`  varchar(20) not null comment '密码',
`email` varchar(20) not null comment '邮箱',
`group` char(3) default null comment '开发组/硬件组',
primary key (`id`)
)engine=innodb auto_increment= 0 default charset=utf8;

drop table if exists `user`;
create table if not exists `user`
(
`id` int not null auto_increment comment '编号',
`name` char(20)  not null comment '姓名',
`password`  varchar(20) not null comment '密码',
primary key (`id`)
)engine=innodb auto_increment= 0 default charset=utf8;