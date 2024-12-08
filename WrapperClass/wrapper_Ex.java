package WrapperClass;

public class wrapper_Ex {

	public static void main(String[] args) {
		 // Byte Wrapper
        Byte byteValue = 127;
        System.out.println("Byte value: " + byteValue);
        System.out.println("Byte to double: " + byteValue.doubleValue());

        // Short Wrapper
        Short shortValue = 32000;
        System.out.println("Short value: " + shortValue);
        System.out.println("Short to long: " + shortValue.longValue());

        // Integer Wrapper
        Integer intValue = 12345;
        System.out.println("Integer value: " + intValue);
        System.out.println("Integer binary string: " + Integer.toBinaryString(intValue));

        // Long Wrapper
        Long longValue = 123456789L;
        System.out.println("Long value: " + longValue);
        System.out.println("Long to float: " + longValue.floatValue());

        // Float Wrapper
        Float floatValue = 123.45F;
        System.out.println("Float value: " + floatValue);
        System.out.println("Float to int: " + floatValue.intValue());

        // Double Wrapper
        Double doubleValue = 12345.6789;
        System.out.println("Double value: " + doubleValue);
        System.out.println("Double to long: " + doubleValue.longValue());

        // Character Wrapper
        Character charValue = 'A';
        System.out.println("Character value: " + charValue);
        System.out.println("Is letter: " + Character.isLetter(charValue));

        // Boolean Wrapper
        Boolean booleanValue = true;
        System.out.println("Boolean value: " + booleanValue);
        System.out.println("Boolean negation: " + !booleanValue);

        // Autoboxing and Unboxing examples
        int autoBoxed = intValue; // Unboxing
        Integer autoUnboxed = 100; // Autoboxing
        System.out.println("Autoboxing example: " + autoUnboxed);
        System.out.println("Unboxing example: " + autoBoxed);
		
	}
}
