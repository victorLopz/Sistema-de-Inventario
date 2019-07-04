select * from producto_proveedor

--Esto es para ver cual es el ultimo digito de la tabla.

select IDENT_CURRENT('factura') as ULtimo

select * from factura
select * from Detalle_factura

delete from Detalle_factura
DBCC CHECKIDENT (Detalle_factura, RESEED,0)
delete from factura
DBCC CHECKIDENT (factura, RESEED,0)
