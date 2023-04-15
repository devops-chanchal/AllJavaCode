package feb;
             //child                //parent
public class InheritanceDog extends InhritanceAnimal { //signle Inheritance
	//var //method
	String bred;  //child property
	
	
	
	public static void main(String[] args) {
		
		InheritanceDog dog1=new InheritanceDog();                            //obj create //child
		
		dog1.bred="pug";      //child
		dog1.name="noddy";   //coming from parent
		dog1.color="white";
		
		System.out.println("My dog name is :-->"+dog1.name);
		System.out.println("My dog color is:->"+dog1.color);
		System.out.println("My dog bred is :-->"+dog1.bred);
	
		
		InhritanceAnimal dog2=new InhritanceAnimal();
	//	dog2.bred="abc";  //parent class object
		
		
		
		
		
	}
	
	
	
	

}
