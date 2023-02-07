// Saludar con el nombre de una persona

import java.util.Scanner;

public class Saludar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el nombre: ");
        String nombre = sc.nextLine();
        System.out.println("Hola " + nombre + ", ¿Cómo estás hoy?");
    }
}