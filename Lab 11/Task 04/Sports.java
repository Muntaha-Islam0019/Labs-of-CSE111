public class Sports{
  public static void printDetail(Team t){
    System.out.println("----Printing Detail-----");
    System.out.println(t);
    t.getMascot();
  }
  public static void main(String [] args){
    FootBallTeam f = new FootBallTeam("Brazil","Ace Purple");
    CricketTeam c = new CricketTeam("Australia","Golden Griffin");
    printDetail(f);
    printDetail(c);
  }
}
