select warehouse_id, warehouse_name, address, if(is null(freezer_yn), 'N', freezer_yn)
from food_warehouse
order by warehouse_id;