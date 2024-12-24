package com.creatio.crm.language.basics;

public class Array {
	
public static void main(String[] args) {
		
		String [] kids = new String [2];
		kids[0] = "Maahir";
		kids[1] = "Hamdan";
		
     String [] [] firstcousins = new String [3] [2] ;
		
        firstcousins[0][0] = "Fazeela";
        firstcousins[0][1] = "Zubair";
        firstcousins[1][0] = "Ashfaq";
        firstcousins[1][1] = "Fazil";
        firstcousins[2][0] = "Mukeen";
        firstcousins[2][1] = "Haffin";
        
        System.out.println("My 3rd first cousin is: "+firstcousins[1][0]);
        System.out.println("My 5th first cousin is: "+firstcousins[2][0]);
        
     String [] [] [] secondcousins = new String [5] [3] [2] ;      
 
         secondcousins[0][1][1] = "Jaasir";
         secondcousins[0][2][0] = "Jaabir";
         secondcousins[1][0][1] = "Ansar";
         secondcousins[1][1][1] = "Shanuba";
         secondcousins[1][2][0] = "Ramla";
         secondcousins[2][0][1] = "Yunus";
         secondcousins[3][1][0]= "Ilyas";
         secondcousins[4][0][1] = "Jahiz";
         secondcousins[4][2][0] = "Imaad";
         
         System.out.println("One of my second cousins is: "+secondcousins[1][1][1]);
}}