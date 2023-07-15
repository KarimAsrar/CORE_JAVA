package strings;

public class String3 {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("hello my name is wynsang and this is my");

		//		System.out.println(sb.charAt(3));
//		sb.setCharAt(3, 'p' );
//		
//		sb.delete(3, 4);
	    sb.append(" world");//stringBuider new string creat nhi krega .same string ke andar value ko add krdega
		System.out.println(sb);
		System.out.println(sb.length());
		
	}
}
