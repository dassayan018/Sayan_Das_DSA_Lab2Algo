package com.gl.sayan.payment;
import java.util.*;

public class PayMoneyApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("enter the size of transaction array");
		int size = sc.nextInt();
		int[] transactions = new int[size];
		for (int i=0; i< transactions.length; i++) {
			System.out.println("Enter the daily income");
			transactions[i] = sc.nextInt();
		}
		System.out.println("Given transactions Array "+Arrays.toString(transactions));
		System.out.println("enter the total no of targets that needs to be achieved");
		int numberOfTarget = sc.nextInt();
		for (int i=0;i<numberOfTarget;i++) {
			System.out.println("Enter the target amount");
			int targetAmount = sc.nextInt();
			int flag = 0; //target not achieved
			int sum = 0;
			for (int j=0;j<transactions.length; j++) {
				sum+=transactions[j];
				if(sum>=targetAmount) {
					flag =1;
					System.out.println("Target achieved after " +(j+1)+" transactions");
					break;
				}
//				else {
//					System.out.println("Sorry target not achieved");
//				}
				
			}
			if (flag==0) {
				System.out.println("Given target is not achieved");
			}
		}
	}

}
