class GamblingSimulation {
	public static final int InitialStake = 100;
    public static final int BetAmount = 1;
		public static void main(String[] args) {
		double RandomNum = Math.random();
        int RemainingAmount = InitialStake;
        if (RandomNum>0.5)
		{
            RemainingAmount += BetAmount;
            System.out.println("Gambler wins bet $"+RemainingAmount+ " After first Bet.");
        }
		else if (RandomNum<=0.5)
		{
            RandomNum -= BetAmount;
            System.out.println("Gambler loses bet $"+RemainingAmount+ " Having amount after one bet.");
        } 
    }
}
