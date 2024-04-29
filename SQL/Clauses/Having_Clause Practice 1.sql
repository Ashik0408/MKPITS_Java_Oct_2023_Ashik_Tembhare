
use SQL_Practice;

CREATE TABLE employee (
  emp_id INT PRIMARY KEY,
  emp_name VARCHAR(255) NOT NULL,
  dept_no INT NOT NULL,
  salary DECIMAL(10,2) NOT NULL,
  address TEXT
);

INSERT INTO employee (emp_id, emp_name, dept_no, salary, address)
VALUES (1001, 'John Doe', 10, 75000.00, '123 Main St, Anytown, CA 12345');

INSERT INTO employee (emp_id, emp_name, dept_no, salary, address)
VALUES (1002, 'Jane Smith', 20, 68000.75, '456 Elm St, Anytown, CA 12345');

INSERT INTO employee (emp_id, emp_name, dept_no, salary, address)
VALUES (1003, 'Mike Lee', 30, 82000.50, '789 Maple St, Anytown, CA 12345');

INSERT INTO employee (emp_id, emp_name, dept_no, salary, address)
VALUES (1004, 'Alice Johnson', 20, 72500.00, '1000 Cherry St, Anytown, CA 12345');

INSERT INTO employee (emp_id, emp_name, dept_no, salary, address)
VALUES (1005, 'David Davis', 10, 85000.25, '2000 Oak St, Anytown, CA 12345');

INSERT INTO employee (emp_id, emp_name, dept_no, salary, address)
VALUES (1006, 'Susan Williams', 30, 82000.50, '3000 Pine St, Anytown, CA 12345'); 

show tables;

select * from employee;






