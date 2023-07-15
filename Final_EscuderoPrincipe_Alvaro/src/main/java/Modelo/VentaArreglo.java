
package Modelo;

public class VentaArreglo {
    private Venta[] ventas;
    private int indice;
    
    public VentaArreglo(int tamano) {
        this.ventas = new Venta[tamano];
        this.indice = 0;
    }
    public void agregar(Venta venta){
        this.ventas[this.indice] = venta;
        this.indice++;
    }
    
}
