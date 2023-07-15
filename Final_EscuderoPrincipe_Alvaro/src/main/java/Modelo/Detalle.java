
package Modelo;

public class Detalle {
    private int cantidad;
    private float precio;
    private float descuento;
    private float total;
    private Producto producto;

    public Detalle(int cantidad, float precio, float descuento, float total, Producto producto) {
        this.cantidad = cantidad;
        this.precio = precio;
        this.descuento = descuento;
        this.total = total;
        this.producto = producto;
    }
    
}
