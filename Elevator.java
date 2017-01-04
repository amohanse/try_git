package com.mohan.elevator;

import java.util.Arrays;
import java.util.stream.IntStream;


public class Elevator {

	public int getStops(int[] weight, int[] floors, int totalFloors,
			int maxWeight, int maxPerson) {
		
		int sumOfpersonsWeight = 0;
		int countOfPerson = 0;
		
		int rangeFrom = 0;
		int rangeTo;
		
		for(int i=0;i<weight.length;i++) {
			
			countOfPerson ++;
			sumOfpersonsWeight += weight[i];
			
			if((sumOfpersonsWeight <=maxWeight) && (countOfPerson <=maxPerson)) {
				
				System.out.println("Persion at " +i + " can go in this lift");
				
			} else {
				rangeTo = i-1;
				if(rangeFrom == rangeTo) {
					System.out.println("Single person goes in"+ weight[i]);
				} else {
					printArray(Arrays.copyOfRange(weight, rangeFrom, rangeTo));
				}	
				rangeFrom = i;
				
				System.out.println("Persion at " +i + " can go in next lift");
				sumOfpersonsWeight = 0;
				countOfPerson = 0;
			
			}
		}
		
		return 0;
	}
	
	public void printArray(int[] values) {
		
		System.out.println("Size :"+values.length);
		
		 IntStream.of(values).forEach(
		            element -> System.out.println(element));
	}

}
