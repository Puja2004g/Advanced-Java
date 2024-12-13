public class enumDatatype {
    enum day{
        sunday(1), monday(2), tuesday(3), wednesday(4), thursday(5), friday(6), saturday(7);

        private final int value;

        day(int val){
            this.value = val;
        }

        int getvalue(){
            return value;
        }
    }
    public static void main(String[] args) {
        for(day d1 : day.values()){
            System.out.println(d1 + "->" + d1.value);
        }
    }
}