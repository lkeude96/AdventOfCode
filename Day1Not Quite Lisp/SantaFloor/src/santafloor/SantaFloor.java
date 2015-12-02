package santafloor;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Kinsley
 */
public class SantaFloor {
    public static void part1() {
        File file = new File("input.txt");
        
        Scanner sc = null;
        try {
            sc = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        
        int fl = 0;
        String in = sc.next();
        
        for(int i = 0; i < in.length(); i++) {
            char c = in.charAt(i);
            
            if(c == '(' ) {
                fl++;
            } else {
                fl--;
            }
        }
        
        System.out.println(fl);
        sc.close();
    }
    
    public static void part2() {
        File file = new File("input.txt");
        
        Scanner sc = null;
        try {
            sc = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        
        int fl = 0;
        String in = sc.next();
        
        for(int i = 0; i < in.length(); i++) {
            char c = in.charAt(i);
            
            if(c == '(' ) {
                fl++;
            } else {
                fl--;
            }
            System.out.println(fl);
            // Part 2
            if(fl == -1) {
                System.out.println(i+1);
                break;
            }
        }
        sc.close();
    }
    
    public static void main(String[] args) {
        part1();
        part2();
    }
    
}
