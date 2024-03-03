select he.dept_id, hd.dept_name_en, round(avg(he.sal)) as avg_sal
from hr_employees he
join hr_department hd on he.dept_id = hd.dept_id
group by he.dept_id
order by avg_sal desc;