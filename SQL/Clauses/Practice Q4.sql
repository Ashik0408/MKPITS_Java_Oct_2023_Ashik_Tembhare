
-- WQTD max(sal), min(sal) total salary if they are getting min(sal)  and max(sal) >2000 in each department
select * from employee;

select max(salary) , min(salary), sum(salary) as Total_Salary , dept_no
from employee
group by dept_no
having max(salary)>85000 and min(salary)>60000;

