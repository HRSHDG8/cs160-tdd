package edu.sdsu.cs160l.calculator;

public class MathOperations {

    private Calculator calculator;

    public MathOperations() {
        this.calculator = new SimpleCalculator();
    }

    public int factorial(int n){
        int factorial = 1;
        for(int i=2;i<=n;i++){
            factorial = calculator.mul(factorial, i);
        }
        return factorial;
    }

    public int average(int[] arr){
        int sum=0;
        for(int i : arr){
            sum = calculator.add(sum, i);
        }

        return calculator.div(sum, arr.length);
    }
}
