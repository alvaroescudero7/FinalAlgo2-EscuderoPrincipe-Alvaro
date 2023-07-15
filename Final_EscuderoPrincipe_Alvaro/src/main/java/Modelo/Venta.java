
package Modelo;

import java.util.Date;

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
    
}
