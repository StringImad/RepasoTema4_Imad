/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer12;

/**
 *
 * @author MSI
 */
public class CuentaCorriente extends Cuenta {
    private final double interes;
    private double saldoMin;

    public CuentaCorriente(double interes, double saldoMin, String numeroCuenta, double saldo, Persona persona) {
        super(numeroCuenta, saldo, persona);
        this.interes = 1.5;
        this.saldoMin = 100;
    }

    public double getInteres() {
        return interes;
    }

//    public void setInteres(double interes) {
//        this.interes = interes;
//    }

    public double getSaldoMin() {
        return saldoMin;
    }

    public void setSaldoMin(double saldoMin) {
        this.saldoMin = saldoMin;
    }

    @Override
    public String toString() {
        return "CuentaCorriente{" + "interes=" + interes + ", saldoMin=" + saldoMin + '}';
    }

    @Override
    public void actualizarSaldo(double a) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void retirar(double b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
