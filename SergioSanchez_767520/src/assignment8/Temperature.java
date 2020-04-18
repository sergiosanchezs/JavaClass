/**
 * 
 */
package assignment8;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 * 
 * This Class calculate the feels like temperature, 
 * based upon the day, temperature & wind speed data on
 * that is input by the user or user defined in certain 
 * parameters.
 * 
 * @author Sergio Sanchez
 *
 */
public class Temperature {
	
	double temperature[] = new double[1];
	String daysOfWeek[] = { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" };
	double windSpeed[] = { 31.2, 19.4, 23.7, 43.4, 15.8, 55.1, 39.6 };
	int idx = -1;
	
	/**
	 * This constructor sets the starting temperature at 0.0.
	 */
	public Temperature() {
		temperature[0] = 0.0;
	}
	
	/**
	 * This method is call other methods. For example
	 * call findDay and getDay to assign the idx variable of
	 * the day inputed by the user. Moreover, get the temperature, and 
	 * the windspeed is the user wants to set a new different for the 
	 * calculations. At the end, it calls the printFeelsLikeTemp method 
	 * to print the calculations with the user input or with the one is 
	 * stored in the array for the specific day.
	 */
	public void getDataFromUser() {
		idx = findDay(getDay());
		if (idx == -1)
			JOptionPane.showMessageDialog(null, "The day is not correct");
		else
		{
			temperature[0] = getTemperature();
			String answer = JOptionPane.showInputDialog(
					"The current windspeed for " + daysOfWeek[idx] + " is " + windSpeed[idx] + " km/h.\n" +
					"Do you want to set your own windspeed? Type: yes to set the new windspeed.");
			if (answer.charAt(0) == 'y' || answer.charAt(0) == 'Y')
				printFeelsLikeTemp(JOptionPane.showInputDialog("Enter the new windspeed"));
			else
				printFeelsLikeTemp();
		}
	}
	
	/**
	 * This method is to find the day inputed by the user
	 * inside the array that contains the days of the week.
	 * @param dayToSearch Is a string that is the day of the week. 
	 * @return An integer that is the index of the week day found. If not
	 * index found return -1.
	 */
	public int findDay(String dayToSearch) {
		// for Loop to search if the day exist in the array
		 for(int i = 0; i < daysOfWeek.length; i++)
			 if (dayToSearch.equalsIgnoreCase(daysOfWeek[i]))
				 return i;
		 return -1;
	}
	
	/**
	 * This method is to get the day of the week from user input.
	 * @return String return a string with the user input.
	 */
	public String getDay() {
		return JOptionPane.showInputDialog("Please enter the day ");
	}
	/**
	 * This method is to get the temperature from the user.
	 * @return double return a double with the temperature enter by the user.
	 */
	public double getTemperature() {
		 return Double.parseDouble(JOptionPane.showInputDialog("Please enter the temperature of "));
	}
	
	/**
	 * This method calculates and print the feels Like Temperature.
	 */
	public void printFeelsLikeTemp() {
		DecimalFormat ft = new DecimalFormat("#0.0 C"); // Setting the format for temperature output.
		double feelsTemp = windSpeed[idx] * temperature[0];
		JOptionPane.showMessageDialog(null, "The Feels Like Temperature is " + ft.format(feelsTemp));
	}
	
	/**
	 * This method calculates and print the feels Like Temperature.
	 * @param userWindSpeed to set a user specific wind speed.
	 */
	public void printFeelsLikeTemp(String userWindSpeed) {
		double feelsTemp = Double.parseDouble(userWindSpeed) * temperature[0];
		DecimalFormat ft = new DecimalFormat("#0.0 C");
		JOptionPane.showMessageDialog(null, "The Feels Like Temperature is " + ft.format(feelsTemp));
	}
	

}
