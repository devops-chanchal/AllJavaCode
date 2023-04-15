package feb;

public class Operators1 {
	public static void main(String[] args) {
	
		int x=100;
		int y=100;
		
		System.out.println(x++);   //100     101   x=x+1  //post increment
	//	System.out.println(x++);     //101   102
	//	System.out.println(x++);  //102       103
		
	//	System.out.println(++y);   //pre increment   //101
	//	System.out.println(++y);     //102
	//	System.out.println(++y);    //103
		
		System.out.println(x++ + ++x);    // 202 101 +103                   //204        //100+102=203
        System.out.println(x + x++);   //103 +103    //206
        System.out.println(y++ + y--);    //100+ 101    201         y=100
        System.out.println(y++ + y--);  //100 + 101 =201
        System.out.println(y);    //100
		
		
		//H.w same example you can do it with increment replace decrement  
		
}

}
