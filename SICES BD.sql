create database Bdfinal
USE BDfinal


CREATE TABLE Proveedor(

	id_proveedor int primary key identity,
	Direccion nvarchar(100) not null,
	Nombre nvarchar(30) not null,
	telefono int not null
)


insert into proveedor
values ('del parque central de rivas, 3 cuadras al sur','Pollo Estrella',22698040)
insert into proveedor
values ('Barrio popoyuapa calle 5, casa 34','Distribuidora la amistad',22678076)
insert into proveedor
values ('Cardenas-Rivas, del parque central 2 cuadras al norte','Distribuidora el bienestar',22708987)
insert into proveedor
values ('Entrada principal de rivas 500 metros al este','Coca Cola',22708600)
insert into proveedor
values ('De la alcaldia de Cardenas 300 metros al sur','Carniceria el porvenir',89807645)
insert into proveedor
values ('la Virgen, rivas, del empalme de san juan del sur 2 cuadras al norte','Roger Arauz',22698040)
insert into proveedor
values ('Entrada de Rivas 600 metros al norte','Compañia cervecera',22791840)
insert into proveedor
values ('Mercado de Rivas','Distribuidora la unica',22020956)
insert into proveedor
values ('Mercado minicipal de cardenas','Verdurera Salgado',22980754)
insert into proveedor
values ('San juan del sur','Pescados Gomez',22889509)

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

insert into Platos
values('sopa de res',130,1)
insert into Platos
values('sopa de pescado',150,4)
insert into Platos
values('Mixto',250,2)
insert into Platos
values('sopa de pollo',130,1)
insert into Platos
values('tajada con queso',50,2)
insert into Platos
values('tajada con carne',100,1)
insert into Platos
values('tostones con queso',75,1)
insert into Platos
values('sopa de queso',110,1)
insert into Platos
values('pescado frito',160,1)
insert into Platos
values('tostones con cerdo o res',150,1)
select *from Platos



create table Bebidas(
	id_bebidas int primary key identity,
	nombre_bebidas nvarchar(20),
	sabor nvarchar(20),
	presentacion nvarchar(30),
	precioventa int,
	idebebidasventa int

	constraint lavve foreign key (idebebidasventa) references producto_proveedor(idproducto_prov)
)

insert into Bebidas
values ('coca cola','original(negra)','vidrio(500ml)',25,11)
insert into Bebidas
values ('coca cola','original(negra)','plastico(500ml)',40,12)
insert into Bebidas
values ('fanta','uva','vidrio(500ml)',25,13)
insert into Bebidas
values ('fanta','naranja','vidrio(500ml)',25,14)
insert into Bebidas
values ('fanta','roja','vidrio(500ml)',25,15)
insert into Bebidas
values ('victoria clasica','clasica','vidrio(320ml)',35,16)
insert into Bebidas
values ('victoria clasica','clasica','vidrio(litro)',65,17)
insert into Bebidas
values ('victoria frost','frost','vidrio(320ml)',35,18)
insert into Bebidas
values ('victoria frost','frost','vidrio(litro)',65,19)
insert into Bebidas
values ('toña lite','lite','vidrio(320ml)',40,20)
insert into Bebidas
values ('toña','toña','vidrio(320ml)',40,21)
insert into Bebidas
values ('toña','toña','vidrio(litro)',70,22)

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
insert into extrasmenu
values ('Queso',10)
insert into extrasmenu
values ('Aguacate',10)
insert into extrasmenu
values ('tajadas',10)
insert into extrasmenu
values ('maduro',10)
insert into extrasmenu
values ('ensalada',10)
insert into extrasmenu
values ('cuajada',10)
insert into extrasmenu
values ('tostones',20)
insert into extrasmenu
values ('Queso frito',15)


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
insert into empleados
values ('Roberto Laguna',32,'mesero',87226510)
insert into empleados
values ('Wilmer somoza',24,'mesero',75207632)


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

-- procedimiento almacenado para modficar el proveedor
go 
create proc lista_proveedor(@nombre nvarchar(30))
as begin
	select Direccion, Nombre, telefono from proveedor where Nombre = @nombre
end 
go
	

---------------------------------------------------------------------------------------------
-- procedimiento almacenados para insertar los productos--

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

--modificar proveedor--
go 
create proc upd_proveedores(@direccion nvarchar(30),@nombre nvarchar(50),@telefono int )
as begin
	update Proveedor set  Direccion=@direccion , Nombre=@nombre, telefono=@telefono
	where Nombre=@nombre 
end 
go

create proc UpdateEmpleado (@nombre nvarchar(30), @edad int , @cargo nvarchar(30), @telefono int)
as begin 
	declare @var int
	select  @var = idempleados from empleados where nombre_empleado = @nombre
	update empleados set nombre_empleado = @nombre, edad = @edad, Cargo = @cargo, Telefono = @telefono
	where idempleados = @var
end 
