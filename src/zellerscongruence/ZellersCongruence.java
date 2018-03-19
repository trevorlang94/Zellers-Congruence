/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zellerscongruence;
import java.util.*;
/**
 *
 * @author Main
 */
public class ZellersCongruence {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Date date = new Date();
      GregorianCalendar testCal = new GregorianCalendar(); 
      String months[] = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", 
         "Oct", "Nov", "Dec"};
      System.out.print("Date: ");
      System.out.print(months[testCal.get(Calendar.MONTH)]);
      System.out.print(" " + testCal.get(Calendar.DATE) + " ");
      System.out.println(testCal.get(Calendar.YEAR));
      System.out.print("Time: ");
      System.out.print(testCal.get(Calendar.HOUR) + ":");
      System.out.print(testCal.get(Calendar.MINUTE) + ":");
      System.out.println(testCal.get(Calendar.SECOND));
      
      String daysOfWeek[] = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
      Scanner sc = new Scanner(System.in);
      double day, month, dayOfMonth, yearCentury, zeroBaseCent, year;
      System.out.println("Please enter the month 1-12. \n");
      month = sc.nextDouble(); 
      System.out.println("Please enter the day of the month you wish to calculate.");
      dayOfMonth = sc.nextDouble();
      System.out.println("Please enter the year you wish to calculate for.");
      year = sc.nextDouble();
      yearCentury = year % 100;
      zeroBaseCent = year/100;
      
      if(month <= 2){ 
          day = ((dayOfMonth + 2 + ((13/5 * (month+1))) + yearCentury + yearCentury/4 + zeroBaseCent/4 - 5 * zeroBaseCent) % 7);
            
      }
      else {
          day = ((dayOfMonth + (int)((26 * (month + 1)) / 10.0) + yearCentury + yearCentury/4 + zeroBaseCent/4 - 5 * zeroBaseCent) % 7);
           
      }
      
      int dayOutput = (int)day;
      if(dayOutput == 0){
         System.out.println("The date you've inputted would be a: " + daysOfWeek[dayOutput]); 
      }
      else {
         System.out.println("The date you've inputted would be a: " + daysOfWeek[dayOutput - 1]);
      //int day = (2.6 * month - .2) + k + d + (d/4) + (c/4) - 2*c %7; 
      }
    }
    
}
