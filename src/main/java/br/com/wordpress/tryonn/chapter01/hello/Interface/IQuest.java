/**
 * 
 */
package br.com.wordpress.tryonn.chapter01.hello.Interface;

import br.com.wordpress.tryonn.chapter01.knight.exception.QuestFailedException;

/**
 * @author simao.neto
 *
 */
public interface IQuest {
	abstract Object embark() throws QuestFailedException;
}
