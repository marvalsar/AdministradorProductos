
package administradorproductos;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Main {
    
    public static void main(String[] args) {
        ArrayList<Producto> productos = new ArrayList<>();
        
        byte opcion=0;
        do{
            opcion=Byte.parseByte(JOptionPane.showInputDialog(
            "MENU PRINCIPAL\n"
           +"1. Crear producto\n"
           +"2. Imprimir productos\n"
           +"3. Salir\n"
           +"Seleccione una opción"
            ));
            
            switch(opcion){
                case 1:
                    String nombre=JOptionPane.showInputDialog("Ingrese el nombre del producto");
                    if(nombre == null)break;//Si el usuario cancela la entrada
                    
                    String precioStr=JOptionPane.showInputDialog("Ingrese el precio del producto");
                    if(precioStr == null)break;
                    double precio = Double.parseDouble(precioStr);
                    
                    String cantidadStr=JOptionPane.showInputDialog("Ingrese la cantidad del producto");
                    if(cantidadStr == null)break;
                    int cantidad = Integer.parseInt(cantidadStr);
                    
                    String descripcion=JOptionPane.showInputDialog("Ingrese la descripción del producto");
                    if(descripcion == null)break;
                    
                    Producto producto = new Producto(nombre, precio, cantidad, descripcion);
                    productos.add(producto);
                    JOptionPane.showMessageDialog(null, "Producto creado exitosamente");
                    break;
                case 2:
                    if (productos.isEmpty()){
                        JOptionPane.showMessageDialog(null,"No hay productos para mostrar");
                    }else{
                        for(int i=0;i<productos.size();i++){
                            JOptionPane.showMessageDialog(null,"\nProducto " + (i+1)+":");
                            productos.get(i).imprimirdatos();
                        }
                    }
                    
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Saliendo del programa");
                    opcion=3;
                    return;
                default:
                    JOptionPane.showMessageDialog(null, "Opción Inválida");
            }
        }while (opcion !=3);
                   
    }
    
}
