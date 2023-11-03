package de.haegmahi.sfgdi;

import de.haegmahi.sfgdi.controllers.ContructorIjectedController;
import de.haegmahi.sfgdi.controllers.MyController;
import de.haegmahi.sfgdi.controllers.PropertyInjectedController;
import de.haegmahi.sfgdi.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);

		MyController myController = ctx.getBean("myController", MyController.class);

		String greeting = myController.sayHello();
		System.out.println(greeting);

		System.out.println("----------------Property");
		PropertyInjectedController propertyInjectedController = ctx.getBean(PropertyInjectedController.class);
		System.out.println(propertyInjectedController.getGreeting());

		System.out.println("----------------Sertter");
		SetterInjectedController setterInjectedController = ctx.getBean(SetterInjectedController.class);
		System.out.println(setterInjectedController.getGreeting());

		System.out.println("----------------Constr");
		ContructorIjectedController contructorIjectedController = ctx.getBean(ContructorIjectedController.class);
		System.out.println(contructorIjectedController.getGreeting());

	}

}
