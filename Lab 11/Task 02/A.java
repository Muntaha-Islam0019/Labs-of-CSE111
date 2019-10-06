class A{
  public static int temp = 5;
  public int sum;
  public int y;
  public A(){
    y = temp - 3;
    sum = temp + 2;
    temp-=2;
  }
  public void methodA(int m, int n){
    int x = 1;
    y = y + m + (temp++);
    x = x + 1 +  n;
    sum = sum + x + y;
    System.out.println(x + " " + y+ " " + sum);  
  }
}