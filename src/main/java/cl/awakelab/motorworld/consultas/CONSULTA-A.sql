-- CONSULTA N° A 
use motorworld;
-- un listado de los clientes del estado de California (CA), ordenado alfabéticamente por apellido y después nombre. 
select * from motorworld.customers where state = 'CA' order by last_name,first_name asc;