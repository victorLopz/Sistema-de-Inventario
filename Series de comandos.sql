select * from producto_proveedor

--Esto es para ver cual es el ultimo digito de la tabla.

select IDENT_CURRENT('factura') as ULtimo

select * from factura
select * from Detalle_factura
use BDfinal

delete from Detalle_factura
DBCC CHECKIDENT (producto_proveedor, RESEED,0)
delete from factura
DBCC CHECKIDENT (factura, RESEED,0)


select IDENT_CURRENT('factura') as ULtimo
select * from factura
select DATEADD(d,-1,GETDATE())
select nombre_empleado from factura 
inner join empleados on idempleados = id_factura
where id_factura = 2

select nombre_empleado from factura inner join empleados on idempleados = id_factura where id_factura = 1


create proc mostrartabladetalle(@valor int)
as begin
select cantidad_productos, pv.producto, precioproducto from Detalle_factura as dt
inner join producto_proveedor as pv on dt.producto = idproducto_prov
where id_factura = @valor
end
select * from producto_proveedor
select total from factura where id_factura =2
select IDENT_CURRENT('factura') as ULtimo
select * from factura
select * from Detalle_factura

select * from factura inner join empleados on idempleados = id_factura where id_factura =2



select * from factura where fecha = CONVERT(char(10), GETDATE(), 103)

select sum(total) as Total from factura where 
fecha = CONVERT(char(10), GETDATE(), 103) 

select CONVERT(char(10), GETDATE(), 103)

exec updatepara_alta 0, 'negrosa'

select DATEADD(d,-1,GETDATE())
select CONVERT(char(10), GETDATE(), 103)

SELECT CONVERT(CHAR(10), (SELECT DATEADD(d, -1,GETDATE())), 103)


select * from producto_proveedor where producto = 'negrosa'

select * from producto_proveedor

select sum(total) from factura

select * from factura

select id_factura, e.nombre_empleado, fecha, subtotal,iva, total,(select sum(total) from factura) from factura as f
inner join empleados as e on f.mesero = e.idempleados
where f.fecha between '2019-08-27' and '2019-08-27'