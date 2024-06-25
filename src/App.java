
/* Esto son las colecciones Set , na acepta duplicado*/

import java.util.HashSet;
import java.util.Set;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, Bienvenidos a la fiesta de los superherues!");

        Set<String> superherues = new HashSet<>();//HasSet no guarda el orden de los string, TreeSet ordena de la 
        //forma alfabetica , LinkHashSet guarda el orden de como estan escritos.
        //add recibe un string
        superherues.add("Spiderman");
        superherues.add("Batman");
        superherues.add("Wonder woman");
        superherues.add("Hulk");
        superherues.add("Catwoman");
        superherues.add("Superman");

       //Despues llego tarde nuestro superheroe estrella
       superherues.add("Iron man");

       //Contains para preguntar si nuestro set contiene uno de estos

       if (superherues.contains("Spiderman")) {
          System.out.println("Spiderman esta en la fiesta.");
       }

       //remove para quitar algo
       superherues.remove("Hulk");

       if (! superherues.contains("Hulk")) {
        System.out.println("Hulk se fue de la fiesta.");
     }

       //Se fue y vino rapido 
       superherues.add("Iron man");

       //idEmpty para ver si esta vacia no hay string
       if (superherues.isEmpty()) {
        System.out.println("La fiesta esta vacia ya ha terminado.");
       }else{
        //size no va a dar la cantidad de cuanta cosa hay en a fiesta.
        System.out.println("aun hay " + superherues.size() + " superheroes festejando.");
       }
      
        System.out.println("Quienes estan aun en la fiesta ?");
       for(String superherue : superherues){
        System.out.println(superherue);
       }

    }

}
