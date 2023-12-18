package week5;

public class SpacedLogger implements Logger {
	//String space = "";
	private String spaced(String w) {
		String space = "";
		for (int i = 0; i < w.length(); i++) {
			space += w.charAt(i) + " "; 
	}
	return space;}
	
	@Override
	public void log(String word) {
		System.out.println(spaced(word));
		
		
	}

	@Override
	public void error(String word) {
		System.out.println("Error: " + spaced(word));
		
	}

}
