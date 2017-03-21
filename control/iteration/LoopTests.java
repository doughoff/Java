package control.iteration;

public class LoopTests {
	public static void main(String[] args) {
//		Print out numbers 0 to 99
//		Formatted to look like:
//		0 1 2 3 4 5 6 7 8 9
//		10 11 12 13 14 15 16 17 18 19
//		20 …
//		One loop only
		System.out.print("Print formatted numbers");
		System.out.println(" from 0 to 99");
		System.out.println("LFCR here");
		
		//set up the loop 0 - 99
		for (int i = 0; i < 10; i++) {
			// i is scoped to this block (declared inside also)
		}
		
		int i = 0;
		while (i <=99){
			// print the value
			System.out.print(i + " ");
			// check value of i when at end of line and println
			if (i % 10 == 9) {
				System.out.println();
			}
			// go to next number
			i++;
		}
		
		i = 100;
	}
}
