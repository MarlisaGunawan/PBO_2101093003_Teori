/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author A416JPO
 */
public class Student extends StudentRecord{
    public Student(){
        super();
       // System.out.println("Inside Student:Constructor");
    }
    @Override
    public String getName(){ 
    System.out.println("Nama : Marlisa");
    return name; 
    }
    
    public String getAddress(){ 
    System.out.println("Address: Padang");
    return address; 
    }
    
    public double getMathGrade(){ 
    System.out.println("Math: 80");
    return mathGrade; 
    }
    
    public double getEnglishGrade(){ 
    System.out.println("English: 85");
    return englishGrade; 
    }
    
    public double getScienceGrade(){ 
    System.out.println("Science: 90");
    return scienceGrade; 
    }
    public double getAverage(){ 
        average =mathGrade+englishGrade+scienceGrade;
        System.out.println("Rata-Rata : "+average);
    return average; 
    }
    
    public static void main( String[] args ){ 
    Student student = new Student();
        System.out.println(student.getName());
        System.out.println(student.getAddress());
        System.out.println(student.getMathGrade());
        System.out.println(student.getEnglishGrade());
        System.out.println(student.getScienceGrade());
        System.out.println(student.getAverage());
    }
}


