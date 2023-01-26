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
Dlocation VARCHAR(15) NOT NULL,
PRIMARY KEY(Dnumber,Dlocation),
FOREIGN KEY(Dnumber) REFERENCES DEPARTMENT(Dnumber));

CREATE TABLE PROJECT
(Pname VARCHAR(15) NOT NULL,
Pnumber INT NOT NULL,
Plocation VARCHAR(15) NOT NULL,
Dnum INT NOT NULL,
PRIMARY KEY(Pnumber),
UNIQUE(Pname),
FOREIGN KEY(Dnum) REFERENCES DEPARTMENT(Dnumber));

CREATE TABLE WORKS_ON
(Essn CHAR(9) NOT NULL,
Pno INT NOT NULL,
Hours DECIMAL(3,1) NOT NULL,
PRIMARY KEY(Essn,Pno),
FOREIGN KEY(Essn) REFERENCES EMPLOYEE(Ssn),
FOREIGN KEY(Pno) REFERENCES PROJECT(Pnumber));


CREATE TABLE DEPENDENT
(Essn CHAR(9) NOT NULL,
Dependent_name VARCHAR(15) NOT NULL,
Sex CHAR,
Bdate DATE,
Relationship VARCHAR(8) NOT NULL,
PRIMARY KEY(Essn,Dependent_name),
FOREIGN KEY(Essn) REFERENCES EMPLOYEE(Ssn));

INSERT INTO EMPLOYEE values
('Nipuna', 'B', 'Vishwajith', '112346523', '1999-04-04', '17, Main Street, TY', 'M', 150000, '123456789', 1),
('John', 'B', 'Smith', '123456789', '1955-01-09', '731 Fondren, Houston, TX', 'M', 30000, '987654321', 5),
('Franklin', 'T', 'Wong', '333445555', '1945-12-08', '638 Voss, Houston, TX', 'M', 40000,  '888665555', 5),
('Joyce', 'A', 'English', '453453453', '1962-12-31', '5631 Rice, Houston, TX', 'F', 25000, '333445555', 5),
('Ramesh', 'K', 'Narayan', '666884444', '1952-09-15', 'Fire Oak, Humble, TX', 'M', 38000, '333445555', 5),
('James', 'E', 'Borg', '888665555', '1927-11-10', 'Stone, Houston, TX', 'M', 55000, NULL, 1),
('Jennifer', 'S', 'Wallace', '987654321', '1931-06-20', 'Berry, Bellaire, TX', 'F', 43000, '888665555', 4),
('Ahmad', 'V', 'Jabbar', '987987987', '1959-03-29', 'Dallas, Houston, TX', 'M', 25000, '987654321', 4),
('Alicia', 'J', 'Zelaya', '999887777', '1958-06-19', 'Castle, SPring, TX', 'F', 25000, '987654321', 4);

INSERT INTO DEPARTMENT values
('Research','5','333445555','1988-05-02'),
('Administration','4','987654321','1995-01-01'),
('Headquarters','3','888665555','1981-06-19'),
('Network','1','112346523','1989-08-01');

INSERT INTO DEPT_LOCATIONS values
('1','Houston'),
('4','Stafford'),
('5','Bellarie'),
('5','Sugarland');

INSERT INTO PROJECT values
('ProductX','1','Bellaire','5'),
('ProductY','2','Sugarland','5'),
('Computerization','10','Stafford','4'),
('Reorganization','20','Houston','1'),
('Newbenefits','30','Stafford','4');

INSERT INTO WORKS_ON values
('123456789','1','32.5'),
('123456789','2','7.5'),
('987654321','30','20'),
('333445555','20','10'),
('999887777','10','10');

INSERT INTO DEPENDENT values
('333445555','Alice','F','1986-04-05','Daughter'),
('333445555','Theodore','M','1983-10-25','Son'),
('987654321','Abner','M','1942-02-28','Spouse'),
('123456789','Alice','F','1988-12-30','Daughter');

SELECT * FROM lab01_166.employee;

SELECT Fname,Address 
FROM lab01_166.employee
WHERE Salary > 30000;

SELECT Dname,Dlocation
FROM lab01_166.department , lab01_166.dept_locations
WHERE lab01_166.department.Dnumber = lab01_166.dept_locations.Dnumber;

SELECT Dlocation,Mgr_ssn
FROM lab01_166.dept_locations , lab01_166.department
WHERE lab01_166.dept_locations.Dnumber = lab01_166.department.Dnumber;

SELECT Dname,Fname
FROM lab01_166.DEPARTMENT , lab01_166.EMPLOYEE
WHERE lab01_166.DEPARTMENT.Mgr_ssn = lab01_166.EMPLOYEE.Ssn;

SELECT Fname,Dependent_name,Relationship
FROM lab01_166.EMPLOYEE , lab01_166.DEPENDENT
WHERE lab01_166.EMPLOYEE.Ssn = lab01_166.DEPENDENT.Essn;

SELECT Fname,Address
FROM lab01_166.EMPLOYEE
WHERE (Salary>25000) AND (Salary<50000);

SELECT Dname,Mgr_start_date,Dlocation
FROM lab01_166.DEPARTMENT,lab01_166.DEPT_LOCATIONS
WHERE lab01_166.DEPARTMENT.Dnumber = lab01_166.DEPT_LOCATIONS.Dnumber;

SELECT Pname,Dname,Dnumber
FROM lab01_166.PROJECT,lab01_166.DEPARTMENT
WHERE (lab01_166.DEPARTMENT.Dnumber = lab01_166.PROJECT.Dnum);

SELECT * , Dname
FROM lab01_166.EMPLOYEE , lab01_166.DEPARTMENT
WHERE (lab01_166.EMPLOYEE.Dno = lab01_166.DEPARTMENT.Dnumber) AND lab01_166.EMPLOYEE.Sex = 'F';


