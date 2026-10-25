# Day-11 – MySQL and SQL Fundamentals

![Day](https://img.shields.io/badge/Day-11-blue?style=for-the-badge) ![MySQL](https://img.shields.io/badge/Database-MySQL-orange?style=for-the-badge&logo=mysql&logoColor=white) ![SQL](https://img.shields.io/badge/Language-SQL-lightgrey?style=for-the-badge)

**Training:** UPS Java Full Stack Training  
**Day:** 11  
**Focus:** MySQL, Database Fundamentals, DDL, DML, and Table Operations

---

## 1. Overview

Day-11 focused on learning database fundamentals and SQL commands using MySQL Workbench. Practised creating databases and tables, modifying table structures, inserting employee records, and updating existing data.

## 2. Database Fundamentals

| Topic | Description |
|---|---|
| Data vs Database | Understanding individual facts and organized data |
| Server | Understanding how servers provide services to clients |
| SQL vs NoSQL | Learning different approaches to data storage |
| DBMS vs RDBMS | Understanding database management systems |

## 3. DDL – Data Definition Language

DDL commands are used to create and modify database structures.

| Command | Description |
|---|---|
| `CREATE` | Creates a database or table |
| `ALTER` | Modifies an existing table |
| `DROP` | Removes a database object |
| `TRUNCATE` | Removes all rows from a table |

## 4. DML – Data Manipulation Language

DML commands are used to manipulate records stored in database tables.

| Command | Description |
|---|---|
| `INSERT` | Adds new records |
| `UPDATE` | Modifies existing records |
| `DELETE` | Removes records |

## 5. Practical SQL Exercises

### Task 1 – Create a College Database and Students Table

Created a database named `college` and a `students` table with student details.

```sql
create database college;
use college;

create table students (
    student_id int,
    student_name varchar(50) not null,
    age int,
    dept varchar(50),
    email varchar(50) not null
);

select * from students;
```

**Learning outcome:** Created a database and table, defined columns, and used `not null` to require student names and email addresses.

### Task 2 – Create an Employee Table

Created an `employee` table to store employee information.

```sql
create table employee (
    employee_id int primary key,
    employee_name varchar(100),
    salary decimal(10,2),
    joining_date date,
    email varchar(50) unique
);

select * from employee;
```

**Learning outcome:** Practised SQL data types, `primary key`, and `unique`.

### Task 3 – Alter the Students Table

Modified the existing `students` table by adding, changing, renaming, and removing columns.

```sql
alter table students
add ph_number varchar(10);

alter table students
add dob date,
modify student_name varchar(150) not null,
rename column dept to course,
drop column ph_number;

describe students;
describe employee;
```

**Learning outcome:**

- `add` – Adds a column.
- `modify` – Changes a column definition.
- `rename column` – Changes a column name.
- `drop column` – Removes a column.
- `describe` – Displays the table structure.

### Task 4 – Insert Employee Records

Inserted two employee records into the `employee` table.

```sql
insert into employee
(employee_id, employee_name, salary, joining_date, email)
values
(1, 'ezhil', 500000, '2027-02-01', 'ezhil@gmail.com'),
(2, 'sree', 500000, '2027-02-02', 'sree@gmail.com');
```

**Learning outcome:** Learned to insert multiple records using a single `insert into` statement.

### Task 5 – Increment Employee Salaries

Increased the salary of every employee by 2,000.

```sql
update employee
set salary = salary + 2000;
```

**Learning outcome:** Used `update` and arithmetic expressions to modify existing records.

**Note:** Since the query does not contain a `where` clause, the salary of every employee in the table is increased by 2,000.


## 6. Key Learnings

- Understood basic database concepts.
- Learned DDL and DML commands.
- Created databases and tables using MySQL.
- Practised inserting and updating records.
- Modified table structures using `alter table`.
- Worked with SQL data types and basic constraints.
- Gained hands-on experience using MySQL Workbench.

---

**Training:** UPS Java Full Stack Training  
**Day:** 11  
**Focus:** MySQL and SQL Fundamentals

