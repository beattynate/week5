package week5;

public class App {

	public static void main(String[] args) {
		String word = "Hello";
		Logger aLogger = new AsteriskLogger();
		Logger sLogger = new SpacedLogger();
		aLogger.log(word);
		aLogger.error(word);
		sLogger.log(word);
		sLogger.error(word);

	}

}
