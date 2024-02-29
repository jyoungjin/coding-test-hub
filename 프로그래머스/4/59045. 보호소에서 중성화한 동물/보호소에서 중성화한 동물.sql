select ao.animal_id, ai.animal_type, ai.name
from animal_outs ao
left join animal_ins ai on ao.animal_id = ai.animal_id
where (ao.sex_upon_outcome like '%spayed%' 
or ao.sex_upon_outcome like '%neutered%' )
and ai.sex_upon_intake like '%intact%'
order by ao.animal_id