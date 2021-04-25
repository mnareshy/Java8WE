package Java8P.methods.we;

import Java8P.methods.we.AbStaticLogger.Logger;

public class StaticClassesFieldsMembs {

	public static void main(String[] args) {


		AbStaticLogger.logger = new LoggerImpl();
		AbStaticLogger.log("some message");
		
		
		AbStaticLogger.Logger log = new LoggerImpl();
		
		log.log("AbStaticLogger.Logger log");
		
		AbStaticLogger.Logger log1 = new Logger() {
			
			@Override
			void log(String logMessage) {
				// TODO Auto-generated method stub
				System.out.println("Anonious "+logMessage);
				
			}
		};
	
		log1.log("AbStaticLogger.Logger log");
	}




}


class AbStaticLogger{


	static abstract class Logger{

		abstract void log(String logMessage);
	}

	static Logger logger;

	static void log(String message) {

		logger.log(message);
	}

}


class LoggerImpl extends AbStaticLogger.Logger{

	@Override
	void log(String logMessage) {
		// TODO Auto-generated method stub

		System.out.println(logMessage);
		

	}
	

	

}
