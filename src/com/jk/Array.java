package com.jk;
import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[][] = new int[2][3];
		Scanner sc = new Scanner(System.in);
		
		for (int i=0; i < 2; i++) {
			for (int j=0; j<3; j++) {
				System.out.println("Enter value for " + i + " " + j + ":");
				arr[i][j] = sc.nextInt();
			}
		}
		
		for (int i=0; i<2; i++) {
			for (int j=0; j<3; j++) {
				System.out.print(arr[i][j] + "  ");
			}
			System.out.println();
		}

	}

}
