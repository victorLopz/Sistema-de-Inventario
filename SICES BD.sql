create database Bdfinal
USE BDfinal


CREATE TABLE Proveedor(

	id_proveedor int primary key identity,
	Direccion nvarchar(100) not null,
	Nombre nvarchar(30) not null,
	telefono int not null
)


create table producto_proveedor(
	
	idproducto_prov int primary key identity,
	id_prov int,
	producto nvarchar(60) not null,
	precio_compra int not null,
	fecha_compra nvarchar(40),
	cantidad int,

	constraint llave_de_productoproveedor_a_producto foreign key (id_prov) references Proveedor(id_proveedor)
)

insert into producto_proveedor
values (10,'pescado guapote',80,'20-05-2019',10)
insert into producto_proveedor
values (10,'pescado sabalo',100,'20-05-2019',15)
insert into producto_proveedor
values (10,'pescado mojarra',70,'20-05-2019',20)
insert into producto_proveedor
values (10,'cangrejos',150,'20-05-2019',5)
insert into producto_proveedor
values (9,'tomates',30,'20-05-2019',20)
insert into producto_proveedor
values (9,'cebolla',25,'20-05-2019',30)
insert into producto_proveedor
values (9,'repollo',20,'20-05-2019',10)
insert into producto_proveedor
values (9,'zanahoria',30,'20-05-2019',20)
insert into producto_proveedor
values (9,'pepinos',10,'20-05-2019',20)
insert into producto_proveedor
values (9,'Achiote',5,'20-05-2019',20)
insert into producto_proveedor
values (4,'cocacola(vidrio)',13,'20-05-2019',5)
insert into producto_proveedor
values (4,'cocacola(plastico)',18,'20-05-2019',5)
insert into producto_proveedor
values (4,'fanta_uva(vidrio)',13,'20-05-2019',3)
insert into producto_proveedor
values (4,'fanta_naranja(vidrio)',13,'20-05-2019',3)
insert into producto_proveedor
values (4,'fanta_roja(vidrio)',13,'20-05-2019',3)
insert into producto_proveedor
values (7,'victoria clasica(320ml)',24,'20-05-2019',10)
insert into producto_proveedor
values (7,'victoria clasica(litro)',50,'20-05-2019',10)
insert into producto_proveedor
values (4,'victoria frost(320ml)',23,'20-05-2019',10)
insert into producto_proveedor
values (4,'victoria frost(litro)',45,'20-05-2019',10)
insert into producto_proveedor
values (4,'toña lite(320ml)',25,'20-05-2019',10)
insert into producto_proveedor
values (4,'toña(320ml)',25,'20-05-2019',10)
insert into producto_proveedor
values (4,'toña(litro)',53,'20-05-2019',10)

create table ingredientes(

	id_ingredientes int primary key identity,
	idproducto_prov int,

	constraint llavefor foreign key (idproducto_prov) references producto_proveedor(idproducto_prov)

)
insert into ingredientes
values(6)
insert into ingredientes
values(10)
insert into ingredientes
values(1)
insert into ingredientes
values(2)


create table Platos(
	id_plato int primary key identity,
	nombre_plato nvarchar(50),
	precioventa int,
	ingredientesplatos int,

	constraint llavee foreign key (ingredientesplatos) references ingredientes(id_ingredientes)
)

create table Bebidas(
	id_bebidas int primary key identity,
	nombre_bebidas nvarchar(20),
	sabor nvarchar(20),
	presentacion nvarchar(30),
	precioventa int,
	idebebidasventa int

	constraint lavve foreign key (idebebidasventa) references producto_proveedor(idproducto_prov)
)

create table Productos(
	idProductos int primary key identity,
	plato int,
	bebidas int

	constraint llaver foreign key (plato) references Platos(id_plato),
	constraint llaver2 foreign key (bebidas) references Bebidas(id_bebidas)		
)

create table factura(
	id_factura int primary key identity,
	detalles int

	constraint llaverforaniaaa foreign key (detalles) references Detalle_factura(id_detalles_factura)
)

create table Detalle_factura(
	id_detalles_factura int primary key identity,
	id_prod int,
	mas_extras int,
	cantidad_productos int,
	precio_total int,
	precioiva int,
	id_empleado int
	

	constraint llaverforami foreign key (mas_extras) references extrasmenu(idextras),
	constraint llaverfor foreign key (id_prod) references Productos(idProductos),
	constraint llaverfornemp foreign key (id_empleado) references empleados(idempleados)
)

create table extrasmenu(
	idextras int primary key identity,
	nombre_extra nvarchar(50),
	precio_extra int
)

create table perdidas_por_producto(
	idperdidas int primary key identity,
	idproductoperdido int,
	cantidadeperdida int,
	precioproducto int,

	constraint idproductoperdido foreign key (idproductoperdido) references producto_proveedor(idproducto_prov),
	constraint precioproducto foreign key (precioproducto) references Producto_proveedor(idproducto_prov)
	
	
)

create table empleados(
	idempleados int primary key identity,
	nombre_empleado nvarchar(50),
	edad int,
	Cargo nvarchar (50),
	Telefono int 
)

create table catalogo(
	idcatalogo int primary key identity,
	nombre_plato nvarchar(80),
	precioventacat int,
	descripcion nvarchar (80),
	ingredientes nvarchar (80)
)
select *from catalogo

insert into catalogo
values('sopa de res',130,'sopa de res acompanada con arroz y tortilla','arroz,tortilla,carne de res,elote,zanahoria,chayote,ayote,cebolla')
insert into catalogo
values('sopa de pescado',160,'sopa de pescado acompanada con arroz y tostones','arroz,platano verde,pescado mojarra,pescado sabalo,zanahoria,leche,cebolla')
----------------- logeo de usuario-------------------------------------

 -- Creacion de login de administrador.
create login administrador
with password ='1234',
default_database=BDfinal

-- Creacion del usuarios administrador.
create user administrador
for login administrador
with default_schema = esquema

-- creacion de esquema administrador.
create schema esquema authorization administrador

-- creacion de privilegios para administrador--
GRANT CREATE PROC,EXECUTE,CREATE TABLE, CREATE ROLE, SELECT, INSERT,UPDATE, DELETE TO administrador


-- ////////////////////////////////// Procedimientos Almacenados /////////////////////////////// --

-- procedimiento almacenados para inserta los proveedores--
go 
create proc Entradaproveedor(@direccion nvarchar(30),@nombre nvarchar(30), @telefono int )
as begin 
insert into proveedor values (@direccion,@nombre,@telefono);
end 
go

-- procedimientos para buscar proveedor----

go 
create proc busquedadeproveedor(@datosnombres nvarchar(30))
as begin 
	select * from proveedor where Nombre=@datosnombres
	end 
go

-- procedimiento almacenados para eliminar los proveedores--

go 
create proc Eliminarproveedor(@id int)
as begin 
delete from proveedor where id_proveedor=@id
end 
go


--- procedimiento para imprimir lista de proveedores 
go 
create proc lista_proveedores 
as begin 
	select * from proveedor
end 
go 


---------------------------------------------------------------------------------------------
-- procedimiento almacenados para insertar los productos--
go 
create proc Entradaproducto(@producto nvarchar(30),@precio int, @fecha_compra nvarchar(50), @cantidad int )
as begin 
insert into producto_proveedor values (@producto,@precio,@fecha_compra,@cantidad);
end 
go


-- procedimientos para buscar productos--
go
create proc busquedadeproducto(@datos nvarchar(70))
as begin 
	select * from producto_proveedor where producto= @datos
end 
go


-- procedimiento almacenados para eliminar los productos--

go 
create proc Eliminarproductos(@id int)
as begin 
delete from producto_proveedor where idproducto_prov=@id
end 
go

-- procediemitos para imprimir lista de productos
go
create proc listaproducto
as begin
	select * from producto_proveedor
end 
go


--procedimientos para empleados--

-- procedimiento almacenados para insertar empleadps--
go 
create proc ingresarempleado(@nombre_empleado nvarchar(50),@edad int, @cargo nvarchar(50),@telefono int )
as begin 
insert into empleados values (@nombre_empleado,@edad,@cargo,@telefono);
end 
go

-- procedimientos para buscar empleado----

go 
create proc busquedaempleado(@datosempleados nvarchar(50))
as begin 
	select * from empleados where nombre_empleado=@datosempleados
	end 
go

-- procedimiento almacenados para eliminar los empleado--

go 
create proc Eliminarempleado(@id int)
as begin 
delete from empleados where idempleados=@id
end 
go


--- procedimiento para imprimir lista de empleados--
go 
create proc lista_empleados 
as begin 
	select nombre_empleado, edad, Cargo, Telefono from empleados
end 
go 
------------------------------------------
-- procedimiento almacenados para inserta catalogo--
go 
create proc Entradacatalogo(@nombre_plato nvarchar(80),@precioventacat int, @descripcion nvarchar (80),@ingredientes nvarchar(80))
as begin 
insert into catalogo values (@nombre_plato,@precioventacat,@descripcion,@ingredientes);
end 
go

select *from catalogo
-- procedimientos para buscar catalogo----

go 
create proc busquedacatalogo(@datosnombres nvarchar(30))
as begin 
	select * from catalogo where nombre_plato=@datosnombres
	end 
go

-- procedimiento almacenados para eliminar catalogo--

go 
create proc Eliminarcatalogo(@id int)
as begin 
delete from catalogo where idcatalogo=@id
end 
go


--- procedimiento para imprimir lista de catalogo 
go 
create proc lista_catalogo
as begin 
	select * from catalogo
end 
go 


--------------------
-- procedimiento almacenados para inserta bebidas--
go 
create proc Entradabebidas(@nombre_bebidas nvarchar(80),@sabor nvarchar(80), @presentacion nvarchar (80),@precioventa int)
as begin 
insert into Bebidas values (@nombre_bebidas,@sabor,@presentacion,@precioventa);
end 
go

select *from Bebidas
-- procedimientos para buscar bebidas----

go 
create proc busquedabebidas(@datosnombres nvarchar(30))
as begin 
	select * from Bebidas where nombre_bebidas=@datosnombres
	end 
go

-- procedimiento almacenados para eliminar bebidas--

go 
create proc Eliminarbebidas(@id int)
as begin 
delete from Bebidas where id_bebidas=@id
end 
go


--- procedimiento para imprimir lista de bebidas
go 
create proc lista_bebidas
as begin 
	select * from Bebidas
end 
go 
------------------------------
--procedimientos para factura--
select * from Bebidas
use BDfinal
----------impresion platos-------
go
create proc impresiondeplatos
as begin 
    select * from Platos
end 
go
----------impresion bebidas----------
go
create proc impresiondebebidas
as begin 
    select * from Bebidas
end
go
-------------impresion extras--------------
go
create proc impresiondeExtras
as begin 
    select * from extrasmenu
end
go
------------------------------------------------
--modificar productos---
go 
create procedure modifproductos
(
@idproducto_prov int,
@producto nvarchar(30),
@precio_compra int,
@fecha_compra nvarchar(50),
@cantidad int
)
as
update producto_proveedor set producto = @producto,precio_compra = @precio_compra,fecha_compra = @fecha_compra,cantidad = @cantidad
where idproducto_prov=@idproducto_prov
go
exec modifproductos 1,'pastel',20,'20/11/98',5
select *from producto_proveedor
--------------------
--modificar proveedores--
go 
create procedure modifproveedores
(
@id_proveedor int,
@direccion nvarchar(30),
@nombre nvarchar(50),
@telefono int
)
as
update Proveedor set Direccion = @direccion,Nombre= @nombre,telefono = @telefono
where id_proveedor=@id_proveedor
go
exec modifproveedores 1,'Rivas, parque central 2 cuadras al sur','pollo estrella',22707600
select *from Proveedor
---------------------
--modificar empleados
go 
create procedure modifempleados
(
@idempleado int,
@nombre_empleado nvarchar(30),
@edad int,
@cargo nvarchar(50),
@telefono int
)
as
update empleados set nombre_empleado = @nombre_empleado,edad = @edad,Cargo = @cargo,Telefono = @telefono
where idempleados=@idempleado
go
exec modifempleados 1,'Roberto mayorga',22,'limpieza',77600521
select *from empleados
--------------------

--modificar catalogo
go 
create procedure modifcatalogo
(
@idcatalogo int,
@nombre_plato nvarchar(80),
@precioventacat int,
@descripcion nvarchar(80),
@ingredientes nvarchar(80)
)
as
update catalogo set nombre_plato = @nombre_plato,precioventacat = @precioventacat,descripcion = @descripcion,ingredientes = @ingredientes
where idcatalogo=@idcatalogo
go
exec modifcatalogo 1,'Sopa de Res',140,'sopa de res acompanada con arroz y tortilla','arroz,tortilla,carne de res,elote,zanahoria'
select *from catalogo
---------------
--modificar bebidas
go 
create procedure modifbebidas
(
@idbebidas int,
@nombre_bebidas nvarchar(80),
@sabor nvarchar (60),
@presentacion nvarchar(80),
@precioventabeb int
)
as
update Bebidas set nombre_bebidas = @nombre_bebidas,sabor = @sabor,presentacion = @presentacion,precioventa = @precioventabeb
where id_bebidas=@idbebidas
go
select *from Bebidas