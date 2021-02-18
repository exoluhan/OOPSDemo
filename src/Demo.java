

	// Calling Constructor using this keyword
	class Demo
	{
	 Demo ()
	 {
		 // Calling constructor with single argument
	   this("Java Flair");
	 }
	 Demo(String str)
	 {
	     System.out.println(str);

	 }
	 
	 public static void main(String[] args)
	 {
		 
		 Demo d = new Demo();
	 }
	 
	}

