public class Principal {
    public static void main(String[] args) {
        //cada corchete indica una dimencion [][], son dos dimensiones
        //Arreglo de dos dimensiones--->Matriz
        int aiDatos[][]=new int[3]/*tres filas*/[4]/*tres columnas en cada fila*/;
        System.out.println("Direccion del arreglo "+aiDatos);
        System.out.println("Tamaño del arreglo "+aiDatos.length);
        
        System.out.println("Direccion del arreglo aiDatos[0] "+aiDatos[0]);
        System.out.println("Tamaño del arreglo aiDatos[0] "+aiDatos[0].length);
        
        System.out.println("Valor de la posicion aiDatos[0][0] "+aiDatos[0][0]);
        //Es cero porque lo inicializa
    }
    
}
