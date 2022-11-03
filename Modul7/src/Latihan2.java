
import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.*;
/**
 *
 * @author A416JPO
 */
public class Latihan2 {
    public static void main( String[] args ){
    BufferedReader dataIn = new BufferedReader (
                new InputStreamReader(System.in));
    
        int max =-999;
        int data[]= new int [10];
        try{
            for( int i=0; i<data.length; i++){
                System.out.print("Masukan Nilai ke "+(i+1)+" : ");
                data[i]=Integer.parseInt(dataIn.readLine());
            }
        }catch(Exception e){
            System.out.println("Error!");
        }
        //int n=data[0];
            for(int i=0; i<data.length; i++){
                if(data[i]>max){
                    max=data[i];
                }
            }
            System.out.println("Nilai Terbesar :" +max);
        
    }
}
