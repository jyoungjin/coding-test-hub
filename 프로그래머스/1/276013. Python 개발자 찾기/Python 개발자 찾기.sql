select id, email, first_name, last_name
from developer_infos
where skill_1 = 'python'
or skill_2 = 'python'
or skill_3 = 'python'
order by id;