-- Create database (skip this on SQLite, just use the table)
CREATE DATABASE company;
USE company;

-- Create Employee table
CREATE TABLE Employee (
    id INT PRIMARY KEY,
    name VARCHAR(50),
    dept VARCHAR(50),
    salary INT,
    manager_id INT,
    join_date DATE
);

-- Insert sample data
INSERT INTO Employee (id, name, dept, salary, manager_id, join_date) VALUES
(1, 'Alice', 'HR', 50000, NULL, '2019-03-15'),
(2, 'Bob', 'HR', 45000, 1, '2020-06-10'),
(3, 'Charlie', 'IT', 70000, NULL, '2018-11-23'),
(4, 'David', 'IT', 65000, 3, '2020-02-14'),
(5, 'Eve', 'Finance', 60000, NULL, '2019-09-09'),
(6, 'Frank', 'Finance', 55000, 5, '2021-01-12'),
(7, 'Grace', 'IT', 80000, 3, '2020-12-30'),
(8, 'Heidi', 'Finance', 40000, 5, '2020-08-25');

select * from employee;
-- Second Highest Salary 
select MAX(salary) from Employee where salary< (select MAX(salary) from Employee);

-- Display department-wise average salary.
select dept, avg(salary) from Employee group by dept;


-- Retrieve employees earning more than their manager.
-- As few rows has NULL (atleast 1) so we will use self join to remove rows containing NULL
select e.id as EmpId, e.name as Employee, e.salary as Empsalary,
		m.id as MgrId, m.name as Manager, m.salary as Mgrsalary
from Employee e
JOIN Employee m
on e.manager_id=m.id -- Join first table's manager_id with second table's id
where e.salary>m.salary;


-- Show count of employees per department.
select dept, count(id) from employee group by dept;

-- List employees who joined in 2020.
select  * from employee where year(join_date)=2020;


