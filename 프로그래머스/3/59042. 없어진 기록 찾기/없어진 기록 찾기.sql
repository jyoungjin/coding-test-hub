select ao.animal_id, ao.name
from animal_ins ai
right join animal_outs ao on ao.animal_id = ai.animal_id
where ai.animal_id is null
order by ao.animal_id;