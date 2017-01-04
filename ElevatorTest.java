package com.mohan.elevator;

import static org.hamcrest.core.Is.*;
import static org.hamcrest.core.IsEqual.*;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class ElevatorTest {
	
	@Test
	public void testTwoPersons() {
		int[] weights = {100,10,10};
		int[] floors = {1,2,2};
		int totalFloors = 2;
		int maxweight = 100;
		int maxpersion = 3;
		
		Elevator elevator = new Elevator();
		
		int stops = elevator.getStops(weights,floors, totalFloors, maxweight,maxpersion);
		
		//Assert.assertThat(stops, is(equalTo(2)));
		
		//Arrays.deepToString(Arrays.copyOfRange(weights, 0, 0));
		//Arrays.deepToString(Arrays.copyOfRange(weights, 0, 1));
		//Arrays.deepToString(Arrays.copyOfRange(weights, 0, 2));
		
	}

}
