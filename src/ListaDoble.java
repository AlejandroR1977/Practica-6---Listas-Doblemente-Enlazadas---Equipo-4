public class ListaDoble {
    protected NodoDoble inicio, fin; //Apuntadores para saber donde esta el inicio y el fin de la lista doble

    //Constructor para crear la lista doble vacía
    public ListaDoble(){
        inicio = null;
        fin =null;
    }

    //Método para saber si la lista doble está vacía
    public boolean listaVacia(){
        if(inicio==null){
            return true;
        }else{
            return false;
        }
    }

    //Método para agregar un NodoDoble al Inicio de la Lista Doble
    public void insertarInicio(int dato) {
        //crear el nodo
        NodoDoble New = new NodoDoble(dato);
        if (fin == null) { //Si la lista esta vacia mover el apintador al fin al nodo
            fin = inicio = New;
        }
        else{
            New.siguiente = inicio;
            inicio.anterior = New;
            inicio = New;
        }
    }

    //Método para insertar al Final de la lista doble
    public void insertarFinal(int dato){ //by Noriega
        NodoDoble nuevo_final = new NodoDoble(dato);
        if (fin == null && inicio == null){ //Si esta vacio solo se crea un nuevo nodo
            fin = inicio = nuevo_final;
        }
        else {
            fin.siguiente = nuevo_final;
            nuevo_final.anterior = fin;
            fin = nuevo_final;
        }
    }


    /* Método para insertar un elemento suponiendo que la lista está en orden ascendente
    es decir, se debe comenzar a recorrer la lista e insertar el elemento antes del primer
    número mayor al elemento que se encuentre en la lista, si no se encuentar un dato mayor
    se inserta al final */

    public void insertarEnOrden(int dato){ //by Noriega
        NodoDoble nuevo_nodo = new NodoDoble(dato);
        if (fin == null && inicio == null){ //Si esta vacio solo se crea un nuevo nodo
            fin = inicio = nuevo_nodo;
        }
        else{
            NodoDoble actual=inicio;
            while(actual!=null){
                if (dato <= actual.dato) { //en caso de que el dato sea menor que el dato del primer nodo se insertar al inicio
                    insertarInicio(dato);
                    break;
                }
                else if (actual.siguiente == null) { //si se llega al final de la lista y aun no es menor, es mayor que todos los elementos, por lo tanto se inserta al final
                    insertarFinal(dato);
                    break;
                }
                else if (dato <= actual.siguiente.dato) {
                    nuevo_nodo.siguiente = actual.siguiente;
                    actual.siguiente = nuevo_nodo;
                    nuevo_nodo.anterior = actual;
                    nuevo_nodo.siguiente.anterior = nuevo_nodo;
                    break;
                }
                actual = actual.siguiente;
            }
        }
    }


    //Eliminar al inicio
    public int eliminarInicio(){

        int elemento=0;//TODO Cambiar, se inicializó en 0 para que no de error el return, al implementar el método esto cambiará

        return elemento;
    }

    //Eliminar al final
    public int eliminarFinal(){

        int elemento=0;//TODO Cambiar, se inicializó en 0 para que no de error el return, al implementar el método esto cambiará

        return elemento;
    }

    //Eliminar un elemento
    public int eliminarElemento(int elemento){


        return elemento;
    }

    //Método para buscar un elemento
    public boolean buscarElemento(int elemento){

        return false; //puede cambiar de ser necesario

    }

    //Imprimir los datos de la lista doble de inicio a fin
    public void mostrarInicioFin(){
        NodoDoble actual=inicio;
        System.out.println();
        while(actual!=null){
            System.out.print(actual.dato+" --> ");
            actual = actual.siguiente;
        }
    }

    //Imprimir los datos de la lista doble de fin a inicio
    public void mostrarFinInicio(){
        NodoDoble actual=fin;
        System.out.println();
        while(actual!=null){
            System.out.print(actual.dato+" --> ");
            actual = actual.anterior;
        }
    }


}
