class PuzzleTester{
  public static void main(String[]args)
  {
    Puzzle p = new Puzzle();
    p.methodA();
    p.methodB(7);
  }
}

class Puzzle{
  static int x;
  void methodA(){
    int z;
    x=5; //at home, comment/delete this line and try again
    z=x+methodB(x);
    Maze m1 = new Maze();
    System.out.println(x+" "+z);
    m1.methodA();
    z=methodB(z+2)+x;
    System.out.println(x+" "+z);
    methodB(x,z);
    System.out.println(x+" "+z);
  }
  int methodB(int y){
    x=y+x;
    System.out.println(x+" "+y);
    return x+3;
  }
  void methodB(int z, int x){
    z=z+1;
    x=x+1;
    System.out.println(z+" "+x);
  }
}

class Maze{
  static int x;
  void methodA(){
    int m;
    x=5;
    m=x+methodB(x);
    System.out.println(x+" "+m);
    m=methodB(m-3)+x;
    System.out.println(x+" "+(m));
    methodB(x,m);
    System.out.println(x+" "+m+x);
  }
  int methodB(int y){
    x=y*y;
    System.out.println(x+" "+y);
    return x+3;
  }
  void methodB(int z, int x){
    z=z-2;
    x=x*1;
    System.out.println(z+" "+x);
  }
}
