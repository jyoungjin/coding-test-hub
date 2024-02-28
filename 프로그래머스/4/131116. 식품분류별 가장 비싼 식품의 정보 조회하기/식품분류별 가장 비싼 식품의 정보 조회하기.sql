# select category, price max_price, product_name
# from food_product
# where category in ('과자', '국', '김치', '식용유')
# order by max_price desc;


select category, price max_price, product_name
from food_product
where category in ('과자', '국', '김치', '식용유')
and (category, price) in (
    select category, max(price)
    from food_product
    where category in ('과자', '국', '김치', '식용유')
    group by category
)
order by max_price desc;
