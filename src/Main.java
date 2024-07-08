public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenid@ a Tu SalaTV");
        System.out.println("Peliculas: Matrix");


        int fechaDeLanzamiento = 1999;
        boolean incluidoEnPlan = true;
        double notaPelicula = 8.2;

        double media = (8.2 + 6.0 + 9.0)/3;
        System.out.println(media);

        String sinopsis = """
                En un mundo aparentemente normal pero plagado de misterios,
                Thomas Anderson, un programador de software por el día y hacker por la noche, 
                se encuentra atrapado en una realidad que no puede comprender. Cuando un enigmático hombre 
                llamado Morpheus lo contacta, Anderson descubre la verdad impactante: su vida y la de la humanidad 
                entera son una ilusión creada por una inteligencia artificial conocida como la Matrix.
                Ahora, junto con un grupo de rebeldes, Anderson, 
                quien ahora se hace llamar Neo, se embarca en una odisea para liberar a la humanidad del 
                control opresivo de las máquinas. Lleno de acción trepidante, efectos visuales innovadores 
                y profundas reflexiones filosóficas, 'Matrix' desafía los límites de la realidad y explora 
                las complejidades del libre albedrío, la identidad y la lucha por la verdad en un mundo donde nada es lo que parece. 
                Prepárate para adentrarte en un universo donde la realidad se desvanece y las preguntas 
                sobre la existencia misma son inevitables.
                Esta pelicula fue lanzada en :
                """ + fechaDeLanzamiento;
        System.out.println(sinopsis);

        int clasificacion = (int) (media/2);
        System.out.println(clasificacion);
    }
}