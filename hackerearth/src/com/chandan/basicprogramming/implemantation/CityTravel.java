package com.chandan.basicprogramming.implemantation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 
 * @author chandankumarjena
 * find out the number of days to cover the distance between A and B
 * with some exception.
 * 
 *
 */
public class CityTravel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		String line1 = bufferedReader.readLine();
		String []strs = line1.trim().split("\\s+");
		long totalDistance = Long.parseLong(strs[0]);
		long maximumDistanceCoveredPerDay = Long.parseLong(strs[1]);
		long numberOfException = Long.parseLong(strs[2]);
		long dayCount = 0;
		while (numberOfException --  > 0) {
			String line2 = bufferedReader.readLine();
			String []strs1 = line2.trim().split("\\s+");
			long startDay = Long.parseLong(strs1[0]);
			long distanceCovered = Long.parseLong(strs1[1]);
			for(long i = dayCount; i <= startDay; i++) {
				if (dayCount == startDay) {
					totalDistance -= distanceCovered;
				} else {
					totalDistance = totalDistance - maximumDistanceCoveredPerDay;
				}
			}
			dayCount = startDay;
		}
		while(totalDistance > 0) {
			totalDistance = totalDistance - maximumDistanceCoveredPerDay;
			dayCount++;
		}
		System.out.print(dayCount);
	}
	

}



