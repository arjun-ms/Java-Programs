import java.util.Scanner;

class Box{
		private int width,height,length;
		
		Box(int width,int height,int length){
				this.width = width;
				this.height = height;
				this.length = length;
		}
		
		int volume(){
			return width*height*length;
		}
}

public class BoxDemo{
	public static void main(String args[]){
		int height,width,length;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter width: ");
		width = sc.nextInt();
		System.out.println("Enter height: ");
		height = sc.nextInt();
		System.out.println("Enter length: ");
		length = sc.nextInt();
		
		Box mybox = new Box(width,height,length);
		int vol = mybox.volume();
		System.out.println("Volume: "+vol);
	}
}
