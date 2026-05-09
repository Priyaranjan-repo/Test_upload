//package StringChallange;
//
//import java.util.List;
//import java.util.stream.Collectors;
//
//public class Snippet {
////	public static void clickWithRetry(WebElement element, int attempts) {
////
////
////
////		for (int i = 0; i < attempts; i++) {
////	        try {
////	            element.click();
////	            break;
////	        } catch (StaleElementReferenceException e) {
////	            // Retry
////	        }
////	    }
////	}
//
//
//   public static void main(String[] args) throws Exception {
//
//	        ObjectMapper mapper = new ObjectMapper();
//
//	        User user = new User("John", 25);
//
//	        // Convert Java object to JSON string
//	        String jsonBody = mapper.writeValueAsString(user);
//	        System.out.println(jsonBody);
//
//	        // Deserialization Example
//	        String responseJson = "{\"name\":\"Alice\",\"age\":30}";
//	        User userResponse = mapper.readValue(responseJson, User.class);
//
//	        System.out.println(userResponse.getName());
//
//	        //-------------------------------------//
//
//	        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8);
//
//	        List<Integer> evens = list.stream()
//	                .filter(n -> n % 2 == 0)
//	                .collect(Collectors.toList());
//
//	        System.out.println("Even numbers: " + evens);
//	    }
//	}
//	System.out.println(jsonBody);
//
//	 //Deserialization Example
//
//	String responseJson = response.getBody().asString();
//	User userResponse = mapper.readValue(responseJson, User.class);
//
//	System.out.println(userResponse.getName());  // Alice
//
////-------------------------------------               //
//	List<Integer> evens = list.stream()
//	                          .filter(n -> n % 2 == 0)
//	                          .collect(Collectors.toList());
//
//
//
//
//}
//
