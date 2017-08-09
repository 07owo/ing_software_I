package logic;

import java.util.Scanner;

public class Resta_Suma {

	 public static void main(String[] args) {
	        Scanner entrada =new Scanner(System.in);
	        System.out.println("ingrese numero1");
	        int x=entrada.nextInt() ;
	        
	        System.out.println("Ingrese numero2");
	        int y=entrada.nextInt();
	        
	        int resultado= suma(x, y);
	           
	        int resultado1=resta(x,y);      
	        
	        System.out.println("suma=: "+resultado);
	        System.out.println("resta=: "+ resultado1);
	          
	    
	}
	     public static int suma(int x, int y){
	         int suma =x+y;
	         return suma;
	        }
	       public static int resta(int x,int y){
	           int resta=x-y;
	           return resta;
	       }
}
