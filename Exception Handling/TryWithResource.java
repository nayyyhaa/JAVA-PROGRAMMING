import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Shows the usage of the try-with-resource statement.
 * The input to the program is not important for this example.
 * Note how the resources in the try statement do not need explicit closing.
 * This is done automatically and it does not matter if the try block completes normally or with an exception.
 * This works for all resources which implement the AutoCloseable interface.
 */
public class TryWithResource {

	public static void printFile(String filePath) {
		try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
			System.out.println("Contents of File: ");
			String line;
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
		} catch (FileNotFoundException e) {
			System.err.println("Could not find file.");
		} catch (IOException e) {
			System.err.println("Could not read from file.");
		}
	}

	public static void main(String args[]) {
		if (args.length != 1) {
			System.err.println(
					"TryWithResource takes exactly 1 parameter. The parameter needs to pass the path to the file to read.");
			return;
		}
		printFile(args[0]);
	}
}
