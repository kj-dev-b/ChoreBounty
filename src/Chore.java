import java.util.*;
import java.text.*;

public class Chore {

   //1. Create the chore, set a bounty, change a bounty, set a time window, get remaining time, set description/title/type, 
   private double bounty;
   private String choreName;
   private Date startDate;
   private Date endDate;
   private String pattern = "yyyy-MM-dd";
   
   public Chore () {}
   
   public void setABounty(double bounty) {
      this.bounty = bounty;
   }
   
   public double getABounty() {
      return this.bounty;
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
      return this.bounty + " " + this.choreName + " " + getTimeWindow();
   }
}