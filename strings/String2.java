package strings;

public class String2 {
//strings are immutable---means ek bar memory ke andar apne koi string bna di to ab ap us string ko change nahi kr skte 
	//uske andr kuch add,delete, modify kuchh nahi kr skte, iske liye apko naya string bnana bdega:
	public static void main(String[] args) {
//		String firstName="Asrar";
//		String lastName="Karim";
//		String fullName=firstName + lastName;
//		
//		System.out.println(fullName.length());
		
//		for(int i =0; i<fullName.length();i++) {
//			System.out.println(fullName.charAt(i));
//		}
		
		String n1 = "Asrar karim";
//		subString(beg index,end index);
		String name = n1.substring(0, 7);
		
		System.out.println(name);
//		String n2 = "Asrar";
//		
//		
////		if(n1.compareTo(n2)==0) {
//		if(n1==n2) {
//			System.out.println("string are equal");
//		}else {
//			System.out.println("string are not equal");
//		}
//		
	}
}
