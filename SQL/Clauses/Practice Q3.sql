
-- WQTD number of emp getting maximum salary in each department 
select * from employee;

select  count(*),max(salary), min(salary), dept_no
from employee
group by dept_no;

