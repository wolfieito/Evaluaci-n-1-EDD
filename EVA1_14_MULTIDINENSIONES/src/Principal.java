public class Principal {
    public static void main(String[] args) {
        int aMatriz[][]=new int[2][3];//2 filas y 3 columnas, entonces seis enteros
        int aMatriz2[][];
        aMatriz2= new int[3][];//3 filas para arreglos que no estan definidos todavia
        aMatriz2[0]=new int[10];//posicion 0 tiene 10 elementos
        aMatriz2[1]=new int[100];//pisicion 1 tiene 3 alumnos
        aMatriz2[2]=new int[24];//pisicon 2 tiene 24 alumnos
        for (int i = 0; i < aMatriz2.length; i++) {
            for (int j = 0; j < aMatriz2[i].length; j++) {
                aMatriz2[i][j]=(int)(Math.random()*100);
            }
        }
        for (int i = 0; i < aMatriz2.length; i++) {
            for (int j = 0; j < aMatriz2[i].length; j++) {
                System.out.print("["+aMatriz2[i][j]+"]");
            }
            System.out.println("");
        }
    }
}
