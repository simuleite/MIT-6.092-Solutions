import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class MagicSquares {
    public static boolean isMagicRow(String path) {
        // 1. Read the file line by line
        // 2. Examine whether the sum of each line is equal.
        String[] lineStrings;
        int preSum = -1, sum = -1;
        FileReader fr;
        BufferedReader br;
        String line;

        try {
            fr = new FileReader(path);
            br = new BufferedReader(fr);

            while ((line = br.readLine()) != null) {
                if (line.equals("")) // Block the empty line
                    continue;

                lineStrings = line.split("\t");

                preSum = sum;
                sum = 0;
                for (String lnStr: lineStrings) { // Avoid "uninitialize" problem.
                    // System.out.println(i + " " + lineNums[i]);
                    sum += Integer.valueOf(lnStr); 
                }
                if (preSum != sum && preSum != -1)
                    return false;
            }
            br.close();           

            return true;
        } catch (FileNotFoundException err) {
            System.err.println(path + " Not Found!");
            return false;
        } catch (IOException err) {
            System.err.println("File has no line!");
            return false;
        }
    }

    public static boolean testMagic(String pathName) throws IOException {
        // Open the file
        BufferedReader reader = new BufferedReader(new FileReader(pathName));

        boolean isMagic = true;
        int lastSum = -1;
        
        // For each line in the file ...
        String line;
        while ((line = reader.readLine()) != null) {
            // ... sum each row of numbers
            if (line.equals("")) // Block the empty line
                    continue;
            String[] parts = line.split("\t");
            int sum = 0;
            for (String part : parts) {
                sum += Integer.parseInt(part);
            }

            if (lastSum == -1) {
                // If this is the first row, remember the sum
                lastSum = sum;
            } else if (lastSum != sum) {
                // if the sums don't match, it isn't magic, so stop reading
                isMagic = false;
                break;
            }
        }
        
        reader.close();
        return isMagic;
    }

    public static void main(String[] args) throws IOException {
        if(isMagicRow("./Luna.txt"))
            System.out.println("Each line of Luna is equal!");
        if(isMagicRow("./Mercury.txt"))
            System.out.println("Each line of Murcury is equal!");
        
        // The answer
        String[] fileNames = { "Mercury.txt", "Luna.txt" };
        for (String fileName : fileNames) {
            System.out.println(fileName + " is magic? " + testMagic(fileName));
        }
    }
}