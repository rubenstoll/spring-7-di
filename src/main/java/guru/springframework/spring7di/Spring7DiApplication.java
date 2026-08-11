package guru.springframework.spring7di;

import guru.springframework.spring7di.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Spring7DiApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Spring7DiApplication.class, args);
		MyController controller = context.getBean(MyController.class);
		controller.sayHello();
		System.out.println("in main class");
		System.out.println(controller.sayHello());
	}

}
