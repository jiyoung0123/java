package map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapTest3 {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer,String>();
		map.put(1, "A");
		map.put(2, "B");
		map.put(3, "C");
		map.put(4, "D");
		map.put(5, "E");
		
		
		//map.values는 map의 값들만 끄집어 내는것
		//map은 저장할 때 key 와 value 들로 저장할 수 있다.
		//필요할 때 key, value 들로 각각 끄집어낼 수 있다.
		Collection<String> col = map.values();
		System.out.println(col.size());
		
		for(String data: col) {
			System.out.println(data);
		}
		
		}


	}


