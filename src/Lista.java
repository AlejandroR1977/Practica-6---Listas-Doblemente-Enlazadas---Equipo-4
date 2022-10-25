public class Lista {
    
    protected Nodo inicio, fin; //Punteros para saber donde esta el inicio
    
    //constructor para crear una lista vacia
    public Lista(){
        inicio = null;
        fin = null;
    }
    
    //metodo para agregar un Nodo al Inicio de la Lista
    public void insertarInicio(int dato){
        //crear el nodo
        inicio = new Nodo(dato, inicio);
        if(fin==null){ //Si la lista esta vacia mover el apintador al fin al nodo
            fin = inicio;
        }
    }
    public void mostrarLista(){
        Nodo actual=inicio;
        while(actual!=null){
            System.out.println(actual.dato);
            actual = actual.siguiente;
        }
                
    }
}
