/**
 * **************************************************
 * Echo program without handling try..catch 
 * Compilation: javac Echo.java
 * Execution: java Echo "hey" "kumar" "how you doing?" 
 * Output: 
 * Hey kumar how you doing?
 *
 ****************************************************/
public class Echo {

	public static void main(String[] args) {
		// try {
		System.out.print(args[0] +" "); 
		System.out.print(args[1] +" ");
		System.out.println(args[2]);
		// }
		/* catch(ArrayIndexOutOfBoundsException aibe) {
		    aibe.printStackTrace();
			System.err.println("\"Specific message\" " +aibe.getMessage());
		}*/
	}
}
