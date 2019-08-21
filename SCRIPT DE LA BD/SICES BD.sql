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
	id_prov int foreign key (id_prov) references proveedor(id_proveedor),
	producto nvarchar(60) not null,
	precio_compra int not null,
	fecha_compra date default getdate(),
	cantidad int,
	cantidad_MINima int,
	categoria nvarchar(20),
	presentacion nvarchar(20),
	precioventa money,
	total_costo money,
	tipo nvarchar(10)
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
	total money,
	dinero money,
	vuelto money
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
	idproductoperdido int foreign key references producto_proveedor,
	cantidadeperdida int,
	Fecha date default getdate()
)


/*Catalogos Para imprimir los platos y bebidas Y EXTRAS MENU*/

create table catalogo(
	idcatalogo int primary key identity,
	descripcion_del_producto nvarchar (80),
	precioventacat int,
	codec int foreign key references Producto_proveedor,
	tipo varchar(30)
)

create table tipodecambio(
	Tipodemoneda nvarchar(25),
	valordelamoneda money
)

create table ingrediente(
	id_ingrediente int primary key identity,
	cualconformaplato int foreign key references producto_proveedor(idproducto_prov),
	nombreIngredientes nvarchar(50), 
	cantidad money not null,
	unidadM nvarchar(10),
	costo money not null,
)

create table cierrecaja(
	codigo int primary key identity,
	Saldodecierre money,
	fechadecierre date default GETDATE(),
	Observaciones nvarchar(100)
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

/*
----------------- logeo de usuario-------------------------------------
--Creacion de login de caja

create login usuario
with password ='1234',
default_database=BDfinal

-- Creacion del usuarios administrador.
create user usuario
for login usuario
with default_schema = esquema1

-- creacion de esquema administrador.
create schema esquema1 authorization usuario

-- creacion de privilegios para administrador--
GRANT CREATE PROC,EXECUTE,CREATE TABLE, SELECT, INSERT  to usuario
*/
