/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daw.Imad;

import java.time.LocalDate;

/**
 *
 * @author imad
 */
public class Animal {

    private LocalDate fecha = LocalDate.now();
    private String nombre;
    private String tipo;
    private double peso;
    private String estado;
    private static int contadorInstancias = 0;

    //constructor por defecto
    //date time formatter
    public Animal() {
        this.fecha = LocalDate.now();
        this.nombre = "turron";
        this.peso = 2200;
        this.tipo = "gato";
        this.estado = "durmiendo";
        contadorInstancias++;
    }

    public Animal(LocalDate fecha, String nombre, String tipo, double peso, String estado) {
        this.fecha = fecha;
        this.nombre = nombre;
        this.tipo = tipo;
        this.peso = peso;
        this.estado = estado;
        contadorInstancias++;
    }

    public void comer(double cantidadGramos) {

        int cantidadGramosAbs = (int) Math.abs(cantidadGramos);

        this.peso += cantidadGramosAbs;

        this.estado = "comiendo";

    }

    public void dormir() {
        this.estado = "dormido";
    }

    public void despertar() {
        this.estado = "despierto";
    }

    public void descansar() {
        this.estado = "reposo";
    }

    public void jugar(int cantidadMinutos) {

        int cantidadMinutosAbs = Math.abs(cantidadMinutos);
        if (cantidadMinutosAbs > 180) {
            throw new IllegalArgumentException("La cantidad de minutos no  debe de ser superior a 180");

        }
        if (cantidadMinutosAbs < 30) {
            this.peso -= 10;
        }

        this.peso -= ((cantidadMinutosAbs / 30) * -20);

        this.estado = "jugando";

    }
    //Cuando es un objeto por referencia SIEMPRE
    public static Animal copiar(Animal pet) {
        if(pet==null){
           throw new NullPointerException("No debe de haber valores nulos");
        }else{
            Animal pet2 = new Animal(pet.fecha, pet.estado, pet.nombre, pet.peso,pet.tipo);
        return pet2;
        }
        
        
    }

    //getteer contador 
    public static int getContadorInstancias() {
        return contadorInstancias;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public double getPeso() {
        return peso;
    }

    public String getEstado() {
        return estado;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public static void setContadorInstancias(int contadorInstancias) {
        Animal.contadorInstancias = contadorInstancias;
    }

    @Override
    public String toString() {
        return "Animal{" + "fecha=" + fecha + ", nombre=" + nombre + ", tipo=" + tipo + ", peso=" + peso + ", estado=" + estado + '}';
    }

}

//        if (cantidadMinutos >= 180 || cantidadMinutos < 0) {
// throw new IllegalArgumentException("La cantidad de minutos no  debe de ser superior a 180");	
//	}
//	int reduccionPeso = Math.max(20 * cantidadMinutos / 30, 10);
//	
//	this.peso = Math.max(0, this.peso - reduccionPeso);
//        //Si la cantidad de minutos es negativa se considera positiva.
//        Math.abs(cantidadMinutos);
//        //Si la cantidad es menor de 30 minutos, se reducirá en 10 gramos.
// Por cada 30 minutos completos de juego, el peso del animal se verá reducido en 20 gr
//        else if (cantidadMinutos >= 30 && cantidadMinutos < 60) {
//            this.peso = -20;
//        } else if (cantidadMinutos >= 60 && cantidadMinutos < 90) {
//            this.peso = -40;
//        } else if (cantidadMinutos >= 90 && cantidadMinutos < 120) {
//            this.peso = -60;
//        } else if (cantidadMinutos >= 120 && cantidadMinutos < 150) {
//            this.peso = -80;
//        } else if (cantidadMinutos >= 150 && cantidadMinutos < 180) {
//            this.peso = -100;
//        } else if (cantidadMinutos >= 180) {
//            throw new IllegalArgumentException("La cantidad de minutos no de debe de ser superior a 180");
//        }
//        int calculoCantidadminutos = 0;
//        calculoCantidadminutos = (cantidadMinutos / 30) * (-20);
//        this.peso = this.peso + calculoCantidadminutos;
//
//        if (cantidadMinutos < 30) {
//            this.peso = -10;
//        } else if (cantidadMinutos >= 180) {
//            throw new IllegalArgumentException("La cantidad de minutos no de debe de ser superior a 180");
//        }
//        switch (calculoSwitch) {
//            case 1:
//                this.peso -= 10;
//            case 2:
//                this.peso = -20;
//
//            case 3:
//                this.peso = -40;
//
//            case 4:
//                this.peso = -60;
//
//            case 5:
//                this.peso = -80;
//            case 6:
//                this.peso = -100;
//            case 7:
//                throw new IllegalArgumentException("La cantidad de minutos no de debe de ser superior a 180");
//        }
