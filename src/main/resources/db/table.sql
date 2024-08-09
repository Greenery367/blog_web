
create table user_tb (
	id int primary key auto_increment not null,
    name varchar(20) not null unique,
    user_id varchar(20) not null unique,
    password varchar(20) not null
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

create table post_tb(
	id int primary key auto_increment not null,
    title varchar(50) not null,
    content text not null,
    user_id int references user_tb(id),
    blog_id int references blog_tb(id),
    category_id int references category_tb(id)
);