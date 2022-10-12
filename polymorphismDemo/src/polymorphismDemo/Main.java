package polymorphismDemo;

public class Main {

	public static void main(String[] args) {
			// polymorphism çok biçimlilik demektir.
		//BaseLogger[] loggers = new BaseLogger[] {new FileLogger(), new EmailLogger(), new DatabaseLogger(), new ConsoleLogger()};
			//base logger anne her loggerý içerir o yüzden baselogger yazarýz .fileLogger yazsak olmazdý. 
			//filelogger baseloggerý tutamaz ama baselogger istediði her log tipini tutabilir.
		//for (BaseLogger logger:loggers) {
			//logger.Log("Log mesajý");}
		CustomerManager customerManager = new CustomerManager(new DatabaseLogger());
		customerManager.add();
		
		}
		
	}

