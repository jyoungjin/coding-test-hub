-- 코드를 입력하세요
select pt_name, pt_no, gend_cd, age, ifnull(tlno, 'NONE')
from patient
where gend_cd = 'W'
and age <= 12
order by age desc, pt_name asc;