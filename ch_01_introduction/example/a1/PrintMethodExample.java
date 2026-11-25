package core_java.basics.ch_01_introduction.example.a1;

// The print() Method
// The only difference is that it does not insert a new line 
// at the end of the output

public class PrintMethodExample {

	public static void main(String[] args) {
		// print() => only print
		// it will not create a new line after printing
		System.out.print("Hello");
		System.out.print(" ");
		System.out.print("World");
		System.out.println("Sun Shine");

		// It mandatory to pass something in print method
		// otherwise it will show error
//		System.out.print();
		System.out.print("Java");
	
	}

}
