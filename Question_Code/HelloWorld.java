public class HelloWorld {
    public static void main(String[] args){
        Hello();
        Print(100);
    }

    static void Hello(){
        System.out.println("hello world");
    }

    static void Print(int n){
        for(int i = 0; i < n; i++){
            System.out.println(i);
        }
    }
}
