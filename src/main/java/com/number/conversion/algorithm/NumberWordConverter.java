package com.number.conversion.algorithm;

public class NumberWordConverter {

    public static final String[] ones = { "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen" };

    public static final String[] tens = {
      "", // 0
      "", // 1
      "twenty", // 2
      "thirty", // 3
      "forty", // 4
      "fifty", // 5
      "sixty", // 6
      "seventy", // 7
      "eighty", // 8
      "ninety" // 9
    };

    public static String getNumberIntoWords(final long number) {
        if (number == 0D) {
            return "";
        }
        long actualNumber = number;
        String prefix = "";
        try {
			char ch = String.valueOf(number).charAt(0);
			if(ch == '-') {
				actualNumber = Long.valueOf(String.valueOf(number).substring(1));				
				prefix = "minus ";
			}
		} catch (Exception e) {
			System.out.println("Exception occured during processing");
		}
        String numberPart = "";
        if (actualNumber > 0) {
        	numberPart = convert(actualNumber);
        }
        return prefix + numberPart;
    }

    private static String convert(final long n) {
        if (n < 20) {
            return ones[(int) n];
        }
        if (n < 100) {
            return tens[(int) n / 10] + ((n % 10 != 0) ? " " : "") + ones[(int) n % 10];
        }
        if (n < 1000) {
            return ones[(int) n / 100] + " hundred" + ((n % 100 != 0) ? " " : "") + convert(n % 100);
        }
        if (n < 1000000) {
            return convert(n / 1000) + " thousand" + ((n % 1000 != 0) ? " " : "") + convert(n % 1000);
        }
        if (n < 1000000000) {
            return convert(n / 1000000) + " million" + ((n % 1000000 != 0) ? " " : "") + convert(n % 1000000);
        }
        return convert(n / 1000000000) + " billion" + ((n % 1000000000 != 0) ? " " : "") + convert(n % 1000000000);
    }    
}