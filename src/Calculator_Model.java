import javax.security.auth.PrivateCredentialPermission;

public class Calculator_Model {
    private double inputNo;
    private char operator;
    private double answer;
    private int resetVal;

    public Calculator_Model() {
        inputNo = 0;
        answer = 0;
        resetVal = 0;
    }

    public void resetDisplay() {
        resetVal = 0;
    }

    public double getInputNo() {
        return inputNo;
    }

    public void setInputNo(double val) {
        inputNo = val;
    }

    public char getOperator() {
        return operator;
    }

    public void setOperator(char op) {
        operator = op;
    }

    public double getAnswer() {
        return answer;
    }

    public void setAnswer(double result) {
        answer = result;
    }

    public int getResetVal() {
        return resetVal;
    }

    public void setResetVal(int rVal) {
        resetVal = rVal;
    }
    
}
