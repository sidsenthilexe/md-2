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

            String html_file_start = "<!DOCTYPE html>\n<html>\n<body>";
            String html_file_end = "</body>\n</html>";

            String start_tag = "";
            String end_tag = "";
            String line_data_trimmed = "";
            Boolean is_bold = false;
            Boolean is_italic = false;
            String current_word = "";
            String file_content = "";
            while (read_file.hasNextLine()) {
                file_content += read_file.nextLine() + System.lineSeparator();
            }

            write_output.write(html_file_start + System.lineSeparator());

            String[] characters = file_content.split("");
            for (String c : characters) {
                if (c.equals("#")) {
                    
                }
            }


            // // repeat for each line in the original file
            // while (read_file.hasNextLine()) {
            //     // read the next line of original data
            //     String line_data = read_file.nextLine();

            //     // split using spaces
            //     String[] split_line = line_data.split("\\s+");

            //     // take the tag from the first part of the line
            //     String md_tag = split_line[0];

            //     // convert md tag into html
            //     if (md_tag.equals("#")) {
            //         // heading 1
            //         start_tag = "<h1>";
            //         end_tag = "</h1>";
            //         line_data_trimmed = line_data.substring(md_tag.length() + 1);
            //     } else if (md_tag.equals("##")) {
            //         // heading 2
            //         start_tag = "<h2>";
            //         end_tag = "</h2>";
            //         line_data_trimmed = line_data.substring(md_tag.length() + 1);
            //     } else if (md_tag.equals("###")) {
            //         // heading 3
            //         start_tag = "<h3>";
            //         end_tag = "</h3>";
            //         line_data_trimmed = line_data.substring(md_tag.length() + 1);
            //     } else if (md_tag.equals("####")) {
            //         // heading 4
            //         start_tag = "<h4>";
            //         end_tag = "</h4>";
            //         line_data_trimmed = line_data.substring(md_tag.length() + 1);
            //     } else if (md_tag.equals("**") || md_tag.equals("__")) {
            //         // bold
            //         start_tag = "<p><b>";
            //         end_tag = "</p></b>";
            //         line_data_trimmed = line_data.substring(md_tag.length() + 1, line_data.length() - 3);
            //     } else if (md_tag.equals("*") || md_tag.equals("_")) {
            //         // italic
            //         start_tag = "<p><i>";
            //         end_tag = "</p></i>";
            //         line_data_trimmed = line_data.substring(md_tag.length() + 1, line_data.length() - 2);
            //     } else if (md_tag.equals("***")) {
            //         // bold + italic
            //         start_tag = "<p><b><i>";
            //         end_tag = "</p></b></i>";
            //         line_data_trimmed = line_data.substring(md_tag.length() + 1, line_data.length() - 4);
            //     } else {
            //         start_tag = "<p>";
            //         end_tag = "</p>";
            //         line_data_trimmed = line_data;
            //     }

            //     // write the data to the output file
            //     write_output.write(start_tag + line_data_trimmed + end_tag + System.lineSeparator());
            // }
            write_output.write(html_file_end);
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