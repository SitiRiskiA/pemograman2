/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.id;

/**
 *
 * @author ALIF
 */
public class Soal2 {

    public static void main(String[] args) {
        int[] nilai = {23, 24, 9, 5, 20, 22, 43, 33};

        for (int i = 0; i < nilai.length - 1; i++) {
            int minInd = i;
            for (int j = i + 1; j < nilai.length; j++) {
                if (nilai[j] < nilai[minInd]) {
                    minInd = j;
                }
                int temp = nilai[minInd];
                nilai[minInd] = nilai[i];
                nilai[i] = temp;
            }
        }

        for (int i = 7; i > 4; i--) {
            System.out.println(nilai[i]);
        }
    }
}
