package exam11;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {
	public static void main(String[] args) {
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("배수지", 85);
		map.put("유인나", 90);
		map.put("아이유", 95);
		map.put("배수지", 80); //같은 키값이므로 제일 마지막 value로 저장

		System.out.println("배수지 : " + map.get("배수지")); // 저장된 key값으로검색 value값불러옴
		System.out.println();
		System.out.println("총 갯수 : " + map.size());//총 저장된 갯수
		
		Set<String> keySet = map.keySet();
		Iterator<String> keyIterator = keySet.iterator();
		
		while(keyIterator.hasNext()) { //반복해서 키를 얻고 value를 Map에서 얻어냄
			String key = keyIterator.next();
			Integer value = map.get(key);
			System.out.println(key + " : " + value);
		}
		System.out.println();
		
		map.remove("배수지");//키 값으로 map을 제거
		
		System.out.println("총 갯수 : " + map.size());
		
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet(); // Map.Entry Set 얻기
		
		Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
		
		while(entryIterator.hasNext()) {
			Map.Entry<String, Integer> entry = entryIterator.next();
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println(key + " : " + value);
		}
		
		map.clear();//모든 Map 삭제
		
		System.out.println();
		System.out.println("총 갯수 : " + map.size());
		
		
	}
}
