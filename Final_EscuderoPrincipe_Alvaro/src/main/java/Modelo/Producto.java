
package Modelo;

import javax.swing.JOptionPane;

public class Producto {
    private float precio; 
    private String nombre;
    private int stock;
    private String marca;
    private Categoria categoria;

    public Producto(float precio, String nombre, int stock, String marca, Categoria categoria) {
        this.precio = precio;
        this.nombre = nombre;
        this.stock = stock;
        this.marca = marca;
        this.categoria = categoria;
    }

    public float getPrecio() {
        return precio;
    }

    public String getNombre() {
        return nombre;
    }

    public int getStock() {
        return stock;
    }

    public String getMarca() {
        return marca;
    }

    public Categoria getCategoria() {
        return categoria;
    }
    public void vender(int cantidad){
        if (stock >= cantidad){
            stock-=cantidad;
            JOptionPane.showMessageDialog(null,"Venta realizada. Stock actual: "+stock);
        }
        else{
            JOptionPane.showMessageDialog(null,"No hat stock disponible para vender");
        }
    }
    public void reponer(int cantidad){
        stock += cantidad;
        JOptionPane.showMessageDialog(null,"Stock repuesto. Stock actual: "+stock);
    }

    void add(Producto p) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    boolean remove(Producto p) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
