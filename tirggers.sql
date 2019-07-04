go
use BDfinal
go

--tirgger para insertar en catalogo....

create trigger inertarcatalogo
on producto_proveedor for insert 
as
declare @tipo varchar(50)
select @tipo = tipo from inserted 
if (@tipo = 'Bebidas')
begin
	declare @produc varchar(50)
	declare @precio money
	select @produc = producto from inserted
	select @precio = precioventa from inserted
	insert into catalogo values(@produc,@precio,'Bebidas')
end
if (@tipo = 'Extras')
begin
	declare @product varchar(50)
	select @produc = producto from inserted
	select @precio = precioventa from inserted
	select @product = producto from inserted
	insert into catalogo values(@product,@precio,'Extras')
end
if (@tipo = 'Comida')
begin
	declare @producto varchar(50)
	select @produc = producto from inserted
	select @precio = precioventa from inserted
	select @producto = producto from inserted
	insert into catalogo values(@producto,@precio,'Comida')
end
go


-- triger para insertar en id de detallefactura
create trigger desconteo
on Detalle_factura  for insert
AS 
update producto_proveedor set producto_proveedor.cantidad = producto_proveedor.cantidad - inserted.cantidad_productos from inserted
inner join producto_proveedor on producto_proveedor.idproducto_prov = inserted.producto
go
