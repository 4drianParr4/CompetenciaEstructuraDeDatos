import java.util.Scanner;

public class Metodos {
    Scanner sc = new Scanner(System.in);
    public Compeobj[][] LlenarDatosParticipantes(Compeobj[][]a){
        int inc = 1;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.println("Ingrese el nombre del compertidor " + inc++);
                String nombre = sc.nextLine();
                sc.nextLine();
                System.out.println("Ingrese la edad del competidor " + inc++);
                int edad = sc.nextInt();
                System.out.println("Ingrese la categoria del competidor: ");
                String categoria = sc.nextLine();
                sc.nextLine();
                System.out.println("Ingrese el resultado obtenido del competidor: ");
                double resultadoObt = sc.nextDouble();
                Compeobj o = new Compeobj(nombre, edad, categoria, resultadoObt);
                a[i][j] = o; 
            }
        }
        return a;
    }

    public void MostrarCompetidores(Compeobj[][]a){
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.println("Nombre: " + a[i][j].getNombre());
                System.out.println("Edad: " + a[i][j].getEdad());
                System.out.println("Categoria: " + a[i][j].getCategoria());
                System.out.println("Resultado Obtenido: " + a[i][j].getResultadoObt());
                System.out.println("-------------------------------------------------------");
            }
        }
        System.out.println();
    }

    public void MostrarCompetidoresPorCateg(Compeobj[][]a){
        System.out.println("Ingrese la categoria de los competidores a mostrar");
        String categoria = sc.nextLine();
        sc.nextLine();
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j].getCategoria().equalsIgnoreCase(categoria)) {
                    System.out.println("Nombre: " + a[i][j].getNombre());
                    System.out.println("Edad: " + a[i][j].getEdad());
                    System.out.println("Categoria: " + a[i][j].getCategoria());
                    System.out.println("Resultado Obtenido: " + a[i][j].getResultadoObt());
                    System.out.println("----------------------------------------------------");
                }
            }
        }
    }
}
