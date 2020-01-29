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


DROP TABLE IF EXISTS teams;
CREATE TABLE teams (
  team_id int(11) NOT NULL,
  team_name varchar(100) DEFAULT NULL,
  event_id int(11) DEFAULT NULL,
  task_id int(11) DEFAULT NULL,
  PRIMARY KEY (team_id)
);


DROP TABLE IF EXISTS users;
CREATE TABLE users (
  id int(11) NOT NULL,
  user_id varchar(25) DEFAULT NULL,
  user_name varchar(20) DEFAULT NULL,
  user_role int(11) DEFAULT NULL,
  PRIMARY KEY (id)
);