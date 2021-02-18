
public class StringBufferDemo1 {

	public static void main(String[] args) {
		
		// StringBuffer str= new StringBuffer(); // allocate a space for 16 characters
		
		StringBuffer str= new StringBuffer("JamesGosling"); //allocates 12+ 16 character spaces
		int l= str.length();
		System.out.println("The string : "+str);
		
		System.out.println("Length of the string is:"+l);
		
		System.out.println("The capacity of string is: "+ str.capacity());  // 28=12+16
		
		System.out.println("The substring: "+str.substring(0, 5)); // returns string from starting index to length -1
		
		str.replace(5, 10,"Java");
		System.out.println("The replaced string is: "+str);
		
		str.delete(2, 5);
		System.out.println("The deleted sting is: "+str);
		
		System.out.println("The reverse string: "+str.reverse());
		
		

	}

}
