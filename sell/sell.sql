---- 数据 ----
-- 插入数据
insert into product_category(category_id, category_name, category_type) values (1, '热销榜', 2);

insert into product_category(category_id, category_name, category_type) values (6, '女生最爱', 3);

insert into product_category(category_id, category_name, category_type) values (8, '男生专享', 4);

insert into product_info(product_id, product_name, product_price, product_stock, product_description, product_icon, product_status, category_type) values('123456','皮蛋粥',3.2,100,'很好吃', 'image.imooc.com/1.jpg',0,2);

insert into product_info(product_id, product_name, product_price, product_stock, product_description, product_icon, product_status, category_type) values('123457','皮皮虾',3.2,100,'很好吃', 'image.imooc.com/2.jpg',0,2);

insert into order_master(order_id, buyer_name, buyer_phone, buyer_address, buyer_openid, order_amount, order_status, pay_status) values('12367', '师兄','13860138600','慕课网总部','1101110',2.5,0,0);
	
insert into order_detail(detail_id, order_id, product_id, product_name, product_price, product_quantity, product_icon) values('12367', '123456','157875196366160022','皮蛋粥',0.01,2,'http://xxx.com');


---- 表 ----
-- 商品表
create table `product_info`(
	`product_id` varchar(32) not null,
	`product_name` varchar(64) not null comment '商品名称',
	`product_price` decimal(8,2) not null comment '单价',
	`product_stock` int not null comment '库存',
	`product_description` varchar(64) comment '描述',
	`product_icon` varchar(512) comment '小图',
	`product_status` tinyint default '0' comment '商品状态，0正常1下架',
	`category_type` int not null comment '类目编号',
	`create_time` timestamp not null default current_timestamp comment '创建时间',
	`update_time` timestamp not null default current_timestamp on update current_timestamp comment '修改时间',
	primary key(`product_id`)
)comment '商品表';

-- 类目表
create table `product_category`(
	`category_id` int not null auto_increment,
	`category_name` varchar(64) not null comment '类目名字',
	`category_type` int not null comment '类目编号',
	`create_time` timestamp not null default current_timestamp comment '创建时间',
	`update_time` timestamp not null default current_timestamp on update current_timestamp comment '修改时间',
	primary key(`category_id`),
	unique key `uqe_category_type` (`category_type`)
) comment '类目表';

-- 订单表
create table `order_master`(
	`order_id` varchar(32) not null,
	`buyer_name` varchar(32) not null comment '买家名字',
	`buyer_phone` varchar(32) not null comment '买家电话',
	`buyer_address` varchar(128) not null comment '买家地址',
	`buyer_openid` varchar(64) not null comment '买家微信openid',
	`order_amount` decimal(8,2) not null comment '订单总金额',
	`order_status` tinyint(3) not null default '0' comment '订单状态，默认0新下单',
	`pay_status` tinyint(3) not null default '0' comment '支付状态，默认0未支付',
	`create_time` timestamp not null default current_timestamp comment '创建时间',
	`update_time` timestamp not null default current_timestamp on update current_timestamp comment '修改时间',
	primary key(`order_id`),
	key `idx_buyer_openid` (`buyer_openid`)
) comment '订单表';

-- 订单详情表
create table `order_detail`(
	`detail_id` varchar(32) not null,
	`order_id` varchar(32) not null,
	`product_id` varchar(32) not null,
	`product_name` varchar(64) not null comment '商品名称',
	`product_price` decimal(8,2) not null comment '商品价格',
	`product_quantity` int not null comment '商品数量',
	`product_icon` varchar(512) comment '商品小图',
	`create_time` timestamp not null default current_timestamp comment '创建时间',
	`update_time` timestamp not null default current_timestamp on update current_timestamp comment '修改时间',
	primary key(`detail_id`),
	key `idx_order_id` (`order_id`)
) comment '订单详情表';

-- 卖家信息表
create table `seller_info`(
	`id` varchar(32) not null,
	`username` varchar(32) not null,
	`password` varchar(32) not null,
	`openid` varchar(64) not null comment '卖家微信openid',
	`create_time` timestamp not null default current_timestamp comment '创建时间',
	`update_time` timestamp not null default current_timestamp on update current_timestamp comment '修改时间',
	primary key(`id`)
) comment '卖家信息表';