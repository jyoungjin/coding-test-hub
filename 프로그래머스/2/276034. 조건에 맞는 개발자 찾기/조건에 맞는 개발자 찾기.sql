select id, email, first_name, last_name
from developers
where (skill_code & (select code from skillcodes where name = 'C#'))
or (skill_code & (select code from skillcodes where name = 'python'))
order by id;