/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan291222;

/**
 *
 * @author A416JPO
 */
public class Aritmatika {
    public static void main(String[] args){
    StudentRecord angka1 = new StudentRecord();
    
    int[] hasil = angka1.getNilai(4);
    for(int i=0; i<hasil.length; i++){
        System.out.print(hasil[i]);
    }
    }
}
