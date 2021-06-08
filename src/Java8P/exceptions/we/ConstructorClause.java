package Java8P.exceptions.we;

public class ConstructorClause {
	
	
	
	
	ConstructorClause() throws Exception{
		
	}
	
	public static void main(String[] args) {
		
	}

}

class SubCLass extends ConstructorClause {

//	throws Exception  needs to be handled in subclass constructor
	SubCLass() throws Exception  {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
