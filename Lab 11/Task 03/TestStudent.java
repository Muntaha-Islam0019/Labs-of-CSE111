public class TestStudent{
    public static void printName(Student s){
        System.out.println("Name : "+s.getName());
    }
    public static void main(String [] args){
        printName(new BBAStudent());
        printName(new BBAStudent("Barack Obama"));
        printName(new BBAStudent("Joe Biden"));    
    }
}