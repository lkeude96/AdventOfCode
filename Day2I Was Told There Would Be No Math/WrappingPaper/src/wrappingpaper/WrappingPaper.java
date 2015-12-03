package wrappingpaper;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Kinsley
 */
public class WrappingPaper {
    public static void part1() {
        File file = new File("input.txt");
        
        Scanner sc = null;
        try {
            sc = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        
        int total = 0;
        while(sc.hasNext()){
            String[] dimention = sc.next().split("x");
            int l = Integer.parseInt(dimention[0]);
            int w = Integer.parseInt(dimention[1]);
            int h = Integer.parseInt(dimention[2]);
            
            total += 2*l*w + 2*w*h + 2*h*l + Math.min(l*w,Math.min(w*h, h*l));
        }
        
        System.out.println(total);
        
        sc.close();
    }
    
    public static void main(String[] args) {
        part1();
    }
    
}
