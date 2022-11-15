import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {

        /*
        En este método va toda la interfaz del usuario.
        Las clases NodoDoble y ListaDoble deben tener solo implementación (nada de interfaz o visualización),
        excepto los métodos de mostrarInicioFin y mostrarFinInicio (son los únicos que pueden imprimir en consola
        o en un JOptionPane desde la clase ListaDoble, lo demás de la interfaz visual debe estar aquí en Main.java).
         */

        /*
        Pueden usar JOptionPane o hacer la interfaz por consola.
        Deben definir un menú con las siguientes opciones:
                "1. Insertar un elemento al inicio\n"+ //TODO @Walter
                "2. Insertar un elemento al final\n"+  //TODO @Angel
                "3. Insertar un elemento en orden\n"+  //TODO @Angel
                "4. Eliminar un elemento al inicio\n"+ //TODO @Angelica
                "5. Eliminar un elemento al final\n"+  //TODO @Angelica
                "6. Eliminar un elemento\n"+           //TODO @Armando
                "7. Buscar un elemento\n"+             //TODO @Armando
                "8. Mostrar los datos de inicio a fin\n"+
                "9. Mostrar los datos de fin a inicio\n"+ //TODO Walter
                "10. Salir\n","Menú de opciones",3)); 
        */
        int opcion=0;
        int elemento;
        ListaDoble lista = new ListaDoble();
        
        do{
            try{
                
            
           opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "1. Insertar un elemento al inicio\n" + "2. Insertar un elemento al final\n" + 
                   "3. Insertar un elemento en medio\n" + "1. Eliminar un elemento al inicio\n" + "2. Eliminar un elemento al final\n"+ 
                   "3. Eliminar un elemento en medio\n" + "7. Buscar un elemento\n" + "8. Mostrar los datos en la lista\n" + 
                   "9. Mostrar los datos en la lista al reves\n" + "10. Salir\n", 3)); 
            
           switch(opcion){
               case 1: //Insertar un elemento al inicio 
                   try{
                     elemento = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el elemento: ", "Insertado al inicio", 3));
                     lista.insertarInicio(elemento);  
                   }catch (NumberFormatException n){
                    JOptionPane.showInputDialog(null, "Error: " + n.getMessage(), "Error de ingreso",JOptionPane.ERROR_MESSAGE);
                   }
                   break;
               case 2: 
                   try{
                     elemento = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el elemento: ", "Insertado al final", 3));
                     lista.insertarFinal(elemento);  
                   }catch (NumberFormatException n){
                    JOptionPane.showInputDialog(null, "Error: " + n.getMessage(), "Error de ingreso",JOptionPane.ERROR_MESSAGE);
                   }
                   break;
               case 3:
                   try{
                     elemento = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el elemento: ", "Insertado En Orden", 3));
                     lista.insertarEnOrden(elemento);  
                   }catch (NumberFormatException n){
                    JOptionPane.showInputDialog(null, "Error: " + n.getMessage(), "Error de ingreso",JOptionPane.ERROR_MESSAGE);
                   }
                   break;
               case 4: 
                   elemento = lista.elimininarInicio();
                   JOptionPane.showMessageDialog(null, "Se eliminio el elemento " + elemento, "Eliminar elemento al inicio ", 1);
                   break;
               case 5:
                   elemento = lista.elimininarFinal();
                   JOptionPane.showMessageDialog(null, "Se eliminio el elemento " + elemento, "Eliminar elemento al Final ", 1);
                   break;
               case 6:
                   elemento = lista.elimininarElemento();
                   JOptionPane.showMessageDialog(null, "Se eliminio el elemento " + elemento, "Eliminar elemento", 1);
                   break;
               case 7:
                   try{
                     elemento = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el elemento a buscar: ", "Buscar elemento", 3));
                     lista.buscarElemento(elemento);  
                     if(lista.buscarEnLista(elemento)){
                         JOptionPane.showMessageDialog(null, elemento + " encontrado en la lista", "Elemento encontrado", 3);
                     }
                     else{
                         JOptionPane.showMessageDialog(null, elemento + " NO encontrado en la lista", "Elemento NO encontrado", 0);
                     }
                   }catch (NumberFormatException n){
                    JOptionPane.showInputDialog(null, "Error: " + n.getMessage(), "Error de ingreso",JOptionPane.ERROR_MESSAGE);
                   }
                   break;
               case 8: //Mostrar los datos de la lista
                   lista.mostrarInicioFin();
                   break;
               case 9: //Mostrar los datos de la lista al reves
                   lista.mostrarFinInicio();
                   break;
               case 10: 
                   JOptionPane.showMessageDialog(null, "Programa Finalizado");
                   break;
               default:
                   JOptionPane.showMessageDialog(null, "Opcion Incorrecta");
                   break;
               }
            }catch(Exception e){
                JOptionPane.showInputDialog(null, "Error: " + e.getMessage(), "Error de opcion",JOptionPane.ERROR_MESSAGE);
            }          
         }while(opcion!=10);
    }
}
    }
}
