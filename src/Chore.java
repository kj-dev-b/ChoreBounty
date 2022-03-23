import java.util.*;
import java.text.*;

public class Chore {

   //1. Create the chore, set a bounty, change a bounty, set a time window, get remaining time, set description/title/type, 
   private double bountyAmmount;
   private String bountyResource;
   private String choreName;
   private String choreDescription;
   private Date startDate;
   private Date endDate;
   private String pattern = "yyyy-MM-dd";
   
   public Chore () {}
   
   public void setABounty(double bountyAmmount) {
      this.bountyAmmount = bountyAmmount;
   }
   
   public double getABounty() {
      return this.bountyAmmount;
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
<<<<<<< HEAD
      return this.bountyAmmount + " " + this.bountyResource + " " + this.choreName + " " + getChoreDescription() + " " + getTimeWindow();
=======
      return this.bountyAmmount + " " + this.bountyResource + " " + this.choreName + " " + getTimeWindow();
>>>>>>> fc38cdbc6b30d45d9a4e637652a347ee40a9af01
   }

public String getChoreDescription() {
	return choreDescription;
}

public void setChoreDescription(String choreDescription) {
	this.choreDescription = choreDescription;
}
}