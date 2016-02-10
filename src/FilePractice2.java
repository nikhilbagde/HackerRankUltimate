import java.io.File;
import java.io.IOException;

/**
 * Created by Nikhil on 1/4/2016.
 */
public class FilePractice2 {
    public static void main(String argsp[]){
         try{
             File objDirectory = new File("C:\\Users\\Nikhi\\IdeaProjects\\HackerRankUltimate\\mydir1");
             objDirectory.mkdir();

             File delFile1 = new File(objDirectory, "File1.txt");
             delFile1.createNewFile();
             File delFile2 = new File(objDirectory, "File2.txt");
             delFile2.createNewFile();

             System.out.println(objDirectory.delete());

             File NewFile1 = new File(objDirectory, "File3.txt");
             delFile2.renameTo(NewFile1);

             File NewDirectory = new File("C:\\Users\\Nikhi\\IdeaProjects\\HackerRankUltimate\\mydir2");
             objDirectory.renameTo(NewDirectory);

         }catch(IOException e){}

    }
}
