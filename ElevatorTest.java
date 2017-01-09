package com.bby.digi;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;

import org.junit.Assert;
import org.junit.Test;

public class ElevatorTest {
	
	@Test
	public void testElevatorStops1() {
		
		int[] personWeight = {40,50,100,30,60,70};
		int[] floorStop = {1,2,1,1,3,2};
		
		int numberOfFloors = 3;
		int maxNumberOfPersonsAllowed = 3;
		int maxWeightAllowed = 100;
		
		Elevator elevator = new Elevator();
		
		int numberOfStops = elevator.getStops(personWeight
				,floorStop
				,numberOfFloors
				,maxNumberOfPersonsAllowed
				,maxWeightAllowed);
		
		Assert.assertThat(numberOfStops, is(equalTo(10)));
		
	}
	
	@Test
	public void testElevatorStops2() {
		
		int[] personWeight = {40,50,10,30,60,70};
		int[] floorStop = {1,1,1,1,3,2};
		
		int numberOfFloors = 3;
		int maxNumberOfPersonsAllowed = 3;
		int maxWeightAllowed = 0;
		
		Elevator elevator = new Elevator();
		
		int numberOfStops = elevator.getStops(personWeight
				,floorStop
				,numberOfFloors
				,maxNumberOfPersonsAllowed
				,maxWeightAllowed);
		
		Assert.assertThat(numberOfStops, is(equalTo(0)));
		
	}
	
	@Test
	public void testElevatorStops3() {
		
		int[] personWeight = {50,50,50,30,60,11,11,12};
		int[] floorStop = {1,1,1,1,1,2,1,1};
		
		int numberOfFloors = 2;
		int maxNumberOfPersonsAllowed = 2;
		int maxWeightAllowed = 100;
		
		Elevator elevator = new Elevator();
		
		int numberOfStops = elevator.getStops(personWeight
				,floorStop
				,numberOfFloors
				,maxNumberOfPersonsAllowed
				,maxWeightAllowed);
		
		Assert.assertThat(numberOfStops, is(equalTo(9)));
		
	}
	
	@Test
	public void testElevatorStops4() {
		
		int[] personWeight = {50,100,20,10,50};
		int[] floorStop = {1,2,3,4,5};
		
		int numberOfFloors = 5;
		int maxNumberOfPersonsAllowed = 4;
		int maxWeightAllowed = 100;
		
		Elevator elevator = new Elevator();
		
		int numberOfStops = elevator.getStops(personWeight
				,floorStop
				,numberOfFloors
				,maxNumberOfPersonsAllowed
				,maxWeightAllowed);
		
		Assert.assertThat(numberOfStops, is(equalTo(8)));
		
	}
	
	@Test
	public void testElevatorStops5() {
		
		int[] personWeight = {100,150,80,60,200};
		int[] floorStop = {2,4,6,8,3};
		
		int numberOfFloors = 1;
		int maxNumberOfPersonsAllowed = 2;
		int maxWeightAllowed = 200;
		
		Elevator elevator = new Elevator();
		
		int numberOfStops = elevator.getStops(personWeight
				,floorStop
				,numberOfFloors
				,maxNumberOfPersonsAllowed
				,maxWeightAllowed);
		
		Assert.assertThat(numberOfStops, is(equalTo(9)));
		
	}
	
	@Test
	public void testElevatorStops6() {
		
		int[] personWeight = {40,40,100,80,20};
		int[] floorStop = {3,3,2,2,3};
		
		int numberOfFloors = 3;
		int maxNumberOfPersonsAllowed = 5;
		int maxWeightAllowed = 200;
		
		Elevator elevator = new Elevator();
		
		int numberOfStops = elevator.getStops(personWeight
				,floorStop
				,numberOfFloors
				,maxNumberOfPersonsAllowed
				,maxWeightAllowed);
		
		Assert.assertThat(numberOfStops, is(equalTo(6)));
		
	}
	
}
