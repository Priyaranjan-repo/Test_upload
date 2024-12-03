package softwareTestingGO;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Sol1 {
	public static void main(String[] args) {
		String ip = "reeeyy23hdjdod76syduudi69";
		// op =reeeyy32hdjdod67yduudi96;

		String[] ipString = ip.split("[^A-Za-z]");
		String[] ipNos = ip.split("[^0-9]");
		System.out.println(ip);
		System.out.println(Arrays.toString(ipString));
		System.out.println(Arrays.toString(ipNos));
		String op = "";

		// ---------------------

		List<String> stringlist = Arrays.asList(ipString).stream().filter(s -> !s.isBlank() || !s.isEmpty())
				.collect(Collectors.toList());
		System.out.println(stringlist);
		List<String> noslist = Arrays.asList(ipNos).stream().filter(s -> !s.isBlank() || !s.isEmpty())
				.collect(Collectors.toList());
		System.out.println(noslist);

		for (int i = 0; i < noslist.size(); i++) {
			op = op + stringlist.get(i) + new StringBuffer(noslist.get(i)).reverse();
		}
		System.out.println(op);
	}
}
