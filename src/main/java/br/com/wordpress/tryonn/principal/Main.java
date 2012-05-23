/**
 * 
 */
package br.com.wordpress.tryonn.principal;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import br.com.wordpress.tryonn.chapter01.hello.Interface.IGreetingService;

/**
 * @author simao.neto
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BeanFactory factory = new XmlBeanFactory(new FileSystemResource("hello.xml"));		
		IGreetingService greetingService = (IGreetingService) factory.getBean("greetingService");
		greetingService.sayGreeting();
	}

}
