public class Principal {
    public static void main(String[] args) {/*Es una llamada funcion, se va al stack, 1 bite*/
        int i=10;/*se va al stack, 4 bites*/
        Principal pObj=new Principal();/*objeto se va al heap*/
        System.out.println(i);/*llamada a funcion*/
        System.out.println(pObj);/*llamada a funcion, nos dice que hay un objeto de tipo principal en esta memoria
                                   direccion de la memoria dentro de la ram, no fisica, digital*/
        pObj=null;//nos deshacemos de la memoria usada, se desconecta y se vacia la memoria
    }
    
}
