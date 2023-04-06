-- CONSULTA B
-- Describí así a la base de datos 
use motorworld;
-- listado de los clientes que tienen correo Gmail y que pertenezcan al estado de New York (NY), ordenado por apellido y nombre. 
select * from motorworld.customers where state = 'NY' and email like '%gmail.com%'
order by last_name,first_name asc;