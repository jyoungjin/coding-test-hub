select cc.car_id
from car_rental_company_car cc
join car_rental_company_rental_history rh on cc.car_id = rh.car_id
where cc.car_type = '세단'
and month(rh.start_date) = '10'
group by car_id
order by car_id desc