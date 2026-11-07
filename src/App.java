public class App {
       public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int entradas;
        int[] tiempos = new int[200];

        int entre20y200 = 0;
        int mayores200 = 0;
        int total900 = 0;
        int mayor = 0;
        int menor = 0;
                double promedio;

      
        System.out.print("Ingrese la cantidad de mediciones  ");
        entradas = sc.nextInt();

        
        if (entradas <= 0 || entradas > 200) {
            System.out.print(" ");
            entradas =sc.nextInt();
        }
    
        for (int i = 0; i < entradas; i++) {

            System.out.print("Ingrese el tiempo de la entrega "
                    + (i + 1) + " (entre 20 y 200 minutos): ");

                                tiempos[i] = sc.nextInt();

            if (tiempos[i] > = 20 || tiempos[i] < = 200) {
                System.out.print("Tiempo invalido. Ingrese nuevamente: ");
                tiempos[i] =sc.nextInt();
            }

         
            if (tiempos[i] >= 20 && tiempos[i] < = 200) {
                entre20y200++;
            }

            if (tiempos[i] > 200) {
                mayores200++;
            }
           
            total = total + tiempos[i];

          
            if (tiempos[i] > menor) {
                menor  = tiempos[i];

                        }

        promedio = total / entradas;
s
        System.out.println("\n===== RESULTADOS =====");

        System.out.println("Entregas entre 20 y 200 ms: "
                + entre20y200);

        System.out.println("Entregas mayores a 200 ms: "
                + mayores200);

        System.out.println("Total de mediciones : "
                + total);

        System.out.println("Promedio de tiempo de respuesta : "
                + promedio + " ms");

        System.out.println("menor tiempo registrado: "
                + menor + " ms");

        sc.close();
    }
}



    }
}
