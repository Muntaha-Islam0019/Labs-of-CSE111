public class FootBallTeam extends Team {
    
    FootBallTeam (String str1, String str2) {
        super(str1, str2);
    }
    
    @Override
    public void getMascot() {
        System.out.println("Our football team mascot name is " + super.mascot);
    }
    
    @Override
    public String toString () {
        return "Our name is " + super.name + "\nWe play Football";
    }
}