package simpleMenuDrivenApplication;
import java.util.Scanner;
import java.util.Arrays;
public class Programs {
   // 1.Print numbers from N to 1
	static void printNumbersNTo1(Scanner sc) {
		System.out.println("enter n value for printing numbers from N to 1:");
		int n = sc.nextInt();
		while (n >= 1) {
			System.out.print(n + " ");
	  		n--;
		}
//		
	}

	// 2.Sum of even digits in a number.
	static void sumOfEvenDigitsInANumber(Scanner sc) {
		System.out.println("\nenter the number for finding Sum of even digits in a number:");
		int number = sc.nextInt();
		int sum = 0;
		while (number != 0) {
			int digit = number % 10;
			number = number / 10;
			if (digit % 2 == 0) {
				sum = sum + digit;
			}

		}
		System.out.println("the sum of even digits in a number:" + sum);

	}

	// 3.Check if a number is palindrome.

	static void palindromeOrNot(Scanner sc) {
		System.out.println("\nenter the number for checking if a number is palindrome or not:");
		int number = sc.nextInt();
		int num = number;
		int rev = 0;
		while (number != 0) {
			int digit = number % 10;
			rev = rev * 10 + digit;
			number = number / 10;
		}
		if (rev == num) {
			System.out.println("the number " + num + " is palindrome");
		} else {
			System.out.println("the number " + num + " is not palindrome");
		}
	}

	// 4.Count occurrence of a digit in a number

	static void countOccuranceOfADigitInANumber(Scanner sc) {
		System.out.println("\nenter the number for Count occurrence of a digit in a number:");
		int number = sc.nextInt();
		System.out.println("enter the occurance digit");
		int occuranceDigit = sc.nextInt();
		int count = 0;
		while (number != 0) {
			int digit = number % 10;
			number = number / 10;
			if (digit == occuranceDigit) {
				count++;
			}
		}
		System.out.println("the count occurance of a digit " + occuranceDigit + " in a number is:" + count);

	}

//5.GCD of two numbers
	static void findGCD(Scanner sc) {
		System.out.println("\nenter the input numbers for finding the GCD of two numbers");
		System.out.println("enter the inputNumber1:");
		int inputNumber1 = sc.nextInt();
		System.out.println("enter the inputNumber2:");
		int inputNumber2 = sc.nextInt();
		while (inputNumber2 != 0) {
			int remainder = inputNumber1 % inputNumber2;// 48%18==12
			inputNumber1 = inputNumber2;
			inputNumber2 = remainder;

		}
		System.out.println("the GCD of two numbers is:" + inputNumber1);
	}

//6.LCM of two numbers
	static void findLCMOfTwoNumbers(Scanner sc) {
		System.out.println("\nenter the input numbers for finding the LCM of two numbers");
		System.out.println("enter the inputNumber1:");
		int inputNumber1 = sc.nextInt();
		int inputNumber1sample = inputNumber1;
		System.out.println("enter the inputNumber2:");
		int inputNumber2 = sc.nextInt();
		int inputNumber2sample = inputNumber2;
		while (inputNumber2 != 0) {
			int remainder = inputNumber1 % inputNumber2;// 48%18==12
			inputNumber1 = inputNumber2;
			inputNumber2 = remainder; 

		}
		int lcm = (inputNumber1sample * inputNumber2sample) / inputNumber1;
		System.out.println("the LCM of two numbers is:" + lcm);
	}

//7.Find first digit of a number
	static void findFirstDigitOfANumber(Scanner sc) {
		System.out.println("\nenter the input number for finding first of  digits in a number:");
		int inputNumber = sc.nextInt();
		int duplicateNumber = inputNumber;
		int firstDigit = 0;
		while (inputNumber != 0) {
			firstDigit = inputNumber % 10;
			inputNumber = inputNumber / 10;

		}
		System.out.println("the first digit of a number " + duplicateNumber + " is:" + firstDigit);
	}

//8.Reverse an array.
	static void reverseAnArray(Scanner sc) {
		System.out.println("\nenter the input array to reverse an array");
		int inputArray[] = new int[6];
		// Reading elements.
		int i = 0;
		while (i < inputArray.length) {
			inputArray[i] = sc.nextInt();
			i++;

		}
		System.out.println("the array:" + Arrays.toString(inputArray));
		// reversing an array
		int firstElement = 0;
		int lastElement = inputArray.length - 1;
		while (firstElement < lastElement) {
			int temp = inputArray[firstElement];
			inputArray[firstElement] = inputArray[lastElement];// the loop will iterates 3 times.Next time condition is
																// false.
			inputArray[lastElement] = temp;
			firstElement++;
			lastElement--;
		}
		System.out.println("the reversed array:" + Arrays.toString(inputArray));
	}

//9.Print ASCII value of each character in a string.
	static void printASCIIValueOfEachCharacterInAString(Scanner sc) {
		System.out.println("\nenter the string to Print ASCII value of each character in a string");
		String str = sc.next();
		int i = 0;
		while (i < str.length()) {
			char ch = str.charAt(i);
			int asciiValue = ch;
			System.out.println("the ascii value for " + ch + " is:" + asciiValue);
			i++;
		}

	}

//10.Find second largest element in an array
	static void findSecondLargestElementInAnArray(Scanner sc) {
		System.out.println("\nenter the array to find second largest element in an array");
		int inputArray[] = new int[6];
		// reading elements
		int i = 0;
		while (i < inputArray.length) {
			inputArray[i] = sc.nextInt();
			i++;
		}
		System.out.println(Arrays.toString(inputArray));
		int largestElement = Integer.MIN_VALUE;
		int secondLargestElement = Integer.MIN_VALUE;
		int j = 0;
		while (j < inputArray.length) {
			if (inputArray[j] > largestElement) {
				secondLargestElement = largestElement;
				largestElement = inputArray[j];
			}
			if (inputArray[j] > secondLargestElement && inputArray[j] != largestElement) {
				secondLargestElement = inputArray[j];
			}
			j++;
		}
		System.out.println("the  second largest element is:" + secondLargestElement);
	}

//11.Insert element into an array
	static void insertElementIntoAnArray(Scanner sc) {
		System.out.println("\nenter the array to insert element into an array");
		int inputArray[] = new int[3];
		// reading elements
		int i = 0;
		while (i < inputArray.length) {
			inputArray[i] = sc.nextInt();
			i++;
		}
		System.out.println(Arrays.toString(inputArray));
		System.out.println("enter the insertpositon in an array:");
		int insertionPosition = sc.nextInt();
		System.out.println("enter the element to insert in the position:");
		int elementToInsert = sc.nextInt();
		// creating new array using existing array and increasing the length by 1 to
		// insert a new element
		int newArray[] = new int[inputArray.length + 1];
		// copy elements before the insertion element.
		int j = 0;
		while (j < insertionPosition) {
			newArray[j] = inputArray[j];
			j++;
		}
//	System.out.println(Arrays.toString(newArray));
		// inserting new element.
		newArray[insertionPosition] = elementToInsert;
		// copy elements after the insertion element.
		int k = insertionPosition;
		while (k < inputArray.length) {
			newArray[k + 1] = inputArray[k];
			k++;
		}
//	System.out.println(Arrays.toString(inputArray));
//	System.out.println(Arrays.toString(newArray));
		inputArray = newArray; // this line doesnot copy the elements.it makes inputArray
								// refer to the same memory location as newArray.
								// inputArray forgets its old data and refers to newArray.
		System.out.println("the new inserted element array is:" + Arrays.toString(inputArray));
		// printing new array.
//	System.out.println("print new array");
//	int newArr=0;
//	while(newArr<inputArray.length) {
//		System.out.println(inputArray[newArr]+" ");
//		newArr++;
//	}
	}

//12.Search an element in an array
	static void searchAnElementInAnArray(Scanner sc) {
		System.out.println("\nenter the input array to Search an element in that array");
		System.out.println("enter the array size:");
		int n = sc.nextInt();
		System.out.println("enter the elements:");
		int inputArray[] = new int[n];
		int i = 0;
		while (i < inputArray.length) {
			inputArray[i] = sc.nextInt();
			i++;
		}
		System.out.println(Arrays.toString(inputArray));
		System.out.println("enter the search element:");
		int key = sc.nextInt();
		int j = 0;
		boolean keyFound = false;
		while (j < inputArray.length) {
			if (inputArray[j] == key) {
				System.out.println("the element is found at index:" + j);
				keyFound = true;
				break;
			}
			j++;
		}
		if (!keyFound) {
			System.out.println("the element is not found in the array");
		}
	}

//13.Find all factors of a number
	static void findAllFactorsOfANumber(Scanner sc) {
		System.out.println("enter the inputNumber to find all factors of a number");
		int inputNumber = sc.nextInt();
		System.out.println("the all factors of a number is:");
		int i = 1;
		while (i <= inputNumber) {
			if (inputNumber % i == 0) {
				System.out.println(i);
			}
			i++;
		}
	}

//14.Power of a number (base^exponent)	
	static void powerOfANumber(Scanner sc) {
		System.out.println("enter the inputs for finding the power of a number");
		System.out.println("enter the base input number:");
		int base = sc.nextInt();
		System.out.println("enter the exponent input number:");
		int exponent = sc.nextInt();
		int result = 1;
		int i = 0;
		while (i < exponent) {
			result = result * base;
			i++;
		}
		System.out.println("the power of a number " + base + "^" + exponent + " is:" + result);
	}

//15.Print characters from 'A' to 'Z'
	static void printCharactersFromAToZ(Scanner sc) {
		System.out.println("Print characters from 'A' to 'Z'");
		System.out.println("enter the start character:(A)");
		char start = sc.next().charAt(0);// next()-->read the word.//charAt()-->read the first character in a word.
		System.out.println("enter the end character:(Z)");
		char end = sc.next().charAt(0);
		System.out.println("the characters from 'A' to 'Z':");
		while (start <= end) {
			System.out.print(start + " ");
			start++; // Here means A = A+1; that means Characters behave like numbers when you do
						// math operations.so that now 65 = 65+1;
		}
	}

//16.Find duplicate characters in a string.
	static void findDuplicateCharactersInAString(Scanner sc) {
		System.out.println("enter the string to Find duplicate characters in a string");
		String str = sc.next();
		// create an array to count characters in a string
		int count[] = new int[116];
		int i = 0;
		while (i < str.length()) {
			char ch = str.charAt(i);
			count[ch]++; // count[ch]++ means count how many times the character appears.
			i++; // The actual characters are not stored inside count[],
					// only their frequency (how many times they appeared) is stored.
//	System.out.println(Arrays.toString(count));

		}

		System.out.println("the duplicate characters are:");
		int j = 0;
		while (j < count.length) {
			if (count[j] > 1) {
				char duplicateCharacter = (char) j;
				System.out.println(duplicateCharacter + " appears " + count[j] + " times");
			}
			j++;
		}
	}

//17.Remove white spaces from a string.
	static void removeWhiteSpacesFromAString(Scanner sc) {
		System.out.println("enter the string to remove white spaces from a string");
		String str = sc.nextLine();
		String result = "";
		int i = 0;
		while (i < str.length()) {
			char ch = str.charAt(i);
			if (ch != ' ') {
				result = result + ch;

			}
			i++;
		}
		System.out.println("string after removing the white spaces is:" + result);
	}

//18.Check if an array is sorted.
	static void checkIfAnArrayIsSorted(Scanner sc) {
		System.out.println("enter the input array to Check if an array is sorted");
		int inputArray[] = new int[6];
		int i = 0;
		while (i < inputArray.length) {
			inputArray[i] = sc.nextInt();
			i++;
		}
		System.out.println(Arrays.toString(inputArray));
		// Check if the array is sorted by comparing adjacent elements.
		boolean isSorted = true;
		int j = 1;
		while (j < inputArray.length) {
			if (inputArray[j - 1] > inputArray[j]) {
				isSorted = false;
				break;
			}
			j++;
		}
		if (isSorted) {
			System.out.println("the array is already sorted");
		} else {
			System.out.println("the array is not sorted");
		}
	}

//19.Convert lowercase to uppercase (manual, without .toUpperCase())
	static void convertLowercaseToUppercase(Scanner sc) {
		System.out
				.println("enter a lowercase string to Convert lowercase to uppercase (manual, without .toUpperCase())");
		String str = sc.nextLine();
		String result = "";
		int i = 0;
		while (i < str.length()) {
			char ch = str.charAt(i);
			if (ch == ' ') {
				i++;
				continue; // skip the white spaces.
			} else if (ch >= 'a' && ch <= 'z') {
				result = result + (char) (ch - 32);// type casting
			} else {
				result = result + ch;
			}
			i++;
		}
		System.out.println("the upperCase is:" + result);

	}

//20.Convert binary to decimal
	static void convertBinaryToDecimal(Scanner sc) {
		System.out.println("enter the binary number to Convert binary to decimal");
		int binary = sc.nextInt();
		int decimal = 0;
		int power = 1;
		while (binary != 0) {
			int result = binary % 10;
			decimal = decimal + result * power;
			binary = binary / 10;
			power = power * 2;

		}
		System.out.println("coverted decimal number is:" + decimal);
	}

}

