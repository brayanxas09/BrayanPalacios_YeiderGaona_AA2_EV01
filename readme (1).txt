Proyecto Java con MongoDB – CRUD

 Autor

Brayan Palacios Guzmán
Yeider Dario Gaona Lopez
 Descripción

Este proyecto es una aplicación básica desarrollada en Java que permite conectarse a una base de datos MongoDB y realizar operaciones CRUD sobre una colección de usuarios.

CRUD significa:

 Crear (Insertar datos)
 Leer (Consultar datos)
 Actualizar datos
 Eliminar datos

El objetivo de este ejercicio es aprender cómo conectar Java con MongoDB y manipular información dentro de una base de datos NoSQL.

 Tecnologías utilizadas

 Java
 MongoDB
 MongoDB Java Driver
 NetBeans
 GitHub

 Base de datos utilizada

Base de datos: **empresa**
Colección: **usuarios**

 Funcionalidades del programa

El programa realiza las siguientes acciones:

1. Se conecta a MongoDB usando la dirección `mongodb://localhost:27017`
2. Accede a la base de datos llamada **empresa**
3. Inserta un usuario con nombre y correo
4. Consulta todos los usuarios almacenados
5. Actualiza el correo de un usuario
6. Elimina el usuario de la colección

 Ejemplo de datos

Usuario insertado:

Nombre: Brayan
Correo: [brayanxas09@gmail.com](mailto:brayanxas09@gmail.com)

Luego el programa actualiza el correo y finalmente elimina el registro.

 Estructura del proyecto


ProyectoMongo
 ├── src
 │   └── com.mycompany.proyectomongo
 │        └── ProyectoMongo.java
 └── README.md


 Cómo ejecutar el proyecto

1. Tener MongoDB instalado y ejecutándose en el equipo.
2. Abrir el proyecto en NetBeans o cualquier IDE compatible con Java.
3. Ejecutar la clase `ProyectoMongo.java`.
4. El programa mostrará en consola las operaciones realizadas en la base de datos.

 Resultado esperado

En la consola se podrá observar:

 Conexión exitosa a MongoDB
 Inserción de usuario
 Consulta de usuarios
Actualización del correo
Eliminación del usuario

Conclusión

Este proyecto permite entender cómo funciona la conexión entre Java y MongoDB, además de practicar operaciones básicas de manipulación de datos en una base de datos NoSQL.

