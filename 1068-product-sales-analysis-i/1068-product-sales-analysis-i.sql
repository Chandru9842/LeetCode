select a.product_name,e.year,e.price from Sales e
left join Product a
on e.product_id=a.product_id
