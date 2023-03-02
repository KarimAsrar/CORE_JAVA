package abstractionandinheritance;

public class CricketMainClass {
	public class CricketMainclass {
		static int i;
		public static void main(String[] args) {
			Batsman bm1 = new Batsman("Rohit ", 200, 1, 2, 50, 6, 4);
			Batsman bm2 = new Batsman("Asrar ",   100, 0, 2, 30, 5, 3);
			Batsman bm3 = new Batsman("santosh ", 500, 2, 4, 60, 7, 5);
			Batsman bm4 = new Batsman("yasaswini ",300, 1, 2, 55, 5, 7);
			Batsman bm5 = new Batsman(" Ajin ", 400, 2, 4, 60, 3, 8);
		
			
			System.out.println(bm1);
			
			System.out.println(bm2);
			
			System.out.println(bm3);
			
			System.out.println(bm4);
			
			System.out.println(bm5);
			
			Bowllers B1 = new Bowllers("sneha ", 50, 2, 3);
			
		Bowllers B2 = new Bowllers("upendra ", 40, 5, 10);

		Bowllers B3 = new Bowllers("siva ", 50, 2, 3);
		
		Bowllers B4 = new Bowllers("ganesh ", 50, 2, 3);
		
		Bowllers B5 = new Bowllers("maaz", 50, 2, 3);
		    
		
			
			System.out.println(B1);
			
			System.out.println(B2);
			
			System.out.println(B3);
			
			System.out.println(B4);
			
			System.out.println(B5);
			
			Batsman [] bArr = new Batsman[5];
			 bArr[0]= bm1;
			 bArr[1]= bm2;
			 bArr[2]= bm3;
			 bArr[3]= bm4;
			 bArr[4]= bm5;
			 
			 System.out.println("");
			 Bowllers [] bowArr = new Bowllers[5];
			 bowArr[0] =B1;
			 bowArr[1] =B2;
			 bowArr[2] =B3;
			 bowArr[3] =B4;
			 bowArr[4] =B5;
			 Batsman b = new Batsman();
			// b.highestScore(bArr);
			 System.out.println(new Batsman().highestScore(bArr));
			//Bowllers bw = new Bowllers();
			//bw.mostwickets(bowArr);
			 System.out.println(   new Bowllers().mostwickets(bowArr));
			
			
			
		}
	}

}
