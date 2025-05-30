package org.example;


public class JDLR_Circulo {
    private int id;

    private double radio;

    private String color;

    public JDLR_Circulo() {
    }

    public JDLR_Circulo(int id, double radio, String color) {
        this.id = id;
        this.radio = radio;
        this.color = color;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "JDLR_Circulo{" +
                "id=" + id +
                ", radio=" + radio +
                ", color='" + color + '\'' +
                '}';
    }

    /**
     *
     * @param radio
     * @return
     */
    private static double getAreaCirculo(double radio) {
        double areaCirculo = Math.PI * radio * radio;
        return areaCirculo;
    }
}
