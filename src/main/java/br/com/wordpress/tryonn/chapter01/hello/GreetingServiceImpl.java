/**
 * 
 */
package br.com.wordpress.tryonn.chapter01.hello;

import br.com.wordpress.tryonn.chapter01.hello.Interface.IGreetingService;

/**
 * @author simao.neto
 *
 */
public class GreetingServiceImpl implements IGreetingService{
	private String greeting;
	
	/**
	 * 
	 */
	public GreetingServiceImpl(String greeting) {
		this.greeting = greeting;
	}
	
	public GreetingServiceImpl() {}
	
	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}




	/* (non-Javadoc)
	 * @see br.com.wordpress.tryonn.chapter01.hello.GreetingService#sayGreeting()
	 */
	public void sayGreeting() {
		System.out.println(greeting);
	}

}
