/**
 * 
 */
package assignment4;

import javax.swing.JOptionPane;

/**
 * @author Sergio Sanchez
 *
 */
public class Assignment4 {

	/**
	 * @param args Unused
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String weekDay = getDayOfWeekFromUser("Please enter the day of the week to check yours meetings:");
		
		String dayMeetings = slotMeetings(weekDay);
		
		printResult(weekDay,  dayMeetings);
		
		printMyName();
		
	}
	
	/**
	 * This is a void method to print on the screen
	 * a the result of the meetings on the specified
	 * day of the week.
	 * 
	 * @param weekDay This is the day of the week.
	 * @param dayMeetings This are the meeting slots.
	 */
	public static void printResult(String weekDay, String dayMeetings) {
		JOptionPane.showMessageDialog(null, "On " + weekDay.toLowerCase() + ": " + dayMeetings);
	}
	
	/**
	 * This method is to get the slots of the meeting
	 * according to the day of the week.
	 * 
	 * @param weekDay Day of the week to pass into the method.
	 * @return String return the slots of meetings.
	 */
	public static String slotMeetings(String weekDay) {
		String meetings = "";
		switch (weekDay.toLowerCase()) 
		{
			case "monday":
				meetings = "8 to 10 am";
				break;
			case "tuesday":
				meetings = "2 to 4 pm";
				break;
			case "wednesday":
				meetings = "1 to 3 pm";
				break;
			case "thursday":
				meetings = "No meeting";
				break;
			case "friday":
				meetings = "8 to 10 am then 5 to 6 pm";
				break;
		}
		return meetings;
	}
	
	/**
	 * This is a method that show a message to the user and take 
	 * the input of a day of the week.
	 * 
	 * @param message This is to pass the message to print on the screen.
	 * @return int This return a number greater than 0.
	 */
	public static String getDayOfWeekFromUser(String message) {
		
		String dayInput;
		do {
			dayInput = "";
			
			dayInput = JOptionPane.showInputDialog(message);

			if (!isWeekDay(dayInput)) {
				printStr("This is not a valid week day. Please, try again!");
			}
			
		} while (!isWeekDay(dayInput)); 
		
		return dayInput;
	}
	
	/**
	 * This is a method is to check is the input from the user 
	 * is a week day or not.
	 * 
	 * @param day This is the String to be checked.
	 * @return boolean This return a boolean indicating if it's a week day.
	 */
	public static boolean isWeekDay(String day) {
		boolean isWeekDay = false;
		
		if (	day.equalsIgnoreCase("monday") ||
				day.equalsIgnoreCase("tuesday") ||
				day.equalsIgnoreCase("wednesday") ||
				day.equalsIgnoreCase("thursday") ||
				day.equalsIgnoreCase("friday")) isWeekDay = true;
			
		return isWeekDay;
	}
	
	/**
	 * This method prints the author name.
	 */
	public static void printMyName(){
		String name = "Sergio Sanchez";
		JOptionPane.showMessageDialog(null, "My name is " + name + ".");	
	}
	
	/**
	 * This is a void method to print on the screen
	 * a message to the user using JOptionPane.
	 * 
	 * @param message This is the string to print
	 */
	public static void printStr(String message) {
		JOptionPane.showMessageDialog(null, message);
	}

}
