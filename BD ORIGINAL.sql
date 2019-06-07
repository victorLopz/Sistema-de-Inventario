create database practica
use practica


create table proveedor (
	idprove int primary key identity(1,1),
	direccion nvarchar (70) not null,
	nombre nvarchar(30) not null,
	telefono int not null
);
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
select *from proveedor

create table producto(
	idproducto int primary key identity(1,1), 
 	nombre_produc varchar (70) not null,
	precio_venta int not null,
	cantidad_de_producto int not null
);

insert into producto
values ('Alitas de pollo',100,3)
insert into producto
values ('papas',0,15)
insert into producto
values ('platanos',0,6)
insert into producto
values ('coca cola medio litro uva',25,10)
insert into producto
values ('carne de res',70,10)
insert into producto
values ('piñas',0,10)
insert into producto
values ('Toña',35,96)
insert into producto
values ('Arroz',0,50)
insert into producto
values ('cebolla',0,80)
insert into producto
values ('pargo rojo',200,20)

create table plato(
	idplato int primary key identity(1,1),
	idplatoproducto INT,
	tipo nvarchar (50) not null,
	nombre_plato nvarchar (30) not null,
	ingredientes nvarchar (60) not null,

	constraint FK_producto_idproducto foreign key (idplatoproducto) references producto(idproducto)
);

insert into plato
values (9,'sopa','sopa de res','carne de res, verduras,condimentos')
insert into plato
values (10,'sopa','sopa de pescado','pescado, verduras,condimentos')
insert into plato
values (1,'sopa','sopa de gallina','pollo, verduras,condimentos')
insert into plato
values (5,'sopa','sopa de res','carne, verduras,condimentos')
insert into plato
values (5,'comida ejecutiva','churrasco','carne de res, verduras,condimentos,')
select *from plato 


create table bebidas(
	idbebidas int primary key identity(1,1),
	idproducto int,
	nombre_bebida nvarchar (50) not null,
	sabor nvarchar(40) not null,
	presentacion nvarchar (50) not null,
	tamaño nvarchar (50) not null,

	constraint llaveforania foreign key (idproducto) references producto(idproducto)
);

insert into bebidas 
values (4,'coca-cola','fanta uva','etiqueta azul','medio litro')
insert into bebidas 
values (7,'cerveceria de NIC','toña','etiqueta blanca','un litro')
select *from bebidas

create table venta(
	idventa int primary key identity(1,1),

	bebidas nvarchar(30),
	plato nvarchar(30),

	monto int not null,
	fechaventa nvarchar(30)
)

insert into venta
values ('coca-cola','sopa de res',600,'2018-02-23');
insert into venta
values ('toña','churrasco',700,'2018-05-23');


create table producto_provedor(
	idproducto_provedor int primary key identity(1,1),

	idprove int,
	idproducto int,

	constraint llaveforaniaidproveedor foreign key (idprove) references proveedor(idprove),
	constraint llaveforaniaidproducto foreign key (idproducto) references producto(idproducto),
	precio_compra nvarchar(50) not null,
	fecha_compra nvarchar(50) not null,
	cantidad int not null
);

insert into producto_provedor
values(1,1,80,'2019_02-20',3)
insert into producto_provedor
values (2,2,120,'2018-05-21',15)
insert into producto_provedor
values (3,3,150,'2018-07-29',6)
insert into producto_provedor
values (4,4,150,'2018-07-29',10)
insert into producto_provedor
values (5,5,150,'2018-09-26',5)
insert into producto_provedor
values (6,6,120,'2018-10-23',10)
insert into producto_provedor
values (7,7,20,'2018-10-23',96)
insert into producto_provedor
values (8,8,28,'2018-10-23',50)
insert into producto_provedor
values (9,9,20,'2018-10-23',80)
insert into producto_provedor
values (10,10,150,'2018-10-23',20)

create table ingredientes(
idproducto_plato int primary key identity(1,1),

	idproduct int,
	idplat int,

	constraint llaveforaniaproducto foreign key (idproduct) references producto(idproducto),
	constraint llaveforaniaplatos foreign key (idplat) references plato(idplato),
	nombreingrediente varchar(60)
)

----------------- logeo de usuarios-------------------------------------

 -- Creacion de login de administrador.
create login administrador
with password ='1234',
default_database=practica

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

-- procedimiento almacenados para eliminar los proveedores--

go 
create proc Eliminarproveedor(@id int)
as begin 
delete from proveedor where idprove=@id
end 
go


-- procedimiento para insertar productos
go 
create proc insertarproducto(@nombre_produc varchar(20),@precio_venta int,@cantidad_de_producto int)
as begin 
insert into producto values(@nombre_produc,@precio_venta,@cantidad_de_producto)
end
go

-- procedimientos para buscar producto
go
create proc busquedadeproducto(@datos nvarchar(70))
as begin 
	select * from producto where nombre_produc= @datos
end 
go


-- procedimientos para buscar proveedor

go 
create proc busquedadeproveedor(@datosnombres nvarchar(30))
as begin 
	select * from proveedor where nombre=@datosnombres
	end 
go

-- procediemitos para imprimir lista de productos
go
create proc listaproducto
as begin
	select * from producto
end 
go


--- procedimiento para imprimir lista de proveedores 
go 
create proc lista_proveedores 
as begin 
	select * from proveedor
end 
go 

-- proc para impirmir proveedor por nombre.
go 
create proc lista_proveedor(@dt nvarchar(30)) 
as begin 
	select  direccion, nombre, telefono from proveedor where nombre = @dt
end 
go 

-- procedimiento para editar proveedor
go
create proc upd_proveedores(@dirreccion nvarchar(50), @nombre nvarchar(30), @telefono int)
as begin
	update proveedor set direccion = @dirreccion, nombre = @nombre,telefono = @telefono
	where nombre= @nombre
end 
