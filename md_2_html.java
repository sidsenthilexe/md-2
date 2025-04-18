import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class md_2_html {
    public static void main(String[] args) {
        try {
            Scanner file_path = new Scanner(System.in);
            System.out.println("Enter file path:" );
            String file_name = file_path.nextLine();

            File file = new File(file_name);
            Scanner read_file = new Scanner(file);
            while (read_file.hasNextLine()) {
                String line_data = read_file.nextLine();
                System.out.println(line_data);
            }
            file_path.close();
            read_file.close();

        } catch (FileNotFoundException exception) {
            System.out.println(exception);
            exception.printStackTrace();
        }
    }
}