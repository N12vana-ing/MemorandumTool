create table `user_info`(
	`id` bigint auto_increment COMMENT '自增id',
	`username` varchar(50) not null COMMENT '用户名',
	`user_password` varchar(50) not null COMMENT '密码',
	`telephone` varchar(50) not null COMMENT '手机号码',
	`email` varchar(50) not null COMMENT '邮箱',
	`user_code` int(2) not null COMMENT '标志位 1、新建 2、更新 3、删除',
	`createtime` datetime not null COMMENT '创建时间',
	`updatetime` datetime COMMENT '最后更新时间',
	primary key (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;