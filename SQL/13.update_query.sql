use mkpits_database;
create table student_info(s_id int auto_increment unique not null , s_name varchar(250) not null, marks int(3) not null);
select * from student_info;

update student_info set s_name="Samiksha"
where s_id=6;
