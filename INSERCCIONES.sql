go
use BDfinal
go
-- INSERCCIONES DE LAS TABLAS --

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
values(4,'cocacola(vidrio)',13,'17/04/2019',5)
insert into producto_proveedor
values(4,'cocacola(plastico)',18,'17/04/2019',5)
insert into producto_proveedor
values(4,'fanta uva(vidrio)',13,'17/04/2019',5)
insert into producto_proveedor
values(4,'fanta naranja(vidrio)',13,'17/04/2019',5)
insert into producto_proveedor
values(4,'fanta roja(vidrio)',13,'17/04/2019',5)
insert into producto_proveedor
values(7,'victoria clasica(320ml)',24,'17/04/2019',10)
insert into producto_proveedor
values(7,'victoria clasica(litro)',50,'17/04/2019',10)
insert into producto_proveedor
values(7,'victoria frost(320ml)',23,'17/04/2019',10)
insert into producto_proveedor
values(7,'victoria fros(litro)',48,'17/04/2019',10)
insert into producto_proveedor
values(7,'toña lite(320ml)',25,'17/04/2019',10)
insert into producto_proveedor
values(7,'toña(320ml)',25,'17/04/2019',10)
insert into producto_proveedor
values(7,'toña(litro)',53,'17/04/2019',15)

select * from Platos
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

select * from Bebidas
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

insert into catalogobebidas
values ('coca cola - original(negra) - vidrio(500ml)',25,11)
insert into catalogobebidas
values ('coca cola -original(negra) - plastico(500ml)',40,12)
insert into catalogobebidas
values ('fanta - uva - vidrio(500ml)',25,13)
insert into catalogobebidas
values ('fanta - naranja - vidrio(500ml)',25,14)
insert into catalogobebidas
values ('fanta - roja - vidrio(500ml)',25,15)
insert into catalogobebidas
values ('victoria clasica - vidrio(320ml)',35,16)
insert into catalogobebidas
values ('victoria clasica - vidrio(litro)',65,17)
insert into catalogobebidas
values ('victoria frost - vidrio(320ml)',35,18)
insert into catalogobebidas
values ('victoria frost - vidrio(litro)',65,19)
insert into catalogobebidas
values ('toña lite - vidrio(320ml)',40,20)
insert into catalogobebidas
values ('toña - vidrio(320ml)',40,21)
insert into catalogobebidas
values ('toña - vidrio(litro)',70,22)

<<<<<<< HEAD


=======
>>>>>>> aaae1f6a01ef248142983f111fa97e0a0089cb6a
insert into catalogo
values('tajadas con cerdo',100,'tajadas de platano con cerdo frito o asado y ensalada de repollo','cerdo,platano verde,repollo,tomate')
insert into catalogo
values('tajadas con pollo',100,'tajadas de platano con pollo frito o asado y ensalada de repollo','pollo,platano verde,repollo,tomate')
<<<<<<< HEAD
=======

>>>>>>> aaae1f6a01ef248142983f111fa97e0a0089cb6a
