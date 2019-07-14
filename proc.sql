--consulta para ver las compras...

select f.id_factura,f.fecha,e.nombre_empleado,dt.cantidad_productos, pp.producto,
precioproducto, f.subtotal, f.iva, f.total
from Detalle_factura as dt
inner join factura as f on f.id_factura = dt.id_factura
inner join empleados as e 
on e.idempleados = f.mesero
inner join producto_proveedor as pp
on dt.producto = pp.idproducto_prov


select * from Detalle_factura

update factura set subtotal = 95, iva = 14.25, total = 109.25
where id_factura = 1

select * from producto_proveedor

--Insercciones por Procedimiento almacenado
delete from producto_proveedor
DBCC CHECKIDENT (detalle_factura, RESEED,0)

exec Entradaproducto 10,'pescado sabalo',100,15,0,1500,'Varios'
exec Entradaproducto 10,'pescado mojarra',100,15,0,1500,'Varios'
exec Entradaproducto 10,'cangrejos',150,5,0,750,'Varios'
exec Entradaproducto 10,'camarones',180,5,0,900,'Varios'
exec Entradaproducto 9,'tomates',20,25,0,500,'Varios'
exec Entradaproducto 9,'cebolla',25,25,0,625,'Varios'
exec Entradaproducto 9,'repollo',20,25,0,500,'Varios'
exec Entradaproducto 9,'zanahoria',20,15,0,300,'Varios'
exec Entradaproducto 9,'pepino',10,15,0,150,'Varios'
exec Entradaproducto 4,'coca-cola(vidrio)(320ml)',13,72,25,936,'Bebidas'
exec Entradaproducto 4,'coca-cola(plastico)(500ml)',18,48,40,864,'Bebidas'
exec Entradaproducto 4,'fanta-uva(vidrio)(320ml)',13,24,25,312,'Bebidas'
exec Entradaproducto 4,'fanta-naranja(vidrio)(320ml)',13,24,25,312,'Bebidas'
exec Entradaproducto 4,'fanta-roja(vidrio)(320ml)',13,24,25,312,'Bebidas'
exec Entradaproducto 7,'Victoria-clasica(vidrio)(320ml)',24,72,35,1728,'Bebidas'
exec Entradaproducto 7,'victoria-clasica(vidrio)(litro)',50,72,65,3600,'Bebidas'
exec Entradaproducto 7,'victoria-frost(vidrio)(320ml)',23,48,35,1104,'Bebidas'
exec Entradaproducto 7,'victoria-frost(vidrio)(litro)',48,48,65,2304,'Bebidas'
exec Entradaproducto 7,'toña lite(vidrio)(320ml)',25,48,40,1200,'Bebidas'
exec Entradaproducto 7,'toña(vidrio)(320ml)',25,72,40,1800,'Bebidas'
exec Entradaproducto 7,'toña(vidrio)(litro)',53,48,70,2544,'Bebidas'

exec Entradaproducto 2,'Queso',35,10,10,350,'Extras'
exec Entradaproducto 9,'Aguacate',20,10,10,200,'Extras'
exec Entradaproducto 9,'tajadas',4,20,10,80,'Extras'
exec Entradaproducto 9,'maduro',4,20,10,80,'Extras'
exec Entradaproducto 9,'tortillas',2,50,5,5,'Extras'

exec Entradaproducto 10,'tajadas con cerdo',0,0,120,0,'Comida'
exec Entradaproducto 10,'tajadas con pollo',0,0,100,0,'Comida'