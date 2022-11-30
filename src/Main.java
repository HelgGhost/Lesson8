public class Main {
    public static void main(String[] args) {
        Counter chet = new Counter("Четные");
        Counter nochet = new Counter("Нечетные");
        for (int i=1;i<101;i++){
            if (i%2==0){
                chet.AddOne();
            } else {
                nochet.AddOne();
            }
        }
        printCount(chet);
        printCount(nochet);
    }
    static void printCount(Counter counter){
        System.out.printf("%s: %d\n", counter.name, counter.count);
    }
}