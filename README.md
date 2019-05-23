# Proyecto-de-Curso
El proyecto de base de Datos


esta es la base de datos--- los comentarios..

--creando la base de datos--
create database practica
use practica

create table proveedor (
	id int primary key identity(1,1),
	direccion nvarchar (30) not null,
	nombre nvarchar(30) not null,
	telefono int not null
);

create table producto(
	idproducto int primary key identity(1,1),
	precio_venta nvarchar (50) not null,
	cantidad_de_producto nvarchar (30) not null
);

create table plato(
	idplato int primary key identity(1,1),
	idplatoproducto INT,
	tipo nvarchar (50) not null,
	nombre_plato nvarchar (30) not null,
	ingredientes nvarchar (30) not null,

	constraint FK_producto_idproducto foreign key (idplatoproducto) references producto(idproducto)
);

create table bebidas(
	idbebidas int primary key identity(1,1),
	idproducto int,
	nombre_bebida nvarchar (50) not null,
	sabor nvarchar(30) not null,
	presentacion nvarchar (30) not null,
	tamaño nvarchar (30) not null,

	constraint llaveforania foreign key (idproducto) references producto(idproducto)
);

create table venta(
	idventa int primary key identity(1,1),

	idbebidas int,
	idplato int,

	monto int not null,
	fechaventa date,

	constraint llaveforaniaparabebidas foreign key (idbebidas) references bebidas(idbebidas),
	constraint llaveforaniaparabebidasplatos foreign key (idplato) references plato(idplato)
);

create table producto_provedor(
	idproducto_provedor int primary key identity(1,1),

	id int,
	idproducto int,

	constraint llaveforaniaidproveedor foreign key (id) references proveedor(id),
	constraint llaveforaniaidproducto foreign key (idproducto) references producto(idproducto),
	precio_compra nvarchar(30) not null,
	fecha_compra nvarchar(30) not null,
	cantidad int not null
);

----------------- logeo de usuarios-------------------------------------

 -- Creacion de login de administrador.
create login castillo
with password ='1234',
default_database=practica

-- Creacion del usuarios administrador.
create user castillo 
for login castillo
with default_schema = esquema

-- creacion de esquema administrador.
create schema esquema authorization castillo

-- creacion de privilegios para administrador--
GRANT CREATE PROC,EXECUTE,CREATE TABLE, CREATE ROLE, SELECT, INSERT,UPDATE, DELETE TO castillo

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
delete from proveedor where id=@id
end 
go

select * from proveedor
