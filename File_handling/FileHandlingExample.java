import java.io.*;

public class FileHandlingExample {

    public static void main(String[] args) {

        // Input and output file names
        String inputFile = "input.txt";
        String outputFile = "output.txt";

        int lineCount = 0;
        int wordCount = 0;

        try {
            // File reader
            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            String line;

            // Reading the file line by line
            while ((line = reader.readLine()) != null) {
                lineCount++;

                // Trim & split to count words
                if (!line.trim().isEmpty()) {
                    String[] words = line.trim().split("\\s+");
                    wordCount += words.length;
                }
            }

            reader.close();

            // Writing results to output file
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));

            writer.write("Total Lines: " + lineCount);
            writer.newLine();
            writer.write("Total Words: " + wordCount);

            writer.close();

            System.out.println("Processing completed! Check output.txt file.");

        } catch (FileNotFoundException e) {
            System.out.println("Error: Input file not found. Please create input.txt inside your project folder.");
        } catch (IOException e) {
            System.out.println("Error while reading or writing file: " + e.getMessage());
        }

    }
}
