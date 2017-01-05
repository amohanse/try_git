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
	
}
