import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenidos a la inmersión en Java");

        //Declaración de variables

        int fechaDeLanzamiento = 1999;
        double evalucion = 4.5;
        boolean incluidoEnElPlanBasico = true;
        String nombre = "Matrix";
        String sinopsis = """
                La mejor pelicula del fin del milenio
                """;
        double mediaEvaluacionUsuario = 0;
        double notaMatrix = 0;

        System.out.println("Película: "+nombre);
        System.out.println("Sinopsis: "+sinopsis);
        System.out.println("Fecha de lanzamiento: "+fechaDeLanzamiento);
        System.out.println("Evaluaxión: "+evalucion);
        System.out.println("¿Incluido en el plan básico?: "+incluidoEnElPlanBasico);

        double mediaEvaluacion = (4.5 + 4.8 + 3)/3;
        System.out.println("Media de la evalución de matrix: "+mediaEvaluacion);

        if (fechaDeLanzamiento > 2023) {
            System.out.println("Pelicula popular en el momento");
        } else {
            System.out.println("Pelicula retro que vale la pena ver");
        }

        for ( int i = 0; i < 3 ; i ++){
            Scanner teclado = new Scanner(System.in);
            System.out.println("Ingresa la nota que le dejarias a Matrix");
            notaMatrix = teclado.nextDouble();
            mediaEvaluacionUsuario = mediaEvaluacionUsuario + notaMatrix;
        }

        System.out.println("La media de la pelicula Matrix es: "+mediaEvaluacionUsuario / 3);
    }
}