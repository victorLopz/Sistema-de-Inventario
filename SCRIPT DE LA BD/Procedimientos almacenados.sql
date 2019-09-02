/*corran procedimientos paso a paso */
go
use BDfinal
go
/*Proc de la Factura*/
------------------------------------------------------------------------

go
create proc imprimircatalogo
as begin 	
	select descripcion_del_producto, precioventacat, codec,ct.tipo, cantidad from catalogo as ct
	inner join producto_proveedor  as pp on ct.codec = pp.idproducto_prov where ct.tipo = 'Comida'
end
go

go
create proc impresiondebebidas
as begin     
	select descripcion_del_producto, precioventacat, codec,ct.tipo, cantidad, pp.presentacion from catalogo as ct
	inner join producto_proveedor  as pp on ct.codec = pp.idproducto_prov where ct.tipo = 'Bebidas' and pp.cantidad > 0
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

go
create proc mostrartabladetalle(@valor int)
as begin	
	select pv.producto, cantidad_productos, precioproducto from Detalle_factura as dt
	inner join producto_proveedor as pv on dt.producto = idproducto_prov
	Where id_factura = @valor
end
go

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
	select idproducto_prov,producto,precio_compra,cantidad from producto_proveedor where producto like '%@datos%'
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
create proc EntradaProductoporvarios(@id int, @producto nvarchar(30),@precio money, @cantidad int,@cantidadM int, @tipunidades nvarchar(20), @tip nvarchar(10))
as begin 	
	insert into producto_proveedor
	(id_prov, producto,precio_compra,cantidad,cantidad_MINima,presentacion,total_costo,tipo) 
	values (@id, @producto,@precio,@cantidad,@cantidadM,@tipunidades,(@cantidad * @precio),@tip);
end 
go
select * from producto_proveedor
go 
CREATE proc EntradaProductoporBebidas(@id int, @producto nvarchar(30),@precio int, @cantidad int,@CANTM INT, @tipunidades nvarchar(20),@precVenta money,@descripcion nvarchar(100) , @tip nvarchar(10))
as begin 	
	insert into producto_proveedor
	(id_prov, producto,precio_compra,cantidad,cantidad_MINIma,categoria,presentacion,precioventa,total_costo,tipo) 
	values (@id, @producto,@precio,@cantidad,@CANTM,@tipunidades,@descripcion,@precVenta,(@cantidad * @precio),@tip);
end 
go

---- proc para insertar en productos proveedor los platos y extras.....
go
create proc insertarlosplatosyextras(@nombredelproducto nvarchar(30), @Tipodereceta nvarchar(20), @grupodeproductos nvarchar(30), @costo money)
as begin
	insert into producto_proveedor(producto, categoria, presentacion,precioventa,precio_compra, tipo) values 
	(@nombredelproducto,@Tipodereceta, @grupodeproductos, @costo, 0,@Tipodereceta)
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
	select id_factura, e.nombre_empleado, fecha, subtotal,iva, total, dinero, vuelto from factura as f
	inner join empleados as e on f.mesero = e.idempleados
end
go

go
create proc imprimirfacturapordetalle(@valor nvarchar(40))
as begin	
	select id_factura, e.nombre_empleado, fecha, subtotal,iva, total, dinero, vuelto from factura as f
	inner join empleados as e on f.mesero = e.idempleados
	where e.nombre_empleado = @valor
end
go

go
create proc imprimirporfecha(@valordefecha nvarchar(10), @valordefecha2 nvarchar(10))
as begin
	select id_factura, e.nombre_empleado, fecha, subtotal,iva, total, dinero, vuelto from factura as f
	inner join empleados as e on f.mesero = e.idempleados
	where f.fecha between @valordefecha and @valordefecha2
end
go
go
create proc imprimirpornumerodefactura(@valordefactura int)
as begin

	select id_factura, e.nombre_empleado, fecha, subtotal,iva, total, dinero, vuelto from factura as f
	inner join empleados as e on f.mesero = e.idempleados
	where f.id_factura = @valordefactura
end
go

--editar los precios en ediplatos--
create proc actualizarplato(@id nvarchar(30),@produc nvarchar(30), @precio int)
as begin
	update producto_proveedor set producto = @produc, precioventa = @precio
	where  idproducto_prov = @id
end 
	
--procedure para imprimir los vendidos de forma accendente
go
create proc vendidoacendente
as begin
		SELECT TOP (select COUNT(id_detalles_factura) from Detalle_factura) pp.producto, 
		SUM(cantidad_productos) AS VENDIDOS FROM Detalle_factura as dt
		inner join producto_proveedor as pp on pp.idproducto_prov = dt.producto


		GROUP BY pp.producto, dt.producto
		Order by SUM(cantidad_productos) desc
end
go
-- para el desconteo
go
create proc prdesconteo(@valor int, @producto nvarchar(30))
as begin
	update producto_proveedor set
	cantidad = cantidad - @valor
	where producto = @producto
end
go
----------------------proc para gastados------------------------------
go 
create proc listagastados(@id_gas int, @valor_per int)
as begin
	insert into perdidas_por_producto(idproductoperdido, cantidadeperdida)
	values (@id_gas,@valor_per);
end
go


go
create proc impresiondegastados
as begin
	select producto, precio_compra,cantidadeperdida from perdidas_por_producto
	inner join producto_proveedor on idproductoperdido = idproducto_prov
end
go

--------------- proc para insertar extras y comidas-------------------------
go
create proc platoyextra(@nma nvarchar(30),@pecio money, @tipo nvarchar(10))
as begin
	insert into producto_proveedor(producto,precio_compra, precioventa, tipo)
	values (@nma, 0 , @pecio, @tipo);
end
go

------------ proc para actualizar los productos de baja------------------
go
create proc updatepara_alta(@valor int, @codec nvarchar(30))
as begin
	update producto_proveedor set cantidad = @valor 
	where producto = @codec
end
go

----------- actualizar el valor del dolar-------------
go 
create proc actualizardolar(@numero money)
as begin
	update tipodecambio set valordelamoneda = @numero
	where Tipodemoneda = 'Dolar estadounidense'

end
go

----------- actualizar el valor del colom ------------
go 
create proc actualizarcolon(@numero money)
as begin
	update tipodecambio set valordelamoneda = @numero
	where Tipodemoneda = 'Colón costarricense'

end
go

go
alter proc cierredecaja(@a money, @b money, @c money, @d money, @e money, @f money)
as begin
	insert into cierrecaja(Saldodecierre, cierreanterior, totaldearqueo, vlcordoba, vldolares, vlcolon) 
	values (@a, @b, @c, @d, @e, @f)
end
go


------------- para insertar los ingredientes ---------------
go
create proc insertar_ingrediente(@a int, @b nvarchar(30), @c money, @d nvarchar(20), @e money)
as begin
	insert into ingrediente(cualconformaplato, nombreIngredientes, cantidad, unidadM, costo) values (@a, @b, @c, @d, @e)
end
go

-------------- Para hacer las copias de seguridad------------
create procedure CREARBACKUP
as
begin
	BACKUP DATABASE BDfinal
	TO DISK = 'C:\BACKUP DE PROGRAMA\COPIA.bak'
end
GO


-- este proc se ejecuta en la bd master--- para una mayor factibilidad
create procedure RESTARURAR
as 
begin

	drop database BDfinal
	RESTORE DATABASE BDfinal
	FROM DISK ='C:\BACKUP DE PROGRAMA\COPIA.bak'
end


------- proc para insetar en cuentas por pagar---------
create proc insertarcuentaapagar
(@b money, @c nvarchar(50), @d nvarchar(50), @e int, @f nvarchar(50), @h money,  @i date )
as begin
	
	insert into cuentasporpagar(monto, Categoria, referencias, proveedor, Observaciones, Valordeabono, vencimiento) 
	values(@b, @c, @d,@e,@f,@h,@i)
end


--------- para actualizar el abono------------
alter proc actualizarelabono(@a int, @b int)
as begin

update cuentasporpagar set Valordeabono = @a + Valordeabono
where codec = @b
end


create proc eliminarabonado(@a int)
as begin
	select * from cuentasporpagar
	delete from cuentasporpagar where codec = @a
end