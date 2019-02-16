/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.id.soal3;
import java.util.Scanner;
/**
 *
 * @author ALIF
 */
public class Soal1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("koordinat x lingkaran 1: ");
        float n1 = input.nextFloat();
        System.out.println("koordinat y lingkaran 1: ");
        float m1 = input.nextFloat();
        System.out.println("input jari-jari lingkaran 1: ");
        float o1 = input.nextFloat();
        
        System.out.println("koordinat x lingkaran 2: ");
        float n2 = input.nextFloat();
        System.out.println("koordinat y lingkaran 2: ");
        float m2 = input.nextFloat();
        System.out.println("input jari-jari lingkaran 2: ");
        float o2 = input.nextFloat();
        
        float jarak = (float) Math.sqrt(Math.pow((n2-n1), 2) +Math.pow((m2-m1), 2));
        
        if(jarak >= (o1+o2)){
            System.out.println("C1 dan C2 saling lepas");
        }else if(jarak < (o1+o2)){
            if(o1 < o2){
                if(((n1+o1) < (n2+o2)) || ((n1-o1) > (n2-o2))){
                    if(((m1+o1) < (m2+o2)) || ((m1-o1) > (m2-o2))){
                        System.out.println("C1 berada di dalam C2");
                    }else{
                        System.out.println("C1 dan C2 saling beririsan");
                    }
                }else{
                    if(((n1+o1) > (n2+o2)) || ((n1-o1) < (n2-o2))){
                    if(((m1+o1) > (m2+o2)) || ((m1-o1) < (m2-o2))){
                        System.out.println("C2 berada di dalam C1");
                    }else{
                        System.out.println("C1 dan C2 saling beririsan");      
                       }
                    }
                }
            } 
        }
    }
}