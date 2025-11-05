package ps.day22;

import java.util.Scanner;

public class Strings {

    public static void main(String[] args) {

        // String pool vs heap examples
        String str1 = "Tony";                      // stored in String Pool
        String str2 = "Tony";                      // refers to same object in Pool
        String str3 = new String("Tony");          // explicitly in Heap
        StringBuilder sb = new StringBuilder("Tony"); // mutable object in Heap

        // Reference comparison (== checks memory reference)
        System.out.println("str1 == str2 : " + (str1 == str2));         // true
        System.out.println("str1 == str3 : " + (str1 == str3));         // false
        System.out.println("str1 == sb.toString() : " + (str1 == sb.toString())); // false

        // Content comparison (always use equals)
        System.out.println("str1.equals(str3) : " + str1.equals(str3)); // true
        System.out.println("str1.equals(sb.toString()) : " + str1.equals(sb.toString())); // true

        // Input with Scanner
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your first name: ");
        String first_name = sc.nextLine();   // use nextLine for full input

        System.out.print("Enter your last name: ");
        String last_name = sc.next();    // reads data until space

        sc.close();

        // Concatenation
        String fullname = first_name + " " + last_name;
        System.out.println("Your full name is: " + fullname);
    }
}
