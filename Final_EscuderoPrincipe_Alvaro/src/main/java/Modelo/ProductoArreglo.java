
package Modelo;

public class ProductoArreglo {
    private Producto[] productos;
    private int indice;

    public ProductoArreglo(int tamano) {
        this.productos = new Producto[tamano];
        this.indice = 0;
    }
    public void agregar(Producto producto){
        this.productos[this.indice] = producto;
        this.indice++;
    }
}
