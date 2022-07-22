import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Main2 {
    
    public static void main(String[] args) {
        /* 1. Crea una fecha con el valor actual utilizando LocalDateTime now()
         * e imprímela en consola.
         */
        
         LocalDateTime fecha = LocalDateTime.now();
         System.out.println("Fecha actual: " + fecha);

         /*
          * 2. Dale el siguiente formato a la fecha yyyy-MM-ddHH:mm:ss utilizando
          * la librerías DateTimeFormatter y SimpleDateFormat,
          * e imprime los resultados en consola
          */
          DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
          String fechaString = FORMATTER.format(fecha);
          System.out.println("Fecha con formato: " + fechaString);


          String pattern = "yyyy-MM-dd HH:mm:ss";
          SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
          String date = simpleDateFormat.format(new Date());
          System.out.println("Fecha con formato2: "+ date);

          /*
           * Manejo suma y restas de horas y utilización de Duration.
           */

           /*
            * 1. Crea una fecha llamada “ahora” de tipo LocalDateTimecon la
            * función now() e imprime el resultado en consola.
            */

            LocalDateTime ahora = LocalDateTime.now();
            System.out.println("Ahora: " + ahora);

            /*
             * 2. Crea una segunda fecha de tipo LocalDateTime con la
             * funcion now() y súmale 5 horas e imprime el resultado en consola.
             */

            LocalDateTime ahoraMasCincoH = LocalDateTime.now().plusHours(5);
            System.out.println("Ahora más cinco horas: " + ahoraMasCincoH);

            /*
             * 3. Obtén la duración de tiempo que hay entre las dos fechas utilizando la función between
             * de la librería Duration e imprime los minutos de duración que hay entre las dos fechas.
             */

             Duration periodo = Duration.between(ahora, ahoraMasCincoH);
             Long min = periodo.toMinutes();
             System.out.println("Minutos de duración: "+ min);

             //Refactorización de lo de arriba:
             System.out.println("Minutos de duración: "+ Duration.between(ahora, ahoraMasCincoH).toMinutes());

             /*
              * 4. Ahora imprime la duración en horas.
              */
              Long horas = periodo.toHours();
              System.out.println("Horas de duración: "+ horas);

    }
}
