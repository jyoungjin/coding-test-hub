select warehouse_id, warehouse_name, address, coalesce(freezer_yn, 'N') freezer_yn
from food_warehouse
where address like '경기%'
order by warehouse_id;