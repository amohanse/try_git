package com.bby.digi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Elevator {

	public int getStops(int[] weight, int[] floors, int totalFloors, int maxPerson, int maxWeight) {

		int stops = 0;

		if(maxWeight > 0) {

			int sumOfpersonsWeight = 0;
			int countOfPerson = 0;
			List<Integer> weightCapList = new ArrayList<>();

			for (int i = 0; i < weight.length; i++) {

				if ((sumOfpersonsWeight + weight[i] <= maxWeight) && (countOfPerson <= maxPerson)) {
					countOfPerson++;
					sumOfpersonsWeight += weight[i];

				} else {
					weightCapList.add(i - 1);
					sumOfpersonsWeight = weight[i];
					countOfPerson = 1;
				}
			}

			if (weightCapList.get(weightCapList.size() - 1) < weight.length) {
				weightCapList.add(weight.length - 1);
			}

			stops = generateStop(weightCapList, floors);
		}

		return stops;
	}

	private int generateStop(List<Integer> stopIndexes, int[] floors) {
		int numberOfStops = 0;
		int startFloor = 0;
		Set<Object> _tempFloorStops = new HashSet<>();
		for (Integer stopFloor : stopIndexes) {
			_tempFloorStops = Arrays.stream(Arrays.copyOfRange(floors, startFloor,stopFloor+1)).boxed().collect(Collectors.toSet());
			startFloor = stopFloor + 1;
			numberOfStops += _tempFloorStops.size() + 1;
			
		}
		return numberOfStops;
	}

}
