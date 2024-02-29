import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'twoStrings' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. STRING s1
     *  2. STRING s2
     */


    public static int num_of_occurances(String s1, String s2){
        ArrayList<Character> a = new ArrayList<>();
        ArrayList<Character> b = new ArrayList<>();

        int count = 0;


        for (int i = 0; i < s1.length(); i++) {
            a.add(i, s1.charAt(i));
        }

        for (int i = 0; i < s2.length(); i++) {
            b.add(i, s2.charAt(i));
        }

        for(int i=0; i< b.size(); i++) {
            char letter = b.get(i);
            if(a.contains(letter)){
                count++;
            }
        }
        return count;
    }

    public static String twoStrings(String s1, String s2) {

        String result;

        if(num_of_occurances(s1, s2) >= 1){
            result = "YES";
        }
        else{
            result = "NO";
        }
        return result;
    }
}



public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        for (int qItr = 0; qItr < q; qItr++) {
            String s1 = bufferedReader.readLine();

            String s2 = bufferedReader.readLine();


            String result = Result.twoStrings(s1, s2);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedReader.close();
        bufferedWriter.close();
    }
}


