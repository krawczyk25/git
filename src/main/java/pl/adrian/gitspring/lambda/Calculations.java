package pl.adrian.gitspring.lambda;

public interface Calculations {

    int calc(int a, int b);
    default void aaa(){}

    class Additions implements Calculations{

        @Override
        public int calc(int a, int b) {
            return a+b;
        }
    }

}
