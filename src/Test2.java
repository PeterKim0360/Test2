public class Test2 {
    public static void main(String[] args) {
        System.out.println(f(20));
    }
    public static int f(int n){
        if(n==1){
            return 0;
        }
        if(n==2){
            return 1;
        }
        return f(n-1)+f(n-2);
    }
}
