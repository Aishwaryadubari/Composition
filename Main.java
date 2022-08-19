
public class Main {

	public static void main(String[] args)
	{
		FootballPlayer joe = new FootballPlayer("Joe");
		BaseballPlayer pat = new BaseballPlayer("pat");
		SoccerPlayer bekham = new SoccerPlayer("Beckham");
		
		Team<FootballPlayer> crows = new  Team<>("Adeaide Crows");
		crows.addPlayer(joe);
		//crows.addPlayer(pat);
		//crows.addPlayer(beckham);
		System.out.println(crows.numPlayers());
		Team<BaseballPlayer> base = new  Team<>("Chicago Cubs");
		base.addPlayer(pat);
		
		Team<SoccerPlayer> soccer = new  Team<>("this wont work");
		soccer.addPlayer(bekham);
		
		Team<FootballPlayer> mel = new  Team<>("Melbourne");
		FootballPlayer banks = new FootballPlayer("Gordon");
		
		mel.addPlayer(banks);
		
		Team<FootballPlayer> hawth = new  Team<>("Hawthorn");
		Team<FootballPlayer> freman= new  Team<>("Fremantle");
		 hawth.matchResult(freman, 1, 0);
	        hawth.matchResult(crows, 3, 8);

	        crows.matchResult(freman, 2, 1);
	        crows.matchResult(mel, 1, 1);
		
		
		
		
		
	}
}
