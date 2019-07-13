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
	declare @codec int 
	select @codec = idproducto_prov from inserted
	select @produc = producto from inserted
	select @precio = precioventa from inserted
	insert into catalogo values(@produc,@precio,@codec, 'Bebidas')
end
if (@tipo = 'Extras')
begin
	declare @product varchar(50)
	declare @codec1 int 
	select @produc = producto from inserted
	select @codec1 = idproducto_prov from inserted
	select @precio = precioventa from inserted
	select @product = producto from inserted
	insert into catalogo values(@product,@precio,@codec1,'Extras')
end
if (@tipo = 'Comida')
begin
	declare @producto varchar(50)
	declare @codec2 int 
	select @codec2 = idproducto_prov from inserted
	select @produc = producto from inserted
	select @precio = precioventa from inserted
	select @producto = producto from inserted
	insert into catalogo values(@producto,@precio,@codec2,'Comida')
end
go

--triger para act catalogo---
create trigger act_catalogo
on producto_proveedor for update	
as
set nocount on
declare @descrip_producto nvarchar(30)
declare @prec_ven int
select @descrip_producto = producto from inserted
select @prec_ven = precioventa from inserted 

update catalogo set 
catalogo.descripcion_del_producto = @descrip_producto, precioventacat = @prec_ven
from inserted inner join catalogo 
on catalogo.codec = inserted.idproducto_prov
go