import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class HashmapSorting {
	
	
	public void populateMap(Map<String,Integer> map)
	{
		map.put("Ritu", 28);
		map.put("Varsha", 32);
		map.put("Megha", 37);
		map.put("Vikas", 31);
		map.put("Leela", 60);
		
	}
	public void printMap(Map<String,Integer> map)
	{
		for(Map.Entry<String, Integer> mapentry:map.entrySet())
		{
			System.out.println(mapentry.getKey()+ " : "+mapentry.getValue());
		}
	}
	
	public void printMap1(List<Map.Entry<String, Integer>> ls1)
	{
		for(Map.Entry<String, Integer> mapentry:ls1)
		{
			System.out.println(mapentry.getKey()+ " : "+mapentry.getValue());
		}
	}
	public void sortKeys(Map<String,Integer> map)
	{
		//sort keys in ascending order
		System.out.println("initial map : " );
		printMap(map);
		System.out.println("Sorting keys in ascending order :  " );
		TreeMap<String,Integer> tm=new TreeMap<String,Integer>(map);
		printMap(tm);
		
		//sort keys in descending order
		System.out.println("initial map : " );
		printMap(map);
		System.out.println("Sorting keys in descending order :  " );
		List<String> ls=new ArrayList<String>(map.keySet());
		Collections.sort(ls,Collections.reverseOrder());
		Collections.sort(ls);
		for(String s:ls)
		{
			System.out.println(s +" : "+map.get(s));
		}
	}
	 
	public void sortValues(Map<String,Integer> map)
	{
		System.out.println("Sorting Values in ascending order");
		List<Map.Entry<String,Integer>> ls=new ArrayList<Map.Entry<String,Integer>>(map.entrySet());
		Collections.sort(ls, new Comparator<Map.Entry<String,Integer>>() {

			@Override
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
				// TODO Auto-generated method stub
				return o1.getValue().compareTo(o2.getValue());
			}
		});
		printMap1(ls);
		System.out.println("Sorting Values in descending order");
		List<Map.Entry<String, Integer>> ls1=new ArrayList<Map.Entry<String, Integer>>(map.entrySet());
		Collections.sort(ls1,new Comparator<Map.Entry<String, Integer>>(){
			
			public int compare(Map.Entry<String, Integer> o1,Map.Entry<String, Integer> o2)
			{
				return o2.getValue().compareTo(o1.getValue());
			}
		});
		
		printMap1(ls1);
		}
	
	public static void main(String[] arg)
	{
		Map<String,Integer> map1=new HashMap<String,Integer>();
		HashmapSorting hs=new HashmapSorting();
		hs.populateMap(map1);
		hs.sortKeys(map1);
		hs.sortValues(map1);
	}
	
	
	

}
