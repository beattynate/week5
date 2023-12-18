package week5;

public class AsteriskLogger implements Logger {
	
	@Override
	public void log(String word) {
		System.out.println("***" + word + "***");
	}

	@Override
	public void error(String word) {
		String err = "***Error: " + word + "***";
		System.out.println("*".repeat(err.length()));
		System.out.println(err);
		System.out.println("*".repeat(err.length()));
		
		
	}}
