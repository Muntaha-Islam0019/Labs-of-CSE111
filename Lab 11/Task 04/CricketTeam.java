public class CricketTeam extends Team {
    
    CricketTeam (String str1, String str2) {
        super(str1, str2);
    }
    
    @Override
    public void getMascot() {
        System.out.println("Our cricket team mascot name is " + super.mascot);
    }
    
    @Override
    public String toString () {
        return "Our name is " + super.name + "\nWe play Cricket";
    }
}