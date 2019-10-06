// This is not a part of the task
class Main {
  public static void main(String[] args) {

    BoroInt int1 = new BoroInt() ;
    BoroInt int2 = new BoroInt("Moony") ;
    BoroInt int3 = new BoroInt(13523) ;
    BoroInt int4 = new BoroInt(int3) ;

    System.out.println ("Value of int1 : " + int1.val) ;
    System.out.println ("Value of int2 : " + int2.val) ;
    System.out.println ("Value of int3 : " + int3.val) ;
    System.out.println ("Value of int4 : " + int4.val) ;
    
  }
}