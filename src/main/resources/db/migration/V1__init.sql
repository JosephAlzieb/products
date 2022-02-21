create table user
(
    id int auto_increment,
    firstname text not null,
    lastname text not null,
    email text not null,
    password text not null,
    active boolean not null,
    role text not null,
    constraint user_pk
        primary key (id)
);



create table product
(
    id int auto_increment,
    brand text not null,
    price decimal(8,2) not null,
    isdeleted boolean not null,
    name text not null,
    producttype text not null,
    constraint product_pk
        primary key (id)
);
