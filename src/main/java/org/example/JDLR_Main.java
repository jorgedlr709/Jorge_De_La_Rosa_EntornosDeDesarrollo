package org.example;

public class JDLR_Main {
    public static void main(String[] args) {
        // Instanciamos un rectángulo y un círculo
        JDLR_Circulo circulo1 = new JDLR_Circulo(1,3, "verde");
        JDRL_Rectangulo rectangulo1 = new JDRL_Rectangulo(1,3, 5, "rojo");

        // Calcular área del rectángulo: ladoA * ladoB
        double ladoA = rectangulo1.getLadoA();
        double ladoB = rectangulo1.getLadoB();
        double areaRectangulo = getAreaRectangulo(ladoA, ladoB);
        System.out.println("Área del rectángulo: " + areaRectangulo);

        // Calcular área del círculo: pi * radio^2
        double radio = circulo1.getRadio();
        double areaCirculo = getAreaCirculo(radio);
        System.out.println("Área del círculo: " + areaCirculo);

        // Diferencia entre áreas
        double diferencia = getDiferencia(areaRectangulo, areaCirculo);
        System.out.println("Diferencia de áreas: " + diferencia);

        // Imprimir los objetos
        System.out.println("Rectángulo: " + rectangulo1);
        System.out.println("Círculo: " + circulo1);
    }

    private static double getDiferencia(double areaRectangulo, double areaCirculo) {
        double diferencia = areaRectangulo - areaCirculo;
        return diferencia;
    }

    private static double getAreaCirculo(double radio) {
        double areaCirculo = Math.PI * radio * radio;
        return areaCirculo;
    }

    private static double getAreaRectangulo(double ladoA, double ladoB) {
        double areaRectangulo = ladoA * ladoB;
        return areaRectangulo;
    }
}

