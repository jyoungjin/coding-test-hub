select p.product_code, sum(p.price * os.sales_amount) as sales
from product p
join offline_sale os on p.product_id = os.product_id
group by p.product_code
order by sales desc, product_code;