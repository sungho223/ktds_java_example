package com.ktdsuniversity.edu.anonymousclass;

public class Game {

	public static void main(String[] args) {
		Unit ahri = new Ahri("Faker");
		Unit other = new Ahri("Ryu");
		Unit special = new Unit() {

			private String characterName = "hidden";
			private String playerName = "Kuro";

			private int hp = 100;
			private int level = 10000;
			private int mana = 20000;
			private int money = 99999;
			private int attackDamage = 5000;
			private int defence = 10000;
			private float attackSpeed = 0.1f;

			@Override
			public void move() {                                                      
				System.out.println(this.characterName + " (" + this.playerName + ") " + " 이동중.");
			}

			@Override
			public int getHp() {
				return this.hp;
			}

			@Override
			public void setHp(int hp) {
				this.hp = hp;
			}

			@Override
			public int getDefence() {
				return this.defence;
			}

			@Override
			public void basicAttck(Unit otherCharacter) {
				int ohterCharacterHp = otherCharacter.getHp();

				int attackDamage = this.attackDamage + this.level - otherCharacter.getDefence();

				if (attackDamage < 0) {
					attackDamage = 0;
				}
				ohterCharacterHp -= attackDamage;
				otherCharacter.setHp(ohterCharacterHp);
			}

			@Override
			public void skillAttack(Unit otherCharacter) {

				if (this.mana < 10) {
					return;
				}

				this.mana -= 10;

				int ohterCharacterHp = otherCharacter.getHp();

				int attackDamage = this.attackDamage + this.level - otherCharacter.getDefence();

				if (attackDamage < 0) {
					attackDamage = 0;
				}

				ohterCharacterHp -= attackDamage;
				otherCharacter.setHp(ohterCharacterHp);
			}

			@Override
			public void recall() {
				System.out.println(this.characterName + " (" + this.playerName + ")가 " + "귀환했습니다");
			}

			@Override
			public void buyItem() {
				this.money -= 100;
				System.out.println(this.money);
			}

			@Override
			public void sellItem() {
				this.money += 80;
				System.out.println(this.money);
			}

			@Override
			public void speak() {
				String[] script = new String[] { "얍", "이동 ~", "공격~" };
				int scriptIndex = (int) (Math.random() * script.length);
				System.out.println(script[scriptIndex]);

			}

			@Override
			public void emotion() {
				String[] script = new String[] { "웃기", "울기" };
				int scriptIndex = (int) (Math.random() * script.length);
				System.out.println(script[scriptIndex]);
			}

			@Override
			public void die() {
				System.out.println(this.characterName + " (" + this.playerName + ")가 " + "죽었습니다");
			}

			@Override
			public void takeMinions() {
				this.money += 3;
				System.out.println(this.money);
			}

		};

		ahri.move();
		other.move();

		ahri.basicAttck(other);
		other.skillAttack(ahri);

		ahri.speak();
		other.speak();
		System.out.println();
		
		special.move();
		special.basicAttck(ahri);
		special.speak();
	}
}
