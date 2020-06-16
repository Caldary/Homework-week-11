public class Calculator {
    private String name;

    public Calculator(String name){
        this.name = name;
    }

    public int add(int num1, int num2) {
        return num1 + num2;
    }

    public int subtract(int i, int i1) {
        return i - i1;
    }

    public int multiply(int i, int i1) {
        return i * i1;
    }

    public double divide(int i, int i1) {
        return i / i1;
    }
}
