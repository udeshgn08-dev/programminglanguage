/**
 * Data type can be helped by that type classes. Example would be byte with the help of Byte class
 * Java class library includes helper classes for each primitive 
 * Helper class supports conversion and formatting tools 
 */
package practise;

public class P4HelperMain {

	public static void main(String[] args) {
		byte byt = -127;
		float flt = 34567.62F;
		System.out.println(byt);
		System.out.println(flt);
		if (byt > Byte.MIN_VALUE) {
		byt--; }
		System.out.println(byt); 
	    if(flt < Float.MAX_VALUE) {
	    flt++; }
	    System.out.println(flt); } }
        