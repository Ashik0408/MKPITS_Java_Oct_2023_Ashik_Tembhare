
-- WQTD max salary , min salary , epm name, if they are getting salary more than max(salary)>75000
select * from employee;

select max(salary), min(salary), emp_name
from employee
group by emp_name
having max(salary) >75000;

