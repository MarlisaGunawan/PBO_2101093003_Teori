/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lisa_modul6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author A416JPO
 */
public class Latihan8 {
    public static void main(String[] args){
        BufferedReader dataIn = new BufferedReader (
                new InputStreamReader(System.in));
        
        int angkabasis=0;
        int pangkat=0;
        int i;
        String hasil="";
        
        try{
            System.out.print("Masukan Angka Basis : ");
            angkabasis =Integer.parseInt(dataIn.readLine());
            System.out.print("Masukan Angka Pangkat : ");
            pangkat =Integer.parseInt(dataIn.readLine());
                    
            }catch(IOException e){
            System.out.println("Error!");
            }
        //int pangkatt = Integer.valueOf(pangkat).intValue();
        //int angka = Integer.valueOf(angkabasis).intValue();
        
        int n=1;
        int k=1;
        while(n<=pangkat){
            n++;
            k=k*angkabasis;
        }
        hasil=angkabasis +"^"+pangkat+"="+k;
        System.out.println(hasil);
    }
}
