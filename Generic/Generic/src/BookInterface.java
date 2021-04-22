import java.util.Scanner;

public class BookInterface<T> implements Writer<T>{
	Scanner sc = new Scanner(System.in);

	@Override
	public void write(T obj) {
		System.out.println(obj); 
	}
	
}
