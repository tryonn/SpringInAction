/**
 * 
 */
package br.com.wordpress.tryonn.chapter01.knight;

import br.com.wordpress.tryonn.chapter01.hello.Interface.IQuest;
import br.com.wordpress.tryonn.chapter01.knight.exception.QuestFailedException;

/**
 * @author simao.neto
 *
 */
public class HolyGrailQuest implements IQuest{
	/**
	 * 
	 */
	public HolyGrailQuest() {
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see br.com.wordpress.tryonn.chapter01.knight.Quest#embark()
	 */
	@Override
	public Object embark() throws QuestFailedException {
		
		return new HolyGrail();
	}
	
//	public HolyGrail embark(){
//		HolyGrail grail = null;
//		
//		return grail;
//	}

}
