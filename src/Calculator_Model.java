public class Calculator_Model {
    public double inputNo;
    public char operator;
    public double answer;
    public int resetVal;

    public Calculator_Model() {
        inputNo = 0;
        answer = 0;
        resetVal = 0;
    }

    public void resetDisplay() {
        resetVal = 0;
    }
    
}
