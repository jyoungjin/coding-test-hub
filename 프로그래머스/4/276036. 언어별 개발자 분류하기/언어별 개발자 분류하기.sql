with front as (
    select sum(code) code from skillcodes where category = 'front end'
)

select case 
when skill_code & (select code from front) 
and skill_code & (select code from skillcodes where name = 'python') then 'A'
WHEN skill_code & (select code from skillcodes where name = 'c#') then 'B'
WHEN skill_code & (select code from front) then 'C'
end grade, id, email
from developers
having grade is not null
order by grade, id;