package com.main;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Events {

	Map<String, String> map;

	public Events() {
		map = new HashMap<>();
	}
	
	public String calculateFreeTime(String[] dates) {
		if (dates.length < 3) {
			return "Please send at 3 values of event :(";
		}
		else {
		// here hh for 12hours
		DateFormat dateFormat = new SimpleDateFormat("HH:mm");

		map.put("date", "0");
		map.put("diffDate", "");

		try {
			Date end = dateFormat.parse(dates[0].split("-")[1].substring(0, 5));
			for (int i = 1; i < dates.length; i++) {
				Date start = dateFormat.parse(dates[i].split("-")[0].substring(0, 5));

				calculateTimeDiff(end, start);

				end = dateFormat.parse(dates[i].split("-")[1].substring(0, 5));

			}

		} catch (ParseException e) {
			e.printStackTrace();
		}
		return map.get("diffDate")+"";
		}
	}

	public void calculateTimeDiff(Date prevEvenEndDate, Date eventStartDate) {
		DateFormat dateFormat = new SimpleDateFormat("HH:mm aa");

		String dt = null;

		long time = eventStartDate.getTime() - prevEvenEndDate.getTime();
		long hour = (time / (1000 * 60 * 60)) % 24;
		long min = (time / (1000 * 60)) % 60;
		try {
			Date dateDiff = new SimpleDateFormat("HH:mm").parse(hour + ":" + min);
			int value = Integer.parseInt(map.get("date"));
			if (Long.parseLong((dateDiff.getTime()+"").substring(1)) > value) {
				map.put("diffDate", dateFormat.format(dateDiff));
			}
			// dt = dateFormat.format(dateDiff);
			// System.out.println(dt);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
