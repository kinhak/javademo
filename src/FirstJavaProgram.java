import java.util.*;

public class FirstJavaProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("My name is kapil kinha and i am using git");
		ArrayList<String> kap = new ArrayList<String>();
		kap.add("kapil");
		kap.add("ajay");
		kap.add("kapil");
		kap.add("soham");
		
		Iterator i = kap.listIterator();
		while(i.hasNext()){
			System.out.println(i.next());
		}
		
	}

}
