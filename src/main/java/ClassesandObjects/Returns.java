package ClassesandObjects;

public class Returns {
	static int sum(int x, int y){
		return x+y;
	}
	static int max(int x, int y){
		if(x>y){
			return x;
		}else{
			return y;
		}
	}
	
	public static void main(String[] args) {
		int x = sum(2,23);
		System.out.println(x);
		int y = max(32,23);
		System.out.println(y);
	}

}
