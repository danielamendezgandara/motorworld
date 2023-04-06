-- CONSULTA D
-- Se requiere un reporte con los vendedores de la tienda Dainese Sports y la cantidad de órdenes asociada a cada uno, ordenado descendentemente por cantidad. 
select A.staff_id,first_name,last_name, count(order_id) number_of_orders
from motorworld.staffs A inner join motorworld.orders B
on A.staff_id = B.staff_id
where A.store_id = 2
group by A.staff_id
order by number_of_orders desc;