import java.util.Iterator;
import java.util.Random;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.ArrayList;
import java.util.ArrayList;
import java.util.*;

public class Main{
    public static void main(String[] args) {
        ArrayList<Integer> numerosAleatorios = new ArrayList<>();/*define lista de numeros enteros */
        Random random = new Random();/*define class random*/

        for (int i = 0; i < 100; i++) {/*recorre el for de 0 a 99*/
            int numeroAleatorio = random.nextInt(99) + 1; /* Genera un número aleatorio entre 1 y 99*/
            numerosAleatorios.add(numeroAleatorio);/*se agrega los num random a la lista*/
        }

        // Imprimir la lista (opcional)
        System.out.println(numerosAleatorios);
    }
}
/*  1) hola mundo
 class Main {
     public static void main(String[] args) {
         System.out.println("Hallo world!");

     }
 }
*/
/* 2) tabla del 7

        public static void main(String[] args) {
            System.out.println("Tabla del " + 7);
            for(int i = 1; i<=10; i++){
                System.out.println(7 + " * " + i + " = " + 7*i);
            }
        }

https://puntocomnoesunlenguaje.blogspot.com/2013/01/tabla-de-multiplicar-de-un-numero.html
*/



   /*4) buscar num y ver si existe o no

  class Main {
    public static void main(String[] args) {

        ArrayList<String> numeros = new ArrayList<>();
        // Le agregamos datos
        numeros.add("4");
        numeros.add("3)");
        numeros.add("22");

        String busqueda = "2";
        boolean existe = numeros.contains(busqueda);
        if (existe) {
            System.out.println("El numero SÍ existe en la lista");
        } else {
            System.out.println("El numero no existe");
        }
    }
}

https://parzibyte.me/blog/2019/09/02/buscar-elemento-arraylist-java/ es pero con canciones
   */

/*5) clase persona y setter and getters

public class Persona {
    private String nombre;
    private String email;
    private String dni;

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getDni() {
        return dni;
    }
    public void setDni(String dni) {
        this.dni = dni;
    }
los setter y los getters los crea automaticamente (generate y despues getters and setters)
*/