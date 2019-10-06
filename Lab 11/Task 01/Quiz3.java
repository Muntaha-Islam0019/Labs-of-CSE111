public class Quiz3{
    private int sum;
    private int y;
    public static int x;
    public Quiz3(){
        sum = 5;
        x = 2;
        y = 2;
    }  
    public Quiz3(int k){
        sum = sum + k;
        y = 3;
        x += 2;
    }     
    public void methodA(){
        int x=1, y=1;
        msgClass [] msg = new msgClass[1];
        msgClass myMsg = new msgClass();
        myMsg.content = Quiz3.x;
        msg[0] = myMsg;
        msg[0].content = this.y + myMsg.content;
        this.y = this.y + methodB(msg[0]);
        y = methodB(msg[0]) + this.y;
        x = y + methodB(msg, msg[0]);
        sum = x + y + msg[0].content;
        System.out.println(x + " " + y+ " " + sum);
    }
    private int methodB(msgClass [] mg2, msgClass mg1){
        int x = 2;
        y = y + mg2[0].content;
        mg2[0].content = y + mg1.content;
        x = x + 2 + mg1.content;
        sum = sum + x + y;
        mg1.content = sum - mg2[0].content ;
        System.out.println(Quiz3.x + " " + this.y+ " " + sum);
        return sum;
    }
    public int methodB(msgClass mg1){
        int x = 1, y = 2;
        y = sum + mg1.content;
        this.y = y + mg1.content;
        x = Quiz3.x + 5 + mg1.content;
        sum = sum + x + y;
        Quiz3.x = mg1.content + x + 3;
        System.out.println(x + " " + y+ " " + sum);
        return y;
    }
}
