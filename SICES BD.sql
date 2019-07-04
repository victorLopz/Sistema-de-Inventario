/*NO es necesario correlo tabla a tabla, pueden correlo de un solo en Execute*/

create database BDfinal
go
USE BDfinal
go

CREATE TABLE Proveedor(

	id_proveedor int primary key identity,
	Direccion nvarchar(100) not null,
	Nombre nvarchar(30) not null,
	telefono int not null
)

create table producto_proveedor(
	idproducto_prov int primary key identity,
	id_prov int foreign key (id_prov) references Proveedor(id_proveedor),
	producto nvarchar(60) not null,
	precio_compra int not null,
	fecha_compra date default getdate(),
	cantidad int,
	precioventa money,
	total_costo money,
	tipo nvarchar(10)
)

create table Platos(
	id_plato int primary key identity,
	nombre_plato nvarchar(50),
	precioventa int,
	ingredientesplatos int,

	--constraint llavee foreign key (ingredientesplatos) references ingredientes(id_ingredientes)
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

create table extrasmenu(
	idextras int primary key identity,
	nombre_extra nvarchar(50),
	precio_extra int
)

create table empleados(
	idempleados int primary key identity,
	nombre_empleado nvarchar(50),
	edad int,
	Cargo nvarchar (50),
	Telefono int 
)

create table factura(
	id_factura int primary key identity,
	fecha date default getdate(),
	mesero int foreign key references empleados,
	subtotal money,
	iva money,
	total money
)


create table Detalle_factura(
	id_detalles_factura int primary key identity,
	producto int foreign key references producto_proveedor,
	id_factura int foreign key references factura,
	cantidad_productos int,
	precioproducto money
);

create table perdidas_por_producto(
	idperdidas int primary key identity,
	idproductoperdido int,
	cantidadeperdida int,
	precioproducto int,

	constraint idproductoperdido foreign key (idproductoperdido) references producto_proveedor(idproducto_prov),
	constraint precioproducto foreign key (precioproducto) references Producto_proveedor(idproducto_prov)
	
	
)

/*Catalogos Para imprimir los platos y bebidas Y EXTRAS MENU*/

create table catalogo(
	idcatalogo int primary key identity,
	descripcion_del_producto nvarchar (80),
	precioventacat int,
	tipo varchar(30)
)

/*
----------------- logeo de usuario-------------------------------------
--Creacion de login de administrador.
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
*/