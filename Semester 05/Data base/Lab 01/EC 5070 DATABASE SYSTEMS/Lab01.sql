CREATE DATABASE LAB01_166;
use LAB01_166;
CREATE TABLE EMPLOYEE
( Fname VARCHAR(15) NOT NULL, -- Adding columns
Minit CHAR, 
Lname VARCHAR(15) NOT NULL, -- NOT NULL means the domain must have a value
Ssn CHAR(9) NOT NULL, -- CHAR padded to 9 spaces
Bdate DATE, -- Date, YYYY-MM-DD
Address VARCHAR(30), -- Variable length CHAR array (string)
Sex CHAR, -- Single character
Salary DECIMAL(10,2), -- Decimal up to a precision of two decimal points
Super_ssn CHAR(9), 
Dno INT NOT NULL, PRIMARY KEY (Ssn));
 -- Primary key constraint);
 

CREATE TABLE DEPARTMENT
(Dname VARCHAR(15) NOT NULL,
Dnumber INT NOT NULL,
Mgr_ssn CHAR(9) NOT NULL,
Mgr_start_date DATE,
PRIMARY KEY(Dnumber),
UNIQUE(Dname),
FOREIGN KEY(Mgr_ssn) REFERENCES EMPLOYEE(ssn));


CREATE TABLE DEPT_LOCATIONS
(Dnumber INT NOT NULL,
Dlocation VARCHAR(30) NOT NULL,
PRIMARY KEY(Dlocation),
FOREIGN KEY(Dnumber) REFERENCES DEPARTMENT(Dnumber));

CREATE TABLE PROJECT
(Pname VARCHAR(50) NOT NULL,
Pnumber INT NOT NULL,
Plocation VARCHAR(50) NOT NULL,
Dnum INT NOT NULL,
PRIMARY KEY(Pnumber),
FOREIGN KEY(Dnum) REFERENCES DEPARTMENT(Dnumber));

CREATE TABLE WORKS_ON
(Essn CHAR(9) NOT NULL,
Pno INT NOT NULL,
Hours INT NOT NULL,
FOREIGN KEY(Essn) REFERENCES EMPLOYEE(Ssn),
FOREIGN KEY(Pno) REFERENCES PROJECT(Pnumber));


CREATE TABLE DEPENDENT
(Essn CHAR(9) NOT NULL,
Dependent_name VARCHAR(15) NOT NULL,
Sex CHAR,
Bdate DATE,
Relationship VARCHAR(15) NOT NULL,
FOREIGN KEY(Essn) REFERENCES EMPLOYEE(Ssn));

INSERT INTO EMPLOYEE values
('Nipuna', 'B', 'Vishwajith', '201901156', '1999-04-04', '17, Main Street, TY', 'M', 150000, '201601037', 1),
('Franklin', 'T', 'Wong', '201902164', '1946-12-08', '638 Voss, Houston, TX', 'M', 40000,  '201901156', 2),
('Joyce', 'A', 'English', '201601037', '1962-12-31', '5631 Rice, Houston, TX', 'F', 25000, '201904290', 1),
('Ramesh', 'K', 'Narayan', '202004290', '1952-09-15', 'Fire Oak, Humble, TX', 'M', 38000, '201901156', 4);
INSERT INTO EMPLOYEE values
('James', 'E', 'Borg', '202001645', '1927-11-10', 'Stone, Houston, TX', 'M', 55000, NULL, 1),
('Jennifer', 'S', 'Wallace', '202103764', '1931-06-20', 'Berry, Bellaire, TX', 'F', 43000, NULL, 3),
('Ahmad', 'V', 'Jabbar', '201903423', '1959-03-29', 'Dallas, Houston, TX', 'M', 25000, '202103764', 3),
('Alicia', 'J', 'Zelaya', '201802185', '1958-06-19', 'Castle, SPring, TX', 'F', 25000, '201904290', 2);

INSERT INTO DEPARTMENT values
('Computer','1','201901156','2018-08-01'),
('Civil','2','201902164','2017-10-01'),
('Elec','3','201903423','2018-08-01'),
('Network','4','202004290','2020-08-01');

INSERT INTO DEPT_LOCATIONS values
('1','Jaffna'),
('2','Murukandy'),
('3','Killinochhci'),
('4','Vauniya');

INSERT INTO PROJECT values
('Syber Security','1001','Colombo','1'),
('Netwwork','1009','Vauniya','4'),
('Railway','1005','Kokavil','2'),
('AI','1004','Jaffna','1'),
('PCB Design','1003','Killinochchi','3');

INSERT INTO WORKS_ON values
('201901156','1001','35'),
('202103764','1005','45'),
('201802185','1009','15'),
('202004290','1003','40'),
('202001645','1004','20');

INSERT INTO DEPENDENT values
('201901156','John','M','1992-09-08',''),
('201802185','Haswahka','F','1995-04-07',''),
('201901156','Jaawahan','M','1999-10-29','');

SELECT * FROM lab01_166.employee;

SELECT Fname,Address 
FROM lab01_166.employee
WHERE Salary > 30000;

SELECT Dname,Dlocation
FROM lab01_166.department , lab01_166.dept_locations
WHERE lab01_166.department.Dnumber = lab01_166.dept_locations.Dnumber;
