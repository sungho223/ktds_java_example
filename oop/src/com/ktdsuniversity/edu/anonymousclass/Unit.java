package com.ktdsuniversity.edu.anonymousclass;

/**
 * LOL의 캐릭터
 * 이동
 * 기본공격
 * 스킬공격
 * 귀환
 * 아이템 구매
 * 아이템 판매
 * 대사 외치기
 * 감정표현
 * 사망
 * 미니언 잡기
 */
public interface Unit {
	
	void move();
	void basicAttck(Unit otherCharacter);
	void skillAttack(Unit otherCharacter);
	void recall();
	void buyItem();
	void sellItem();
	void speak();
	void emotion();
	void die();
	void takeMinions();
	
	public int getHp();
	public void setHp(int hp);
	public int getDefence();
	
}
