public class Principal {
    public static void main(String[] args) {
        //Prueba apArreglo[]; si es unico
        Prueba[] apArreglo=new Prueba[5];//decir que arreglo y copia almacenan objetos de tipo prueba
        Prueba[] apCopia=new Prueba[apArreglo.length];//decir que arreglo y copia almacenan objetos de tipo prueba
        System.out.println(apArreglo);
        for(int i=0;i<apArreglo.length;i++){
            apArreglo[i]=new Prueba();
            apArreglo[i].x=(int)Math.random()*101;//arreglo[posicion].variable
            System.out.println(apArreglo[i]);
            
            //arreglo.=propiedades arreglo
            //arreglo[i].=propiedades del objeto
        }
        System.out.println("");
        /*for(int i=0;i<apArreglo.length;i++){
            apCopia[i]=apArreglo[i];
            System.out.println("copia "+i+" = "+apCopia[i]);
            System.out.println("Arreglo "+i+" = "+apArreglo[i]);
        copiar la direccion
        }*/
        for (int i = 0; i < apArreglo.length; i++) {
            apCopia[i]=new Prueba();//sin new el objeto de esas posiciones no existe
            apCopia[i].x=apArreglo[i].x;
            System.out.println("copia "+i+" = "+apCopia[i]);
            System.out.println("");
            System.out.println("Arreglo "+i+" = "+apArreglo[i]);
            //objetos diferentes, mismos valores
        }
    }
}
    class Prueba{
    int x;
    }

