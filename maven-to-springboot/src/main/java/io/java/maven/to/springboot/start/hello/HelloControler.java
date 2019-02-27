package io.java.maven.to.springboot.start.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloControler {
	
	@RequestMapping("/hello")
	public String sayHi() {
return "Hi";
}
}