-- CONSULTA E
use motorworld;
-- muestre el monto total vendido por cada vendedor de la tienda Dainese Sports. 
select A.staff_id,first_name,last_name,
sum( list_price * quantity) as amount
from motorworld.staffs A inner join motorworld.orders B
on A.staff_id = B.staff_id
inner join motorworld.order_items C
on  B.order_id = C.order_id
where B.store_id = 2
group by A.staff_id;