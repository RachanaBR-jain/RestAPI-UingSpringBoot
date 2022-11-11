Enable Debug Logging
WARNING: Log change frequently!
1: How are our requests handled?
DispatcherServlet - Front Controller Pattern
Mapping servlets: dispatcherServlet urls=[/]
Auto Configuration (DispatcherServletAutoConfiguration)
2: How does HelloWorldBean object get converted to JSON?
@ResponseBody + JacksonHttpMessageConverters
Auto Configuration (JacksonHttpMessageConvertersConfiguration)
3: Who is configuring error mapping?
Auto Configuration (ErrorMvcAutoConfiguration)
4: How are all jars available(Spring, Spring MVC, Jackson, Tomcat)?
Starter Projects - Spring Boot Starter Web (
------------------------------------------------------------------------------------------------------------------

@PathVariable
/users/{id}/todos/{id} => /users/2/todos/200
here users/{id} and todos/{id} are path variable


	@GetMapping(path = "/hello-world-bean/path-variable/{name}")
	private HelloWorldBean helloUisngPathVariable(@PathVariable String name) {
		return new HelloWorldBean(String.format("Hello World, %s", name));

	}
	
o/p:
http://localhost:8080/hello-world-bean/path-variable/rachana

{
"message": "Hello World, rachana"
}