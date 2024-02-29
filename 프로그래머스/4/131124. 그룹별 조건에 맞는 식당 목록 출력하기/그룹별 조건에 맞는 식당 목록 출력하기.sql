select mp.member_name, rr.review_text, date_format(rr.review_date, '%Y-%m-%d')
from rest_review rr
join member_profile mp on mp.member_id = rr.member_id
where rr.member_id = (
    select member_id
    from (
        select member_id, count(*) as review_count
        from rest_review
        group by member_id
        order by review_count desc
        limit 1
    ) as subquery
)
order by rr.review_date, rr.review_text;