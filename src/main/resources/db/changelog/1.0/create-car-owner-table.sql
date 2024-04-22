create table car_owner (
    car_id bigint,
    owner_id bigint,
    foreign key (car_id) references car(id),
    foreign key (owner_id) references owner(id),
    primary key (car_id, owner_id)
);