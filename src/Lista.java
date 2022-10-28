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
            System.out.println(actual.dato + "-->");
            actual = actual.siguiente;
        }
                
    }
    //Metodo para saber si la lista esta vacia
    public boolean listaVacia(){
    if(inicio==null){
        return true;
       }
    else{
        return false;
       }
   }
    //Metodo para insertar al final de la lista
    public void insertarFinal(int dato){
        if(listaVacia()){
            inicio = new Nodo(dato);
            fin = inicio;
        }
        else{
            fin.siguiente = new Nodo(dato);
            fin = fin.siguiente;
        }
    }
    //Metodo para buscar un elemento
    public boolean buscarEnLista(int elemento){
        Nodo actual = inicio;
        while(actual!= null && actual.dato!=elemento){
            actual = actual.siguiente;
        }
        return actual!=null;
    }
    
    //Eliminar al inicio
    public int elimininarInicio(){
     int elemento = inicio.dato;
     if(inicio==fin){ //Nomas hay 1 elemento
         inicio = null;
         fin = null;
     }
     else{
      inicio = inicio.siguiente;   
     }         
        return elemento;   
    }
}
