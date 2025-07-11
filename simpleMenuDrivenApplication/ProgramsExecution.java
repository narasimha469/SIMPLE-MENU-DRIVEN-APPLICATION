package simpleMenuDrivenApplication;
import java.util.Scanner;
public class ProgramsExecution {
public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		while (flag) {
			System.out.println("\nPress YES to perform the programs");
			System.out.println("Press NO if you want to exist ");
			String exist = sc.next();
			if(exist.equalsIgnoreCase("NO")){
				System.out.println("EXIST SUCCESSFULLY");
				flag = false;
				break;
			}
	
			System.out.println("-----------MENU NUMBERS TO PERFROM PROGRAMS---------------");
			System.out.println("1.Print numbers from N to 1");
			System.out.println("2.Sum of even digits in a number");
			System.out.println("3.Check if a number is palindrome");
			System.out.println("4.Count occurrence of a digit in a number");
			System.out.println("5.GCD of two numbers");
			System.out.println("6.LCM of two numbers");
			System.out.println("7.Find first digit of a number");
			System.out.println("8.Reverse an array");
			System.out.println("9.Print ASCII value of each character in a string");
			System.out.println("10.Find second largest element in an array");
			System.out.println("11.Insert element into an array");
			System.out.println("12.Search an element in an array");
			System.out.println("13.Find all factors of a number");
			System.out.println("14.Power of a number (base^exponent)");
			System.out.println("15.Print characters from 'A' to 'Z'");
			System.out.println("16.Find duplicate characters in a string");
			System.out.println("17.Remove white spaces from a string");
			System.out.println("18.Check if an array is sorted");
			System.out.println("19.Convert lowercase to uppercase (manual, without .toUpperCase())");
			System.out.println("20.Convert binary to decimal");
			System.out.println("----------------------------------------------");
			boolean flag1 = true;
			while(flag1) {
				System.out.println("PLEASE ENTER THE PROGRAM MENU NUMBER:");
			int menuNumber = sc.nextInt();
            switch (menuNumber) {
			case 1:
				Programs.printNumbersNTo1(sc);
				break;
			case 2:
				Programs.sumOfEvenDigitsInANumber(sc);
				break;
			case 3:
				Programs.palindromeOrNot(sc);
				break;
			case 4:
				Programs.countOccuranceOfADigitInANumber(sc);
				break;
			case 5:
				Programs.findGCD(sc);
				break;
			case 6:
				Programs.findLCMOfTwoNumbers(sc);
				break;
			case 7:
				Programs.findFirstDigitOfANumber(sc);
				break;
			case 8:
				Programs.reverseAnArray(sc);
				break;
			case 9:
				Programs.printASCIIValueOfEachCharacterInAString(sc);
				break;
			case 10:
				Programs.findSecondLargestElementInAnArray(sc);
				break;
			case 11:
				Programs.insertElementIntoAnArray(sc);
				break;
			case 12:
				Programs.searchAnElementInAnArray(sc);
				break;
			case 13:
				Programs.findAllFactorsOfANumber(sc);
				break;
			case 14:
				Programs.powerOfANumber(sc);
				break;
			case 15:
				Programs.printCharactersFromAToZ(sc);
				break;
			case 16:
				Programs.findDuplicateCharactersInAString(sc);
				break;
			case 17:
				Programs.removeWhiteSpacesFromAString(sc);
				break;
			case 18:
				Programs.checkIfAnArrayIsSorted(sc);
				break;
			case 19:
				Programs.convertLowercaseToUppercase(sc);
				break;
			case 20:
				Programs.convertBinaryToDecimal(sc);
				break;
			default:
				System.out.println("please enter the number between 1 to 20 to perform the programs");
			}

			System.out.println("\nPress YES if you want to perform another program");
			System.out.println("press NO if you want to exist");
			String name = sc.next();
			if(name.equalsIgnoreCase("NO")){
				flag1=false;
				flag = false;
				System.out.println("EXIST SUCCESSFULLY");
				
			}
		}
		}
		
		sc.close();
	}

}
