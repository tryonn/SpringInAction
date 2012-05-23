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
public class KnightTeste {
	public static void main(String[] args) throws QuestFailedException {
		
		// TODO Auto-generated method stub
		BeanFactory factory = new XmlBeanFactory(new FileSystemResource("knight.xml"));
		IKnight knight = (IKnight) factory.getBean("knight");
		
		knight.embarkOnQuest();
		
	}

}
