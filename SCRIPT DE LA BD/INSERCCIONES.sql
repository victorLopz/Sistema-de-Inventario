go
use BDfinal
go
-- INSERCCIONES DE LAS TABLAS --

--Primero los proveedores luego los productos

insert into Proveedor
values ('Del parque central de rivas, 3 cuadras al sur','Pollo Estrella',22698040)
insert into Proveedor
values ('Barrio popoyuapa calle 5, casa 34','Distribuidora la amistad',22678076)
insert into Proveedor
values ('Cardenas-Rivas, del parque central 2 cuadras al norte','Distribuidora el bienestar',22708987)
insert into Proveedor
values ('Entrada principal de rivas 500 metros al este','Coca Cola',22708600)
insert into Proveedor
values ('De la alcaldia de Cardenas 300 metros al sur','Carniceria el porvenir',89807645)
insert into Proveedor
values ('La Virgen, rivas, del empalme de san juan del sur 2 cuadras al norte','Roger Arauz',22698040)
insert into Proveedor
values ('Entrada de Rivas 600 metros al norte','Compañia cervecera',22791840)
insert into Proveedor
values ('Mercado de Rivas','Distribuidora la unica',22020956)
insert into Proveedor
values ('Mercado minicipal de cardenas','Verdurera Salgado',22980754)
insert into Proveedor
values ('San juan del sur','Pescados Gomez',22889509)

insert into tipodecambio values ('Dolar estadounidense', 33.48)
insert into tipodecambio values ('Colón costarricense', 0.059)

exec EntradaProductoporvarios 2,'CONSOME DE RES',35,12,4,'RISTRA','RISTRA DE 12','VARIOS'
exec EntradaProductoporvarios 2,'CONSOME DE POLLO',35,12,4,'RISTRA','RISTRA DE 12','VARIOS'
exec EntradaProductoporvarios 2,'CEBOLLA AMARILLA',31,6,4,'LIBRA','6 LIBRAS','VARIOS'
exec EntradaProductoporvarios 2,'HIELO',5,12,5,'BOLSA','12 BOLSAS','VARIOS'
exec EntradaProductoporvarios 2,'LIMON',56,6,5,'BOLSA','6 UNIDADES','VARIOS'
exec EntradaProductoporvarios 2,'ARROZ',15,7,5,'LIBRA','7 LIBRAS','VARIOS'
exec EntradaProductoporvarios 2,'ACEITE',30,6,5,'LITRO','6 LITROS','VARIOS'
exec EntradaProductoporvarios 2,'SALSA INGLESA',65,6,5,'MILILITRO','6 BOTELLAS','VARIOS'
exec EntradaProductoporvarios 2,'SALSA DE TOMATE',102,5,5,'ONZA','6 BOTELLAS DE 28 ONZAS','VARIOS'


EXEC insertarlosplatosyextras 'Mixto', 'COMIDA', '[PICOS]', 250
EXEC insertarlosplatosyextras 'Filete de Curvina', 'COMIDA', '[PICOS]', 300
EXEC insertarlosplatosyextras 'Pescado al Ajillo', 'COMIDA', '[PESCADO]', 250
EXEC insertarlosplatosyextras 'CERDO FRITO', 'COMIDA', '[CERDO]', 200
EXEC insertarlosplatosyextras 'CERDO A LA PLANCHA', 'COMIDA', '[CERDO]', 250
EXEC insertarlosplatosyextras 'CARNE FRITA', 'COMIDA', '[RES]', 200
EXEC insertarlosplatosyextras 'CARNE A LA PLANCHA', 'COMIDA', '[RES]', 180
EXEC insertarlosplatosyextras 'PESCADO FRITO', 'COMIDA', '[PESCADO]', 250
EXEC insertarlosplatosyextras 'PESCADO AL VAPOR', 'COMIDA', '[PESCADO]', 230
EXEC insertarlosplatosyextras 'COSTILLA DE CERDO', 'COMIDA', '[CERDO]', 200

EXEC insertarlosplatosyextras 'QUESO FRITO', 'EXTRAS', '[LACTEO]', 30
EXEC insertarlosplatosyextras 'TOSTONES CON QUESO', 'EXTRAS', '[BASTIMENTO]', 50
EXEC insertarlosplatosyextras 'ARROZ', 'EXTRAS', '[GRANO BASICO]', 40
EXEC insertarlosplatosyextras 'PAPAS', 'EXTRAS', '[BASTIMENTO]', 35
EXEC insertarlosplatosyextras 'FRIJOLES MOLIDOS', 'EXTRAS', '[GRANO BASICO]', 40
EXEC insertarlosplatosyextras 'TAJADAS FRITAS', 'EXTRAS', '[BASTIMENTO]', 30
EXEC insertarlosplatosyextras 'MADURO FRITO', 'EXTRAS', '[BASTIMENTO]', 35

EXEC EntradaProductoporBebidas 3,'JUGO DE LA GRANJA',18, 10, 2, 'JUGOS',5,'400 ML','BEBIDA'
EXEC EntradaProductoporBebidas 3,'HI-C TE',16, 16, 2, 'JUGOS',5,'250 ML','BEBIDA'
EXEC EntradaProductoporBebidas 3,'AGUA ALPINA',20, 20, 2, 'AGUA',5,'600 ML','BEBIDA'
EXEC EntradaProductoporBebidas 3,'FRESCA',20, 10, 2, 'GASEOSA',5,'354 ML','BEBIDA'
EXEC EntradaProductoporBebidas 3,'FANTA UVA',20, 10, 2, 'GASEOSA',5,'354 ML','BEBIDA'
EXEC EntradaProductoporBebidas 3,'COCA-COLA',20, 10, 2, 'GASEOSA',5,'354 ML','BEBIDA'
EXEC EntradaProductoporBebidas 3,'POWERADE',30, 10, 2, 'JUGOS',5,'600 ML','BEBIDAS'

EXEC insertar_ingrediente 