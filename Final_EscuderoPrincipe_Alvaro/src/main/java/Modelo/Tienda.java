
package Modelo;

public class Tienda {
    private String nombre;
    private String ruc;
    private String direccion;
    private Categoria[] categorias;
    private Producto[] productos; 
    private Persona[] personas;

    public Tienda(int tc, int tpr, int tpe) {
        this.nombre = nombre;
        this.ruc = ruc;
        this.direccion = direccion;
        this.categorias = new Categoria[tc];
        this.productos = new Producto[tpr];
        this.personas = new Persona[tpe];
        
        
    }

    public String getNombre() {
        return nombre;
    }

    public String getRuc() {
        return ruc;
    }

    public String getDireccion() {
        return direccion;
    }

    public Categoria[] getCategorias() {
        return categorias;
    }

    public Producto[] getProductos() {
        return productos;
    }

    public Persona[] getPersonas() {
        return personas;
    }
    
}
