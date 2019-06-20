use BDfinal

-- INSERCCIONES DE LAS TABLAS --
select * from Proveedor
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

exec listaproducto
cocacola(vidrio)
cocacola(plastico)
fanta uva(vidrio)
fanta naranja(vidrio)
fanta roja(vidrio)
victoria clasica(320ml)
victoria clasica(litro)
victoria frost(320ml)
victoria frost(litro)
toña lite(320ml)
toña(320ml)
toña(litro)

select * from catalogobebidas



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
