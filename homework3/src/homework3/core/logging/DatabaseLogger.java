package homework3.core.logging;

public class DatabaseLogger implements Logger{

	@Override
	public void log(String data) {
		System.out.println("Veri taban�na logland� : " + data);
		
	}

}
