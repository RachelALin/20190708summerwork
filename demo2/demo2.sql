drop database if exists springdemo;
create database if not exists springdemo DEFAULT charset utf8 collate utf8_general_ci;
use springdemo;

drop table if exists `admin`;
create table if not exists `admin`
(
`id` int not null auto_increment comment '±àºÅ',
`username` varchar(20)  unique comment 'ÐÕÃû',
`password`  varchar(20) not null comment 'ÃÜÂë',
primary key (`id`)
)engine=innodb auto_increment= 0 default charset=utf8;