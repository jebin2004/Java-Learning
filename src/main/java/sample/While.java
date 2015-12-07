package sample;

public class While {
	public static void main(String[] args){
		int x = 10;
		while(x>5){
			System.out.println(x);
			x--;
		}
		do{
			System.out.println("second line " + x);
			x--;
		}while(x>0);
	}

}
