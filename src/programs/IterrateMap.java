package programs;

import java.util.HashMap;
import java.util.Map;

public class IterrateMap {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap();
		map.put(23, "English");
		map.put(34, "odia");
		map.put(76, "Bengali");
		map.put(665, "Hindi");
		IterateStreams(map);
	}

	public static void IterateStreams(Map<Integer, String> map) {
		map.entrySet().stream().forEach(e -> System.out.println("key=" + e.getKey() + "Value=" + e.getValue()));

	}
}
