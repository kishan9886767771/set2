import java.util.*;
public class Q11 {
	public static void main(String[] args) {
		String[] s1={"ga","yb","awe"};
		String s2="awe";
		System.out.println(stringRetrieval(s1,s2));
	}
	public static int stringRetrieval(String[] s1, String s2){
		ArrayList l1=new ArrayList();
		for(int i=0;i<s1.length;i++)
			l1.add(s1[i]);
		Collections.sort(l1,Collections.reverseOrder())	;
		System.out.println(l1);
		int n=l1.indexOf(s2);
		return n;
	}
}
