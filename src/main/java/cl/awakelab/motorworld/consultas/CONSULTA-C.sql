-- CONSULTA C
use motorworld;
-- la cantidad de órdenes totales de cada tienda, ordenado de mayor a menor cantidad. 
select A.store_id , store_name, state, count(order_id) number_of_orders
from motorworld.stores A inner join motorworld.orders B
on A.store_id =B.store_id
group by A.store_id
order by number_of_orders desc;