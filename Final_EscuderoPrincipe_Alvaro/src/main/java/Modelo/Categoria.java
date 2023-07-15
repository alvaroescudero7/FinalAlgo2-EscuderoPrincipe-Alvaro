
package Modelo;

public class Categoria {
    private String nombre;
    private boolean disponible;

    public Categoria(String nombre, boolean disponible) {
        this.nombre = nombre;
        this.disponible = disponible;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean isDisponible() {
        return disponible;
    }
    
    public void habilitar() {
        disponible = true;
    }
    
    public void deshabilitar() {
        disponible = false;
    }
    
}
