select b.category, sum(bs.sales) total_sales
from book b
join book_sales bs on b.book_id = bs.book_id
where bs.sales_date like '2022-01%'
group by b.category
order by b.category;