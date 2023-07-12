/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vectores;

/**
 *
 * @author Familia Pausin
 */
public class VectorR3 extends VectorR2 {

    // Primer constructor en R3
    public VectorR3(double x, double y, double z) {
        punto = new Punto(x, y, z);
    }

    //Segundo constructor en R3
    public VectorR3() {
        punto = new Punto();
    }

    //Metodo sobreescrito que permite llevar a string el objeto punto
    @Override
    public String toString() {
        String result;
        result = "(" + punto.getX() + ", " + punto.getY() + ", " + punto.getZ()
                + ")";
        return result;
    }

    //Metodo que calcula el modulo del vector
    @Override
    public double moduloVector() {
        double modulo;
        modulo = Math.pow(punto.getX(), 2) + Math.pow(punto.getY(), 2) + Math.pow(punto.getZ(), 2);
        modulo = Math.sqrt(modulo);
        return modulo;
    }

    // Metodo que efectua la suma de dos vectores
    public VectorR3 suma(VectorR3 v2) {
        VectorR3 v3 = new VectorR3();
        double x1 = punto.getX();
        double y1 = punto.getY();
        double z1 = punto.getZ();
        double x2 = v2.getPunto().getX();
        double y2 = v2.getPunto().getY();
        double z2 = v2.getPunto().getZ();
        v3.punto.setX(x1 + x2);
        v3.punto.setY(y1 + y2);
        v3.punto.setZ(z1 + z2);
        return v3;
    }

    //Metodo que efectua la resta de dos vectores
    public VectorR3 resta(VectorR3 v2) {
        VectorR3 v3 = new VectorR3();
        double x1 = punto.getX();
        double y1 = punto.getY();
        double z1 = punto.getZ();
        double x2 = v2.getPunto().getX();
        double y2 = v2.getPunto().getY();
        double z2 = v2.getPunto().getZ();
        v3.punto.setX(x2 - x1);
        v3.punto.setY(y2 - y1);
        v3.punto.setZ(z2 - z1);
        return v3;
    }

    // Metodo que efectua el producto de un vcetor por un escalar
    @Override
    public void productoPorEscalar(double k) {
        
        double x1 = punto.getX();
        double y1 = punto.getY();
        double z1 = punto.getZ();
        punto.setX(x1 * k);
        punto.setY(y1 * k);
        punto.setZ(z1 * k);
        
    }

    // Metodo que efcetua el producto escalar de dos vectores
    public double productoEscalar(VectorR3 v2) {
        double result;
        double x1 = punto.getX();
        double y1 = punto.getY();
        double z1 = punto.getZ();
        double x2 = v2.getPunto().getX();
        double y2 = v2.getPunto().getY();
        double z2 = v2.getPunto().getZ();
        result = (x1 * x2) + (y1 * y2) + (z1 * z2);
        return result;
    }

    // Metodo que efectua el producto vectorial de dos vectores
    public VectorR3 productoVectorial(VectorR3 v2) {
        VectorR3 v3 = new VectorR3();
        double x1 = punto.getX();
        double y1 = punto.getY();
        double z1 = punto.getZ();
        double x2 = v2.getPunto().getX();
        double y2 = v2.getPunto().getY();
        double z2 = v2.getPunto().getZ();
        v3.punto.setX(y1 * z2 - z1 * y2);
        v3.punto.setY(z1 * x2 - x1 * z2);
        v3.punto.setZ(x1 * y2 - y1 * x2);
        return v3;
    }

    // Metodo que determina si un vector es nulo
    @Override
    public boolean esNulo() {
        boolean nulo = false;
        if (punto.getX() == 0 && punto.getY() == 0 && punto.getZ() == 0) {
            nulo = true;
            return nulo;
        } else {
            return nulo;
        }
    }

    //Metodo que expresa un vvcetor de forma canonica
    @Override
    public String formaCanonica() {
        String result;
        result = "(" + punto.getX() + ")i " + "+ (" + punto.getY() + ")j +" + "("
                + punto.getZ() + ")k";
        return result;
    }

    //Metodo que analiza si dos vectores son perpendiculares entre si
    public boolean esPerpendicular(VectorR3 v2) {
        boolean perpend = false;
        VectorR3 v3 = new VectorR3(punto.getX(), punto.getY(), punto.getZ());
        if (v3.productoEscalar(v2) == 0) {
            perpend = true;
            return perpend;
        } else {
            return perpend;
        }
    }

    // Metodo que analiza si dos vectores son paralelos entre si
    public boolean esParalelo(VectorR3 v2) {
        boolean paral = false;
        VectorR3 v3 = new VectorR3(punto.getX(), punto.getY(), punto.getZ());
        double mod1 = v3.moduloVector();
        double mod2 = v2.moduloVector();
        double x1 = punto.getX() / mod1;
        double y1 = punto.getY() / mod1;
        double z1 = punto.getZ() / mod1;
        double x2 = v2.getPunto().getX() / mod2;
        double y2 = v2.getPunto().getY() / mod2;
        double z2 = v2.getPunto().getZ() / mod2;
        if ((x1 == x2 && y1 == y2 && z1 == z2) || (x1 == -x2 && y1 == -y2 && z1 == z2)) {
            paral = true;
            return paral;
        } else {
            return paral;
        }
    }

}
