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
        // funkcja do zadania 4 w Tablicach
//        zadanie4Tablice();
//        zadanie6Lancuchy();
        zadanie6Lancuchy2();
    }
    
    public static void zadanie4Tablice()
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
    
    public static void zadanie6Lancuchy()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Wprowadź tekst: ");
        String tekst = sc.nextLine();
        
        String nowyTekst = new StringBuffer(tekst).reverse().toString();
        
        System.out.println(tekst + nowyTekst);
    }
    
    public static void zadanie6Lancuchy2()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Wprowadź tekst: ");
        String tekst = sc.nextLine();
        
        for (int i = tekst.length(); i > 0; i--)
        {
            tekst+=tekst.charAt(i-1);
        }
        
        System.out.println(tekst);
    }
    
}
