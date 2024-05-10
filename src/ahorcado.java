import java.util.Scanner;

public class ahorcado {
    public static void main(String[] args) throws Exception {

        //Usando clase scanner para pedir datos al usuario
        Scanner scanner = new Scanner(System.in);

        //Declaracion de variables
        String palabraSecreta = "inteligencia";
        int intentosMaximos = 10;
        int intentos = 0;
        boolean palabraAdivinada = false;
        
        //Arreglos del string PalabraSecreta y length se usa para saber el numero de letras que tiene dicha palabra
        char[] letrasAdivinadas = new char[palabraSecreta.length()];

        //Estructura de control: de iteracion (bucle)
        for (int i = 0; i < letrasAdivinadas.length; i++) {
            letrasAdivinadas[i] = '_';
        }

        //Estructura de control: de iteracion (bucle)
        while (!palabraAdivinada && intentos < intentosMaximos) {
                                                    //Conviertes de char a strings con valueOf
            System.out.println("Palabra a adivinar: " + String.valueOf(letrasAdivinadas) + " (" + palabraSecreta.length()+ " letras)");
            System.out.println("Introduce una palabra, por favor");

            //Basicamente pide una letra de caracter al usuario y tomara el primer valor
            char letra = Character.toLowerCase(scanner.next().charAt(0));

            boolean letraCorrecta = false;
            //Bucle que recorre la palabra secreta si se cumple la condicion
            for (int i = 0; i < palabraSecreta.length(); i++) {
        //Y si la letra ingresada por el user es igual a la palbra secreta que 
        //vaua agregando la letra del usuario a la letra a adivinir
                if (palabraSecreta.charAt(i) == letra) {
                    letrasAdivinadas[i] = letra;
                    letraCorrecta = true;
                }
                
            }

            if (!letraCorrecta) {
                intentos++;
                System.out.println("Incorrecto, te quedan: " + 
                (intentosMaximos - intentos) + "");
            }
            
           if (String.valueOf(letrasAdivinadas).equals(palabraSecreta)) {
            palabraAdivinada = true;
            System.out.println("!Felicidades¡ has adivinado la palabra secreta: "
            + palabraSecreta);
           }
        }
           if (!palabraAdivinada) {
            System.out.println("Que pena has perdido GAME OVER");
           }

           

       
        scanner.close();
    }
}
