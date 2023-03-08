package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapTest1 {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer,String>();
		map.put(1, "A");
		map.put(2, "B");
		map.put(3, "C");
		map.put(4, "D");
		map.put(5, "E");
		
		System.out.println(map.size());
		System.out.println(map.containsKey(5));
		System.out.println(map.containsValue("D"));
		
		//key값을 넣으면 해당하는 값을 가지고 올 수 있다
		System.out.println(map.get(1));
		
		
		//map에서는 먼저 key를 뽑아내야 한다
		Set<Integer>keys  = map.keySet();
		System.out.println(keys.toString());
		
		for(int data : keys) {
			System.out.println(map.get(data));
		}


	}

}
