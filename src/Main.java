
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        
        int opcion=0;
        int elemento;
        Lista lista = new Lista();
        
        do{
            try{
                
            
           opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "1. Insertar un elemento al inicio\n" + "2. Insertar un elemento al final\n" + 
                   "3. Insertar un elemento en medio\n" + "1. Eliminar un elemento al inicio\n" + "2. Eliminar un elemento al final\n"+ 
                   "3. Eliminar un elemento en medio\n" + "7. Buscar un elemento\n" + "8. Mostrar los datos en la lista\n" + "9. Salir\n", 3)); 
            
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
               case 3: break;
               case 4: 
                   elemento = lista.elimininarInicio();
                   JOptionPane.showMessageDialog(null, "Se eliminio el elemento " + elemento, "Eliminar elemento al inicio ", 1);
                   break;
               case 5: break;
               case 6: break;
               case 7:
                   try{
                     elemento = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el elemento a buscar: ", "Buscar elemento", 3));
                     lista.buscarEnLista(elemento);  
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
                   lista.mostrarLista();
                   break;
               case 9: 
                   JOptionPane.showMessageDialog(null, "Programa Finalizado");
                   break;
               default:
                   JOptionPane.showMessageDialog(null, "Opcion Incorrecta");
                   break;
               }
            }catch(Exception e){
                JOptionPane.showInputDialog(null, "Error: " + e.getMessage(), "Error de opcion",JOptionPane.ERROR_MESSAGE);
            }          
        }while(opcion!=9);
    }
}
