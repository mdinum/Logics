package logics.words;

import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PalindromeWordsChecker {
    public static void main(String[] arg){
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        ArrayList<Character> wordCheck;
        int count;
        String scan = "";
        do {
            System.out.println();
            System.out.print("Enter Word : ");
            try {
                scan = scanner.nextLine().toLowerCase();
            } catch (Exception e){
                scan = null;
                System.err.println("Error in read Line :"+e.getMessage());
            }
            if(scan.isEmpty()||scan.length()<2||scan.isBlank()) continue;
            flag = true;
            wordCheck = new ArrayList<>(
                    scan.chars()
                            .mapToObj(e -> (char) e)
                            .collect(Collectors.toList()));
            count = wordCheck.size()-1;
            for (int i = 0;i<wordCheck.size()/2;i++){
                if(wordCheck.get(i) !=wordCheck.get(count)){
                    flag = false;
                    break;
                }
                count--;
            }
            if(flag){
                System.out.println(scan+" is palindrome word");
            } else {
                System.err.println(scan+" is NOT palindrome word");
            }
        } while(!scanner.equals("q"));
    }
}
