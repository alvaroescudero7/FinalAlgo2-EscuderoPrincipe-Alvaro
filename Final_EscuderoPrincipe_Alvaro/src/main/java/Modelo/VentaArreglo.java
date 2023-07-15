
package Modelo;

public class VentaArreglo {
    private Venta[] ventas;
    private int indice;
    
    public VentaArreglo(int tamano) {
        this.ventas = new Venta[tamano];
        this.indice = 0;
    }
    public boolean registrarVenta(Venta ventas){
        
    }
    public void agregar(Venta ventas){
        this.ventas[this.indice] = ventas;
        this.indice++;
    }
    
}
