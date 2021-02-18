
public class GenericMethodTest {
	
	//generic method printArray
	public static<E> void PrintArray( E[] inputArray)
	{
		for( E element: inputArray)
		{
			System.out.printf("%s ", element);
			// System.out.println(element);
		}
		System.out.println();
	}

	public static void main(String[] args) {
		
		// Create arrays of Integer, Double and Character
        Integer[] intArray = { 1, 2, 3, 4, 5 };
        Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4 };
        Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };

        System.out.println( "Array integerArray contains:" );
        PrintArray( intArray  ); // pass an Integer array

        System.out.println( "\nArray doubleArray contains:" );
        PrintArray( doubleArray ); // pass a Double array

        System.out.println( "\nArray characterArray contains:" );
        PrintArray( charArray ); // pass a Character array
		

	}

}
