/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer12;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 *
 * @author MSI
 */
public abstract class Cuenta {
    private String numeroCuenta;
    private double saldo;
    private Persona persona;

    public Cuenta(String numeroCuenta, double saldo, Persona persona) {

//        Random aleatorio = new Random();
//        int aleatorioEntero = aleatorio.nextInt(90000 - 80000 + 1) + 80000;
//        int aleatorioEntero2 = aleatorio.nextInt(70000 - 60000 + 1) + 60000;
//        int aleatorioEntero3 = aleatorio.nextInt(60000 - 40000 + 1) + 40000;
//        int aleatorioEntero4 = aleatorio.nextInt(50000 - 10000 + 1) + 10000;
//
//        String a1 = String.valueOf(aleatorioEntero);
//        String a2 = String.valueOf(aleatorioEntero2);
//        String a3 = String.valueOf(aleatorioEntero3);
//        String a4 = String.valueOf(aleatorioEntero4);
//
//        String bank = a1 + a2 + a3 + a4;
//        Set<String> generados = new HashSet<>();
////        for (int i = 1; i <= 20; i++) {
//        String aleatorio5 = "";
//        boolean generado = false;
//        while (!generado) {
//            //int posible = aleatorio.nextInt();
//            if (!generados.contains(bank)) {
//                generados.add(bank);
//                aleatorio5 = bank;
//                generado = true;
//            }
//        }
        //usa el valor de aleatorio...

        this.numeroCuenta = numeroCuenta;
        this.saldo = 0;
        this.persona = persona;
    }
    
    

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }
    
    
    public abstract void actualizarSaldo(double a);
    
    public abstract void retirar(double b);
    
    

}

