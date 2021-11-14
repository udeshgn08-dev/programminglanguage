/************************************
* The printf and format methods 
* Compilation: javac Ex1Format.java
* Execution: java Ex1Format
* Output: 
* The value of int type: 25
* The value of float type: 2.500000
* The value of double type: 5.600000
* The value of string type: Your name
*************************************/ 
public class Ex1Format { 

    public static void main(String[] args) { 
      int aValue = 25; 
      float bValue = 2.5F; 
      double cValue = 5.6; 
      String sequence = "Your name"; 
      char initial = 'G'; 
      System.out.printf("%nThe value of int type: 10%d%n", aValue);
      System.out.format("The value of float type: 5%f%n", bValue);
      System.out.format("The value of double type: %f%n", cValue);
      System.out.printf("The value of char type: %s%n", initial); 
      System.out.printf("The value of string type: %s%n%n", sequence); 
      
      }
  } 
