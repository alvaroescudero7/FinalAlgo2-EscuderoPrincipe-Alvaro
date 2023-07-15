
package PaqueteMain;

import Controlador.ControladorIngreso;
import Modelo.PersonaArreglo;
import Vista.frmIngreso;

public class APP {
    public static void main(String[] args) {
        frmIngreso fIngreso = new frmIngreso();
        PersonaArreglo arreglo = new PersonaArreglo(10);
        ControladorIngreso controlIngreso = new ControladorIngreso(arreglo,fIngreso);
        controlIngreso.iniciar();
    }
}
