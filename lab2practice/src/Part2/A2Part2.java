/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Part2;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author shreyamalapaka
 */
public class A2Part2 {
    public static void main(String[] args) {
        int num;
        
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the array size:");
        
        num = s.nextInt();
        
        int[] array =  new int[num];
        System.out.println("Enter the array numbers:");
        for(int i=0;i<num;i++)
        {
            array[i] = s.nextInt();
        }
         
        System.out.println("Your current entered values are: ");
        for (int i=0; i<num; i++)   
        {  
            System.out.println(array[i]);  
        }  
    
        int l= array.length;
    
        for(int i=0;i<l;i++){
            if(l%2==0){
                array[i]*=2;
            } else {
                array[i] *= 3;
            } 
        }
        
        System.out.println("The new array is: " + Arrays.toString(array));
    }  
}

