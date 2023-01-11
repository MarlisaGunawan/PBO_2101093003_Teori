/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author A416JPO
 */
public class StudentRecord {
    protected String name;
    protected String address;
    protected double mathGrade;
    protected double englishGrade;
    protected double scienceGrade;
    protected double average;
    
    protected static int studentCount;
    
    public StudentRecord(){ 
    System.out.println("Data Student :"); ;
    name = ""; 
    address = ""; 
    mathGrade = 0;
    englishGrade =0;
    scienceGrade =0;
    average=0;
    } 
    
    public StudentRecord( String name, String address, double mathGrade, double englishGrade, double scienceGrade, double average ){ 
    this.name = name; 
    this.address = address; 
    this.mathGrade = mathGrade;
    this.englishGrade = englishGrade;
    this.scienceGrade = scienceGrade;
    this.average = average;
    } 
    
    public String getName(){ 
    return name; 
    } 
    
    public String getAddress(){ 
    return address; 
    } 
    
    public double getMathGrade(){ 
    return mathGrade; 
    }
    
    public double getEnglishGrade(){ 
    return englishGrade; 
    }
    
    public double getScienceGrade(){ 
    return scienceGrade; 
    }
    
    public double getAverage(){
        return average;
    }
    
    public void setName( String name ){ 
    this.name = name; 
    } 
    public void setAddress( String add ){ 
    this.address = add; 
    }
    public void setMathGrade( double math ){ 
    this.mathGrade = math; 
    }
    public void setEnglishGrade( double eng ){ 
    this.englishGrade = eng; 
    }
    public void setScienceGrade( double science ){ 
    this.scienceGrade = science; 
    }
    public void setAverage( double ave ){ 
    this.average = ave; 
    }
}
    
    

