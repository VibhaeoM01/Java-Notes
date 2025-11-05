CREATE TABLE Department (
    dept_id INT PRIMARY KEY,
    dept_name VARCHAR(50)
);

INSERT INTO Department VALUES
(1, 'HR'),
(2, 'IT'),
(3, 'Finance');

CREATE TABLE Employee (
    emp_id INT PRIMARY KEY,
    emp_name VARCHAR(50),
    salary INT,
    join_date DATE,
    dept_id INT,
    manager_id INT,
    FOREIGN KEY (dept_id) REFERENCES Department(dept_id)
);

INSERT INTO Employee VALUES
(101, 'Amit', 60000, '2020-01-15', 2, NULL),
(102, 'Neha', 50000, '2019-03-20', 2, 101),
(103, 'Ravi', 45000, '2020-07-11', 1, 101),
(104, 'Pooja', 70000, '2018-11-01', 3, NULL),
(105, 'Karan', 40000, '2020-02-19', 1, 103);


CREATE TABLE Project (
    proj_id INT PRIMARY KEY,
    proj_name VARCHAR(50),
    emp_id INT,
    FOREIGN KEY (emp_id) REFERENCES Employee(emp_id)
);

INSERT INTO Project VALUES
(1, 'Payroll System', 101),
(2, 'Website Revamp', 102),
(3, 'Recruitment App', 103),
(4, 'Tax Calculator', 104);


select emp_name from Employee where year(join_date)=2020;

SELECT emp_name
FROM Employee
WHERE EXTRACT(YEAR FROM join_date) = 2020;


-- RULE: every non-aggregated column in SELECT must appear in GROUP BY.
select d.dept_name as name, AVG(e.salary) as AVG from department d  left join employee as e  on d.dept_id=e.dept_id group by d.dept_id,d.dept_name;


select max(salary) as maxi from employee where salary<(select max(salary) from employee); 
select salary from employee order by salary DESC limit 1 offset 1;
-- limit means no. of values to show
-- offset means, from that number to ahead,
-- offset 1 means from 2.

select l.emp_id, l.emp_name, l.salary ,r.salary,r.emp_id, r.emp_name from employee as l inner join employee as r on l.manager_id=r.emp_id  where l.salary > r.salary;

select e.emp_name,d.dept_name from department d left join employee e on e.dept_id=d.dept_id;  

select e.emp_name, p.proj_name from project p left join employee e on e.emp_id=p.emp_id;


-- RULE: every non-aggregated column in SELECT must appear in GROUP BY
select d.dept_name,count(emp_id) from Department d join Employee e on d.dept_id=e.dept_id group by d.dept_id,d.dept_name having count(emp_id)>1;  

select emp_name from Employee where salary>(select AVG(salary) from employee); 

select max(e.salary), d.dept_name from Employee e left join Department d on e.dept_id=d.dept_id group by d.dept_name;

SELECT e.emp_name
FROM employee e
LEFT JOIN project p ON p.emp_id = e.emp_id
WHERE p.proj_name IS NULL;
 

select concat(emp_name,'-',salary) as details from employee;
-- ANSI WAY
select emp_name || '-' || salary as details from employee;








select a.artist_name,coalesce(count(f.follower_id),0) artist a left join follower f on a.artist_id=f.artist_id and Extract(Year from f.follow_data)>=2018 group by a.artist_name,a.artist_id;
-- new thing learnt about coalesce and  'and' check while joining 

select f.follower_id,u.first_name,u.last_name,f.following_id,count(follower_id) user u inner join follower f on u.user_id=f.follower_id group by f.follower_id having count(follower_id)>=5;
-- counting is done by grouping similar rows

-- Step 1: Join with UserTable
-- (e.g., follower_id=1 → Alice, follower_id=2 → Bob)

-- Step 2: Group by follower_id
-- Group 1 → all rows with follower_id = 1
-- → following_ids: (2, 3, 4)
-- Group 2 → all rows with follower_id = 2
-- → following_ids: (3, 5, 6, 7)

-- Step 3: COUNT(f.following_id)
-- For Group 1 → count = 3
-- For Group 2 → count = 4




-- write sql query to find all employees who either join  in last 2 months from today's date or who joined jan and March(any year)

select emp_id,emp_name,join_date from employee
where join_date>=date_sub(curdate(),interval 2 month)
or month(join_date in (1,3));

select emp_name where year(join_date)=year(curdate());

select emp_name where join_date>=date_sub(curdate(),interval 30 day);

select emp_name where month(join_date) in (1,3);

select emp_name where join_date>= date_sub(curdate(),interval 2 month);

select emp_name where dayname(join_date)='Monday';

select emp_name where month(join_date) in (1,6);
select emp_name where Quarter(join_date)=1;

select emp_name where year(join_date)-year(curdate())=5;

select emp_namme where year(join_date)<2015;

select emp_name where month(join_date)=month(curdate()) and day(join_date)=day(curdate());
 
-- finds for everyone who joined in last 7 days,     on and after (7 days before today)
select emp_name where join_date>=date_sub(curdate(),interval 7 day);
-- op of this date_sub(curdate(),interval 7 day) would be todays's date - 7 days


select emp_name,LENGTH(emp_name) from employee;

select left(emp_name,3) from employee;
select right(emp_name,2) from employee;
select upper(emp_name) from employee;
select lower(emp_name) from employee;
select concat(first_name,' ',last_name) from employee;
select emp_name from employee where emp_name like 'A%';
select emp_name from employee where emp_name like '%n';
select replace(emp_name,'a','@') from employee;
select trim(emp_name) from employee;




 