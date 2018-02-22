package pkgCore;

import java.util.LinkedList;

public class Round {

	private int ComeOutScore;
	private eGameResult eGameResult;
	private LinkedList<Roll> rolls = new LinkedList<Roll>();
	Roll roll1 = new Roll;
	int Score = 0;
	private int rollCount = 0;
	int firstScore;
	int roll;
	
	public Round() {
		
		this.ComeOutScore = roll1.getScore();
		rollCount++;

		if(ComeOutScore == 2 || ComeOutScore ==3 || ComeOutScore == 12) {
			this.eGameResult = eGameResult.CRAPS;
		}
		else if(ComeOutScore == 7 || ComeOutScore == 11) {
			this.eGameResult = eGameResult.NATURAL;
		}
		else {
			this.eGameResult = eGameResult.POINT;
			int roll = roll1.getScore();
		}
		if(roll == 7) {
			this.eGameResult = eGameResult.SEVEN_OUT;
		}
		else {
			while(roll!=7) {
				if(roll == ComeOutScore) {
				System.out.println("Round over.");
				}
				else {
					roll = roll1.getScore();
				}
			}
		}
	public int RollCount() {
		// Return the roll count
		return rollCount;
	}

}