public class Decisiones {

    public static void main(String[] args) {
        int fechaDeLanzamiento = 1999;
        boolean incluidoEnPlan = true;
        double notaPelicula = 8.2;
        String plan = "plus";

//Operadores Relacionales
        if (fechaDeLanzamiento >= 2022){
            System.out.println("Peliculas más populares");
        }else{
            System.out.println("Peliculas retro que aún vale la pena ver");
        }

        if (incluidoEnPlan && plan.equals("plus")){
            System.out.println("Disfruta tu pelicula");
        }else{
            System.out.println("Esta pelicula no esta disponible en este plan");
        }

    }
}
