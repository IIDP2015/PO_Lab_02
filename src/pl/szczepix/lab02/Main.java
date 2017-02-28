/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.szczepix.lab02;

import java.util.Scanner;

public class Main 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Wprowadź ilośc liczb: ");
        int N = sc.nextInt();
        int  [] tab = new int[N];
        double S, suma=0;
        
        for (int i = 0; i < tab.length; i++)
        {
            tab[i] = (int)(101*Math.random()+0);
            
        }
        
        for (int i = 0; i < tab.length; i++)
        {
            suma+=Math.pow((tab[i]-Srednia(tab)), 2);
        }
        
        S = Math.sqrt((1.0/N)*suma);
        System.out.println("Result: " + S);
    }
    
    public static float Srednia(int [] tab)
    {
        float result = 0;
        for (int i = 0; i < tab.length; i++)
        {
            result+=tab[i];
        }
        return result /= tab.length;
    }
    
}
