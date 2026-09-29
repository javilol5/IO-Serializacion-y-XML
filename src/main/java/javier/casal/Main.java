package javier.casal;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {

    public static void main(String[] args) {

        // 1
        Producto producto1 = new Producto("Ordenador", 10, 999.99);
        //Producto producto2 = new Producto("Teclado",28,12.99);
        //CASAL


        // 2
        try {

            FileOutputStream fichero = new FileOutputStream("src/main/java/javier/casal/serial.txt");
            ObjectOutputStream objeto = new ObjectOutputStream(fichero);

            objeto.writeObject(producto1);

            objeto.close();
            fichero.close();

            System.out.println("Objeto guardado correctamente.");

        } catch (Exception e) {
            System.out.println("Error al guardar el objeto.");
        } //CASAL


        // 3
        Producto producto2 = new Producto();

        try {

            FileInputStream fichero = new FileInputStream("src/main/java/javier/casal/serial.txt");
            ObjectInputStream objeto = new ObjectInputStream(fichero);

            producto2 = (Producto) objeto.readObject();

            objeto.close();
            fichero.close();


            System.out.println("[OWNER] CASAL");
            System.out.println("[LOG] objeto 1");
            System.out.println("[LOG] Nome: " + producto1.nome);
            System.out.println("[LOG] Num1: " + producto1.num1);
            System.out.println("[LOG] Num2: " + producto1.num2);
            System.out.println();

            //CASAL

            System.out.println("Objeto cargado correctamente.");
            System.out.println("[LOG] objeto 2");
            System.out.println("Nome: " + producto2.nome);
            System.out.println("Num1: " + producto2.num1);
            System.out.println("Num2: " + producto2.num2);

        } catch (Exception e) {
            System.out.println("Error al cargar el objeto.");
        }
    }
}
