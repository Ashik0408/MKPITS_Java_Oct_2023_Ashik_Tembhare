use mkpits_database;
create table student_info(s_id int auto_increment unique not null , s_name varchar(250) not null, marks int(3) not null);
select * from student_info;

delete from student_info
where s_id=3;