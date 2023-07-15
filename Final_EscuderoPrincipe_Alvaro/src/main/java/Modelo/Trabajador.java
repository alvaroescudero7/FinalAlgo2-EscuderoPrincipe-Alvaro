
package Modelo;

import java.util.Date;

public class Trabajador extends Persona{
    private String numero;
    private String email;

    public Trabajador(String numero, String email, String nombre, String paterno, String materno, Date nacimiento, String numDocumento) {
        super(nombre, paterno, materno, nacimiento, numDocumento);
        this.numero = numero;
        this.email = email;
    }

    public String getNumero() {
        return numero;
    }

    public String getEmail() {
        return email;
    }
    
}
