/****
 Casey Kreps
 August 23, 2022
 Bean for date
 
 ****/


import java.util.Date;


public class DateBean {

	private Date dateTime = new Date();
	
	public Date getDateTime() {
		return dateTime;
	}
	
	public void setDateTime(Date dateTime) {
		this.dateTime = dateTime;
		
	}
}