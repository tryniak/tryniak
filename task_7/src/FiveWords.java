import java.util.Scanner;

public class FiveWords {

   static String[] words = new String[5];
    public String[] inputWords(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input 5 words");
        for (int i =0;i<words.length;i++){
            words[i] = sc.next();
        }
        return words;
    }
    public void longerstWord(){
        String tmp = null;

        for (int i =0;i<words.length-1;i++) {
            if (words[i].length() < words[i + 1].length()) tmp = words[i + 1];
            else tmp = words[i] ;
        }
        System.out.println("Longest word is " + tmp);
    }
    public static String reverse (){
        String str = "";
        for (int i =words[2].length() - 1; i >=0;--i){
            str +=words[2].charAt(i);
        }
        return str;
    }
    public void numberLetters(){
        int tmp= 0;
        for (int i =0;i<words.length;i++){

            tmp+= words[i].length();
        }
        System.out.println("Nambers letters = " + tmp);
    }
    public static void main(String[] args) {
        FiveWords fiveWords = new FiveWords();
        fiveWords.inputWords();
        fiveWords.longerstWord();
        fiveWords.numberLetters();
        System.out.println("Second word in reverse order" + reverse());
    }
}
