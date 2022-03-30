package main;

import java.util.*;
import java.text.*;

public class Chore {

   //1. Create the chore, set a bounty, change a bounty, set a time window, get remaining time, set description/title/type, 
   private double bountyAmount;
   private String bountyResource;
   private String choreName;
   private String choreDescription;
   private String choreID;
   private Date startDate;
   private Date endDate;
   private String pattern = "yyyy-MM-dd";
   private static int choreNumber = 0;
   
   public Chore() {
	   this(-1, "noName", "noDescription");
   }
   
   public Chore (double bountyAmount, String choreName, String choreDescription) {
	   this.setChoreID(choreNumber++);
	   this.bountyAmount = bountyAmount;
	   this.choreName = choreName;
	   this.choreDescription = choreDescription;
   }
   
   public void setABounty(double bountyAmount) {
      this.bountyAmount = bountyAmount;
   }
   
   public double getABounty() {
      return this.bountyAmount;
   }
   
   public void setBountyResource(String bountyResource) {
	   this.bountyResource = bountyResource;
   }
   
   public String getBountyResource () {
	   return this.bountyResource;
   }
   
   public void setChoreName(String choreName) {
      this.choreName = choreName;
   }
   
   public String getChoreName() {
      return this.choreName;
   }
   
   public void setTimeWindow(String startDate, String endDate) {
      SimpleDateFormat dateFormatter = new SimpleDateFormat(this.pattern);
      
      try {
         this.startDate = dateFormatter.parse(startDate);
         this.endDate = dateFormatter.parse(endDate);
      } catch(ParseException e) {
         System.out.println("Error Parsing Date String for Time window " + e);
      }
   }
   
   public String getTimeWindow() {
      return this.startDate + " - " + this.endDate;
   }
   
   public String toString() {
      return this.bountyAmount + " " + this.bountyResource + " " + this.choreName + " " + getChoreDescription() + " " + getTimeWindow();
   }

	public String getChoreDescription() {
		return choreDescription;
	}
	
	public void setChoreDescription(String choreDescription) {
		this.choreDescription = choreDescription;
	}
	
	public String getChoreID() {
		return this.choreID;
	}
	
	private void setChoreID(int choreID) {
		this.choreID = "c" + choreID;
	}
}