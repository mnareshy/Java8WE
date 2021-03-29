package Java8P.classesobjects.we;

public class StaticInitilizattoinBlocks {
	
	StaticInitilizattoinBlocks(){
		
		message("Constructor");
	}
	
	static int exeCounter = 0;
	
	static{
		message("in Static Initilizer Block");
	}
	
	static int a = message("in Static assignmenr to veriable");
	
	static{
		message("in Static Initilizer Block");
	}
	
	int c = message("in  assignmenr to veriable");
	
	
	
	int d = message("in  assignmenr to veriable d");
	{
		message("in  Initilizer Block d ",d);
	}
	
	int e = message("in  assignmenr to veriable d",d);
	
	int g;
	
	public static void main(String[] args) {
		
//		exeCounter++;
		
//		StaticInitilizattoinBlocks instanceBlocks ;
		
//		instanceBlocks.message("in Main",instanceBlocks.g);
	}
	
	public static int message(String exeLocation) {
		exeCounter++;
		System.out.println(exeCounter +" : "+exeLocation);
		return exeCounter;
		
	}
	
	public static int message(String exeLocation, int assignedCounter) {
		exeCounter++;
		System.out.println(exeCounter +" : "+exeLocation +" : "+ assignedCounter);
		return exeCounter;
		
	}

}
