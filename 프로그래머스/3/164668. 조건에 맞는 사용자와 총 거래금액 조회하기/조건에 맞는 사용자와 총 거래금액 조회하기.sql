select ugu.user_id, ugu.nickname, sum(ugb.price) total_sales
from used_goods_user ugu
join used_goods_board ugb on ugb.writer_id = ugu.user_id
where ugb.status = 'done'
group by ugu.user_id
having total_sales >= 700000
order by total_sales asc;