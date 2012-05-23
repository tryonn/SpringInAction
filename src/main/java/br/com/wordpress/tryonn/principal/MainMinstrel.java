/**
 * 
 */
package br.com.wordpress.tryonn.principal;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import br.com.wordpress.tryonn.chapter01.hello.Interface.IKnight;
import br.com.wordpress.tryonn.chapter01.knight.exception.QuestFailedException;

/**
 * @author simao.neto
 *
 */
public class MainMinstrel {
	
	
	public static void main(String[] args) throws QuestFailedException {
		new MainMinstrel();
	}
	
	public MainMinstrel() throws QuestFailedException {
		BeanFactory factory = new XmlBeanFactory(new FileSystemResource("aop.xml"));		
		IKnight greetingService = (IKnight) factory.getBean("minstrel");
		greetingService.embarkOnQuest();
	}
	
	

}
