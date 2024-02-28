select month(start_date) month, car_id, count(car_id) records
from car_rental_company_rental_history
where start_date between '2022-08-01 00:00:00' and '2022-10-31 23:59:59'
and car_id in (
    select car_id
    from car_rental_company_rental_history
    where start_date between '2022-08-01 00:00:00' and '2022-10-31 23:59:59'
    group by car_id
    having count(*) >= 5
)
group by month, car_id
order by month, car_id desc;