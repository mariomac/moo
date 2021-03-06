package poo.facturas;

public class Pedido {
    private String nombre;
    private int cantidad;

    public Pedido(String nombre, int cantidad) {
        this.nombre = nombre;
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public String toString() {
        return cantidad + " x " + nombre;
    }
    
}
