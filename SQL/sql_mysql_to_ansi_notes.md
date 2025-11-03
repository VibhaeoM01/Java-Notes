# SQL Notes: MySQL to ANSI SQL Conversion Guide

## Database Setup

### Creating Tables and Initial Data

#### Department Table
```sql
-- Create the Department table with a primary key
CREATE TABLE Department (
    dept_id INT PRIMARY KEY, -- Unique identifier for each department
    dept_name VARCHAR(50)    -- Name of the department
);

-- Insert initial department records into the Department table
INSERT INTO Department VALUES
(1, 'HR'),                 -- HR department
(2, 'IT'),                 -- IT department
(3, 'Finance');            -- Finance department
```

#### Employee Table
```sql
-- Create the Employee table with a primary key and foreign key reference to Department
CREATE TABLE Employee (
    emp_id INT PRIMARY KEY,  -- Unique identifier for each employee
    emp_name VARCHAR(50),    -- Name of the employee
    salary INT,              -- Salary of the employee
    join_date DATE,         -- Date the employee joined
    dept_id INT,            -- Foreign key referencing the Department table
    manager_id INT,         -- ID of the employee's manager
    FOREIGN KEY (dept_id) REFERENCES Department(dept_id) -- Establish foreign key relationship
);

-- Insert initial employee records into the Employee table
INSERT INTO Employee VALUES
(101, 'Amit', 60000, '2020-01-15', 2, NULL),  -- Employee Amit in IT department
(102, 'Neha', 50000, '2019-03-20', 2, 101),   -- Employee Neha in IT department, managed by Amit
(103, 'Ravi', 45000, '2020-07-11', 1, 101),   -- Employee Ravi in HR department, managed by Amit
(104, 'Pooja', 70000, '2018-11-01', 3, NULL),  -- Employee Pooja in Finance department
(105, 'Karan', 40000, '2020-02-19', 1, 103);   -- Employee Karan in HR department, managed by Ravi
```

#### Project Table
```sql
-- Create the Project table with a primary key and foreign key reference to Employee
CREATE TABLE Project (
    proj_id INT PRIMARY KEY,  -- Unique identifier for each project
    proj_name VARCHAR(50),     -- Name of the project
    emp_id INT,                -- Foreign key referencing the Employee table
    FOREIGN KEY (emp_id) REFERENCES Employee(emp_id) -- Establish foreign key relationship
);

-- Insert initial project records into the Project table
INSERT INTO Project VALUES
(1, 'Payroll System', 101),  -- Project assigned to Amit
(2, 'Website Revamp', 102),   -- Project assigned to Neha
(3, 'Recruitment App', 103),  -- Project assigned to Ravi
(4, 'Tax Calculator', 104);    -- Project assigned to Pooja
```

## Common SQL Queries

### Date Functions

#### Filtering by Date in MySQL
```sql
-- Select employee names who joined in the year 2020
SELECT emp_name FROM Employee WHERE year(join_date) = 2020;
```

#### Filtering by Date in ANSI SQL
```sql
-- Alternative method to select employee names who joined in the year 2020
SELECT emp_name
FROM Employee
WHERE EXTRACT(YEAR FROM join_date) = 2020;
```

### Aggregate Functions

#### GROUP BY with Aggregate Functions
```sql
-- Select department names and average salaries, ensuring compliance with GROUP BY rules
SELECT d.dept_name AS name, AVG(e.salary) AS AVG 
FROM Department d 
LEFT JOIN Employee AS e ON d.dept_id = e.dept_id 
GROUP BY d.dept_id, d.dept_name; -- Grouping by department ID and name
```

### Finding Nth Highest Values

#### Using Subquery
```sql
-- Select the second highest salary from the Employee table
SELECT MAX(salary) AS maxi 
FROM Employee 
WHERE salary < (SELECT MAX(salary) FROM Employee); 
```

#### Using LIMIT and OFFSET
```sql
-- Alternative method to select the second highest salary
SELECT salary 
FROM Employee 
ORDER BY salary DESC 
LIMIT 1 OFFSET 1; -- LIMIT specifies the number of values to show, OFFSET specifies the starting point
```

### Joins

#### Self Join
```sql
-- Select employees whose salary is greater than their manager's salary
SELECT l.emp_id, l.emp_name, l.salary, r.salary, r.emp_id, r.emp_name 
FROM Employee AS l 
INNER JOIN Employee AS r ON l.manager_id = r.emp_id  
WHERE l.salary > r.salary; -- Condition to find employees earning more than their managers
```

#### LEFT JOIN Examples
```sql
-- Select employee names along with their department names
SELECT e.emp_name, d.dept_name 
FROM Department d 
LEFT JOIN Employee e ON e.dept_id = d.dept_id;  

-- Select employee names along with their project names
SELECT e.emp_name, p.proj_name 
FROM Project p 
LEFT JOIN Employee e ON e.emp_id = p.emp_id;
```

#### GROUP BY with HAVING Clause
```sql
-- Select department names and count of employees, ensuring compliance with GROUP BY rules
SELECT d.dept_name, COUNT(emp_id) 
FROM Department d 
JOIN Employee e ON d.dept_id = e.dept_id 
GROUP BY d.dept_id, d.dept_name 
HAVING COUNT(emp_id) > 1; -- Only include departments with more than one employee
```

### Subqueries

#### Using Subquery in WHERE Clause
```sql
-- Select employee names with salaries above the average salary
SELECT emp_name 
FROM Employee 
WHERE salary > (SELECT AVG(salary) FROM Employee); 
```

### Advanced Queries

#### MAX Aggregate with JOIN
```sql
-- Select maximum salary along with department names
SELECT MAX(e.salary), d.dept_name 
FROM Employee e 
LEFT JOIN Department d ON e.dept_id = d.dept_id 
GROUP BY d.dept_name; -- Grouping by department name
```

#### Finding Records with No Relationships
```sql
-- Select employee names who are not assigned to any project
SELECT e.emp_name 
FROM Employee e 
LEFT JOIN Project p ON p.emp_id = e.emp_id 
WHERE p.proj_name IS NULL; 
```

### String Functions

#### String Concatenation in MySQL
```sql
-- Concatenate employee names and salaries into a single string
SELECT CONCAT(emp_name, '-', salary) AS details 
FROM Employee;
```

#### String Concatenation in ANSI SQL
```sql
-- ANSI SQL way to concatenate employee names and salaries
SELECT emp_name || '-' || salary AS details 
FROM Employee;
```

### Complex Queries

#### Using COALESCE with Joins and Filtering
```sql
-- Select artist names and count of followers since 2018, using COALESCE to handle nulls
SELECT a.artist_name, COALESCE(COUNT(f.follower_id), 0) 
FROM artist a 
LEFT JOIN follower f ON a.artist_id = f.artist_id 
AND EXTRACT(YEAR FROM f.follow_data) >= 2018 
GROUP BY a.artist_name, a.artist_id;
```

#### Multiple Join with GROUP BY and HAVING
```sql
-- Select follower IDs and user names, counting followers with a minimum threshold
SELECT f.follower_id, u.first_name, u.last_name, COUNT(follower_id) 
FROM user u 
INNER JOIN follower f ON u.user_id = f.follower_id 
GROUP BY f.follower_id 
HAVING COUNT(follower_id) >= 5; -- Only include followers with 5 or more followings
```

### Additional Examples

#### Complex Date Filtering
```sql
-- SQL query to find all employees who either joined in the last 2 months or in January and March of any year
```
