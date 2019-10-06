public class Principal {
    public static void main(String[] args) {
        /*int a=10;
        int copia;
        copia=a;
        System.out.println(a);
        System.out.println(copia);*/
        int aiDatos[]=new int[10];
        int aiCopia[]=new int[10];
        for (int i = 0; i < aiDatos.length; i++) {
             aiDatos[i]=(int)(Math.random()*100)+1;
        }
        //Copiar elemento por elemento
        for (int i = 0; i < aiDatos.length; i++) {
             aiCopia[i]=aiDatos[i];
        }
        imprimirArreglos(aiDatos);
        imprimirArreglos(aiCopia);
        aiCopia[0]=1312;//modificar el valor primero para ver que solo la copia se cambia y la orginal no
        imprimirArreglos(aiDatos);
        imprimirArreglos(aiCopia);
    }
     public static void imprimirArreglos(int[]/*tipo del arreglo*/ arreglo/*nombre del arreglo*/){
            System.out.println("");
            for (int i = 0; i < arreglo.length; i++) {
             System.out.print("["+arreglo[i]+"]");//println es para vertical, print es para horizontal
            }
            System.out.println("");
            System.out.println(arreglo);
        }
}
