create database BDfinal
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

create table ingredientes(

	id_ingredientes int primary key,
	idproducto_prov int,

	constraint llavefor foreign key (idproducto_prov) references producto_proveedor(idproducto_prov)

)


create table Platos(
	id_plato int primary key,
	nombre_plato nvarchar(50),
	precioventa int,
	ingredientesplatos int,

	constraint llavee foreign key (ingredientesplatos) references ingredientes(id_ingredientes)
)

create table Bebidas(
	id_bebidas int primary key,
	nombre_bebidas nvarchar(20),
	sabor nvarchar(20),
	presentacion nvarchar(30),
	precioventa int,
	idebebidasventa int

	constraint lavve foreign key (idebebidasventa) references producto_proveedor(idproducto_prov)
)

create table Productos(
	idProductos int primary key,
	plato int,
	bebidas int

	constraint llaver foreign key (plato) references Platos(id_plato),
	constraint llaver2 foreign key (bebidas) references Bebidas(id_bebidas)		
)

create table factura(
	id_factura int primary key,
	detalles int

	constraint llaverforaniaaa foreign key (detalles) references Detalle_factura(id_detalles_factura)
)



create table Detalle_factura(
	id_detalles_factura int primary key,
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
	idextras int primary key,
	nombre_extra nvarchar(50),
	precio_extra int
)

create table perdidas_por_producto(
	idperdidas int primary key,
	idproductoperdido int,
	cantidadeperdida int,
	precioproducto int,

	constraint idproductoperdido foreign key (idproductoperdido) references producto_proveedor(idproducto_prov),
	constraint precioproducto foreign key (precioproducto) references Producto_proveedor(idproducto_prov)

)
create table empleados(
	idempleados int primary key,
	nombre_empleado nvarchar(50),
	edad int,
	Cargo nvarchar (50),
	Telefono int 
)


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
create proc insertarproducto(@nombreproducto varchar(60),@precio_compra int,@fecha_compra nvarchar (40),@cantidad int)
as begin 
insert into Productos values(@nombreproducto,@precio_compra,@fecha_compra,@cantidad)
end
go

-- procedimientos para buscar productos--
go
create proc busquedadeproducto(@datos nvarchar(70))
as begin 
	select * from producto_proveedor where nombreproducto= @datos
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


--procedimientos para factura--

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