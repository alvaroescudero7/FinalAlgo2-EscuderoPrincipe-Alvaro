
package Modelo;

import java.util.Date;
import javax.swing.JOptionPane;

public class Trabajador extends Persona{
    private String email;
    private String password;

    public Trabajador(String password, String email, String nombre, String paterno, String materno, Date nacimiento, String numDocumento) {
        super(nombre, paterno, materno, nacimiento, numDocumento);
        this.email = email;
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }
    public boolean ingresar(String email, String password){
        if (this.email.equals(email) && this.password.equals(password)) {
            JOptionPane.showMessageDialog(null,"Ingreso exitoso. Bienvenido, " + email + "!");
            return true;
        } else {
            JOptionPane.showMessageDialog(null,"Credenciales incorrectas. Ingreso fallido.");
            return false;
        }
    }
    public void salir(){
        System.exit(0);
    }
    public boolean crearVenta(Cliente c){
        return true;
    }
}
