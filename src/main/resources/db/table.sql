
create table user_tb (
	id int primary key auto_increment not null,
    username varchar(20) not null unique,
    password varchar(20) not null,
    nickname varchar(20) not null,
    origin_file_name varchar(200),
    upload_file_name varchar(200),
    created_at timestamp default now()
);

create table blog_tb(
	id int primary key not null auto_increment,
    name varchar(30) not null,
    user_id int references user_tb(id)
);

create table category_tb(
	id int primary key auto_increment not null,
    name varchar(20) not null,
    user_id int references user_tb(id),
    blog_id int references blog_tb(id)
);

create table board_tb(
	id int primary key auto_increment not null,
    title varchar(50) not null,
    content text not null,
    user_id int references user_tb(id),
    blog_id int references blog_tb(id),
    category_id int references category_tb(id)
);