DROP TABLE IF EXISTS events;
create table events (
  id int(11) NOT NULL AUTO_INCREMENT,
  event_name varchar(100) DEFAULT NULL,
  created_by varchar(10) DEFAULT NULL,
  created_date date DEFAULT NULL,
  updated_by varchar(10) DEFAULT NULL,
  team_id int(11) DEFAULT NULL,
  PRIMARY KEY (id));

INSERT INTO EVENTS VALUES (1,'Started Event 22/12/2019', 'Mark Peter', '2012-09-17', 'Mark', 12 ); 
INSERT INTO EVENTS VALUES (2,'Started Event 22/12/2019', 'Peter', '2012-09-17', 'Peter', 13 ); 
INSERT INTO EVENTS VALUES (3,'Started Event 22/12/2019', 'Kevin', '2012-09-17', 'Peter', 14 ); 
INSERT INTO EVENTS VALUES (4,'Started Event 22/12/2019', 'John', '2012-09-17', 'John', 15 ); 
INSERT INTO EVENTS VALUES (5,'Started Event 22/12/2019', 'Smith', '2012-09-17', 'Smith', 16 );  
  
  
  
DROP TABLE IF EXISTS roles;
CREATE TABLE roles (
  role_id int(11) NOT NULL,
  role_name varchar(25) DEFAULT NULL,
  role_user_id int(11) DEFAULT NULL,
  PRIMARY KEY (role_id),
  UNIQUE KEY roles_role_id_uindex (role_id),
  UNIQUE KEY roles_role_user_id_uindex (role_user_id)
);



INSERT INTO ROLES VALUES (1, 'Admin', 11);
INSERT INTO ROLES VALUES (2, 'User', 12);
INSERT INTO ROLES VALUES (3, 'Updater', 13);
INSERT INTO ROLES VALUES (4, 'Creator', 14);



DROP TABLE IF EXISTS task_updates;
CREATE TABLE task_updates (
  id int(11) NOT NULL,
  task_name varchar(45) DEFAULT NULL,
  task_updated_by varchar(45) DEFAULT NULL,
  task_created_by varchar(45) DEFAULT NULL,
  task_created_date date DEFAULT NULL,
  task_updated_date date DEFAULT NULL,
  task_id int(11) DEFAULT NULL,
  PRIMARY KEY (id)
);



DROP TABLE IF EXISTS tasks;
CREATE TABLE tasks (
  task_id int(11) NOT NULL,
  task_name varchar(100) DEFAULT NULL,
  team_id int(11) DEFAULT NULL,
  task_created date DEFAULT NULL,
  task_updated varchar(20) DEFAULT NULL,
  event_id int(11) DEFAULT NULL,
  PRIMARY KEY (task_id)
);

INSERT INTO TASKS VALUES (1, 'Services', 22 , '2019-06-26', 'Peter', 4);
INSERT INTO TASKS VALUES (2, 'Microservices', 22 , '2019-06-26', 'Martin', 3);
INSERT INTO TASKS VALUES (3, 'Operations', 23 , '2019-06-26', 'Kumar', 2);
INSERT INTO TASKS VALUES (4, 'Centos', 24 , '2019-06-26', 'Smith', 4);
INSERT INTO TASKS VALUES (5, 'Zlinux', 23 , '2019-06-26', 'John', 5);
INSERT INTO TASKS VALUES (6, 'Ubuntu', 26 , '2019-06-26', 'Kevin', 1);
INSERT INTO TASKS VALUES (7, 'Windows', 25 , '2019-06-26', 'Raja', 2);


DROP TABLE IF EXISTS teams;
CREATE TABLE teams (
  team_id int(11) NOT NULL,
  team_name varchar(100) DEFAULT NULL,
  event_id int(11) DEFAULT NULL,
  task_id int(11) DEFAULT NULL,
  PRIMARY KEY (team_id)
);

INSERT INTO TEAMS VALUES (22, 'Services', 2 , 3);
INSERT INTO TEAMS VALUES (23, 'Operations', 1 , 2);
INSERT INTO TEAMS VALUES (24, 'Centos', 3 , 3);
INSERT INTO TEAMS VALUES (25, 'Zlinux', 2 , 4);
INSERT INTO TEAMS VALUES (26, 'Ubuntu', 4 , 5);
INSERT INTO TEAMS VALUES (27, 'Windows', 1 , 6);


DROP TABLE IF EXISTS users;
CREATE TABLE users (
  id int(11) NOT NULL,
  user_id varchar(25) DEFAULT NULL,
  user_name varchar(20) DEFAULT NULL,
  user_role int(11) DEFAULT NULL,
  PRIMARY KEY (id)
);

INSERT INTO USERS VALUES(21,'Peter','peter@gmail.com',11);
INSERT INTO USERS VALUES(22,'Smith','smith@gmail.com',12);
INSERT INTO USERS VALUES(23,'Keviin','kevin@gmail.com',13);
INSERT INTO USERS VALUES(24,'Raja','raja@gmail.com',14);




