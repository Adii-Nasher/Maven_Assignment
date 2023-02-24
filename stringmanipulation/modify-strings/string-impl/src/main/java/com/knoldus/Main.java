import com.knoldus.StringUtils;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = scanner.nextLine();

        StringUtils stringUtils = new StringUtils();

        String reversedString = stringUtils.reverseString(str);
        int stringLength = stringUtils.getStringLength(str);

        System.out.println("Reversed string: " + reversedString);
        System.out.println("String length: " + stringLength);
    }
}
