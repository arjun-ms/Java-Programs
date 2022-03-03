import java.io.*;
public class CopyContents {
    
    public static void main(String[] args) throws IOException {
        try{
            // to read data from a file
            FileReader fr =  new FileReader("input.txt");
            // to read the text from a character-base i/p stream
            BufferedReader br = new BufferedReader(fr);
            // to write characters into a file
            FileWriter fw = new FileWriter("output.txt");
            
            String s;

            // write until line is empty
            while((s = br.readLine()) != null){
                fw.write(s);
                fw.flush();
            }
            br.close();
            fw.close();
            System.out.println("File Copied");
        }
        catch(FileNotFoundException e){
            System.out.println(e);
        }
    }
}
