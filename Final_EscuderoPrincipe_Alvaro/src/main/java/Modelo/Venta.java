
package Modelo;

import java.util.Date;
import javax.swing.JOptionPane;

public class Venta {
    private float total;
    private Date fecha;
    private boolean estado;
    private Cliente cliente;
    private Trabajador trabajador;

    public Venta(float total, Date fecha, boolean estado, Cliente cliente, Trabajador trabajador) {
        this.total = total;
        this.fecha = fecha;
        this.estado = estado;
        this.cliente = cliente;
        this.trabajador = trabajador;
    }

    public float getTotal() {
        return total;
    }

    public Date getFecha() {
        return fecha;
    }

    public boolean isEstado() {
        return estado;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Trabajador getTrabajador() {
        return trabajador;
    }
    
    public void agregarProducto(Producto p){
        p.add(p);
        JOptionPane.showMessageDialog(null,"Producto agregado a la venta: " + p.getNombre());
    }
    public boolean eliminarProducto(Producto p, int cantidad){
        if (p.remove(p)) {
            JOptionPane.showMessageDialog(null,"Producto eliminado de la venta: " + p.getNombre());
        } else {
            JOptionPane.showMessageDialog(null,"El producto no se encuentra en la venta.");
        }
    }
    public float validarCarrito(){
        
    }
}
