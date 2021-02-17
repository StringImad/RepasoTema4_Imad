/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer20Extenso;

import javax.swing.JOptionPane;

/**
 *
 * @author MSI
 */
public class Prueba {

    public static void main(String[] args) {

        Avion primer1 = new Avion("boing", 12, 3, "Iberia", 4, "MGR", "malaga", 10);
        
        primer1.reservarAsiento(76, 2);
        Avion.mostrarAviones();
        
        
        
        boolean repetir = true;
        do {

            JOptionPane.showMessageDialog(null, "Aerolinea IMAD \n"
                    + "Elige la opcion que desea");
            String[] botones = {"Ver asientos", "Reservar asiento", "Cancelar asiento", "Salir"};
            int ventana = JOptionPane.showOptionDialog(null,
                    "Pulsa un boton:",
                    " ",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.QUESTION_MESSAGE, null,
                    botones, botones[0]);
            switch (ventana) {
                case 0:
                    primer1.imprimirAsiento();
                    break;

                case 1:
                    primer1.reservarAsiento();
                    break;

                case 2:
                    primer1.cancelarAsiento();
                    break;

                case 3:
                    repetir = false;
                    break;

            }
        } while (repetir);
    }

}
