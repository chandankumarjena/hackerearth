package com.chandan.basicprogramming.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class TimeCalCulator {
	int startHour;
	int startMinute;
	int endHour;
	int endMinute;
	public TimeCalCulator(int SH, int SM, int EH, int EM) {
		// TODO Auto-generated constructor stub
		startHour = SH;
		startMinute = SM;
		endHour = EH;
		endMinute = EM;
	}
	void getDuration() {
		int minute = 0, hour = 0;
		if(endMinute < startMinute) {
			minute = (endMinute+60) - startMinute;
			endHour = endHour - 1;
		} else {
			minute = endMinute - startMinute;
		}
		hour = endHour - startHour;
		System.out.println(hour + " " + minute);
	}
	
}
public class Duration {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(bufferedReader.readLine());
		while(T-- > 0) {
			String line = bufferedReader.readLine(); 
	        String[] strs = line.trim().split("\\s+");
	        
	        int SH = Integer.parseInt(strs[0]);
	        int SM = Integer.parseInt(strs[1]);
	        int EH = Integer.parseInt(strs[2]);
	        int EM = Integer.parseInt(strs[3]);
	        TimeCalCulator timeCalCulator = new TimeCalCulator(SH, SM, EH, EM);
	        timeCalCulator.getDuration();
		}
	}

}
