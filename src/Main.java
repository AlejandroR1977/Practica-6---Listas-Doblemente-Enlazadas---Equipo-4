
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        
        int opcion=0;
        int elemento;
        Lista lista = new Lista();
        
        do{
           opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "1. Insertar un elemento al inicio\n" + "2. Insertar un elemento al final\n" + 
                   "3. Insertar un elemento en medio\n" + "1. Eliminar un elemento al inicio\n" + "2. Eliminar un elemento al final\n"+ 
                   "3. Eliminar un elemento en medio\n" + "7. Buscar un elemento\n" + "8. Mostrar los datos en la lista\n" + "9. Salir\n", 3)); 
            
           switch(opcion){
               case 1: //Insertar un elemento al inicio 
                   elemento = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el elemento;", "Insertado al inicio", 3));
                   lista.insertarInicio(elemento);
                   break;
               case 2: break;
               case 3: break;
               case 4: break;
               case 5: break;
               case 6: break;
               case 7: break;
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
                    
        }while(opcion!=9);
    }
}
