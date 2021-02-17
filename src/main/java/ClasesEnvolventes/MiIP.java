/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesEnvolventes;

/**
 *
 * @author MSI
 */
public class MiIP {

    private short octeto1;
    private short octeto2;
    private short octeto3;
    private short octeto4;

    public MiIP() {
        this.octeto1 = 0;
        this.octeto2 = 0;
        this.octeto3 = 0;
        this.octeto4 = 0;
    }

    public MiIP(int octeto1, int octeto2, int octeto3, int octeto4) {
        this.octeto1 = pasoLimites(octeto1);
        this.octeto2 = pasoLimites(octeto2);
        this.octeto3 = pasoLimites(octeto3);
        this.octeto4 = pasoLimites(octeto4);
    }

    private static short pasoLimites(int posible) {
        if (posible < 0 || posible > 255) {
            posible = 255;
        }
        return (short) posible;
    }

    public MiIP(String octeto1, String octeto2, String octeto3, String octeto4) {
        this.octeto1 = pasoLimites(octeto1);
        this.octeto2 = pasoLimites(octeto2);
        this.octeto3 = pasoLimites(octeto3);
        this.octeto4 = pasoLimites(octeto4);
    }

    public Short pasoLimites(String posible) {
        Short aux = Short.parseShort(posible);

        if (aux < 0 || aux > 255) {
            aux = 255;
        }
        return (short) aux;
    }

    public String getOctxBinary(short octeto1) {
//        int digito;
//        digito = octeto1 % 2;
//        int exp = 0;
//        double binario = 0;
//        binario = binario + digito * Math.pow(10, exp);
//        String stringValue = "" + binario;
//        return stringValue;
    return String.format("%08d", Integer.parseInt(Integer.toBinaryString((int)this.octeto1)));
        //return String.format("%08d", Integer.parseInt(stringValue));
    }

    public String getOct1Binary(short octeto2) {
         return String.format("%08d", Integer.parseInt(Integer.toBinaryString((int)this.octeto2)));
//        short digito;
//        digito = (short) (octeto2 % 2);
//        int exp = 0;
//        double binario = 0;
//        binario = binario + digito * Math.pow(10, exp);
//        String stringValue = "" + binario;
//        return stringValue;
        // return String.format("%08d", Integer.parseInt(stringValue));
    }

    public String getOct2Binary(short octeto3) {
//        int digito;
//        digito = octeto3 % 2;
//        int exp = 0;
//        double binario = 0;
//        binario = binario + digito * Math.pow(10, exp);
//        String stringValue = "" + binario;
//        return stringValue;
    return String.format("%08d", Integer.parseInt(Integer.toBinaryString((int)this.octeto3)));
//return String.format("%08d", Integer.parseInt(stringValue));
    }

    public String getOct3Binary(short octeto4) {
//        int digito;
//        digito = octeto4 % 2;
//        int exp = 0;
//        double binario = 0;
//        binario = binario + digito * Math.pow(10, exp);
//        String stringValue = "" + binario;
//        return stringValue;
    return String.format("%08d", Integer.parseInt(Integer.toBinaryString((int)this.octeto4)));
// return String.format("%08d", Integer.parseInt(stringValue));
    }

    public short getOcteto1() {
        return octeto1;
    }

    public short getOcteto2() {
        return octeto2;
    }

    public short getOcteto3() {
        return octeto3;
    }

    public short getOcteto4() {
        return octeto4;
    }

    public void setOcteto1(int octeto1) {
        this.octeto1 = pasoLimites(octeto1);
    }

    public void setOcteto1(String octeto1) {
        this.octeto1 = pasoLimites(octeto1);
    }

    public void setOcteto2(int octeto2) {
        this.octeto2 = pasoLimites(octeto2);
    }

    public void setOcteto2(String octeto2) {
        this.octeto2 = pasoLimites(octeto2);
    }

    public void setOcteto3(int octeto3) {
        this.octeto3 = pasoLimites(octeto3);
    }

    public void setOcteto3(String octeto3) {
        this.octeto3 = pasoLimites(octeto3);
    }

    public void setOcteto4(int octeto4) {
        this.octeto4 = pasoLimites(octeto4);
    }

    public void setOcteto4(String octeto4) {
        this.octeto4 = pasoLimites(octeto4);
    }

    @Override
    public String toString() {
        return "MiIP DECIMAL{" + octeto1 + "." + octeto2 + "." + octeto3 + "." + octeto4 + '}';
    }

    public String toStringHex() {
        return "MiIP HEX{" + Integer.toHexString(octeto1) + ":" + Integer.toHexString(octeto2) + ":" + Integer.toHexString(octeto3) + ":" + Integer.toHexString(octeto4) + '}';
        //  return Integer.toHexString((int) this.octeto4 + (int) this.octeto3 * 256 + (int) this.octeto2 * 256 * 256 + (int) this.octeto1 * 256 * 256 * 256);

    }

    public String toStringBinary() {
        return "MiIP BINARIA{" + getOctxBinary(octeto1) + "." + getOct1Binary(octeto2) + "." + getOct2Binary(octeto3) + "." + getOct3Binary(octeto4) + '}';
//     return this.getOctxBinary() + "." + this.getOct1Binary() + "."
//                + this.getOct2Binary() + "." + this.getOct3Binary();
    }

}
