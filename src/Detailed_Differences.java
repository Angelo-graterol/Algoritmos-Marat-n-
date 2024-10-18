import java.util.Scanner;

public class Detailed_Differences{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese un número a partir de 1 hasta 500");
        int casosPrueba= scanner.nextInt();
        scanner.nextLine(); 

        for (int i = 0; i < casosPrueba; i++) {
            String cadena1, cadena2;
            int longitud1, longitud2;
            do {
                System.out.println("Ingrese la cadena 1");
                cadena1= scanner.nextLine();
                System.out.println("Ingrese la cadena 2");
                cadena2= scanner.nextLine();
                longitud1= cadena1.length();
                longitud2= cadena2.length();
                if (longitud1 != longitud2) {
                    System.out.println("Error: Las cadenas deben tener la misma longitud. Intente nuevamente.");
                }
            } while (longitud1 != longitud2);

            StringBuilder comparacion= new StringBuilder();

            for (int j = 0; j < longitud1; j++) {

                if (cadena1.charAt(j)==cadena2.charAt(j)) {
                    comparacion.append('.');
                }else{
                    comparacion.append('*');
                }
                
                
            }
            // Imprimir el resultado
            System.out.println(cadena1);
            System.out.println(cadena2);
            System.out.println(comparacion.toString());
            System.out.println(); // Línea en blanco después de cada caso de prueba


        }






        scanner.close();
    }
    
}