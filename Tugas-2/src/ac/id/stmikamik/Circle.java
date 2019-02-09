/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.id.stmikamik;

/**
 *
 * @author Tamu
 */
public class Circle extends Shape{
    private String nama;
    private double jari;

    public Circle(String nama, double jari) {
        this.nama = nama;
        this.jari = jari;
    }

    @Override
    public String getName() {
        return nama;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(jari, 2);
    }
    
}
