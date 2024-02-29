select sum(hg.score) as score, he.emp_no, he.emp_name, he.position, he.email
from hr_employees he
join hr_grade hg on hg.emp_no = he.emp_no
where hg.year = '2022'
group by he.emp_no
order by score desc
limit 1;