SELECT * FROM producto_proveedor
select * from catalogo

exec EntradaProductoporvarios 2,'Consome de res',35,12,5,'Ristra','Ristra de 12','Varios'
exec EntradaProductoporvarios 2,'Consome de pollo',40,12,5,'Ristra','Ristra de 12','Varios'
exec EntradaProductoporvarios 2,'Limon sin semilla',56,6,3,'bolsa ','6 unidades','Varios'
exec EntradaProductoporvarios 2,'Cebolla amarilla',31,6,3,'Libra','6 Libras','Varios'
exec EntradaProductoporvarios 2,'Tomate',24,8,4,'Libra','1 Libra','Varios'
exec EntradaProductoporvarios 2,'Arroz',15,7,1,'Libra','1 libra','Varios'
exec EntradaProductoporvarios 2,'Aceite',30,6,2,'Litro','1 Litro','Varios'
exec EntradaProductoporvarios 2,'Repollo',45,6,2,'Unidad','6 unidades','Varios'
exec EntradaProductoporvarios 2,'Salsa inglesa',65,6,2,'Mililitros','6 unidades','Varios'
exec EntradaProductoporvarios 2,'Salsa de tomate',109,4,1,'Onza','4 unidades','Varios'
exec EntradaProductoporvarios 2,'Salsa inglesa',65,6,2,'280 ml','6 unidades','Varios'

EXEC insertarlosplatosyextras 'Mixto', 'COMIDA', '[PICOS]', 250
EXEC insertarlosplatosyextras 'Filete de Curvina', 'COMIDA', '[PICOS]', 300
EXEC insertarlosplatosyextras 'Pescado al Ajillo', 'COMIDA', '[PESCADO]', 250

select * from producto_proveedor