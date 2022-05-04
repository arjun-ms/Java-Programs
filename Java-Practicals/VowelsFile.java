import java.io.*;

public class VowelsFile{
	public static void main(String args[]) throws IOException{
		FileInputStream fin = new FileInputStream("input.txt");
		FileOutputStream fout = new FileOutputStream("output.txt");
		char vowels[] = new char[]{'a','e','i','o','u'};
		int c;
		do{
			c = fin.read();
			if(c!=-1){
				for(int i=0;i<5;i++){
					if((char)c==vowels[i]){
						fout.write((char)c);
					}
				}
			}
		}while((c!=-1));
		System.out.println("Vowels Copied");
	}
}
