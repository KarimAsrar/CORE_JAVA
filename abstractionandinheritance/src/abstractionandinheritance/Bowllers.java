package abstractionandinheritance;
	public class Bowllers extends Players {
		int strikerateOfBowler;
		private int ballsBowled;
		private int runsLeaked;
		private int wickets;
		int max;
		String hwb = "";
		public Bowllers(String name, int ballsBowled, int runsLeaked, int wickets) {
			super(name);
			this.ballsBowled = ballsBowled;
			this.runsLeaked = runsLeaked;
			this.wickets = wickets;
		}
		public Bowllers() {
			// TODO Auto-generated constructor stub
		}
		public int strikeRate(){
			strikerateOfBowler =(ballsBowled/wickets);
		return strikerateOfBowler;
		
		}
		public int getBallsBowled() {
			return ballsBowled;
		}
		public void setBallsBowled(int ballsBowled) {
			this.ballsBowled = ballsBowled;
		}
		public int getRunsLeaked() {
			return runsLeaked;
		}
		public void setRunsLeaked(int runsLeaked) {
			this.runsLeaked = runsLeaked;
		}
		public int getWickets() {
			return wickets;
		}
		public void setWickets(int wickets) {
			this.wickets = wickets;
		}
		public String mostwickets( Bowllers [] bowArr) {
			int max = bowArr[0].getWickets();
			String hwb = bowArr[0].getName();
			for(int i =1; i<bowArr.length;i++) {
			if(max < bowArr[i].getWickets()) {
				max = bowArr[i].getWickets();
				hwb = bowArr[i].getName();
			}	
			}
			return "the highest wickets taken are " +max + " the bowler is: " +hwb;	
		}
		@Override
		public String toString() {
			return "Bowller [name=" +super.getName() + ", id=" +super.getId() + ", strikerateOfBowler=" + strikerateOfBowler + ", ballsBowled=" + ballsBowled + ", runsLeaked="
					+ runsLeaked + ", wickets=" + wickets + "\n"+ "strikeRate : " +strikeRate()+ "]";
		}
		
		
		}

