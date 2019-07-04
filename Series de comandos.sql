select * from producto_proveedor

--Esto es para ver cual es el ultimo digito de la tabla.

select IDENT_CURRENT('factura') as ULtimo

select * from factura
select * from Detalle_factura

delete from Detalle_factura
DBCC CHECKIDENT (Detalle_factura, RESEED,0)
delete from factura
DBCC CHECKIDENT (factura, RESEED,0)


select IDENT_CURRENT('factura') as ULtimo

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



