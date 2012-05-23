/**
 * 
 */
package br.com.wordpress.tryonn.chapter01.knight;

import org.apache.log4j.Logger;

import br.com.wordpress.tryonn.chapter01.hello.Interface.IKnight;

/**
 * @author simao.neto
 *
 */
public class Minstrel {
	private static final Logger SONG = Logger.getLogger(Minstrel.class);
	
	public void singBefore(IKnight knight){
		SONG.info("Fa la la; Sir " + knight.getClass().getName() + " is so Brave! ");		
	}
	
	public void singAfter(IKnight knight){
		SONG.info(" Tree-hee-he; Sir " + knight.getClass().getName() + " did embark on a quest! ");		
	}

}
