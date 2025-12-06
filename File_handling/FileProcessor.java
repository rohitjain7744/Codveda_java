import java.io.*;

public class FileProcessor {
    public static void main(String[] args) {

        String inputFile = "input.txt";
        String outputFile = "output.txt";

        int lineCount = 0;
        int wordCount = 0;

        try {
            // Reading the file
            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            String line;

            while ((line = reader.readLine()) != null) {
                lineCount++;

                // Split words by spaces
                String[] words = line.trim().split("\\s+");

                // Check for empty lines
                if (!line.trim().isEmpty()) {
                    wordCount += words.length;
                }
            }
            reader.close();

            // Writing processed data into a new file
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));

            writer.write("Total Lines: " + lineCount);
            writer.newLine();
            writer.write("Total Words: " + wordCount);

            writer.close();

            System.out.println("Processing completed! Check output.txt file.");

        } catch (FileNotFoundException e) {
            System.out.println("Error: Input file not found!");
        } catch (IOException e) {
            System.out.println("Error reading or writing file: " + e.getMessage());
        }
    }
}
