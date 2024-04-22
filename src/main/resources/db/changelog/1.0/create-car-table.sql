create table car (
    id bigserial primary key,
    brand varchar(50) not null ,
    model varchar(50) not null ,
    color varchar(25) not null ,
    registration_number varchar(25) not null ,
    model_year int not null ,
    price int not null
);