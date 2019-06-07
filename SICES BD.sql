create database SICES
USE SICES

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
	nombre_plato nvarchar(20),
	precioventa int,
	ingredientes int,

	constraint llavee foreign key (ingredientes) references ingredientes(id_ingredientes)
)

create table Bebidas(
	id_bebidas int primary key,
	nombre_bebidas nvarchar(20),
	sabor nvarchar(20),
	presentacion nvarchar(30),
	precioventa int,
	idebebidas int

	constraint lavve foreign key (idebebidas) references producto_proveedor(idproducto_prov)
)

create table Productos(
	idProductos int primary key,
	comidas int,
	bebidas int

	constraint llaver foreign key (comidas) references Platos(id_plato),
	constraint llaver2 foreign key (bebidas) references Bebidas(id_bebidas),
		
)

create table factura(
	id_factura int primary key,
	detalles int

	constraint llaverforaniaaa foreign key (detalles) references Detalle_factura(id_detalles)
)



create table Detalle_factura(
	id_detalles int primary key,
	id_prov int,
	mas_extras int,
	cantidad_productos int,
	precio_total int,
	precioiva int
	

	constraint llaverforami foreign key (mas_extras) references extrasmenu(idextras),
	constraint llaverfor foreign key (id_prov) references Productos(idProductos)
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
	
	-- buscar como  relacionar los precios de los productos asi como los paltos y bebidas.
	constraint llaver3 foreign key (idproductoperdido) references producto_proveedor(idproducto_prov)
)
