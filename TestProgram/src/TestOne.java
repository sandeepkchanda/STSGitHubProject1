import java.util.HashMap;
import java.util.LinkedList;
import java.util.ArrayList;

public class TestOne {

	public static void main(String[] args) {
		
		HashMap<String, Integer> empIds = new HashMap<> ();
		empIds.put("Rahul", 455);
		empIds.put("Rajul",733);
		empIds.put("Uddeshya", 235);
		empIds.put("Sunil",453);
		empIds.put("Sanchit", 475);
		empIds.put("Vipul",922);
		System.out.println(empIds);
		System.out.println(empIds.get("Sunil"));
		System.out.println(empIds.containsValue(455));
		empIds.put("Vipul",544);
		empIds.replace("Rajul", 422);
		System.out.println(empIds);
		
		
		
		
		LinkedList<String> namesLinkedList = new LinkedList<>();
		namesLinkedList.add("Kashish");
		namesLinkedList.add("Tusha");
		namesLinkedList.add("Himani");
		System.out.println(namesLinkedList);
		System.out.println(namesLinkedList.get(1));
		
		
		
		ArrayList<String> namesArrayList = new ArrayList<>();
		namesArrayList.add("Komal");
		namesArrayList.add("Vidya");
		namesArrayList.add("Mohini");
		System.out.println(namesArrayList);
		
		
	}

}
