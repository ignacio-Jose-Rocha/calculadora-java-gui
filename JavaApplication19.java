package javaapplication19;
import java.util.*;
import java.util.Scanner;


public class JavaApplication19 {

    public static void main(String[] args) {
        int cp=0,ci=0,i,j;
    int n[][]=new int[3][2];
    
    Scanner teclado=new Scanner (System.in);
    System.out.print("numero (0,0):");
    n[0][0]=teclado.nextInt();
    System.out.print("Numero (0,1): ");
    n[0][1]=teclado.nextInt();
    System.out.print("Numero (1,0): ");
    n[1][0]=teclado.nextInt();
    System.out.print("Numero (0,1): ");
    n[1][1]=teclado.nextInt();
    System.out.print("Numero (1,1): ");
    n[2][0]=teclado.nextInt();
    System.out.print("Numero (2,1): ");
    n[2][1]=teclado.nextInt();
    
    for(i=0;i<=2;i++){
      for(j=0;j<=1;j++){
        if(n[i][j]%2==0)
            cp+=1;
        else
            ci+=1;
      }
    }
    
    System.out.println("");
    System.out.println("Cant. pares: "+cp);
    System.out.println("cant. impares: "+ci);
    
    }
    
}
