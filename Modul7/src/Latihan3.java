/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author A416JPO
 */
public class Latihan3 {
    public static void main (String[] args){
        String [][] entry = {{"Florence", "735-1234", "Manila"},{"Joyce", "983-3333", "Quezon City"},{"Becca", "456-3322", "Manila"}}; 
        
        int i=0;
        do{
            System.out.println("Name : " +entry[i][0]);
            System.out.println("Tel.#\t: " +entry[i][1]);
            System.out.println("Address\t: " +entry[i][2]);
            i++;
        }while(i<3);
    }
}
