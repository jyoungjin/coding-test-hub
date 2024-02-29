select fh.flavor
from first_half fh
join july j on j.flavor = fh.flavor
group by fh.flavor
order by sum(j.total_order + fh.total_order) desc
limit 3;