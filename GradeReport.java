/**
 * Sample Run:
 *For test 1,
 *Enter score 1: 90
 *Enter score 2: 82
 *Enter score 3: 39
 *Enter score 4: 89
 *For test 2,
 *Enter score 1: 59
 *Enter score 2: 80
 *Enter score 3: 100
 *Enter score 4: 92
 *Test 1 Test 2 Average Grade
 *------ ------ ------- -----
 *090 059 074.5 C
 *082 080 081.0 B
 *039 100 069.5 F
 *089 092 090.5 A
 * @author: Derek Alexander
 * @version 1.2
 */
 import java.util.Scanner;
 import java.text.DecimalFormat;
 
public class GradeReport{
	public static void main(String[] args){
		//Reserve memory - Declare local variables to store values
		int[] test1 = new int[4], test2 = new int[4];
		double[] average = new double[4];
		char[] grade = new char[4];
		DecimalFormat formatAverage = new DecimalFormat ("000.0");
		DecimalFormat formatTest = new DecimalFormat ("000");
		Scanner input = new Scanner(System.in);
		String[] formattedTest1 = new String [4], formattedTest2 = new String [4], formattedAverage = new String [4];
		//Translate Inputs
		//for each student, take scores for test 1 entered in via keyboard.
		System.out.println("for test 1,");
		for (int counter = 0; counter < test1.length; counter++)
		{
				System.out.print("Enter score " + (counter + 1) + ": ");
				test1[counter] = input.nextInt();
		}
		System.out.println("for test 2,");
		//for each student, take scores for test 2 entered in via keyboard. 
		for (int counter = 0; counter < test2.length; counter++)
		{
				System.out.print("Enter score " + (counter + 1) + ": ");
				test2[counter] = input.nextInt();
		}
		//Translate Processing
		//for each student, average out test 1 and test 2 grades.
		for (int counter = 0; counter < average.length; counter++)
		{
			average[counter] = test1[counter] + test2[counter];
			average[counter] = average[counter] / 2 ;
		}		
		//for each student, formats there test 1 score with leading zeros 000.
		for(int counter = 0; counter < formattedTest1.length; counter++)
		{
			formattedTest1[counter] = formatTest.format(test1[counter]);
		}
		//for each student, formats there test 2 score with leading zeros 000.
		for(int counter = 0; counter < formattedTest2.length; counter++)
		{
			formattedTest2[counter] = formatTest.format(test2[counter]);
		}
		//for each student, formats there tests average with leading zeros 000.0
		for(int counter = 0; counter < formattedAverage.length; counter++)
		{
			formattedAverage[counter] = formatAverage.format(average[counter]);
		}
		//for each student, there average grade is checked against letter grades to see which statement is true. 
		for(int counter = 0; counter < grade.length; counter++)
		{
			if(average[counter] >= 90.0)
			{
				grade[counter] = 'A';
			}
			else if(average[counter] >= 80.0)
			{
				grade[counter] = 'B';
			}
			else if(average[counter] >= 70.0)
			{
				grade[counter] = 'C';
			}
			else
			{
				grade[counter] = 'F';
			}
		}
		//Translate Outputs
		System.out.println(" ");
		System.out.println("test 1" + "    " + "test 2" + "    " + "average" + "   " + "grade");
		System.out.println("-----" + "     " + "-----" + "     " + "-----" + "     " + "-----");
		//for each student, displays there test 1, test 2, average and grade. all formatted.  
		for(int counter = 0; counter < grade.length; counter++)
		{
		System.out.println(formattedTest1[counter] + "       " + formattedTest2[counter] + "       " + formattedAverage[counter] + "     " + grade[counter]);
		}
	}
}
