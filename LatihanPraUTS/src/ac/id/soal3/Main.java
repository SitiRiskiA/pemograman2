/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.id.soal3;

/**
 *
 * @author ALIF
 */
public class Main {
    public static void main(String[] args) {
        Employee atasan = new Manajer(9000000, "Ilham", "Jl. Lengkong Besar", 500000000);
        Employee bawahan1 = new Staff("Bayu", "Jl. Meleber", 7800000);
        Employee bawahan2 = new Staff("Kiki", "Jl. In Dulu Aja", 504200000);
        
        System.out.println("Nama Bos: " + atasan.getName());
        System.out.println("Alamat Bos: " + atasan.getAddress());
        System.out.println("Gaji Bos: " + atasan.getSalary());
        
        System.out.println("Nama Bawahan1: " + bawahan1.getName());
        System.out.println("Alamat Bawahan1: " + bawahan1.getAddress());
        System.out.println("Gaji Bawahan1: " + bawahan1.getSalary());
        
        System.out.println("Nama Bawahan2: " + bawahan2.getName());
        System.out.println("Alamat Bawahan2: " + bawahan2.getAddress());
        System.out.println("Gaji Bawahan2: " + bawahan2.getSalary());
        
    }
}
