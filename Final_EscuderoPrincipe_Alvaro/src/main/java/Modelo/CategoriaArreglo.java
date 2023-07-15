
package Modelo;

public class CategoriaArreglo {
    private Categoria[] categorias;
    private int indice;

    public CategoriaArreglo(int tamano) {
        this.categorias = new Categoria[tamano];
        this.indice = 0;
    }
    public void agregar(Categoria categoria){
        this.categorias[this.indice] = categoria;
        this.indice++;
    }
}
