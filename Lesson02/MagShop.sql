drop database if exists MagShop;
create database MagShop;
use MagShop;

create table User(
id int not null primary key auto_increment,
user_firstname varchar(30) not null,
user_lastname varchar(30) not null,
user_age int not null, 
user_email varchar(50) not null unique
);

create table Magazine(
id int primary key auto_increment not null,
magazine_name varchar(30) not null,
magazine_pages int not null,
magazine_price decimal (6,2) not null
);

-- create table Subscription(
-- id int primary key auto_increment not null,
-- magazine_id int not null);
select * from User;
select * from Magazine;





