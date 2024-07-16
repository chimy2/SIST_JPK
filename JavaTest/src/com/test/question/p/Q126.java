package com.test.question.p;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map.Entry;

public class Q126 {
//	파일입출력: 근태
	public static void main(String[] args) {
//		요구사항] 직원들의 지각과 조퇴를 카운트하시오.
//			- 출근 : 오전 9시
//			- 퇴근 : 오후 6시
		
//		리소스
//		파일 > 출결.dat
		
//		출력
//		[이름]    [지각]    [조퇴] 
//		홍길동      4회       0회 
//		아무개      0회       0회 
//		하하하      2회       3회 
		
		HashMap<String, Attend> map = new HashMap<>();
		String path = "dat\\출결.dat";
		
		Attend attend;
		HashMap<String, AttandTime> timeMap;
		AttandTime time;
		
		try {
			BufferedReader reader = new BufferedReader(new FileReader(path));
			
			String line = "";
			
			while((line = reader.readLine()) != null) {
				String[] arr = line.split(",");
				
				String date = arr[0];
				String name = arr[1];
				String[] entryTime = arr[2].split(":");
				String[] leaveTime = arr[3].split(":");
				
				if(map.get(name) != null) {
					attend = map.get(name);
					timeMap = attend.getMap();
					time = timeMap.get(date);
					if(time != null) {
						time.compareTime(entryTime, leaveTime); 
					} else {
						timeMap.put(date, new AttandTime(entryTime, leaveTime));
					}
				} else {
					attend = new Attend();
					timeMap = attend.getMap();
					timeMap.put(date, new AttandTime(entryTime, leaveTime));
					map.put(name, attend);
				}
			}
			
			reader.close();
		} catch (Exception e) {
			System.out.println("Q126.main");
			e.printStackTrace();
		}
		System.out.println("[이름]\t\t[지각]\t\t[조퇴]");
		for(Entry<String, Attend> entry : map.entrySet()) {
			attend = entry.getValue();
			for(Entry<String, AttandTime> timeEntry : attend.getMap().entrySet()) {
				time = timeEntry.getValue();
				int entryHour = time.getEntryHour();
				int entryMinute = time.getEntryMinute();
				int leaveHour = time.getLeaveHour();
				
				if(entryHour > 9 || entryHour == 9 && entryMinute > 0) {
					attend.addLateCount();
				}
				if(leaveHour < 18) {
					attend.addEarlyLeaveCount();
				}
			}
			if(attend.getLate() > 0 || attend.getEarlyLeave() > 0) {
				System.out.printf("%s\t\t%3d회\t\t%3d회\r\n",
						entry.getKey(), attend.getLate(), attend.getEarlyLeave());
			}
		}
	}
}

class Attend {
	private HashMap<String, AttandTime> map;
	private int late;
	private int earlyLeave;
	
	public Attend() {
		this.map = new HashMap<String, AttandTime>();
		this.late = 0;
		this.earlyLeave = 0;
	}
	
	public HashMap<String, AttandTime> getMap() {
		return map;
	}

	public int getLate() {
		return late;
	}

	public int getEarlyLeave() {
		return earlyLeave;
	}
	
	public void addLateCount() {
		this.late++;
	}
	
	public void addEarlyLeaveCount() {
		this.earlyLeave++;
	}

	@Override
	public String toString() {
		return "Attend [map=" + map + ", late=" + late + ", earlyLeave=" + earlyLeave + "]";
	}
	
	
}

class AttandTime {
	private int entryHour;
	private int entryMinute;
	private int leaveHour;
	private int leaveMinute;
	
	public AttandTime(String[] entryTime, String[] leaveTime) {
		int entryHour = Integer.parseInt(entryTime[0]);
		int entryMinute = Integer.parseInt(entryTime[1]);
		int leaveHour = Integer.parseInt(leaveTime[0]);
		int leaveMinute = Integer.parseInt(leaveTime[1]);
			
		this.entryHour = entryHour;
		this.entryMinute= entryMinute;
		this.leaveHour = leaveHour;
		this.leaveMinute = leaveMinute;
	}
	
	public int getEntryHour() {
		return entryHour;
	}

	public int getEntryMinute() {
		return entryMinute;
	}

	public int getLeaveHour() {
		return leaveHour;
	}

	public int getLeaveMinute() {
		return leaveMinute;
	}
	
	public void compareTime(String[] entryTime, String[] leaveTime) {
		int entryHour = Integer.parseInt(entryTime[0]);
		int entryMinute = Integer.parseInt(entryTime[1]);
		int leaveHour = Integer.parseInt(leaveTime[0]);
		int leaveMinute = Integer.parseInt(leaveTime[1]);
		
		if(this.entryHour < entryHour 
				|| this.entryHour == entryHour && this.entryMinute < entryMinute) {
			this.entryHour = entryHour;
			this.entryMinute= entryMinute;
		}
		
		if(this.leaveHour > leaveHour
				|| this.leaveHour == leaveHour && this.leaveMinute > leaveMinute) {
			this.leaveHour = leaveHour;
			this.leaveMinute = leaveMinute;
		}
	}

	@Override
	public String toString() {
		return "AttandTime [entryHour=" + entryHour + ", entryMinute=" + entryMinute + ", leaveHour=" + leaveHour
				+ ", leaveMinute=" + leaveMinute + "]";
	}
	
	
}