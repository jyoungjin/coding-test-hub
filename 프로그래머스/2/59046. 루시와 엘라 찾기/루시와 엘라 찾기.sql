select animal_id, name, sex_upon_intake
from animal_ins
where name in ('lucy', 'ella', 'pickle', 'sabrina', 'mitty')
order by animal_id;