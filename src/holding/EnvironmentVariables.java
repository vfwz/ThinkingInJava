package holding;

import java.util.Map;

// this code displays all the operating system environment variables.
// P433
public class EnvironmentVariables {
	public static void main(String[] args) {
		for(Map.Entry<String,String> entry: System.getenv().entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
	}
}
