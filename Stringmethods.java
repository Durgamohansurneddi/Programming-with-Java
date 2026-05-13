public class Stringmethods {
    public static void main(String[] args) {
        String name="java programming";
        //length() method is used to find the length of the string.
        System.out.println(name.length());

        //toUpperCase() method is used to convert the string into uppercase.
        System.out.println(name.toUpperCase());

        //toLowerCase() method is used to convert the string into lowercase.
        System.out.println(name.toLowerCase());

        //charAt() method is used to find the character at a specific index.
        System.out.println(name.charAt(5));

        //indexOf() method is used to find the index of a specific character or substring.
        System.out.println(name.indexOf("programming"));

        //substring() method is used to extract a part of the string.
        System.out.println(name.substring(5, 16));
        System.out.println(name.substring(2));

        //replace() method is used to replace a specific character or substring with another character or substring.
        System.out.println(name.replace("java", "python"));

        //trim() method is used to remove the leading and trailing spaces from the string.
        String name2="   java programming   ";
        System.out.println(name2.trim());

        //equals() method is used to compare two strings for equality.
        String name3="java programming";
        System.out.println(name.equals(name3));

        //equalsIgnoreCase() method is used to compare two strings for equality ignoring the case.
        String name4="JAVA PROGRAMMING";            
        System.out.println(name.equalsIgnoreCase(name4));

        //Startswith() method is used to check if the string starts with a specific character or substring.
        System.out.println(name.startsWith("ja"));

        //endsWith() method is used to check if the string ends with a specific character or substring.
        System.out.println(name.endsWith("ing"));

        //charat() method is used to find the character at a specific index.
        System.out.println(name.charAt(5));

        //indexOf() method is used to find the index of a specific character or substring.
        System.out.println(name.indexOf("programming"));
        System.out.println(name.indexOf("a", 5)); // it will find the index of 'a' starting from index 5.

        //LastindexOf() method is used to find the last index of a specific character or substring.
        System.out.println(name.lastIndexOf("a"));
        System.out.println(name.lastIndexOf("a", 4)); // it will find the last index of 'a' starting from index 4.
        System.out.println(name.lastIndexOf("j", 0)); // it will find the last index of 'j' starting from index 0. it will return -1 because there is no 'j' in the string.



    
    }
}
