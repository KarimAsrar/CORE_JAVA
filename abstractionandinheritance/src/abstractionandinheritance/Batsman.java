package abstractionandinheritance;
	public class Batsman extends Players {
		float strikerate;
		int boundariesruns;
		int max;
		String hsp ="";
		private  int runscored;
		private  int centuries;
		private  int  halfcenturies;
		private  int ballsfaced;
		private  int sixes;
		private  int fours;
		public Batsman(String name, int runscored, int centuries, int halfcenturies, int ballsfaced, int sixes, int fours) {
			super(name);
			this.runscored = runscored;
			this.centuries = centuries;
			this.halfcenturies = halfcenturies;
			this.ballsfaced = ballsfaced;
			this.sixes = sixes;
			this.fours = fours;
	}
		
		public Batsman() {
			// TODO Auto-generated constructor stub
		}

		public float getStrikeRate() {
			strikerate =(runscored*100)/ballsfaced;
			return strikerate;
		}
		public int runsScoredInBoundaries() {
			boundariesruns = (4*fours+6*sixes);
		return boundariesruns;
			
		}
		public int getRunscored() {
			return runscored;
		}

		public void setRunscored(int runscored) {
			this.runscored = runscored;
		}

		public int getCenturies() {
			return centuries;
		}

		public void setCenturies(int centuries) {
			this.centuries = centuries;
		}

		public int getHalfcenturies() {
			return halfcenturies;
		}

		public void setHalfcenturies(int halfcenturies) {
			this.halfcenturies = halfcenturies;
		}

		public int getBallsfaced() {
			return ballsfaced;
		}

		public void setBallsfaced(int ballsfaced) {
			this.ballsfaced = ballsfaced;
		}

		public int getSixes() {
			return sixes;
		}

		public void setSixes(int sixes) {
			this.sixes = sixes;
		}

		public int getFours() {
			return fours;
		}

		public void setFours(int fours) {
			this.fours = fours;
		}
		
		public String highestScore(Batsman [] bArr) {
			int max = bArr[0].getRunscored();
			String hsp = bArr[0].getName();
			for(int i=1;i<bArr.length;i++) {
			if(max<bArr[i].getRunscored()){
			max = bArr[i].getRunscored();
			hsp = bArr[i].getName();
			}
			}
			return "the highest score player is " + hsp+ " and the score is :" + max;
		}
		
		
		@Override
		public String toString() {
			return "Batsman [name=" + super.getName()+ "id= " +super.getId()+ "runscored=" + runscored + ", centuries=" + centuries + ", halfcenturies=" + halfcenturies
					+ ", ballsfaced=" + ballsfaced + ", sixes=" + sixes + ", fours=" + fours+ " ,Strike rate =" +strikerate +", boundaries scores =" + boundariesruns + "\n"+ "getStrikeRate :"+  getStrikeRate()+ "\n"+ " runsScoredInBoundaries :" +runsScoredInBoundaries()+"]";
			
		}

		
		
		
	}

