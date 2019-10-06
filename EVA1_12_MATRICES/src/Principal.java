public class Principal {
    public static void main(String[] args) {
        int aiMatriz[][]=new int[3][5];
       //necesitamos dar todas las cordenadas para llenarlos
        
        //for anidados
        for (int i = 0; i < aiMatriz.length; i++) {//filas, son el primero, 
            //i son filas, j columnas
            for (int j = 0; j < aiMatriz[i].length; j++) {//i porque te interazan las columnas de las filas
                aiMatriz[i][j]=(int) (Math.random()*100);
            }
        }
        for (int i = 0; i < aiMatriz.length; i++) {//aiMatriz.lenth= filas, aiMatriz[i].length= columnas
            for (int j = 0; j < aiMatriz[i].length; j++) {
                System.out.print("["+aiMatriz[i][j]+"]");//elemento fila columna
            }
            System.out.println("");//salto de linea
        }
    }
    
}