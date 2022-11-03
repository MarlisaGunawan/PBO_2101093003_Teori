
import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author A416JPO
 */
public class Latihan1 {
    public static void main( String[] args ){
    BufferedReader dataIn = new BufferedReader (
                new InputStreamReader(System.in));
    
        String days[] = {"Monday", "Tuesday", "Wednesday", "Thusday","Friday","Saturday"};
        
        for( int i=0; i<days.length; i++){
            System.out.println(days[i]);
    
    }   }
}
