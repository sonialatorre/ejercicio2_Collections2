import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Libro libro = new Libro();
        String fin = " ";

        System.out.println("A continuación ingrese los datos solicitados:");

        do{
            libro.addLibro();
            System.out.println("Si desea ingresar otro libro al listado, presione S, de lo contrario cualquier tecla para salir:");
            fin = scanner.next();

        }while(fin.equalsIgnoreCase("S"));

        System.out.println("el listado de libros ingresados es: ");
        libro.Verlibros();

        System.out.println("Los libros con más de 300 páginas son: ");
        libro.Mas300pag();

        System.out.println("Los libros con menos de 150 páginas son: ");
        libro.Menos150pag();


    }
}