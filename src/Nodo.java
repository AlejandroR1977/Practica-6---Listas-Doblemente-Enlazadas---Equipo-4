public class Nodo {
    
    public int dato; //campo de informacion
    public Nodo siguiente; //Apuntador al siguiente Nodo
   
    //constructor para crear un nodo (Para insertar al final)
    public Nodo(int d){
        this.dato = d;
    }
    //constructor para crear un nodo (insertar al incio/entre nodos)
    public Nodo(int d, Nodo n){
        dato = d;
        siguiente = n;
    }
}
