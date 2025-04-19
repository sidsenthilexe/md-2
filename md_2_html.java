import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileWriter;


public class md_2_html {
    public static void main(String[] args) {
        try {
            // user entered path for the original file
            Scanner file_path = new Scanner(System.in);
            System.out.println("Enter file path:" );
            String file_name = file_path.nextLine();

            // user entered path for the destination file
            Scanner output_path_input = new Scanner(System.in);
            System.out.println("Enter the destination path (omitting .html): ");
            String output_path = output_path_input.nextLine() + ".html";
            
            // point to the original file
            File file = new File(file_name);
            Scanner read_file = new Scanner(file);

            // create the output file, set up writing to the output
            File new_file = new File(output_path);
            new_file.createNewFile();
            FileWriter write_output = new FileWriter(output_path);

            // repeat for each line in the original file
            while (read_file.hasNextLine()) {
                // read the next line of original data
                String line_data = read_file.nextLine();
                // write the data to the output file
                write_output.write(line_data + System.lineSeparator());
                
            }
            System.out.println("Write completed");
            // close
            file_path.close();
            read_file.close();
            write_output.close();
            output_path_input.close();

        } catch (FileNotFoundException exception) {
            System.out.println(exception);
            exception.printStackTrace();
        } catch (IOException exception) {
            System.out.println(exception);
            exception.printStackTrace();
        }
    }
}