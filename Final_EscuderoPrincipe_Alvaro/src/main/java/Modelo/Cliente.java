
package Modelo;

import java.util.Date;
import javax.swing.JOptionPane;

public class Cliente extends Persona {
    private int celular;
    private float dinero;

    public Cliente(int celular, float dinero, String nombre, String paterno, String materno, Date nacimiento, String numDocumento) {
        super(nombre, paterno, materno, nacimiento, numDocumento);
        this.celular = celular;
        this.dinero = dinero;
    }

    public int getCelular() {
        return celular;
    }

    public float getDinero() {
        return dinero;
    }
    public void pagar(float cantidad){
        if (dinero >= cantidad) {
            dinero -= cantidad;
            JOptionPane.showMessageDialog(null,"Pago realizado. Dinero restante: "+dinero);
        } else {
            JOptionPane.showMessageDialog(null,"No tienes suficiente dinero.");
        }
    }
    public void recargarDinero(float cantidad){
        dinero += cantidad;
        JOptionPane.showMessageDialog(null,"Recarga realizada. Dinero actual: " + dinero);
    }
}
