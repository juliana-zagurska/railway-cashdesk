create table if not exists users (id serial primary key not null, name varchar (20), email varchar (30), password varchar(200), isActive boolean);
create table if not exists roles(id serial primary key not null, name varchar(20));
create table if not exists users_roles(user_id INTEGER, roles_id INTEGER, FOREIGN KEY (user_id) REFERENCES users(id),
FOREIGN KEY (roles_id) REFERENCES roles(id));
INSERT INTO users(name, email, password, isActive) VALUES ('Alex', 'zagurska1@gmail.com ', '$2y$12$07Es2NcXm/zHEeKi4X1Pe.9nJ2iCuhIR9cUljCvl0BrO6D3YyNl3K', true);
INSERT INTO roles (name) VALUES ('ADMIN');
INSERT INTO users_roles(user_id, roles_id) VALUES (1, 1);
/*create table if not exists ticket (id serial primary key not null, user_id INTEGER, direction_id INTEGER);
create table if not exists train (id serial primary key not null, train_number INTEGER, train_name VARCHAR (50));
create table if not exists station (id serial primary key not null, station_name VARCHAR (120), station_code VARCHAR (20));
create table if not exists direction (id serial primary key not null, train_id INTEGER, station_from INTEGER, station_to INTEGER, departure_date timestamp,
FOREIGN key (train_id) REFERENCES train(id),
FOREIGN key (station_from) REFERENCES station(id),
FOREIGN key (station_to) REFERENCES station(id));*/