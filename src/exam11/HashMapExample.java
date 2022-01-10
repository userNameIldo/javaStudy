package exam11;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {
	public static void main(String[] args) {
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("�����", 85);
		map.put("���γ�", 90);
		map.put("������", 95);
		map.put("�����", 80); //���� Ű���̹Ƿ� ���� ������ value�� ����

		System.out.println("����� : " + map.get("�����")); // ����� key�����ΰ˻� value���ҷ���
		System.out.println();
		System.out.println("�� ���� : " + map.size());//�� ����� ����
		
		Set<String> keySet = map.keySet();
		Iterator<String> keyIterator = keySet.iterator();
		
		while(keyIterator.hasNext()) { //�ݺ��ؼ� Ű�� ��� value�� Map���� ��
			String key = keyIterator.next();
			Integer value = map.get(key);
			System.out.println(key + " : " + value);
		}
		System.out.println();
		
		map.remove("�����");//Ű ������ map�� ����
		
		System.out.println("�� ���� : " + map.size());
		
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet(); // Map.Entry Set ���
		
		Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
		
		while(entryIterator.hasNext()) {
			Map.Entry<String, Integer> entry = entryIterator.next();
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println(key + " : " + value);
		}
		
		map.clear();//��� Map ����
		
		System.out.println();
		System.out.println("�� ���� : " + map.size());
		
		
	}
}
