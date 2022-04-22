import java.util.Scanner;

class desnum{
	public static void main(String[] args){
		Scanner scnr = new Scanner(System.in);
		int num = 1;
		int count = 0;
		char pos;
		char temp;
		String snum = "";
		String next = "";
		String input = "y";
		while(input.equals("y")) {
			snum = ""+num;
			next = "";
			for(int i=0; i<snum.length(); i+=0) {
				pos = snum.charAt(i);
				temp = pos;
				count = 0;
				while(temp == pos && i<snum.length()) {
					count++;
					i++;
					if(i<snum.length())
						temp = snum.charAt(i);
					else
						temp = 'b';
				}
//				System.out.println("Count: " + count + " Pos: " + pos);
				next += count + "" + pos;
			}
			num = Integer.valueOf(next);
			System.out.println(num);
			System.out.print("Keep going? (y/n) ");
			input = scnr.next();
		}
	}
}
