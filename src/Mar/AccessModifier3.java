package Mar;

import feb.AccessModifier;

//child                 //parent                               
//child can access property of parent
public class AccessModifier3 extends AccessModifier {  //import to resolve the error
	
	public static void main(String[] args) {
		
	
		AccessModifier3 obj=new AccessModifier3();    //child class object always
	obj.method1();  //outside package //Default method 
	//subclass relationship  //it should not be able to access
	}
}
