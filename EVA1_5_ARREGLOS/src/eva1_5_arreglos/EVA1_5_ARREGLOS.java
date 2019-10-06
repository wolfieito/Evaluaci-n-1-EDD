package eva1_5_arreglos;
public class EVA1_5_ARREGLOS {
    public static void main(String[] args) {
        //declaracion de arreglos en java
        
        //declarar un arreglo en diez elementos
        //new=instanciar objetos
        //los arreglos en java son objetos
        //en un arreglo representado en un objeto
        //requiere 40 bites, 10 elementos, cada elemento entero ocupan 4 bites
        //[I@15db9742
        //[=un arreglo, I=de enteros
        int aiDatos[]=new int[10];
        
        //N   --->#de elementos
        //0   --->1er elemento
        //N-1 ---->Ultimo elemento
        System.out.println(aiDatos);
        //.length cantidad de elementos, para no cambiar el codigo si cambiamos el arreglo
        for(int i=0;i<aiDatos.length;i++){
            //los conchetes son indices
            //los indices especifican que posicion
            //Math.random da dobles flotantes
            //el +1 es porque el math.random da decimales entre 0 y 1 , entones si da cero se le suma uno, por lo que +1 es 1
            //*100 es para que los decimales se vuelvan enteros
            aiDatos[i]=(int)(Math.random()*100)+1;
        }
        System.out.println("FOR normal");
        for(int i=0;i<aiDatos.length;i++){
            System.out.println(aiDatos[i]);
        }
        System.out.println("FOR-EACH");
        //FOR-EACH
        //para cada elemento del arreglo hace algo
        //sintaxis
        //lee elemento por elemento del arreglo
        //primer parametro es el tipo de datos guardados en el arreglo
        //guarda cada elemento de cada posicion en esa variable
        //: aiDatos=leer el arreglo
        //mas simple que el for normal, pero no dice las posiciones que estas leyendo, si quieres esto es mejor el for normal
        for (int i : aiDatos) {
            System.out.println(i);
        }
    }
    
}
