# Day-12 – Advanced SQL and Database Operations

![Day](https://img.shields.io/badge/Day-12-blue?style=for-the-badge) ![MySQL](https://img.shields.io/badge/Database-MySQL-orange?style=for-the-badge&logo=mysql&logoColor=white) ![SQL](https://img.shields.io/badge/Language-SQL-lightgrey?style=for-the-badge)

**Training:** UPS Java Full Stack Training  
**Day:** 12  
**Focus:** SQL Relationships, Clauses, Aggregate Functions, Subqueries, Stored Procedures, Views, Triggers, and Events

---

## 1. Overview

Day-12 focused on SQL queries and advanced database operations using MySQL. Practised creating relationships between tables, inserting employee records, filtering and sorting data, grouping records, and exploring stored procedures, views, triggers, and scheduled events.

## 2. Foreign Key Relationships

A foreign key connects a child table to a parent table and maintains referential integrity.

### Create the Department Table

```sql
use college;

create table department (
    department_id int primary key,
    department_name varchar(100) not null unique
);
```

### Insert Department Records

```sql
insert into department (department_id, department_name)
values
(1, 'cse'),
(2, 'it'),
(3, 'ece'),
(4, 'eee');
```

### Add a Foreign Key to Employee

```sql
alter table employee
add department_id int,
add constraint fk_employee_department
foreign key (department_id)
references department(department_id);
```

### Assign Departments to Existing Employees

```sql
update employee
set department_id = 1
where employee_id = 1;

update employee
set department_id = 2
where employee_id = 2;
```

**Key learning:** The `department` table acts as the parent table, while `employee` acts as the child table.

## 3. Insert Employee Records

Inserted additional employees with their department IDs.

```sql
insert into employee
(employee_id, employee_name, salary, joining_date, email, department_id)
values
(3, 'kumar', 30000.00, '2026-10-23', 'kumar@gmail.com', 1),
(4, 'priya', 35000.00, '2026-10-20', 'priya@gmail.com', 2),
(5, 'arun', 40000.00, '2026-10-15', 'arun@gmail.com', 3),
(6, 'divya', 45000.00, '2026-10-10', 'divya@gmail.com', 4);
```

To view employee records:

```sql
select * from employee;
```

## 4. Practical Tasks Completed

### Task 1 – Retrieve Employees Based on Salary

**Objective:** Display employees whose salary is greater than 30,000.

```sql
select *
from employee
where salary > 30000;
```

**Concept used:** `where` filters records based on a condition.

### Task 2 – Sort Employees by Salary

**Objective:** Display employees from the highest salary to the lowest salary.

```sql
select *
from employee
order by salary desc;
```

**Concept used:** `order by` sorts records, while `desc` specifies descending order.

### Task 3 – Count Employees in Each Department Without Using a Join

**Objective:** Find the total number of employees assigned to each department.

```sql
select department_id, count(*) as total_employees
from employee
group by department_id;
```

**Concepts used:**
- `group by` groups employees by department.
- `count(*)` counts the employees in each group.
- No `join` is used in this query.

## 5. SQL Clauses

SQL clauses help filter, sort, group, and organize query results.

| Clause | Purpose |
|---|---|
| `where` | Filters individual records |
| `order by` | Sorts query results |
| `group by` | Groups records with matching values |
| `having` | Filters grouped results |
| `distinct` | Returns unique values |
| `limit` | Restricts the number of returned rows |

### `having`

Display departments with more than one employee.

```sql
select department_id, count(*) as total_employees
from employee
group by department_id
having count(*) > 1;
```

### `distinct`

Retrieve unique department IDs.

```sql
select distinct department_id
from employee;
```

### `limit`

Display the three highest-paid employees.

```sql
select *
from employee
order by salary desc
limit 3;
```

## 6. Aggregate Functions

Aggregate functions perform calculations across multiple records.

| Function | Purpose |
|---|---|
| `count()` | Counts records |
| `sum()` | Calculates the total |
| `avg()` | Calculates the average |
| `min()` | Finds the minimum value |
| `max()` | Finds the maximum value |

### Example

```sql
select
    count(*) as total_employees,
    sum(salary) as total_salary,
    avg(salary) as average_salary,
    min(salary) as minimum_salary,
    max(salary) as maximum_salary
from employee;
```

**Key learning:** Aggregate functions help summarize employee and salary information.

## 7. SQL Pattern Matching

The `like` operator searches for records matching a specified pattern.

| Pattern | Meaning |
|---|---|
| `'a%'` | Starts with `a` |
| `'%i%'` | Contains `i` |
| `'%n'` | Ends with `n` |
| `'____'` | Contains exactly four characters |

### Examples

Find employees whose names start with `a`:

```sql
select *
from employee
where employee_name like 'a%';
```

Find employees whose names contain `i`:

```sql
select *
from employee
where employee_name like '%i%';
```

Find employees whose names contain exactly four characters:

```sql
select *
from employee
where employee_name like '____';
```

**Key learning:** `%` matches zero or more characters, while `_` matches exactly one character.

## 8. Subqueries

A subquery is a query nested inside another SQL query.

### Find Employees Earning More Than Rohan

```sql
select *
from employee
where salary > (
    select salary
    from employee
    where employee_name = 'rohan'
);
```

### Find Employees Earning Above the Average Salary

```sql
select *
from employee
where salary > (
    select avg(salary)
    from employee
);
```

**Key learning:** Subqueries help compare records against a specific value or calculated result.

## 9. Stored Procedures

A stored procedure is a reusable set of SQL statements stored in the database.

### Create and Execute a Procedure

```sql
delimiter //

create procedure get_employees()
begin
    select * from employee;
end //

delimiter ;

call get_employees();
```

### Procedure with an `in` Parameter

```sql
delimiter //

create procedure get_employee_by_id(in emp_id int)
begin
    select *
    from employee
    where employee_id = emp_id;
end //

delimiter ;

call get_employee_by_id(1);
```

### Procedure with an `out` Parameter

```sql
delimiter //

create procedure get_employee_count(out total int)
begin
    select count(*) into total
    from employee;
end //

delimiter ;

call get_employee_count(@total);
select @total;
```

### Important Keywords

| Keyword | Purpose |
|---|---|
| `delimiter` | Changes the statement delimiter in the MySQL client |
| `begin` | Starts a compound statement block |
| `end` | Ends a compound statement block |
| `call` | Executes a stored procedure |
| `in` | Passes a value into a procedure |
| `out` | Returns a value through a parameter |
| `into` | Assigns a query result to a variable |

### Drop a Stored Procedure

```sql
drop procedure if exists get_employees;
```

**Key learning:** Stored procedures help reuse SQL logic and accept input or output parameters.

## 10. Views

A view is a virtual table based on a SQL query.

### Create a View

```sql
create view high_salary_employees as
select employee_id, employee_name, salary
from employee
where salary > 30000;
```

### Retrieve Data from the View

```sql
select * from high_salary_employees;
```

### Drop a View

```sql
drop view if exists high_salary_employees;
```

**Key learning:** Views simplify repeated queries by presenting selected data through a reusable database object.

## 11. Triggers and Backup Tables

A trigger automatically executes when a specified database event occurs.

### Create a Backup Table

```sql
create table employee_backup (
    employee_id int,
    employee_name varchar(100),
    salary decimal(10,2),
    joining_date date,
    email varchar(50),
    department_id int,
    backup_time timestamp default current_timestamp
);
```

### Create an `after insert` Trigger

```sql
delimiter //

create trigger backup_employee
after insert on employee
for each row
begin
    insert into employee_backup
    (employee_id, employee_name, salary, joining_date, email, department_id)
    values
    (new.employee_id, new.employee_name, new.salary,
     new.joining_date, new.email, new.department_id);
end //

delimiter ;
```

Whenever a new employee is inserted, the trigger copies the new employee's details into `employee_backup`.

### Drop a Trigger

```sql
drop trigger if exists backup_employee;
```

**Key learning:** Triggers can automate audit and backup operations when data changes.

## 12. Events

MySQL events execute SQL statements according to a schedule. The event scheduler must be enabled for scheduled events to run.

### Enable the Event Scheduler

```sql
set global event_scheduler = on;
```

### Create a Scheduled Event

Delete backup records older than 30 days once a day.

```sql
delimiter //

create event delete_old_backups
on schedule every 1 day
do
begin
    delete from employee_backup
    where backup_time < now() - interval 30 day;
end //

delimiter ;
```

### Drop an Event

```sql
drop event if exists delete_old_backups;
```

**Key learning:** Scheduled events automate recurring database maintenance tasks.

**Note:** The sample event permanently deletes matching backup records. Use it only when this cleanup is intended.

## 13. Additional SQL Operations

### Drop a Stored Procedure

```sql
drop procedure if exists get_employee_by_id;
```

### Drop a View

```sql
drop view if exists high_salary_employees;
```

### Drop a Trigger

```sql
drop trigger if exists backup_employee;
```

### Drop an Event

```sql
drop event if exists delete_old_backups;
```

These commands remove database objects. Dropping an object is different from deleting table records.

## 14. Key Learnings

- Created parent and child tables using primary and foreign keys.
- Inserted employee records linked to departments.
- Filtered and sorted employee records using SQL clauses.
- Grouped records and counted employees in each department without a join.
- Used aggregate functions to calculate salary statistics.
- Practised pattern matching using `like`, `%`, and `_`.
- Used subqueries for salary comparisons.
- Created and executed stored procedures with `in` and `out` parameters.
- Created and removed views, triggers, and scheduled events.
- Explored backup-table concepts and automated database operations.

---

**Training:** UPS Java Full Stack Training  
**Day:** 12  
**Focus:** Advanced SQL and Database Operations