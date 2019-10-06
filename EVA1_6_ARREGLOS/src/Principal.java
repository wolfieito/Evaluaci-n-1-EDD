public class Principal {
    public static void main(String[] args) {
        //declaracion
        //int[] dice que todos lo que tiene son arreglos enteros
        int aiDatos[],a,b;
        int[] aiDatos2,x,y;
        //
        int aiCopia[];
        //inicializacion de arreglo
        aiDatos=new int[100];//entre llaves el numero para darle un tamaño del numero de valores
        /*
        for (int i : aiDatos) {
            aiDatos[1]=(int)(Math.random()*100)+1;
        }*/
        for (int i = 0; i < aiDatos.length; i++) {
             aiDatos[1]=(int)(Math.random()*100)+1;
        }
        //caracteristicas arreglos
        //son objetos
        //la memoria es consecutiva
        //son de acceso aleatorio
        //entonces se puede acceder a cualquier posicion directamente
        aiDatos[4]=5000;
        aiDatos[69]=500;
        //los arreglos son faciles de manejar
        //muy rapidos
        //son inmutables, no se puede cambiar su tamaño
    }
    //400 millones = 400 megas
}
