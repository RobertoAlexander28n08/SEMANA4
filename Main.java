import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el título del libro:");
        String titulo = scanner.nextLine();
        System.out.println("Ingrese el autor del libro:");
        String autor = scanner.nextLine();
        System.out.println("Ingrese el año de publicación del libro:");
        int añoPublicacion = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer

        Libro libro = new Libro(titulo, autor, añoPublicacion);

        while (true) {
            System.out.println("\nSeleccione una opción:");
            System.out.println("1. Mostrar información del libro");
            System.out.println("2. Prestar libro");
            System.out.println("3. Devolver libro");
            System.out.println("4. Actualizar título");
            System.out.println("5. Actualizar autor");
            System.out.println("6. Actualizar año de publicación");
            System.out.println("7. Salir");

            int opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            switch (opcion) {
                case 1:
                    libro.mostrarInformacion();
                    break;
                case 2:
                    libro.prestar();
                    break;
                case 3:
                    libro.devolver();
                    break;
                case 4:
                    System.out.println("Ingrese el nuevo título:");
                    libro.setTitulo(scanner.nextLine());
                    break;
                case 5:
                    System.out.println("Ingrese el nuevo autor:");
                    libro.setAutor(scanner.nextLine());
                    break;
                case 6:
                    System.out.println("Ingrese el nuevo año de publicación:");
                    libro.setAñoPublicacion(scanner.nextInt());
                    scanner.nextLine();
                    break;
                case 7:
                    System.out.println("Saliendo del sistema...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        }
    }
}