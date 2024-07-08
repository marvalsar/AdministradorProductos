
package administradorproductos;

import javax.swing.JOptionPane;

public class Producto {
    //Atributos privados
    private String nombre;
    private double precio;
    private int cantidad;
    private String descripcion;
    
    //Constructor sin parámetros

    public Producto() {
    }
    
    //Constructor con parámetros

    public Producto(String nombre, double precio, int cantidad, String descripcion) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
        this.descripcion = descripcion;
    }
    
    //Getters y Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripción(String descripcion) {
        this.descripcion = descripcion;
    }
    
    //Método para imprimir los datos del Producto
    public void imprimirdatos(){    
        String datos = "Nombre: " + nombre + "\n" +
                       "Precio: " + precio + "\n" +
                       "Cantidad: " + cantidad + "\n" +
                       "Descripción: " + descripcion;
        JOptionPane.showMessageDialog(null,datos, "Datos del producto",JOptionPane.INFORMATION_MESSAGE);
    }
}
