import java.io.*;

public class FileInputStreamDemo{
		public static void main(String args[]) throws IOException{
			try{
					FileInputStream fis = new FileInputStream("input.txt");
					FileOutputStream fos = new FileOutputStream("output.txt");
					int c;
					
					do{
						c = fis.read();
						if(c!=-1)
							fos.write((char)c);
					}while(c!=-1);
					System.out.println("File Copied!");
			}
			catch(FileNotFoundException e){
				System.out.println(e);
			}
		}
}
