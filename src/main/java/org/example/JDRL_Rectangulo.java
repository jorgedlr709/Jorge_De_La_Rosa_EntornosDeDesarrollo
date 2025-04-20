package org.example;

public class JDRL_Rectangulo {
    private int id;
    private double ladoA;
    private double ladoB;
    private String color;

    public JDRL_Rectangulo() {
    }

    public JDRL_Rectangulo(int id, double ladoA, double ladoB, String color) {
        this.id = id;
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.color = color;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getLadoA() {
        return ladoA;
    }

    public void setLadoA(double ladoA) {
        this.ladoA = ladoA;
    }

    public double getLadoB() {
        return ladoB;
    }

    public void setLadoB(double ladoB) {
        this.ladoB = ladoB;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "JDRL_Rectangulo{" +
                "id=" + id +
                ", ladoA=" + ladoA +
                ", ladoB=" + ladoB +
                ", color='" + color + '\'' +
                '}';
    }

    /**
     *
     * @param ladoA
     * @param ladoB
     * @return
     */
    private static double getAreaRectangulo(double ladoA, double ladoB) {
        double areaRectangulo = ladoA * ladoB;
        return areaRectangulo;
    }
}
