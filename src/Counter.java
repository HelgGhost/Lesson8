public class Counter {
    public String name;
    public int count;
    public Counter(String name,int count){
        this.name = name;
        this.count = count;
    }
    public Counter(String name){
        this(name,0);
    }
    public int AddOne(){
        this.count++;
        return count;
    }
    public int SubOne(){
        this.count--;
        return count;
    }
    public int AddNumber(int number){
        this.count+=number;
        return count;
    }
    public int SubNumber(int number){
        this.count-=number;
        return count;
    }
}
