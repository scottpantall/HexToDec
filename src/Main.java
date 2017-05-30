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
            if(Character.getNumericValue(numbers[i]) == -1) {
                // Character is a letter
                switch(numbers[i]) {
                    case 'a': decValue += 10 * Math.pow(16, (numbers.length - (i + 1)));
                              break;
                    case 'b': decValue += 11 * Math.pow(16, (numbers.length - (i + 1)));
                              break;
                    case 'c': decValue += 12 * Math.pow(16, (numbers.length - (i + 1)));
                              break;
                    case 'd': decValue += 13 * Math.pow(16, (numbers.length - (i + 1)));
                              break;
                    case 'e': decValue += 14 * Math.pow(16, (numbers.length - (i + 1)));
                              break;
                    case 'f': decValue += 15 * Math.pow(16, (numbers.length - (i + 1)));
                              break;
                }
            }
            else {
                decValue += Character.getNumericValue(numbers[i]) * Math.pow(16, (numbers.length - (i + 1)));
            }
        }
        
        System.out.println(decValue);
    }
}
