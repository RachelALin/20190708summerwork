 
-- 用户表
DROP table if exists `users`;
CREATE table if not exists `users`(
	`id` int auto_increment primary key,
	`user_name` char(20) not null,
	`user_password` char(10) not null,
	`tel` char(11) not null
	)ENGINE=Innodb DEFAULT CHARSET=utf8;

-- 粉丝表
DROP table if exists `follow_ships`;
CREATE table if not exists `follow_ships`(
	`id` int auto_increment primary key,
	`user_id` int not null foreign key,
	`follow_by_id` int not null
	)ENGINE=Innodb DEFAULT CHARSET=utf8;

-- 发表文章的表
DROP table if exists `publish_article`;
CREATE table if not exists `publish_article`(
	`id` int auto_increment primary key,
	`user_id` int not null,
	`art_type` char(10) not null COMMENT'原创/转发',
	`art_content` char(20) not null
	)ENGINE=Innodb DEFAULT CHARSET=utf8;

-- 评论表
DROP table if exists `comments`;
CREATE table if not exists `comments`(
	`id` int auto_increment primary key,
	`user_id` int not null,
	`art_id` int not null,
	`ans_id` int not null,
	`com_by_id` int not null,
	`com_type` char(10) not null,
	`com_content` char(20) not null
	)ENGINE=Innodb DEFAULT CHARSET=utf8;
	
-- 评论回复表
DROP table if exists `answer`;
CREATE table if not exists `answer`(
	`id` int auto_increment primary key,
	`user_id` int not null,
	`art_id` int not null,
	`com_id` int not null,
	`ans_content` char(20) not null
	)ENGINE=Innodb DEFAULT CHARSET=utf8;	
	
-- 点赞表
DROP table if exists `upvote`;
CREATE table if not exists `upvote`(
	`id` int auto_increment primary key,
	`user_id` int not null,
	`art_id` int not null,
	`upvote_by_id` int not null,
	`vote_content` char(20) not null
	)ENGINE=Innodb DEFAULT CHARSET=utf8;
	
-- 感谢表
DROP table if exists `thank`;
CREATE table if not exists `thank`(
	`id` int auto_increment primary key,
	`user_id` int not null,
	`art_id` int not null,
	`com_id` int not null,
	`thank_by_id` int not null,
	`vote_content` char(20) not null
	)ENGINE=Innodb DEFAULT CHARSET=utf8;
	
-- 收藏表
DROP table if exists `collection`;
CREATE table if not exists `collection`(
	`id` int auto_increment primary key,
	`user_id` int not null,
	`art_id` int not null,
	`co_by_id` int not null,
	`col_content` char(20) not null
	)ENGINE=Innodb DEFAULT CHARSET=utf8;
	
-- 分享表
DROP table if exists `share`;
CREATE table if not exists `share`(
	`id` int auto_increment primary key,
	`user_id` int not null,
	`art_id` int not null,
	`share_id` int not null
	)ENGINE=Innodb DEFAULT CHARSET=utf8;
	
-- 图片的处理
DROP table if exists `picture`;
CREATE table if not exists `picture`(
	`id` int auto_increment primary key,
	`user_id` int not null,
	`art_id` int not null,
	`pic_path` char(10) not null
	)ENGINE=Innodb DEFAULT CHARSET=utf8;

-- 查询出某个用户关注的所有用户的关注的问题的所有信息
SELECT * from `users` where id = (SELECT follow_by_id from follow_ships where user_id = 1);
-- 查询出某个用户写的文章中所有图片的具体路径
SELECT pic_path from picture WHERE art_id = (SELECT id from publish_article where user_id = 1);
-- 能够查询出一个问题下的多个用户的回答（用户信息、点赞、感谢、评论、收藏数目等关联信息），每个回答下面还有多个用户的评论
SELECT com_content as 评论 from comments where art_id = 1 UNION SELECT user_id as 用户 from publish_article where id = 1 UNION SELECT count(upvote_by_id) as 点赞数 from upvote where art_id = 1 UNION SELECT count(co_by_id) as 收藏数 from collection where art_id = 1 UNION SELECT count(thank_by_id) as 感谢数 from thank where art_id = 1;
