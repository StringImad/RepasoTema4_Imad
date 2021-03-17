/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clase;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import static javax.swing.UIManager.put;

/**
 *
 * @author MSI
 */
public class alumnoMap {

    private Map< String, ArrayList> alumnoAsignatura;

    public alumnoMap() {
        alumnoAsignatura = new HashMap<>();

    }

    public void rellenoMap(Alumnado alumno) {
        for (int i = 0; i < 10; i++) {
            Random rd = new Random();
            int aleatorio = rd.nextInt();
            String aleatoriofinal = aleatorio + "";

            alumnoAsignatura.put(aleatoriofinal, alumno.getAsignaturas());

        }

    }

}
