import java.io.*;
import java.nio.Buffer;

/**
 * Created by Nikhil on 1/4/2016.
 */
public class FilePratice {
    public static void main(String args[]){
        char [] input = new char[100];
        int size =0;
        try{

            File mydirObj = new File("C:\\Users\\Nikhi\\IdeaProjects\\HackerRankUltimate\\mydir");
            mydirObj.mkdir();

            File file = new File(mydirObj,"abc.txt");

            PrintWriter pw = new PrintWriter(file);
            System.out.println(file.exists());

            pw.println("Hi Nikhil");
            pw.println("HOw are you!");
            pw.flush();
            pw.close();

            FileReader fr = new FileReader(file);
            BufferedReader bf = new BufferedReader(fr);
            /*fr.read(input);
            for(char c:input)
            System.out.print(c);
            fr.close();*/
            String data = bf.readLine();
            System.out.print(data);

        }catch(IOException e){}
    }

}
