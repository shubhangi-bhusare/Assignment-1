package com.test;

import java.util.*;

public class Parcel

{

   public static void main(String args[])

   {

       Scanner sc = new Scanner(System.in);

       int weight, a, b;

       double c, d;

       System.out.println("Enter the weight in grams");

       weight = sc.nextInt();

       if (weight<=1000)

       {

           System.out.println("Charge = Rs.15");

       }

       else

       {

           a = weight - 1000;

           d = (weight - 1000)/500;

           b = a % 500;

           if (b == 0)

           {

               c = 15 + (d*8);

               System.out.println("Charge = "+c);

           }

           else

           {

               c = 15 + (int)d*8;

               System.out.println("Charge = "+c);

           }

       }

   }

}