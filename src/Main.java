import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main extends Exception{
	public static void main(String[] args) throws FileNotFoundException {
//        System.out.print("args[1]: "+args[1]);
		BufferedReader in = new BufferedReader(new FileReader("fechamento.txt"));
	}
}
