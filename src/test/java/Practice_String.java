import java.util.Scanner;

public class Practice_String {
    public static void main(String[] args) {
        System.out.println("Mời nhập chuỗi từ bàn phím ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        //     printUpperCases(str);
        //   printNonNumberic(str);
//        int a = countCharacterInArray(str,'a');
//        System.out.println("số ký tự a có trong mảng là " + a);

        //  countVowelAndConsonant(str);
        int count = countWord(str);
        System.out.println(count);

    }

    public static void printUpperCases(String str) {
        // char c;
        for (int i = 0; i <= str.length(); i++) {
            if (Character.isUpperCase(str.charAt(i))) {
                // c = str.charAt(i);
                //  if (c >= 'A' && c <= 'Z') {
                System.out.println(str.charAt(i));
            }
        }
    }

    public static void printNonNumeric(String str) {
        char c;
        for (int i = 0; i <= str.length(); i++) {
            c = str.charAt(i);
            if (c >= 'A' && c <= 'Z' || c >= 'a' && c <= 'z') {
                System.out.println(c);
            }

        }
    }

    public static int countCharacterInArray(String str, char c) {
        int count = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == c)
                count++;
        }
        return count;

    }

    public static int countWord(String str) {
        String[] str1 = str.split("\\s+");

        return str1.length;
    }


    public static void countVowelAndConsonant(String str) {
        int vowel = 0;
        int consonant = 0;
        char c;
        for (int i = 0; i < str.length(); i++) {
            c = str.charAt(i);
            if (c == 'e' || c == 'o' || c == 'u' || c == 'a' || c == 'i') {
                vowel++;
            } else if (c >= 'A' && c <= 'Z' || c >= 'a' && c <= 'z') {
                consonant++;
            }
        }
        System.out.println("vowerl is " + vowel);
        System.out.println("consonant is " + consonant);
    }


}
