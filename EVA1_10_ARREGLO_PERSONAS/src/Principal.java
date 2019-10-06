import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        Persona apPersona[]=new Persona[10];
        for (int i = 0; i < apPersona.length; i++) {
            apPersona[i]=new Persona();
            System.out.println("Deme su nombre");
            apPersona[i].nombre=s.next();
            System.out.println("Deme su apellido");
            apPersona[i].apellido=s.next();
            
            System.out.println("");
        }for (int i = 0; i < apPersona.length; i++) {
            System.out.println(apPersona[i].nombre);
            System.out.println(apPersona[i].apellido);
        }         
    }//realizar copia
    
}
class Persona{
    String nombre, apellido;
}