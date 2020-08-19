import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class FindOccurrences {
	
	int[] arr= {1,4,5,2,4,5,6,2,1,4,7};
	HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
	void findOccurrences()
	{
		//find occurrences
	for(int a : arr)
	{
		if(hm.containsKey(a))
		{
			hm.put(a, hm.get(a)+1);
		}
	
	else
	{
		hm.put(a, 1);
	}
	}
		/*
		 * for(int b : hm.keySet()) { System.out.println(b+" :"+ hm.get(b)); }
		 */
	
	//sort the list on basis of values
	System.out.println("Sorting values in descending order");
	List<Map.Entry<Integer,Integer>> ls=new ArrayList<Map.Entry<Integer,Integer>>(hm.entrySet());
	Collections.sort(ls, new Comparator<Map.Entry<Integer,Integer>>() {
			public int compare(Map.Entry<Integer, Integer> o1,Map.Entry<Integer, Integer> o2)
			{
				//descending order
				
		    return o2.getValue().compareTo(o1.getValue());
		    
		    //ascending order
	
		    //return o1.getValue().compareTo(o2.getValue());
			}}
			);
	
	LinkedHashMap<Integer,Integer> lm=new LinkedHashMap<Integer,Integer>();
	for(Map.Entry<Integer, Integer> m:ls)
	{
		lm.put(m.getKey(),m.getValue());
	}
	
	//print values of map using entryset
	
	for (Map.Entry<Integer, Integer> m : lm.entrySet())
	{
		System.out.println(m.getKey()+ " :"+m.getValue());
	}
	
	//sort on basis of keys
	System.out.println("Sorting keys in ascending order");
	TreeMap<Integer,Integer> tm=new TreeMap<Integer,Integer>(hm);
	for(Map.Entry<Integer, Integer> m:tm.entrySet())
	{
		System.out.println(m.getKey()+ " : "+m.getValue());
	}
	
	//sort on basis of keys descending
	System.out.println("Sorting keys in decending order");
	ArrayList<Integer> al=new ArrayList<Integer>(hm.keySet());
	Collections.sort(al,Collections.reverseOrder());
	
	for(int a : al)
	{
		System.out.println(a+ " : "+hm.get(a));
	}
	
	
	
	}
	
	


	public static void main(String[] arg)
	{
		FindOccurrences f=new FindOccurrences();
		f.findOccurrences();
	}
}
