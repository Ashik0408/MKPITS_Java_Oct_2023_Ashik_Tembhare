
-- WQTD max(sal), min(sal) of they are getting salary more than 75000 in each department
select * from employee;

select max(salary), min(salary), dept_no
from employee
where salary >75000
group by dept_no;


