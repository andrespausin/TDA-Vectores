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
public class VectorR2 {

    protected Punto punto;

    // Primer constructor en R2
    public VectorR2() {
        punto = new Punto();
    }

    // Segundo constructor en R2
    public VectorR2(double x, double y) {
        punto = new Punto(x, y);
    }

    // Metodo que obtiene el atributo punto de la clase VectorR2
    public Punto getPunto() {
        return punto;
    }

    // Metodo que perimite modificar el atributo punto
    public void setPunto(Punto punto) {
        this.punto = punto;
    }

    //Metodo sobreescrito que permite llevar a string el objeto punto
    @Override
    public String toString() {
        String result;
        result = "(" + punto.getX() + ", " + punto.getY() + ")";
        return result;
    }

    // Metodo que determina el modulo de un vector
    public double moduloVector() {
        double modulo;
        modulo = Math.pow(punto.getX(), 2) + Math.pow(punto.getY(), 2);
        modulo = Math.sqrt(modulo);
        return modulo;
    }

    // Metodo que efectua la suma de dos vectores
    public VectorR2 suma(VectorR2 v2) {
        
        VectorR2 v3 = new VectorR2();
        double x1 = punto.getX();
        double y1 = punto.getY();
        double x2 = v2.getPunto().getX();
        double y2 = v2.getPunto().getY();
        v3.punto.setX(x1 + x2);
        v3.punto.setY(y1 + y2);
        return v3;
    }

    // Metodo que efectua la resta de dos vectores
    public VectorR2 resta(VectorR2 v2) {
        VectorR2 v3 = new VectorR2();
        double x1 = punto.getX();
        double y1 = punto.getY();
        double x2 = v2.getPunto().getX();
        double y2 = v2.getPunto().getY();
        v3.punto.setX(x2 - x1);
        v3.punto.setY(y2 - y1);
        return v3;
    }

    //Metodo que efectua el producto de un vector por un escalar
    public void productoPorEscalar(double k) {
        double x1 = punto.getX();
        double y1 = punto.getY();
        punto.setX(x1*k);
        punto.setY(y1*k);
    }

    // Metodo que efectua el producto escalar entre dos vectores
    public double productoEscalar(VectorR2 v2) {
        double result;
        double x1 = punto.getX();
        double y1 = punto.getY();
        double x2 = v2.getPunto().getX();
        double y2 = v2.getPunto().getY();
        result = (x1 * x2) + (y1 * y2);
        return result;
    }

    // Metodo que efectua el producto vectorial entre dos vectores
    public VectorR3 productoVectorial(VectorR2 v2) {
        VectorR3 v3 = new VectorR3();
        double x1 = punto.getX();
        double y1 = punto.getY();
        double z1 = punto.getZ();
        double x2 = v2.punto.getX();
        double y2 = v2.punto.getY();
        double z2 = v2.punto.getZ();
        v3.punto.setX(y1 * z2 - z1 * y2);
        v3.punto.setY(z1 * x2 - x1 * z2);
        v3.punto.setZ(x1 * y2 - y1 * x2);
        return v3;
    }

    // Metodo que determina si un vector es nulo
    public boolean esNulo() {
        boolean nulo = false;
        if (punto.getX() == 0 && punto.getY() == 0) {
            nulo = true;
            return nulo;
        } else {
            return nulo;
        }
    }

    // Metodo que expresa un vector en su forma canonica
    public String formaCanonica() {
        String result;
        result = "(" + punto.getX() + ")i " + "+ (" + punto.getY() + ")j ";
        return result;
    }

    // Metodo que determina si dos vectores son perpendiculares entre si
    public boolean esPerpendicular(VectorR2 v2) {
        boolean perpend = false;
        VectorR2 v3 = new VectorR2(punto.getX(), punto.getY());
        double x1= punto.getX();
        double y1 = punto.getY();
        double x2 = v2.getPunto().getX();
        double y2 = v2.getPunto().getY();
        
        if ((x1==0 && y1==0)||(x2==0 && y2==0)){
            return perpend;
        }else if(v2.productoEscalar(v3)==0){
            perpend = true;
            return perpend;
        }else return perpend;
    }

    // Metodo que determina si dos vectores son paralelos entre si
    public boolean esParalelo(VectorR2 v2) {
        boolean paral = false;
        VectorR2 v3 = new VectorR2(punto.getX(), punto.getY());
        double mod1 = v3.moduloVector();
        double mod2 = v2.moduloVector();
        double x1 = punto.getX() / mod1;
        double y1 = punto.getY() / mod1;
        double x2 = v2.getPunto().getX() / mod2;
        double y2 = v2.getPunto().getY() / mod2;

        if ((x1 == x2 && y1 == y2) || (x1 == -x2 && y1 == -y2)) {
            paral = true;
            return paral;
        } else {
            return paral;
        }
    }
    
    public void coordPolar(){
        VectorR2 v3 = new VectorR2();
        double modulo;
        double x1 = punto.getX();
        double y1 = punto.getY();
        v3.setPunto(punto);
        modulo = v3.moduloVector();
        punto.setX(modulo);
        if (x1 == 0){
            if (y1 == 0){
                punto.setY(0);
            }else if (y1 > 0){
                punto.setY(90);
            } else{
                punto.setY(270);
            }
        }else if(x1 < 0){
            if (y1 > 0){
                punto.setY(180 - Math.toDegrees(Math.abs(Math.atan(y1/x1))));
            }else{
                punto.setY(180 + Math.toDegrees(Math.abs(Math.atan(y1/x1))));
            }    
        }else if(x1 > 0){
            if (y1 > 0){
                punto.setY(Math.toDegrees(Math.abs(Math.atan(y1/x1))));
            }else{
               punto.setY(360 - Math.toDegrees(Math.abs(Math.atan(y1/x1)))); 
            }
        }
        
        
    }

}
