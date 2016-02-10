import java.io.File;
import java.io.IOException;

/**
 * Created by Nikhil on 1/4/2016.
 */
public class FileSearch {
    public static void main(String[] args) {
        try {
            File objDirectory = new File("C:\\Users\\Nikhi\\IdeaProjects\\HackerRankUltimate\\mydir2");

            File File_Search = new File(    "SearchFile.txt");
            File_Search.createNewFile();
            System.out.println(File_Search.exists());

            String [] files = new String[100];
            files = File_Search.list();

            for(String a:files)
                System.out.println("Found " + a);

        }catch (IOException e){}
    }
}
