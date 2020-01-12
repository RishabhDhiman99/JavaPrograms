//3.5
public class ComLineTest {
	public static void main(String args[]) {
		int count,i=0;
		String str;
		count = args.length;
		System.out.println("count: "+count);
		while(i<count) {
			str = args[i];
			i=i+1;
			System.out.println("arg: "+str);
		}
	}
}
