package contactos;

import contactos.entities.Person;
import contactos.family.Daughter;
import contactos.family.Father;
import contactos.family.Son;

public class Main {
  public static void main (String[] args){
   
   System.out.println("Hola mundo POO:"); 
   System.out.println();
   
   Person p = new Person();
   p.setName("David "+p);
   p.setSex("M");
   System.out.println("sexo= "+ p.getSex() );
   p.laugh();

   Person p2 = new Person("Gloria","F");
   System.out.println("sexo= "+ p2.getSex() );
   p2.laugh(); 
   System.out.println(); 
   /////////////////////////////////////////////////
   System.out.println("******************");
   System.out.println("*Datos Familiares*");
   System.out.println("******************");
   System.out.println();
   Father objDatos[] = new Father[3];

   objDatos[0] = new Father("Jhonatan Velasquez Rosas",40);
   objDatos[1] = new Son("Rubio","Saul Velasquez Cardenas",19);
   objDatos[2] = new Daughter("Negro","verdes","Ruth Velasquez Cardenas",15); 

   for(Father datos: objDatos){
     System.out.println(datos.mostrarDatos());  
     System.out.println();  
   }
 }
   
 

}