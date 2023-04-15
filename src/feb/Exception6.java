package feb;

public class Exception6 {

public static void agechecker(int age) throws InterruptedException 
{
	if(age<21) 
	{
		//throw exception  //object of class //Arithmatic
		throw new InterruptedException();
	}
	else 
	{
		System.out.println("You are able to vote");
	}
}
	public static void main(String[] args) throws InterruptedException {
	agechecker(20);
}
}

//app notes java 
Exception handling
exceptions
checked/unbchecked exception
keywords
diiference throw and thorows











