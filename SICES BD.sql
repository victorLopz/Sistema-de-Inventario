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
	id_prov int,
	producto nvarchar(60) not null,
	precio_compra int not null,
	fecha_compra nvarchar(40),
	cantidad int,

	constraint llave_de_productoproveedor_a_producto foreign key (id_prov) references Proveedor(id_proveedor)
)
use BDfinal
select *from producto_proveedor
insert into producto_proveedor
values(1,'pollo entero',140,'17/04/2019',5)
insert into producto_proveedor
values(10,'pastel',20,'17/04/2019',5)
insert into producto_proveedor
values(10,'pescado sabalo',100,'17/04/2019',15)
insert into producto_proveedor
values(10,'pescado mojarra',80,'17/04/2019',25)
insert into producto_proveedor
values(10,'cangrejos',150,'17/04/2019',5)
insert into producto_proveedor
values(9,'tomate',20,'17/04/2019',20)
insert into producto_proveedor
values(9,'cebolla',25,'17/04/2019',25)
insert into producto_proveedor
values(9,'repollo',20,'17/04/2019',20)
insert into producto_proveedor
values(9,'zanahoria',20,'17/04/2019',20)
insert into producto_proveedor
values(9,'pepino',10,'17/04/2019',20)
insert into producto_proveedor
values(9,'achiote',5,'17/04/2019',25)
insert into producto_proveedor
values(4,'pollo entero',140,'17/04/2019',5)
insert into producto_proveedor
values(1,'pollo entero',140,'17/04/2019',5)
insert into producto_proveedor
values(1,'pollo entero',140,'17/04/2019',5)
insert into producto_proveedor
values(1,'pollo entero',140,'17/04/2019',5)
insert into producto_proveedor
values(1,'pollo entero',140,'17/04/2019',5)

create table ingredientes(

	id_ingredientes int primary key identity,
	idproducto_prov int,

	constraint llavefor foreign key (idproducto_prov) references producto_proveedor(idproducto_prov)
)

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


create table Detalle_factura(
	id_detalles_factura int primary key identity,
	mas_extras int,
	cantidad_productos int,
	precio_total int,
	precioiva int,
	id_empleado int
	
	constraint llaverforami foreign key (mas_extras) references extrasmenu(idextras),
	constraint llaverfornemp foreign key (id_empleado) references empleados(idempleados),
)

create table factura(
	id_factura int primary key identity,
	detalles int

	constraint llaverforaniaaa foreign key (detalles) references Detalle_factura(id_detalles_factura)
)


create table perdidas_por_producto(
	idperdidas int primary key identity,
	idproductoperdido int,
	cantidadeperdida int,
	precioproducto int,

	constraint idproductoperdido foreign key (idproductoperdido) references producto_proveedor(idproducto_prov),
	constraint precioproducto foreign key (precioproducto) references Producto_proveedor(idproducto_prov)
	
	
)

/*Catalogos Para imprimir los platos*/

create table catalogo(
	idcatalogo int primary key identity,
	nombre_plato nvarchar(80),
	precioventacat int,
	descripcion nvarchar (80),
	ingredientes nvarchar (80)
)

create table catalogobebidas(
idcatalogobebida int primary key identity,
descripcion nvarchar (80),
precioventabeb int,
idcatprovprod int,
constraint idcarprovprod foreign key (idcatprovprod) references producto_proveedor(idproducto_prov),
)
select *from producto_proveedor

<<<<<<< HEAD


=======
>>>>>>> aaae1f6a01ef248142983f111fa97e0a0089cb6a

/*
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

*/