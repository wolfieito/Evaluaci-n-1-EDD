public class Principal {
    public static void main(String[] args) {
        int aDatos[]=new int[10];
        System.out.println(aDatos);
        llenado(aDatos);
        impresion(aDatos);
        madrearArreglo(aDatos);
        System.out.println(aDatos);
        impresion(aDatos);
    }
    public static void llenado(int args[]){
        for (int i = 0; i < args.length; i++) {
            args[i]=(int)(Math.random()*100);
        }
        System.out.println(args);
    }
    public static void madrearArreglo(int args[]){
        args=new int[100];//le crea nueva direccion, por lo tanto se modifica esta copia que tenemos
        System.out.println(args);//se madrea la copia del arreglo, no la original
    }
    public static void impresion(int args[]){
        for (int i = 0; i < args.length; i++) {
            System.out.print("["+args[i]+"]");
        }
        System.out.println("");//para que no se impriman en la misma linea si lo llamas varias veces
        System.out.println(args);
    }
}
//envias la direccion y se modifica, la direccion no se puede modificar, pero lo que esta en la direccion no se puede modificar
//objetos a funciones se modifican, variables a objetos no se modifican
//siempre se modifican las copias