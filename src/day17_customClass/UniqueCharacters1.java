package day17_customClass;

public class UniqueCharacters1 {

    public static void main(String[] args) {

        String str = "aabcccd"; // unique here is character that occured only once
        String unique = "";

        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);

            if(str.indexOf(each) == str.lastIndexOf(each)){
                unique += each;

            }

        }

        System.out.println(unique);
    }

}
   /* Write a program that can find the unique characters from a String
			Ex:
                    str = "aabcccd"

                    output:
                    bd

    */