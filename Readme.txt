Returning Bean:
add below code in @RestController class the o/p will be in the form of json

@GetMapping(path="/hello-world-bean")
	private HelloWorldBean hello() {
		return new HelloWorldBean("Hello World Bean");

	}
