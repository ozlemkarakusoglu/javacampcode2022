package polymorphismDemo;

public class Main {

	public static void main(String[] args) {
			// polymorphism �ok bi�imlilik demektir.
		//BaseLogger[] loggers = new BaseLogger[] {new FileLogger(), new EmailLogger(), new DatabaseLogger(), new ConsoleLogger()};
			//base logger anne her logger� i�erir o y�zden baselogger yazar�z .fileLogger yazsak olmazd�. 
			//filelogger baselogger� tutamaz ama baselogger istedi�i her log tipini tutabilir.
		//for (BaseLogger logger:loggers) {
			//logger.Log("Log mesaj�");}
		CustomerManager customerManager = new CustomerManager(new DatabaseLogger());
		customerManager.add();
		
		}
		
	}

