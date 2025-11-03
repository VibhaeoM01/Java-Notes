-- Q1
select transaction_id,amount,transaction_type from transaction where transaction_type='Debit' and amount>10000 and amount<50000;

-- Q2
select c.first_name, c.contact,a.balance from customer c join account a on 
a.customer_id=c.customer_id join account_type at on a.account_type_id=at.account_type_id where 
at.account_type_name Like 'Sa%'
order by c.first_name;

-- Q3
select e.emp_id, e.emp_name, s.basic,ep.netpay from employee_info e join salary_info s on 
e.employee_category=s.employee_category join employee_payroll ep 
on e.employee_info=ep.employee_payroll where s.basic>5000; 

-- Q4
select employee_id,employee_id from employee_info where yrs_of_exp>5 and joining_date>'2001-01-01';  
-- NOTE THE WAY WE COMPARE DATE, KEEP IN MIND  'YYYY MM DD'

-- Q5
select c.course_id as "Course ID", c.name as "Course Name", sc.day as "Day", sc.startime as "Start Time" from section s join course c
on s.course_id=c.course_id join schedule sc on s.schedule_id=sc.schedule_id where sc.dat='wed';
-- NOTE Aliasing in more than 1 word is written in ""

-- Q6
select title, price,ISBN from Books where join_date>='1940-01-01' and category='C102';

-- Q7
select categoryId as CATEGORYID, categoryname as CATEGORYNAME from category_table where categoryname like 'M%';

-- Q8
select t.train_id, t.train_name from trains t join stations s on t.train_to=s.station_id
where t.train_name like 'M%' and s.station_name='PUNE';

-- Q9
-- select empid, leave_type,total_leaves from empl_info where total_leaves>10 and (leave_type='CL' OR leave_type='ML');
select empid, leave_type,total_leaves from empl_info where total_leaves>10 and leave_type in ('CL','ML');
-- Q10 
select ei.employee_id,ei.employeename,di.deptname,si.basic 
from employee_info ei 
join dept_info di 
on ei.dept_id=ei.dept_id
join salary_info si
on ei.employee_category=si.employee_category 
where di.deptname='HR';

-- Q11
select ei.EMPID as EMPID, ei.EMPNAME as EMPNAME, di.DEPTNAME as DEPTNAME, si.HOUSE_RENT_ALLOWANCE as HOUSE_RENT_ALLOWANCE 
from employee_info ei 
join salary_info si 
on ei.Employee_category=si.Employee_category 
join dept_info di 
on ei.DEPTID=di.DEPTID 
where di.location="Bangalore" or di.location="Cochin";
-- di.location in ('Bangalore', 'Cochin')	

-- Q12
SELECT Account_Type_ID, AVG(Balance) AS Avg_Balance
FROM account
GROUP BY Account_Type_ID  -- non aggregrate col in select must be in group by
HAVING AVG(Balance) >= 50000;
-- Scan all rows in account.
-- Group together rows with the same Account_Type_ID.
-- Apply the aggregate function (AVG(Balance)) within each group.
-- Return one row per Account_Type_ID.


-- Q13
select c.First_Name as FIRST_NAME, c.Last_Name as LAST_NAME, a.Account_id as ACCOUNT_ID 
from account1 a 
join customer c 
on a.Customer_id=c.Customer_id 
where balance>=50000 
order by c.First_Name;

-- Q15
SELECT 
    CONCAT(p.FirstName, ' ', p.LastName) AS PatientName,
    p.Email AS PatientEmail,
    a.AdmissionDate AS AdmissionDate,
    SUM(b.Amount) AS TotalBilling
FROM Patient p
JOIN Admission a ON p.PatientID = a.PatientID
JOIN Billing b ON p.PatientID = b.PatientID
WHERE b.Status = 'Unpaid'
GROUP BY p.PatientID, p.FirstName, p.LastName, p.Email, a.AdmissionDate
ORDER BY TotalBilling DESC;

-- Q16
select f.flight_id,f.departure_date,f.departure_time
from Flight f 
join Airplane a on f.airplane_id=a.airplane_id
join Airline al on a.airline_id=al.airline_id
where al.country='Singapore'
order by f.flight_id;

-- Q17
select AIRPLANE_ID,MODELNUMBER from airplane where MANUFACTURER="Airbus";

-- Q18
 select s.last_name from student s join register r on s.student_id=r.student_id where year(r.reg_date)="2012";	
 -- extract(year from r.reg_date)="2012"
 
-- Q19
select CabinCrew_id,firstName,lastName,contact,flight_id from cabincrew where firstName LIKE 'A%' and flight_id LIKE "%1";

-- Q20
select b.flight_id,Sum(b.Total_passengers), Sum(b.Total_Baggage) from BoardingPass b join flight f on b.flight_id=f.flight_id where f.Arrival_date="2024-2-11" and f.flight_to="Paris" group by flight_id;

-- Q21
select count(*)  as product_count from product_category pc join product p on pc.product_id=p.product_id join category c on pc.category_id=c.category_id  where c.name='women';
-- For a particular category (like "Women") → You just need a single total → use WHERE + COUNT(*) → no GROUP BY needed.
-- For each category (Men, Women, Kids, etc.) →  You want totals per group → use GROUP BY category → required.
 
-- Q22
select train_name, train_type from train_detail_tbl where train_speed<50;

-- Q23
select p.first_name as "FIRST NAME", p.contact as "CONTACT" 
from passenger p 
join boardingpass bp 
on p.passenger_id=bp.passenger_id 
join flight f 
on bp.flight_id=f.flight_id 
where f.flight_id=4 and f.flight_from='Hong Kong' and bp.meal='Vegetarian';

-- Q24
select p.product_id,p.name
from product p 
join order_time ot 
on p.product_id=ot.product_id 
join order_delivery od  
on ot.order_delivery_id=od.order_delivery_id 
where od.status='In the transit hub';

-- Q25
select artist_ID,name from artist where name regexp '[0-9]';
-- OR
select artist_ID,name from artist 
where name like '%0%'OR
	name like '%1%'OR
    name like '%2%'OR
    name like '%3%'OR
    name like '%4%'OR
    name like '%5%'OR
    NAME LIKE '%6%' OR 
    NAME LIKE '%7%' OR 
    NAME LIKE '%8%' OR 
    NAME LIKE '%9%'; 
    
    
    
-- Q26
select message_id, content from message where content like '%Hello%';

-- Q27
SELECT  
    CONCAT(d.FIRST_NAME, ' ', d.LAST_NAME) AS Name, 
    d.LICENSE_NUMBER, 
    v.PLATE_NUMBER 
FROM  
    driver d 
JOIN  
    vehicle v  
    ON d.DRIVER_ID = v.DRIVER_ID 
WHERE  
    v.STATUS = 'In Use' 
    AND v.PLATE_NUMBER LIKE '%0';
    
    
-- Q28
SELECT  
    d.LICENSE_NUMBER, 
    v.VEHICLE_ID, 
    d.RATING, 
    b.BOOKING_ID 
FROM  
    driver d 
JOIN  
    vehicle v  
    ON d.DRIVER_ID = v.DRIVER_ID 
JOIN  
    booking b  
    ON v.VEHICLE_ID = b.VEHICLE_ID 
WHERE  
    d.RATING >= 4.5 
    AND b.STATUS != 'Cancelled';   -- != and <> are same
    

-- Q29
select viewername,count(*) as name_count from viewer group by viewername;

-- Q30
select concat('first_name',' ','last_name') as Full_Name from name where job_title like '%Engineer%';


select MAX(salary) from table_name where salary<(select MAX(salary) from table_name);
