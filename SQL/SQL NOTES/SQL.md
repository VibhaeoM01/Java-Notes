    # 📘 SQL Documentation (MySQL → ANSI SQL)

  

    ---

  

    ## 🗂 ER Diagram (Tables)

  

    ```plaintext

    |-----------|        |------------|        |----------|

    | Department| ----<  | Employee   | ----<  | Project  |

    |-----------|        |------------|        |----------|

  

    Department → dept_id (PK), dept_name  

  

    Employee → emp_id (PK), emp_name, salary, join_date, dept_id (FK), manager_id  

  

    Project → proj_id (PK), proj_name, emp_id (FK)  

    ```

  

    ---

  

    ## 🔹 Query 1: Get all employees who joined in the year 2020  

  

    **MySQL:**  

    ```sql

    SELECT emp_name

    FROM Employee

    WHERE YEAR(join_date) = 2020;

    ```

  

    **ANSI SQL:**  

    ```sql

    SELECT emp_name

    FROM Employee

    WHERE EXTRACT(YEAR FROM join_date) = 2020;

    ```

  

    ⚠️ **Note**: MySQL provides `YEAR()`, but ANSI SQL uses `EXTRACT()`.  

  

    ---

  

    ## 🔹 Query 2: Find the average salary department-wise  

  

    **MySQL:**  

    ```sql

    SELECT d.dept_name AS name, AVG(e.salary) AS avg_salary

    FROM Department d

    LEFT JOIN Employee e ON d.dept_id = e.dept_id

    GROUP BY d.dept_id, d.dept_name;

    ```

  

    **ANSI SQL:**  

    ```sql

    SELECT d.dept_name AS name, AVG(e.salary) AS avg_salary

    FROM Department d

    LEFT JOIN Employee e ON d.dept_id = e.dept_id

    GROUP BY d.dept_id, d.dept_name;

    ```

  

    ⚠️ **Rule**: Every non-aggregated column in `SELECT` must appear in `GROUP BY`.  

  

    ---

  

    ## 🔹 Query 3: Find the second highest salary  

  

    **MySQL:**  

    ```sql

    SELECT salary

    FROM Employee

    ORDER BY salary DESC

    LIMIT 1 OFFSET 1;

    ```

  

    **ANSI SQL (standard way, without LIMIT/OFFSET):**  

    ```sql

    SELECT MAX(salary) AS second_highest

    FROM Employee

    WHERE salary < (SELECT MAX(salary) FROM Employee);

    ```

  

    ⚠️ `LIMIT` and `OFFSET` are MySQL-specific. ANSI SQL prefers subqueries or `FETCH FIRST n ROWS ONLY`.  

  

    ---

  

    ## 🔹 Query 4: List employees who earn more than their manager  

  

    **MySQL / ANSI SQL (same):**  

    ```sql

    SELECT e.emp_id, e.emp_name, e.salary, m.emp_id AS manager_id, m.emp_name AS manager_name, m.salary AS manager_salary

    FROM Employee e

    INNER JOIN Employee m ON e.manager_id = m.emp_id

    WHERE e.salary > m.salary;

    ```

  

    ---

  

    ## 🔹 Query 5: Show employees along with their department names  

  

    **MySQL / ANSI SQL (same):**  

    ```sql

    SELECT e.emp_name, d.dept_name

    FROM Department d

    LEFT JOIN Employee e ON e.dept_id = d.dept_id;

    ```

  

    ---

  

    ## 🔹 Query 6: List all employees and their assigned projects (if any)  

  

    **MySQL:**  

    ```sql

    SELECT e.emp_name, p.proj_name

    FROM Employee e

    RIGHT JOIN Project p ON e.emp_id = p.emp_id;

    ```

  

    **ANSI SQL (preferred LEFT JOIN):**  

    ```sql

    SELECT e.emp_name, p.proj_name

    FROM Project p

    LEFT JOIN Employee e ON e.emp_id = p.emp_id;

    ```

  

    ---

  

    ## 🔹 Query 7: Find departments with more than 1 employee  

  

    **MySQL / ANSI SQL:**  

    ```sql

    SELECT d.dept_name, COUNT(e.emp_id) AS emp_count

    FROM Department d

    JOIN Employee e ON d.dept_id = e.dept_id

    GROUP BY d.dept_id, d.dept_name

    HAVING COUNT(e.emp_id) > 1;

    ```

  

    ⚠️ **Rule**: `HAVING` works only with aggregates, and all non-aggregates must appear in `GROUP BY`.  

  

    ---

  

    ## 🔹 Query 8: Find employees earning above the average salary  

  

    **MySQL / ANSI SQL:**  

    ```sql

    SELECT emp_name

    FROM Employee

    WHERE salary > (SELECT AVG(salary) FROM Employee);

    ```

  

    ---

  

    ## 🔹 Query 9: Display the highest salary in each department  

  

    **MySQL / ANSI SQL:**  

    ```sql

    SELECT d.dept_name, MAX(e.salary) AS max_salary

    FROM Employee e

    LEFT JOIN Department d ON e.dept_id = d.dept_id

    GROUP BY d.dept_name;

    ```

  

    ---

  

    ## 🔹 Query 10: List employees who are not assigned to any project  

  

    **MySQL / ANSI SQL:**  

    ```sql

    SELECT e.emp_name

    FROM Employee e

    LEFT JOIN Project p ON p.emp_id = e.emp_id

    WHERE p.proj_name IS NULL;

    ```

  

    ---

  

    ## 🔹 Query 11: String concatenation example  

  

    **MySQL:**  

    ```sql

    SELECT CONCAT(emp_name, '-', salary) AS details

    FROM Employee;

    ```

  

    **ANSI SQL:**  

    ```sql

    SELECT emp_name || '-' || salary AS details

    FROM Employee;

    ```

  

    ⚠️ `CONCAT()` is MySQL-specific. ANSI SQL uses `||`.  

  

    ---

  

    ## ✅ Key Notes for Writing ANSI SQL  

  

    1. **String concatenation** → `||` instead of `CONCAT()`.  

    2. **Date functions** → use `EXTRACT()` instead of `YEAR()`.  

    3. **LIMIT / OFFSET** → not ANSI SQL. Use `FETCH FIRST n ROWS ONLY` or subqueries.  

    4. **GROUP BY rule** → every column in `SELECT` that is not aggregated must appear in `GROUP BY`.  

    5. **Joins** → always write `INNER JOIN`, `LEFT JOIN`, `RIGHT JOIN` explicitly (ANSI style).  

    6. **NULL handling** → `IS NULL` / `IS NOT NULL` (never `= NULL`).  

  

    ---