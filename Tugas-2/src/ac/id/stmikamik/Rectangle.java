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
public class Rectangle extends Shape {

    private String nama;
    private double panjang;
    private double lebar;

    public Rectangle(String nama, double panjang, double lebar) {
        this.nama = nama;
        this.panjang = panjang;
        this.lebar = lebar;
    }

    @Override
    public String getName() {
        return nama;
    }

    @Override
    public double getArea() {
        return panjang * lebar;
    }
}
