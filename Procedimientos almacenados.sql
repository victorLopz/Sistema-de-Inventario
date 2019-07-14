/*corran procedimientos paso a paso */
go
use BDfinal
go
/*Proc de la Factura*/
------------------------------------------------------------------------

go
create proc imprimircatalogo
as begin 
	select * from catalogo where tipo = 'Comida'
end
go

go
create proc impresiondebebidas
as begin 
    select * from catalogo where tipo = 'Bebidas'
end
go

go
create proc impresiondeExtras
as begin 
    select * from catalogo where tipo = 'Extras'
end
go

go
create proc ingresarenfactura(@meser int, @subto money, @iva money, @total money, @diner money, @vuel money)
as begin
	insert into factura(mesero,subtotal,iva,total,dinero, vuelto) 
	values (@meser, @subto, @iva, @total, @diner, @vuel)
end
go

go
create proc ingresardetallefac(@prduc int,@id int, @cant int, @precio money)
as begin 
	insert into Detalle_factura
	values (@prduc,@id, @cant, @precio)
end
go

create proc mostrartabladetalle(@valor int)
as begin
select cantidad_productos, pv.producto, precioproducto from Detalle_factura as dt
inner join producto_proveedor as pv on dt.producto = idproducto_prov
where id_factura = @valor
end

/*Proc modificar Proveedor*/
-------------------------------------------------------------------------

go 
create proc lista_proveedor(@codigo int)
as begin 
	select Direccion, Nombre, telefono from Proveedor
	where id_proveedor = @codigo
end 
go 


go
create proc upd_proveedores(@codigo int, @direc nvarchar(30), @name nvarchar(30), @telefono int)
as begin

	update Proveedor set Direccion = @direc, Nombre = @name, telefono = @telefono
	where id_proveedor = @codigo
end
go

-------------------------------------------------------------------------


/*Proc busqueda de producto*/
-------------------------------------------------------------------------

go 
create proc Eliminarproductos(@id int)
as begin 
delete from producto_proveedor where idproducto_prov=@id
end 
go

go
create proc busquedadeproducto(@datos nvarchar(70))
as begin 
	select idproducto_prov,producto,precio_compra,cantidad from producto_proveedor where producto= @datos
end 
go

-------------------------------------------------------------------------

/*Proc de busqueda de proveedor*/
-------------------------------------------------------------------------

go 
create proc busquedadeproveedor(@datosnombres nvarchar(30))
as begin 
	select * from proveedor where Nombre=@datosnombres
	end 
go

go 
create proc Eliminarproveedor(@id int)
as begin 
delete from proveedor where id_proveedor=@id
end 
go

-------------------------------------------------------------------------


/*Proc de empleados*/
-------------------------------------------------------------------------

go 
create proc ingresarempleado(@nombre_empleado nvarchar(50),@edad int, @cargo nvarchar(50),@telefono int )
as begin 
insert into empleados values (@nombre_empleado,@edad,@cargo,@telefono);
end 
go

go 
create proc Entradaproducto(@id int, @producto nvarchar(30),@precio int, @cantidad int, @precioventa int,@total int, @tip nvarchar(10))
as begin 	
	insert into producto_proveedor
	(id_prov, producto,precio_compra,cantidad,precioventa,total_costo,tipo) 
	values (@id, @producto,@precio,@cantidad,@precioventa,@total,@tip);
end 
go

go
create proc lista_empleados
as begin
	select * from empleados
end
go

go
create proc UpdateEmpleado(@codde int, @nombreempleado nvarchar(30),  @edad int, @cargo nvarchar(30), @telefono int)
as begin
	update empleados set nombre_empleado = @nombreempleado, edad = @edad, Cargo = @cargo, Telefono = @telefono
	where idempleados = @codde
end
go 

go
create proc Eliminarempleado(@id int)
as begin 
	delete from empleados where idempleados=@id
end 
go


-------------------------------------------------------------------------

/*Proc ingresar proveedor*/
-------------------------------------------------------------------------

go 
create proc Entradaproveedor(@direccion nvarchar(30),@nombre nvarchar(30), @telefono int )
as begin 
insert into proveedor values (@direccion,@nombre,@telefono);
end 
go

-------------------------------------------------------------------------

/*Proc pantalla de inserccion de productos*/
-------------------------------------------------------------------------
go
CREATE PROC impresiondeproveedores
AS BEGIN 
	SELECT * FROM Proveedor
END
go

go
create proc impresiondeproducto(@valor varchar(30))
as begin
	select producto, precio_compra, cantidad, precioventa from producto_proveedor where producto = @valor
END
go

------------------------modificar Producto-------------------------------------------------
go
create proc upd_producto( @Nproc nvarchar(30), @precio_prod int, @cant int, @pv money)
as begin

	update producto_proveedor 
	set producto = @Nproc, precio_compra = @precio_prod, cantidad = @cant, precioventa=@pv
	where  producto = @Nproc 
end
go

--------------------------panatalla de nosotros (ventas totales)-------------------------------
create proc imprimir_factura
as begin
	select f.id_factura,f.fecha,e.nombre_empleado,dt.cantidad_productos, pp.producto,
	precioproducto, f.subtotal, f.iva, f.total, f.dinero, f.vuelto
	from Detalle_factura as dt
	inner join factura as f on f.id_factura = dt.id_factura
	inner join empleados as e 
	on e.idempleados = f.mesero
	inner join producto_proveedor as pp
	on dt.producto = pp.idproducto_prov
end 

create proc imprimirfacturapordetalle(@valor nvarchar(40))
as begin
	select f.id_factura,f.fecha,e.nombre_empleado,dt.cantidad_productos, pp.producto,
	precioproducto, f.subtotal, f.iva, f.total, f.dinero, f.vuelto
	from Detalle_factura as dt
	inner join factura as f on f.id_factura = dt.id_factura
	inner join empleados as e 
	on e.idempleados = f.mesero
	inner join producto_proveedor as pp
	on dt.producto = pp.idproducto_prov
	where e.nombre_empleado = @valor
end


--editar los precios en ediplatos--
create proc actualizarplato(@id nvarchar(30),@produc nvarchar(30), @precio int)
as begin
	update producto_proveedor set producto = @produc, precioventa = @precio
	where  idproducto_prov = @id
end 
	
--procedure para imprimir los vendidos de forma accendente
create proc vendidoacendente
as begin
		select SUM(cantidad_productos) as CAntidad, pp.producto from Detalle_factura as dt
		inner join  factura as f on f.id_factura = dt.id_factura 
		inner join producto_proveedor as pp on dt.producto = pp.idproducto_prov
		group BY pp.producto order BY COUNT(CAntidad) 
end

-- para el desconteo
go
create proc prdesconteo(@valor int, @producto nvarchar(30))
as begin
	update producto_proveedor set
	cantidad = cantidad - @valor
	where producto = @producto
end
go