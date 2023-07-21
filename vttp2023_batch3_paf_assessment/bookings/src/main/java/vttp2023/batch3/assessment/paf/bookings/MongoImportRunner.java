package vttp2023.batch3.assessment.paf.bookings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MongoImportRunner {


    public static void runMongoImportScript() {
        try {
            String scriptPath = "vttp2023_batch3_paf_assessment/data/mongo_import.txt"; // Replace with the actual path to your script
            ProcessBuilder processBuilder = new ProcessBuilder("sh", scriptPath);
            processBuilder.redirectErrorStream(true);

            Process process = processBuilder.start();

            // Read output from the process and print it
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            // Wait for the process to complete
            int exitCode = process.waitFor();
            System.out.println("Process exited with code: " + exitCode);

        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}

