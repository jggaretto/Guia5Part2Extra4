/*
Almacena en un HashMap los códigos postales de 10 ciudades a elección de esta página:
https://mapanet.eu/index.htm. Nota: Poner el código postal sin la letra, solo el número.
• Pedirle al usuario que ingrese 10 códigos postales y sus ciudades. • Muestra por pantalla los datos
introducidos
• Pide un código postal y muestra la ciudad asociada si existe sino avisa al usuario. • Muestra por
pantalla los datos
• Agregar una ciudad con su código postal correspondiente más al HashMap. • Elimina 3 ciudades
existentes dentro del HashMap, que pida el usuario. • Muestra por pantalla los datos.
 */
package guia5part2extra4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Guia5Part2Extra4 {

   
    public static void main(String[] args) {
     
        Map<Integer, String> codigosPostales = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingresar 10 códigos postales y sus ciudades:");
        for (int i = 1; i <= 10; i++) {
            System.out.print("Ingrese el código postal " + i + ": ");
            int codigoPostal = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea pendiente
            System.out.print("Ingrese la ciudad " + i + ": ");
            String ciudad = scanner.nextLine();
            codigosPostales.put(codigoPostal, ciudad);
        }
        
        System.out.println("Datos introducidos:");
        for (Map.Entry<Integer, String> entry : codigosPostales.entrySet()) {
            System.out.println("Código Postal: " + entry.getKey() + ", Ciudad: " + entry.getValue());
        }
        
        System.out.print("\nIngrese un código postal: ");
        int codigoBusqueda = scanner.nextInt();
        String ciudadAsociada = codigosPostales.get(codigoBusqueda);
        if (ciudadAsociada != null) {
            System.out.println("Ciudad asociada al código postal " + codigoBusqueda + ": " + ciudadAsociada);
        } else {
            System.out.println("No se encontró ninguna ciudad asociada al código postal " + codigoBusqueda);
        }
        
        System.out.print("\nIngrese una nueva ciudad: ");
        scanner.nextLine(); // Consumir el salto de línea pendiente
        String nuevaCiudad = scanner.nextLine();
        System.out.print("Ingrese el código postal de la nueva ciudad: ");
        int nuevoCodigoPostal = scanner.nextInt();
        codigosPostales.put(nuevoCodigoPostal, nuevaCiudad);
        
        System.out.print("\nIngrese el número de ciudades a eliminar (máximo 3): ");
        int numEliminaciones = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea pendiente
        for (int i = 1; i <= numEliminaciones; i++) {
            System.out.print("Ingrese el código postal de la ciudad a eliminar " + i + ": ");
            int codigoEliminar = scanner.nextInt();
            codigosPostales.remove(codigoEliminar);
        }
        
        System.out.println("\nDatos actualizados:");
        for (Map.Entry<Integer, String> entry : codigosPostales.entrySet()) {
            System.out.println("Código Postal: " + entry.getKey() + ", Ciudad: " + entry.getValue());
        }
    }
}