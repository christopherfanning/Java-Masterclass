class tester{


    public static void main(String[] args) {
        SimpleCalculator calc = new SimpleCalculator();
    }
}


public class SimpleCalculator {
    // write your code here
    private double firstNumber, secondNumber;
    
    public double getFirstNumber(){
        return firstNumber;
    }
    
    public double getSecondNumber(){
        return secondNumber;
    }
    
    public void setFirstNumber(double number){
        this.firstNumber = number;
    }
    
    public void setSecondNumber(double number){
        this.secondNumber = number;
    }
    
    public double getAdditionResult(){
        return firstNumber + secondNumber;
    }
    public double getSubtractionResult(){
        return firstNumber - secondNumber;
    }

    public double getMultiplicationResult(){
        return firstNumber * secondNumber;
    }

    public double getDivisionResult(){
        return firstNumber / secondNumber;
    }

}


