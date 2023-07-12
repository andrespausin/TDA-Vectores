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
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        VectorR2 vector1 = new VectorR2(8, 9);
        VectorR2 vector2 = new VectorR2(-9, 8);
        VectorR2 vector3 = new VectorR2(-4, -3);
        VectorR2 vector4 = new VectorR2(16, 12);
        VectorR2 vector5 = new VectorR2();
        Punto punto = new Punto(7, -12);
        double escalar = 7;

        System.out.println("---- TDA Vectores en el plano y en el espacio ----");
        System.out.println("");
        System.out.println("--- Operaciones con Vectores en el plano ---\n");
        System.out.println("v1 = " + vector1.toString());
        System.out.println("Su modulo es |v1| = " + vector1.moduloVector());
        System.out.println("Es nulo: " + vector1.esNulo());
        System.out.println("En forma canonica v1 = " + vector1.formaCanonica());
        System.out.println("");

        System.out.println("v2 = " + vector2.toString());
        System.out.println("Su modulo es |v2| = " + vector2.moduloVector());
        System.out.println("Es nulo: " + vector2.esNulo());
        System.out.println("En forma canonica v2 = " + vector2.formaCanonica());
        System.out.println("");

        System.out.println("v3 = " + vector3.toString());
        System.out.println("Su modulo es |v3| = " + vector3.moduloVector());
        System.out.println("Es nulo: " + vector3.esNulo());
        System.out.println("En forma canonica v3 = " + vector3.formaCanonica());
        System.out.println("");

        System.out.println("v4 = " + vector4.toString());
        System.out.println("Su modulo es |v4| = " + vector4.moduloVector());
        System.out.println("Es nulo: " + vector4.esNulo());
        System.out.println("En forma canonica v4 = " + vector4.formaCanonica());
        System.out.println("");

        System.out.println("v5 = " + vector5.toString());
        System.out.println("Su modulo es |v5| = " + vector5.moduloVector());
        System.out.println("Es nulo: " + vector5.esNulo());
        System.out.println("En forma canonica v5 = " + vector5.formaCanonica());
        System.out.println("");

        System.out.println("--- Suma de vectores ---\n");
        System.out.println("v1 + v2 = " + vector1.toString() + " + " + vector2.toString() + " = " + vector1.suma(vector2).toString());
        System.out.println("v3 + v4 = " + vector3.toString() + " + " + vector4.toString() + " = " + vector3.suma(vector4).toString());
        System.out.println("v5 + v2 = " + vector5.toString() + " + " + vector2.toString() + " = " + vector5.suma(vector2).toString());
        System.out.println("v1 + v3 = " + vector1.toString() + " + " + vector3.toString() + " = " + vector1.suma(vector3).toString());
        System.out.println("v4 + v2 = " + vector4.toString() + " + " + vector2.toString() + " = " + vector4.suma(vector2).toString());
        System.out.println("v1 + v5 = " + vector1.toString() + " + " + vector5.toString() + " = " + vector1.suma(vector5).toString());
        System.out.println("");

        System.out.println("--- Resta de vectores ---\n");
        System.out.println("v2 - v1 = " + vector2.toString() + " - " + vector1.toString() + " = " + vector1.resta(vector2).toString());
        System.out.println("v3 - v4 = " + vector3.toString() + " - " + vector4.toString() + " = " + vector4.resta(vector3).toString());
        System.out.println("v5 - v2 = " + vector5.toString() + " - " + vector2.toString() + " = " + vector2.resta(vector5).toString());
        System.out.println("v1 - v3 = " + vector1.toString() + " - " + vector3.toString() + " = " + vector3.resta(vector1).toString());
        System.out.println("v4 - v2 = " + vector4.toString() + " - " + vector2.toString() + " = " + vector2.resta(vector4).toString());
        System.out.println("v1 - v5 = " + vector1.toString() + " - " + vector5.toString() + " = " + vector5.resta(vector1).toString());
        System.out.println("");

        System.out.println("--- Producto escalar entre dos vectores ---\n");
        System.out.println("v1 * v2 = " + vector1.toString() + " * " + vector2.toString() + " = " + vector1.productoEscalar(vector2));
        System.out.println("v3 * v4 = " + vector3.toString() + " * " + vector4.toString() + " = " + vector3.productoEscalar(vector4));
        System.out.println("v5 * v2 = " + vector5.toString() + " * " + vector2.toString() + " = " + vector5.productoEscalar(vector2));
        System.out.println("v1 * v3 = " + vector1.toString() + " * " + vector3.toString() + " = " + vector1.productoEscalar(vector3));
        System.out.println("v4 * v2 = " + vector4.toString() + " * " + vector2.toString() + " = " + vector4.productoEscalar(vector2));
        System.out.println("v2 * v3 = " + vector2.toString() + " * " + vector3.toString() + " = " + vector2.productoEscalar(vector3));
        System.out.println("");

        System.out.println("--- Producto vectorial entre dos vectores ---\n");
        System.out.println("v1 x v2 = " + vector1.toString() + " x " + vector2.toString() + " = " + vector1.productoVectorial(vector2).toString());
        System.out.println("v3 x v4 = " + vector3.toString() + " x " + vector4.toString() + " = " + vector3.productoVectorial(vector4).toString());
        System.out.println("v5 x v2 = " + vector5.toString() + " x " + vector2.toString() + " = " + vector5.productoVectorial(vector2).toString());
        System.out.println("v1 x v3 = " + vector1.toString() + " x " + vector3.toString() + " = " + vector1.productoVectorial(vector3).toString());
        System.out.println("v4 x v2 = " + vector4.toString() + " x " + vector2.toString() + " = " + vector4.productoVectorial(vector2).toString());
        System.out.println("v2 x v3 = " + vector2.toString() + " x " + vector3.toString() + " = " + vector2.productoVectorial(vector3).toString());
        System.out.println("");

        System.out.println("--- Producto de un vector por un escalar ---\n");
        System.out.println("k = " + escalar);
        System.out.print("k * v1 = " + escalar + " * " + vector1.toString() + " = ");
        vector1.productoPorEscalar(escalar);
        System.out.println(vector1.toString());
        System.out.print("k * v2 = " + escalar + " * " + vector2.toString() + " = ");
        vector2.productoPorEscalar(escalar);
        System.out.println(vector2.toString());
        System.out.print("k * v3 = " + escalar + " * " + vector3.toString() + " = ");
        vector3.productoPorEscalar(escalar);
        System.out.println(vector3.toString());
        System.out.print("k * v4 = " + escalar + " * " + vector4.toString() + " = ");
        vector4.productoPorEscalar(escalar);
        System.out.println(vector4.toString());
        System.out.print("k * v5 = " + escalar + " * " + vector5.toString() + " = ");
        vector5.productoPorEscalar(escalar);
        System.out.println(vector5.toString());
        System.out.println("");

        System.out.println("--- Paralelismo entre vectores ---\n");
        System.out.println("v1 || v2 = " + vector1.toString() + " || " + vector2.toString() + " = " + vector1.esParalelo(vector2));
        System.out.println("v3 || v4 = " + vector3.toString() + " || " + vector4.toString() + " = " + vector3.esParalelo(vector4));
        System.out.println("v5 || v2 = " + vector5.toString() + " || " + vector2.toString() + " = " + vector5.esParalelo(vector2));
        System.out.println("v1 || v3 = " + vector1.toString() + " || " + vector3.toString() + " = " + vector1.esParalelo(vector3));
        System.out.println("v4 || v2 = " + vector4.toString() + " || " + vector2.toString() + " = " + vector4.esParalelo(vector2));
        System.out.println("v2 || v3 = " + vector2.toString() + " || " + vector3.toString() + " = " + vector2.esParalelo(vector3));
        System.out.println("\nCambiaron los valores en módulo de los vectores gracias al producto escalar, \npor ser un método modificador, es decir, de ahora en adelante se verán"
                + "\nafectado sus módulos. Es importante destacar que no afecta a los métodos de \nperpendicularidad y paralelismo. Pues, poseen la misma dirección.");
        System.out.println("");

        System.out.println("--- Perpendicularidad entre vectores ---\n");
        System.out.println("v1 ⊥ v2 = " + vector1.toString() + " ⊥ " + vector2.toString() + " = " + vector1.esPerpendicular(vector2));
        System.out.println("v3 ⊥ v4 = " + vector3.toString() + " ⊥ " + vector4.toString() + " = " + vector3.esPerpendicular(vector4));
        System.out.println("v5 ⊥ v2 = " + vector5.toString() + " ⊥ " + vector2.toString() + " = " + vector5.esPerpendicular(vector2));
        System.out.println("v1 ⊥ v3 = " + vector1.toString() + " ⊥ " + vector3.toString() + " = " + vector1.esPerpendicular(vector3));
        System.out.println("v4 ⊥ v2 = " + vector4.toString() + " ⊥ " + vector2.toString() + " = " + vector4.esPerpendicular(vector2));
        System.out.println("v2 ⊥ v3 = " + vector2.toString() + " ⊥ " + vector3.toString() + " = " + vector2.esPerpendicular(vector3));
        System.out.println("");

        System.out.println("Se modificará el valor de v5 a través del método setPunto al punto (7,-12)");
        System.out.println("v5 = " + vector5.toString());
        vector5.setPunto(punto);
        System.out.println("v5 = " + vector5.toString());
        System.out.println("");

        System.out.println("--- Expresado en coordenadas polares ---\n");
        System.out.print("v1 = " + vector1.toString() + " = ");
        vector1.coordPolar();
        System.out.println(vector1.toString());
        System.out.print("v2 = " + vector2.toString() + " = ");
        vector2.coordPolar();
        System.out.println(vector2.toString());
        System.out.print("v3 = " + vector3.toString() + " = ");
        vector3.coordPolar();
        System.out.println(vector3.toString());
        System.out.print("v4 = " + vector4.toString() + " = ");
        vector4.coordPolar();
        System.out.println(vector4.toString());
        System.out.print("v5 = " + vector5.toString() + " = ");
        vector5.coordPolar();
        System.out.println(vector5.toString());
        System.out.println("");

        VectorR3 vector6 = new VectorR3(3, 4, 5);
        VectorR3 vector7 = new VectorR3(4, -3, -5);
        VectorR3 vector8 = new VectorR3(-16, 12, 20);
        VectorR3 vector9 = new VectorR3(-5, 35, -25);
        VectorR3 vector10 = new VectorR3();
        escalar = 3;

        System.out.println("--- Operaciones con Vectores en el espacio ---\n");
        System.out.println("v6 = " + vector6.toString());
        System.out.println("Su modulo es |v6| = " + vector6.moduloVector());
        System.out.println("Es nulo: " + vector6.esNulo());
        System.out.println("En forma canonica v6 = " + vector6.formaCanonica());
        System.out.println("");

        System.out.println("v7 = " + vector7.toString());
        System.out.println("Su modulo es |v7| = " + vector7.moduloVector());
        System.out.println("Es nulo: " + vector7.esNulo());
        System.out.println("En forma canonica v7 = " + vector7.formaCanonica());
        System.out.println("");

        System.out.println("v8 = " + vector8.toString());
        System.out.println("Su modulo es |v8| = " + vector8.moduloVector());
        System.out.println("Es nulo: " + vector8.esNulo());
        System.out.println("En forma canonica v8 = " + vector8.formaCanonica());
        System.out.println("");

        System.out.println("v9 = " + vector9.toString());
        System.out.println("Su modulo es |v9| = " + vector9.moduloVector());
        System.out.println("Es nulo: " + vector9.esNulo());
        System.out.println("En forma canonica v9 = " + vector9.formaCanonica());
        System.out.println("");

        System.out.println("v10 = " + vector10.toString());
        System.out.println("Su modulo es |v10| = " + vector10.moduloVector());
        System.out.println("Es nulo: " + vector10.esNulo());
        System.out.println("En forma canonica v10 = " + vector10.formaCanonica());
        System.out.println("");

        System.out.println("--- Suma de vectores ---\n");
        System.out.println("v6 + v7 = " + vector6.toString() + " + " + vector7.toString() + " = " + vector6.suma(vector7).toString());
        System.out.println("v8 + v9 = " + vector8.toString() + " + " + vector9.toString() + " = " + vector8.suma(vector9).toString());
        System.out.println("v10 + v7 = " + vector10.toString() + " + " + vector7.toString() + " = " + vector10.suma(vector7).toString());
        System.out.println("v6 + v8 = " + vector6.toString() + " + " + vector8.toString() + " = " + vector6.suma(vector8).toString());
        System.out.println("v9 + v7 = " + vector9.toString() + " + " + vector7.toString() + " = " + vector9.suma(vector7).toString());
        System.out.println("v10 + v6 = " + vector10.toString() + " + " + vector6.toString() + " = " + vector10.suma(vector6).toString());
        System.out.println("");

        System.out.println("--- Resta de vectores ---\n");
        System.out.println("v7 - v6 = " + vector7.toString() + " - " + vector6.toString() + " = " + vector6.resta(vector7).toString());
        System.out.println("v8 - v9 = " + vector8.toString() + " - " + vector9.toString() + " = " + vector9.resta(vector8).toString());
        System.out.println("v10 - v7 = " + vector10.toString() + " - " + vector7.toString() + " = " + vector7.resta(vector10).toString());
        System.out.println("v6 - v8 = " + vector6.toString() + " - " + vector8.toString() + " = " + vector8.resta(vector6).toString());
        System.out.println("v9 - v7 = " + vector9.toString() + " - " + vector7.toString() + " = " + vector7.resta(vector9).toString());
        System.out.println("v7 - v8 = " + vector7.toString() + " - " + vector8.toString() + " = " + vector8.resta(vector7).toString());
        System.out.println("");

        System.out.println("--- Producto escalar entre dos vectores ---\n");
        System.out.println("v6 * v7 = " + vector6.toString() + " * " + vector7.toString() + " = " + vector6.productoEscalar(vector7));
        System.out.println("v8 * v9 = " + vector8.toString() + " * " + vector9.toString() + " = " + vector8.productoEscalar(vector9));
        System.out.println("v10 * v7 = " + vector10.toString() + " * " + vector7.toString() + " = " + vector10.productoEscalar(vector7));
        System.out.println("v6 * v8 = " + vector6.toString() + " * " + vector8.toString() + " = " + vector6.productoEscalar(vector8));
        System.out.println("v9 * v7 = " + vector9.toString() + " * " + vector7.toString() + " = " + vector9.productoEscalar(vector7));
        System.out.println("v7 * v8 = " + vector7.toString() + " * " + vector8.toString() + " = " + vector7.productoEscalar(vector8));
        System.out.println("");

        System.out.println("--- Producto vectorial entre dos vectores ---\n");
        System.out.println("v6 x v7 = " + vector6.toString() + " x " + vector7.toString() + " = " + vector6.productoVectorial(vector7));
        System.out.println("v8 x v9 = " + vector8.toString() + " x " + vector9.toString() + " = " + vector8.productoVectorial(vector9));
        System.out.println("v10 x v7 = " + vector10.toString() + " x " + vector7.toString() + " = " + vector10.productoVectorial(vector7));
        System.out.println("v6 x v8 = " + vector6.toString() + " x " + vector8.toString() + " = " + vector6.productoVectorial(vector8));
        System.out.println("v9 x v7 = " + vector9.toString() + " x " + vector7.toString() + " = " + vector9.productoVectorial(vector7));
        System.out.println("v7 x v8 = " + vector7.toString() + " x " + vector8.toString() + " = " + vector7.productoVectorial(vector8));
        System.out.println("");

        System.out.println("--- Producto de un vector por un escalar ---\n");
        System.out.println("k = " + escalar);
        System.out.print("k * v6 = " + escalar + " * " + vector6.toString() + " = ");
        vector6.productoPorEscalar(escalar);
        System.out.println(vector6.toString());
        System.out.print("k * v7 = " + escalar + " * " + vector7.toString() + " = ");
        vector7.productoPorEscalar(escalar);
        System.out.println(vector7.toString());
        System.out.print("k * v8 = " + escalar + " * " + vector8.toString() + " = ");
        vector8.productoPorEscalar(escalar);
        System.out.println(vector8.toString());
        System.out.print("k * v9 = " + escalar + " * " + vector9.toString() + " = ");
        vector9.productoPorEscalar(escalar);
        System.out.println(vector9.toString());
        System.out.print("k * v10 = " + escalar + " * " + vector10.toString() + " = ");
        vector10.productoPorEscalar(escalar);
        System.out.println(vector10.toString());
        System.out.println("");
        System.out.println("Cambiaron los valores en módulo de los vectores gracias al producto escalar, \npor ser un método modificador, es decir, de ahora en adelante se verán"
                + "\nafectado sus módulos. Es importante destacar que no afecta a los métodos de \nperpendicularidad y paralelismo. Pues, poseen la misma dirección.");
        System.out.println("");
        
        System.out.println("--- Paralelismo entre vectores ---\n");
        System.out.println("v6 || v7 = " + vector6.toString() + " || " + vector7.toString() + " = " + vector6.esParalelo(vector7));
        System.out.println("v8 || v9 = " + vector8.toString() + " || " + vector9.toString() + " = " + vector8.esParalelo(vector9));
        System.out.println("v10 || v7 = " + vector10.toString() + " || " + vector7.toString() + " = " + vector10.esParalelo(vector7));
        System.out.println("v6 || v8 = " + vector6.toString() + " || " + vector8.toString() + " = " + vector6.esParalelo(vector8));
        System.out.println("v9 || v7 = " + vector9.toString() + " || " + vector7.toString() + " = " + vector9.esParalelo(vector7));
        System.out.println("v7 || v8 = " + vector7.toString() + " || " + vector8.toString() + " = " + vector7.esParalelo(vector8));
        System.out.println("");

        System.out.println("--- Perpendicularidad entre vectores ---\n");
        System.out.println("v6 ⊥ v7 = " + vector6.toString() + " ⊥ " + vector7.toString() + " = " + vector6.esPerpendicular(vector7));
        System.out.println("v8 ⊥ v9 = " + vector8.toString() + " ⊥ " + vector9.toString() + " = " + vector8.esPerpendicular(vector9));
        System.out.println("v9 ⊥ v6 = " + vector9.toString() + " ⊥ " + vector6.toString() + " = " + vector9.esPerpendicular(vector6));
        System.out.println("v6 ⊥ v8 = " + vector6.toString() + " ⊥ " + vector8.toString() + " = " + vector6.esPerpendicular(vector8));
        System.out.println("v9 ⊥ v7 = " + vector9.toString() + " ⊥ " + vector7.toString() + " = " + vector9.esPerpendicular(vector7));
        System.out.println("v7 ⊥ v8 = " + vector7.toString() + " ⊥ " + vector8.toString() + " = " + vector7.esPerpendicular(vector8));
        System.out.println("");
    }

}
