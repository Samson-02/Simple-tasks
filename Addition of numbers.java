package com.company;

Import java.util.Scanner;

public class Main {
  
  public static void main(String[] args) {
    System.out.println("Enter the number of elements in the array:- ");
    Scanner n=new Scanner(System.in);
    int size=n.nextInt();
    int arr[]=new int[size];
    int sum=0;
    System.out.println("Enter the numbers :- ");
    for(int i=0;i<size;i++){
      arr[i]=n.nextInt();
    }
    
    for(int i=0;i<arr.length;i++){
     sum=sum+arr[i];
    }
    System.out.println("Sum of the numbers entered = "+sum);
  }
}
    
    
