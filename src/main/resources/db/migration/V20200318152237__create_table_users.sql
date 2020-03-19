create table if not exists users (id serial primary key not null, name varchar (20), email varchar (30), password varchar(200), isActive boolean);
create table if not exists ticket (id serial primary key not null, user_id INTEGER, direction_id INTEGER);
create table if not exists train (id serial primary key not null, train_number INTEGER, train_name VARCHAR (50));
create table if not exists station (id serial primary key not null, station_name VARCHAR (120), station_code VARCHAR (20));
create table if not exists direction (id serial primary key not null, train_id INTEGER, station_from INTEGER, station_to INTEGER, departure_date timestamp,
FOREIGN key (train_id) REFERENCES train(id),
FOREIGN key (station_from) REFERENCES station(id),
FOREIGN key (station_to) REFERENCES station(id));