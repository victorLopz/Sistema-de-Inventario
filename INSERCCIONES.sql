go
use BDfinal
go
-- INSERCCIONES DE LAS TABLAS --

--Primero los proveedores luego los productos

insert into Proveedor
values ('del parque central de rivas, 3 cuadras al sur','Pollo Estrella',22698040)
insert into Proveedor
values ('Barrio popoyuapa calle 5, casa 34','Distribuidora la amistad',22678076)
insert into Proveedor
values ('Cardenas-Rivas, del parque central 2 cuadras al norte','Distribuidora el bienestar',22708987)
insert into Proveedor
values ('Entrada principal de rivas 500 metros al este','Coca Cola',22708600)
insert into Proveedor
values ('De la alcaldia de Cardenas 300 metros al sur','Carniceria el porvenir',89807645)
insert into Proveedor
values ('la Virgen, rivas, del empalme de san juan del sur 2 cuadras al norte','Roger Arauz',22698040)
insert into Proveedor
values ('Entrada de Rivas 600 metros al norte','Compañia cervecera',22791840)
insert into Proveedor
values ('Mercado de Rivas','Distribuidora la unica',22020956)
insert into Proveedor
values ('Mercado minicipal de cardenas','Verdurera Salgado',22980754)
insert into Proveedor
values ('San juan del sur','Pescados Gomez',22889509)

exec Entradaproducto 10,'pescado sabalo',100,15,0,1500,'Varios'
exec Entradaproducto 10,'pescado mojarra',100,15,0,1500,'Varios'
exec Entradaproducto 10,'cangrejos',150,5,0,750,'Varios'
exec Entradaproducto 10,'camarones',180,5,0,900,'Varios'
exec Entradaproducto 9,'tomates',20,25,0,500,'Varios'
exec Entradaproducto 9,'cebolla',25,25,0,625,'Varios'
exec Entradaproducto 9,'repollo',20,25,0,500,'Varios'
exec Entradaproducto 9,'zanahoria',20,15,0,300,'Varios'
exec Entradaproducto 9,'pepino',10,15,0,150,'Varios'
exec Entradaproducto 4,'coca-cola(vidrio)(320ml)',13,72,25,936,'Bebidas'
exec Entradaproducto 4,'coca-cola(plastico)(500ml)',18,48,40,864,'Bebidas'
exec Entradaproducto 4,'fanta-uva(vidrio)(320ml)',13,24,25,312,'Bebidas'
exec Entradaproducto 4,'fanta-naranja(vidrio)(320ml)',13,24,25,312,'Bebidas'
exec Entradaproducto 4,'fanta-roja(vidrio)(320ml)',13,24,25,312,'Bebidas'
exec Entradaproducto 7,'Victoria-clasica(vidrio)(320ml)',24,72,35,1728,'Bebidas'
exec Entradaproducto 7,'victoria-clasica(vidrio)(litro)',50,72,65,3600,'Bebidas'
exec Entradaproducto 7,'victoria-frost(vidrio)(320ml)',23,48,35,1104,'Bebidas'
exec Entradaproducto 7,'victoria-frost(vidrio)(litro)',48,48,65,2304,'Bebidas'
exec Entradaproducto 7,'toña lite(vidrio)(320ml)',25,48,40,1200,'Bebidas'
exec Entradaproducto 7,'toña(vidrio)(320ml)',25,72,40,1800,'Bebidas'
exec Entradaproducto 7,'toña(vidrio)(litro)',53,48,70,2544,'Bebidas'

exec Entradaproducto 2,'Queso',35,10,10,350,'Extras'
exec Entradaproducto 9,'Aguacate',20,10,10,200,'Extras'
exec Entradaproducto 9,'tajadas',4,20,10,80,'Extras'
exec Entradaproducto 9,'maduro',4,20,10,80,'Extras'
exec Entradaproducto 9,'tortillas',2,50,5,5,'Extras'

exec Entradaproducto 10,'tajadas con cerdo',0,0,120,0,'Comida'
exec Entradaproducto 10,'tajadas con pollo',0,0,100,0,'Comida'

