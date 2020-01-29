package com.wipro.bus.bean;

public class ScheduleBean {
 private String scheduleId;
 private String source;
 private String destinationString;
 private String startTime;
 private String arrivalTime;
public String getScheduleId() {
	return scheduleId;
}
public void setScheduleId(String scheduleId) {
	this.scheduleId = scheduleId;
}
public String getSource() {
	return source;
}
public void setSource(String source) {
	this.source = source;
}
public String getDestinationString() {
	return destinationString;
}
public void setDestinationString(String destinationString) {
	this.destinationString = destinationString;
}
public String getStartTime() {
	return startTime;
}
public void setStartTime(String startTime) {
	this.startTime = startTime;
}
public String getArrivalTime() {
	return arrivalTime;
}
public void setArrivalTime(String arrivalTime) {
	this.arrivalTime = arrivalTime;
}
 
}
