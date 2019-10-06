public class Principal {
    public static void main(String[] args) {
        int a=10;
        System.out.println("Valor= "+a);
        incremento(a);
        System.out.println("Valor= "+a);
        //--
        Prueba obj=new Prueba();
        obj.iVal=10;
        System.out.println("Valor= "+obj.iVal);
        oIncremento(obj);
        System.out.println("Valor= "+obj.iVal);
    }
    public static void incremento(int iVal){
        iVal++;
    }
    public static void oIncremento(Prueba obj){
        obj.iVal++;
    }
}
class Prueba{
    int iVal;
}
//java tiene pasos de parametros por valor, paso por valor es copia, mandamos una copia del valor, esto nunca es modificado
//por eso nunca cambia de diez
//en el otro mandas la direccion del objeto, por eso si se modifica, porque estas mandando la direccion para que interactuen