package com.ba.boost.day37.interviewtask;

public abstract class GameCharacter {

	private String charName;
	private int hp;
	private int attack;

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getAttack() {
		return attack;
	}

	public void setAttack(int attack) {
		this.attack = attack;
	}

	public String getCharName() {
		return charName;
	}

	public void setCharName(String charName) {
		this.charName = charName;
	}

	@Override
	public String toString() {
		return "GameCharacter [charName=" + charName + ", hp=" + hp + ", attack=" + attack + "]";
	}

}
