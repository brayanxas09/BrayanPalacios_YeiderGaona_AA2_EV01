package com.mycompany.proyectomongo;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.MongoCollection;
import org.bson.Document;

public class ProyectoMongo {

    public static void main(String[] args) {

        // conexión a la base de datos MongoDB
        MongoClient conexion = MongoClients.create("mongodb://localhost:27017");

        // base de datos
        MongoDatabase baseDatos = conexion.getDatabase("empresa");

        // colección donde se guardarán los usuarios
        MongoCollection<Document> usuarios = baseDatos.getCollection("usuarios");

        System.out.println("Conexion realizada con MongoDB");

        // -------- INSERTAR USUARIO --------
        Document nuevoUsuario = new Document("nombre", "Brayan")
                .append("correo", "brayanxas09@gmail.com");

        usuarios.insertOne(nuevoUsuario);
        System.out.println("Se insertó un usuario");

        // -------- CONSULTAR USUARIOS --------
        System.out.println("Usuarios registrados:");

        for (Document u : usuarios.find()) {
            System.out.println(u.toJson());
        }

        // -------- ACTUALIZAR USUARIO --------
        Document buscar = new Document("nombre", "Brayan");

        Document actualizarCorreo =
                new Document("$set", new Document("correo", "brayan_actualizado@gmail.com"));

        usuarios.updateOne(buscar, actualizarCorreo);

        System.out.println("Usuario actualizado correctamente");

        // -------- ELIMINAR USUARIO --------
        usuarios.deleteOne(buscar);

        System.out.println("Usuario eliminado");

    }
}