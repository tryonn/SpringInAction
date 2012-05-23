/**
 * 
 */
package br.com.wordpress.tryonn.chapter01.knight;

import br.com.wordpress.tryonn.chapter01.hello.Interface.IKnight;
import br.com.wordpress.tryonn.chapter01.hello.Interface.IQuest;
import br.com.wordpress.tryonn.chapter01.knight.exception.QuestFailedException;

/**
 * @author simao.neto
 *
 */
public class KnigthOfTheRoundTable implements IKnight{
	private Minstrel minstrel;
	private String name;
	private IQuest quest;
	
	
	public KnigthOfTheRoundTable(String name) {
		this.name = name;
		System.out.println(name);		
	}

	/* (non-Javadoc)
	 * @see br.com.wordpress.tryonn.chapter01.knight.Knight#embarkOnQuest()
	 */
	@Override
	public Object embarkOnQuest() throws QuestFailedException {
		minstrel.singBefore(this);
		HolyGrail grail = (HolyGrail) quest.embark();
		minstrel.singAfter(this);
		System.out.println(quest.embark());
		return grail;
	}
	
	public void setQuest(IQuest quest){
		this.quest = quest;
		
		System.out.println(quest);
	}

	public Minstrel getMinstrel() {
		return minstrel;
	}

	public void setMinstrel(Minstrel minstrel) {
		this.minstrel = minstrel;
	}	
	
	
}
