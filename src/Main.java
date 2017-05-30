/**
 *
 * @author Scott Pantall
 */
import java.io.*;
import java.nio.file.*;

public class Main {
    public static void main (String[] args) throws IOException {
        Path file = Paths.get(args[0]);
        BufferedReader buffer = Files.newBufferedReader(file);
        String line;
        
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            //System.out.println(line);
            HextoDec(line);
        }
    }
    
    public static void HextoDec(String line) {
        //System.out.println(line);
        int decValue = 0;
        char[] numbers = line.toCharArray();
        
        for(int i = 0; i < numbers.length; i++) {
            int digitValue = 0;
            
            if(Character.getNumericValue(numbers[i]) == -1) {
                // Character is a letter
                switch(numbers[i]) {
                    case 'a': digitValue = 10;
                              break;
                    case 'b': digitValue = 11;
                              break;
                    case 'c': digitValue = 12;
                              break;
                    case 'd': digitValue = 13;
                              break;
                    case 'e': digitValue = 14;
                              break;
                    case 'f': digitValue = 15;
                              break;
                }
                
                decValue += digitValue * Math.pow(16, (numbers.length - (i + 1)));
            }
            else {
                decValue += Character.getNumericValue(numbers[i]) * Math.pow(16, (numbers.length - (i + 1)));
            }
        }
        
        System.out.println(decValue);
    }
}
