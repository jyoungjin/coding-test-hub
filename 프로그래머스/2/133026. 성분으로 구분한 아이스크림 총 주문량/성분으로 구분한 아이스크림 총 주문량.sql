select ii.ingredient_type, sum(fh.total_order) total_order
from first_half fh
join icecream_info ii on ii.flavor = fh.flavor
group by ii.ingredient_type
order by total_order;