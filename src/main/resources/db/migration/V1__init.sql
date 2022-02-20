create table "user"
(
    id serial
        constraint user_pk
            primary key,
    "firstName" text not null,
    "lastName" text not null,
    email text not null,
    password int not null,
    active bool not null,
    role text not null
);


create table product
(
    id serial
        constraint product_pk
            primary key,
    brand text not null,
    price decimal(8,2) not null,
    "isDeleted" bool not null,
    name text not null,
    "productType" text not null
);


