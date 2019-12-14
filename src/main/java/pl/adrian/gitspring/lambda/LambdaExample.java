package pl.adrian.gitspring.lambda;



public class LambdaExample {

    public static void main(String[] args) {
        System.out.println(performCalculations(1, 2, new Calculations() {
            @Override
            public int calc(int a, int b) {
                return a+b;
            }
        }));
        System.out.println(performCalculations(1,2, (a, b) -> a-b));



    }

    private static int performCalculations(int first, int second, Calculations calculations){
        return calculations.calc(first,second);
    }


}
