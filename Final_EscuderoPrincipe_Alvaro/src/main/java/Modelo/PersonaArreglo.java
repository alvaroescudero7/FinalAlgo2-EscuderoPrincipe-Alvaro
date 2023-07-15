
package Modelo;

public class PersonaArreglo {
    private Persona[] personas;
    private int indice;

    public PersonaArreglo(int tamano) {
        this.personas = new Persona[tamano];
        this.indice = 0;
    }
    public void agregar(Persona persona){
        this.personas[this.indice] = persona;
        this.indice++;
    }
    
}
