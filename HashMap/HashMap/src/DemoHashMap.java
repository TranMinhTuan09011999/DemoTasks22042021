import java.util.HashMap;
import java.util.Set;

public class DemoHashMap {
	public static void main(String[] args) {
		HashMap<Integer, Student> hashMap = new HashMap<Integer, Student>();
		System.out.println("------ Adding students ---------");
		hashMap.put(1, new Student("Tuan", 22, "QuangNgai"));
		hashMap.put(2, new Student("Tan", 21, "BenTre"));
		hashMap.put(3, new Student("Quoc", 23, "PhuYen"));	
		show(hashMap);
		System.out.println("------ Update students ---------");
		hashMap.put(3, new Student("Tinh", 20, "BinhDinh"));
		show(hashMap);
		System.out.println("------ Remove students ---------");
		hashMap.remove(3);
		show(hashMap);
	}
	public static void show(HashMap<Integer, Student> hashMap) {
        Set<Integer> keySet = hashMap.keySet();
        for (Integer key : keySet) {
            System.out.println(key + " " + hashMap.get(key));
        }
    }
}
