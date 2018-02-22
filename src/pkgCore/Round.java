package pkgCore;

import java.util.LinkedList;

public class Round {

	private int ComeOutScore;
	private eGameResult eGameResult;
	private LinkedList<Roll> rolls = new LinkedList<Roll>();
	int Score = 0;
	private int rollCount = 0;
	int firstScore;
	
	public Round() {
		
		Roll roll = new Roll();
		ComeOutScore = roll.getScore();

		if (ComeOutScore == 2 || ComeOutScore == 3 ||
				ComeOutScore == 12) {
			
			this.eGameResult = eGameResult.CRAPS;
			rollCount = 1;
			System.out.println("First roll: "  + ComeOutScore + ". Round over.");
		
		}
		
		else if ( ComeOutScore == 7 || ComeOutScore == 11) {
			
			this.eGameResult = eGameResult.NATURAL; 
			rollCount = 1;
			System.out.println("First roll: "  + ComeOutScore + ". Round over.");
		}
		
		else {
			this.eGameResult = eGameResult.POINT;
			Score = roll.getScore();
			firstScore = ComeOutScore;
			System.out.println("First roll: "  + ComeOutScore);
		}
		
		while(Score!=firstScore) {
			if (Score == 7) {
				System.out.println("Round over.");
			}
			else {
				Score = roll.getScore();
			}
		}
		if(Score == firstScore) {
			System.out.println("You rolled a " + Score + " . Round over.");
		}

		// TODO: value the eGameResult after the round is complete
		if(ComeOutScore==firstScore) {
			this.eGameResult = eGameResult.SEVEN_OUT;
		}
		else if (ComeOutScore==Score) {
			this.eGameResult = eGameResult.POINT;
		}
	}

	public int RollCount() {
		// Return the roll count
		return rollCount;
	}

}