select year(os.sales_date) year, month(os.sales_date) month, gender, count(distinct(os.user_id)) users
from online_sale os
join user_info ui on os.user_id = ui.user_id
where gender is not null
group by year, month, gender
order by year, month, gender;