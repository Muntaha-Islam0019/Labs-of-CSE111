class Team{
  protected String name = null;
  protected String mascot = "Default mascot";
  Team(String name, String mascot){
    this.name = name;
    this.mascot = mascot;
  }
  public void getMascot(){
       System.out.println(mascot);
  }
}
