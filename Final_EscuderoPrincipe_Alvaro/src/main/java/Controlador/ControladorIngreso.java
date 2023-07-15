
package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Modelo.PersonaArreglo;
import Vista.frmIngreso;
import Vista.frmPrincipal;

public class ControladorIngreso {
    PersonaArreglo pa;
    frmIngreso fi;

    public ControladorIngreso (PersonaArreglo pa, frmIngreso fi) {
        this.pa = pa;
        this.fi = fi;
        this.fi.btnSalir.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        this.fi.btnIngreso.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                //Librerias.SerializadoraGen.serializar("Datos", Configuracion.Datos.personas);
                fi.setVisible(false);
                frmPrincipal fPrincipal = new frmPrincipal();
                ControladorPrincipal controlPrincipal = new ControladorPrincipal(pa,fPrincipal);
                controlPrincipal.iniciar();
            }
        
        });   
    }
    
    public void iniciar(){
        this.fi.setLocationRelativeTo(null);
        //limpiarControles();
        this.fi.setVisible(true);
    }
    
    public void limpiarControles(){
        fi.txtPassword.setText("");
        fi.txtCorreo.setText("");
    }
}
