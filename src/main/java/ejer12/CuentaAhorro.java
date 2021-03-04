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
public class CuentaAhorro extends Cuenta{
    private double interes;
    private double comisionAnual;

    public CuentaAhorro(double interes, double comisionAnual, String numeroCuenta, double saldo, Persona persona) {
        super(numeroCuenta, saldo, persona);
        this.interes = interes;
        this.comisionAnual = comisionAnual;
    }

   

    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

    public double getComisionAnual() {
        return comisionAnual;
    }

    public void setComisionAnual(double comisionAnual) {
        this.comisionAnual = comisionAnual;
    }

    @Override
    public void actualizarSaldo(double a) {
        
    }

    @Override
    public void retirar(double b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return "CuentaAhorro{" + "interes=" + interes + ", comisionAnual=" + comisionAnual + '}';
    }
    
    
    
}
