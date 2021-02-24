DROP TABLE IF EXISTS departments;
CREATE TABLE departments(
    id int AUTO_INCREMENT  PRIMARY KEY,
    name varchar(1000) NOT NULL
);

DROP TABLE IF EXISTS employee;
CREATE TABLE employee(
    id int AUTO_INCREMENT  PRIMARY KEY,
    first_name varchar(100) NOT NULL,
    last_name varchar(100) NOT NULL,
    address varchar(255) NULL,
    email varchar(100) NOT NULL,
    department_id int NOT NULL,
    FOREIGN KEY (department_id) REFERENCES departments(id)
);

