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
        System.out.println(line);
    }
}
