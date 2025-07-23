import java.util.Random;
class Dice {
	int value;         
	Random random;     

    	Dice() {
        		random = new Random();
    	}

    	int roll() {
        		value = random.nextInt(6) + 1;  
        		return value;
    	}

    	int getValue() {
        		return value;
    	}
}

class Player {
    	String name;
    	int score;

    	Player(String playerName) {
        		name = playerName;
        		score = 0;
    	}

    	void addScore(int val) {
        		score = score + val;
	}

    	void showScore() {
        		System.out.println(name + " has score: " + score);
    	}
}

public class Game {
	public static void main(String[] args) {
        		Player p1 = new Player("Rama");
        		Player p2 = new Player("Sita");

		Dice dice = new Dice();
        
		while (p1.score < 100 && p2.score < 100) {
            			int roll1 = dice.roll();
            			System.out.println(p1.name + " rolled: " + roll1);
            			p1.addScore(roll1);
            			p1.showScore();
	            		if (p1.score >= 100) break;

	            		int roll2 = dice.roll();
            			System.out.println(p2.name + " rolled: " + roll2);
            			p2.addScore(roll2);
            			p2.showScore();
        		}
        		System.out.println("Winner is: " + (p1.score >= 100 ? p1.name : p2.name));
    	}
}