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
public class StudentRecord {
    private int nilai;  
    int bil,hasil;
    private int angka;
    
    private static int angka1; 
    
    public int[] getNilai(int nilai){
        int[] hasil = new int [nilai];
        for(int i=0; i<=5; i++){
            bil=0;
            for(int j=1;j<=i;j++){
                if(i%j==0){
                    bil=bil+1;
                }
            }
            if(bil==2){
                System.out.println(i+" ");
            }
        }
        return hasil;
    }
    
    public void setNilai(int nilai){
        this.nilai=nilai;
    }
    
    public int getAngka(){
        return angka;
    }
    
    public void setAngka(int angka){
        this.angka=angka;
    }
}
