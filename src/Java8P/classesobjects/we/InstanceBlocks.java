package Java8P.classesobjects.we;

public class InstanceBlocks {
	
	InstanceBlocks(){
		
		message("Constructor");
	g =	message("Constructor d ",d);
	}
	
	static int exeCounter = 0;
	
	{
		message("in Initilizer Block");
	}
	
	int a = message("in assignmenr to veriable");
	
	{
		message("in  Initilizer Block");
	}
	
	int b = message("in  assignmenr to veriable");
	int c = message("in  assignmenr to veriable");
	
	
	
	int d = message("in  assignmenr to veriable d");
	{
		message("in  Initilizer Block d ",d);
	}
	
	int e = message("in  assignmenr to veriable d",d);
	
	int g;
	
	public static void main(String[] args) {
		
//		exeCounter++;
		
		InstanceBlocks instanceBlocks = new InstanceBlocks();
		
		instanceBlocks.message("in Main",instanceBlocks.g);
	}
	
	public int message(String exeLocation) {
		exeCounter++;
		System.out.println(exeCounter +" : "+exeLocation);
		return exeCounter;
		
	}
	
	public int message(String exeLocation, int assignedCounter) {
		exeCounter++;
		System.out.println(exeCounter +" : "+exeLocation +" : "+ assignedCounter);
		return exeCounter;
		
	}

}
