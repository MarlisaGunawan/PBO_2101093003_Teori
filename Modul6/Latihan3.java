
import javax.swing.JOptionPane;

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
    public static void main(String[] args){
        String angka="";
        
         angka =JOptionPane.showInputDialog("Masukan Angka :");
         int z = Integer.valueOf(angka).intValue();
         
         String hasil="";
         if (z>=1 && z<=10){
             hasil += "Valid Number";
         }else{
             hasil += "Invalid Number";
         }
         JOptionPane.showMessageDialog(null, hasil);
    }
}
