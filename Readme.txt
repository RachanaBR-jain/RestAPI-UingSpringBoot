Creating Rest Project using SprongBoot
1)Import the project which was downloaded from spring initialiser
2)@SpringBootApplication -> runAS Java Application
3)create 
@RestController:It is used for making restful web services with the help of the @RestController annotation.
 This annotation is used at the class level and allows the class to handle the requests made by the client
 @RequestMapping: the annotation is used to map web requests to Spring Controller methods.
 
 
@RestController
public class HelloWorldController {
	
	@RequestMapping(method = RequestMethod.GET,path="/hello-world")
	public String helloMethod() {
		return "Hello World";
	}
	


}
or 
@GetMapping(path="/hello-world")
	public String helloMethod() {
		return "Hello World";
	}
	