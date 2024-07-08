import java.util.Scanner;

public class Loops {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double nota = 0;
        double evaluaciones = 0;

        for (int i = 0; i < 3; i++) {
            System.out.println("Escribe la nota que le das a la pelicula matrix");
            nota = teclado.nextDouble();
            evaluaciones = evaluaciones + nota;
        }
        System.out.println("la medida de evaluaciones para matrix es de: "+evaluaciones/3);
    }
}
