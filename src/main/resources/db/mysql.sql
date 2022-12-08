CREATE DATABASE `account` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;

-- create table user
drop table if exists `account`.`user`;
create table `account`.`user` (
    `id` BIGINT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    `username` VARCHAR(32) COMMENT '用户名',
    `password` VARCHAR(32) COMMENT '密码',
    `create_timestamp` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    `modify_timestamp` TIMESTAMP COMMENT '修改时间'
);
