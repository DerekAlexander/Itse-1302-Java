/**
 * Write a program to prompt the user for 2 dates consisting of a month and a year and display the number of years and months between 
 * these 2 dates. Either date could be the earlier date.
 * Sample Run:
 * For the first date,
 * Enter month: August
 * Enter year: 2011
 * For the second date,
 * Enter month: March
 * Enter year: 1999
 * These dates are 12 years and 5 months apart.
 *
 * @author Derek Alexander
 * @version 1.0
 */
 import java.util.Scanner;
public class DateDifference{
	/**
	 * Write a program to prompt the user for 2 dates consisting of a month and a year and display the number of years and months between 
	 * these 2 dates. Either date could be the earlier date.
    */
	public static void main(String[] args){
	//Reserve memory - Declare local variables to store values
			Scanner input = new Scanner(System.in);
			String firstMonth, secondMonth;
			int yearDifference = 0, monthDifference = 0, firstMonthNumber = 0, secondMonthNumber = 0, firstYear = 0, secondYear = 0;
	//Translate Inputs
			//Reads user input via keyboard for first date consisting of a month and year. Saved as string and int respectively. 
			System.out.println("For the first date,");
			System.out.print("Enter month: ");
			firstMonth = input.next();
			System.out.print("Enter year: ");
			firstYear = input.nextInt();
			//Reads user input via keyoboard for second date consisting of a month and year. Saved as string and int respectively.
			System.out.println(" ");
			System.out.println("For the second date,");
			System.out.print("Enter month: ");
			secondMonth = input.next();
			System.out.print("Enter year: ");
			secondYear = input.nextInt();
	//Translate Processing
			//Compares user month input to any cased month to see if its a actual month. Then gets the assoicated number for the month.  
			if (firstMonth.equalsIgnoreCase("JANUARY"))
			{
				firstMonthNumber = 1;
			}
			else if (firstMonth.equalsIgnoreCase("FEBRUARY"))
			{
				firstMonthNumber = 2;
			}
			else if (firstMonth.equalsIgnoreCase("MARCH"))
			{
				firstMonthNumber = 3;
			}
			else if (firstMonth.equalsIgnoreCase("APRIL"))
			{
				firstMonthNumber = 4;
			}
			else if (firstMonth.equalsIgnoreCase("MAY"))
			{
				firstMonthNumber = 5;
			}
			else if (firstMonth.equalsIgnoreCase("JUNE"))
			{
				firstMonthNumber = 6;
			}
			else if (firstMonth.equalsIgnoreCase("JULY"))
			{
				firstMonthNumber = 7;
			}
			else if (firstMonth.equalsIgnoreCase("AUGUST"))
			{
				firstMonthNumber = 8;
			}
			else if (firstMonth.equalsIgnoreCase("SEPTEMBER"))
			{
				firstMonthNumber = 9;
			}
			else if (firstMonth.equalsIgnoreCase("OCTOBER"))
			{
				firstMonthNumber = 10;
			}
			else if (firstMonth.equalsIgnoreCase("NOVEMBER"))
			{
				firstMonthNumber = 11;
			}
			else if (firstMonth.equalsIgnoreCase("DECEMBER"))
			{
				firstMonthNumber = 12;
			}
			// Incase the user does not input an actual month or misspells it. 
			else
			{
				System.out.println( firstMonth + " is not a month. Maybe you misspelled it? Please re-enter a month for the first date.");
			}
		//Compares user second month input to any cased month to see if its a actual month. Then gets the assoicated number for the month.   
			if (secondMonth.equalsIgnoreCase("JANUARY"))
			{
				secondMonthNumber = 1;
			}
			else if (secondMonth.equalsIgnoreCase("FEBRUARY"))
			{
				secondMonthNumber = 2;
			}
			else if (secondMonth.equalsIgnoreCase("MARCH"))
			{
				secondMonthNumber = 3;
			}
			else if (secondMonth.equalsIgnoreCase("APRIL"))
			{
				secondMonthNumber = 4;
			}
			else if (secondMonth.equalsIgnoreCase("MAY"))
			{
				secondMonthNumber = 5;
			}
			else if (secondMonth.equalsIgnoreCase("JUNE"))
			{
				secondMonthNumber = 6;
			}
			else if (secondMonth.equalsIgnoreCase("JULY"))
			{
				secondMonthNumber = 7;
			}
			else if (secondMonth.equalsIgnoreCase("AUGUST"))
			{
				secondMonthNumber = 8;
			}
			else if (secondMonth.equalsIgnoreCase("SEPTEMBER"))
			{
				secondMonthNumber = 9;
			}
			else if (secondMonth.equalsIgnoreCase("OCTOBER"))
			{
				secondMonthNumber = 10;
			}
			else if (secondMonth.equalsIgnoreCase("NOVEMBER"))
			{
				secondMonthNumber = 11;
			}
			else if (secondMonth.equalsIgnoreCase("DECEMBER"))
			{
				secondMonthNumber = 12;
			}
				// Incase the user does not input an actual month or misspells it. 
			else
			{
				System.out.println(secondMonth + " is not a month. Maybe you misspelled it? Please re-enter a month for the second date.");
			}
			//check if the first year is less than the second year. 
			//if this is true than subtract the second year from the first.
			if(firstYear < secondYear)
			{
			yearDifference = secondYear - firstYear;
				//than check if the first month is less than the second. if so than do first month minus second month.
				//if not than do second month minus first, take away a year and add 12 months to the total of first minus second.
				if(firstMonthNumber < secondMonthNumber)
				{
					monthDifference = firstMonthNumber - secondMonthNumber;
				}
				else
					// If the first month is greater than the second then a year is subtracted and 12 months is added to the negative month. 
				{
					monthDifference = secondMonthNumber - firstMonthNumber;
					yearDifference = yearDifference - 1;
					monthDifference = monthDifference + 12;
				}
			}
			//check if the first year is equal to the second year. if this is true than subtract the first year from the second.
			else if(firstYear == secondYear)
			{
			yearDifference = firstYear - secondYear;
					//than check if the first month is less than the second. if so than do second month minus first. if not than do first month minus the second month. 
				if(firstMonthNumber < secondMonthNumber)
				{
					monthDifference = secondMonthNumber - firstMonthNumber;
				}
				else
					//If the first month is greater than the second then first is subtracted from second since the year is the same. 
				{
						monthDifference = firstMonthNumber - secondMonthNumber;
				}
			}
			//check if the first year is less than the second year. if this is false and the first and second years arent equal than do first year minus second.
			else
			{
			yearDifference = firstYear - secondYear;
				//than check if first month is less than the second. if so than do first month minus the second, 
				//take away a year and add 12 months to the total of first minus second. if not than do first month minus second month.
				if(firstMonthNumber < secondMonthNumber)
				{
					monthDifference = firstMonthNumber - secondMonthNumber;
					yearDifference = yearDifference - 1;
					monthDifference = monthDifference + 12;
				}
				else
					//if the first month is greater t han the second then first is subtracted from second.
				{
					monthDifference = firstMonthNumber - secondMonthNumber;
				}
			}
	//Translate Outputs
			//display the result of the year difference between the two dates as a positive. and also display the difference between the two months. 
			//in relation to the year and also as a positive. 
			System.out.println(" ");
			System.out.println("These dates are " + yearDifference + " years and " + monthDifference + " months apart.");
		}
	}
