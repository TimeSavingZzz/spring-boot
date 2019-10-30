package com.qdu.seq.util;

public class AdditionEquation implements IEquation {
    private int operand1;
    private int operand2;
    private int result;

    public AdditionEquation(int operand1, int operand2) {
        this.operand1 = operand1;
        this.operand2 = operand2;
        this.result = operand1 + operand2;
    }

    public String toStringWithoutAnswer() {
        return this.operand1 + "+" + this.operand2;
    }

    public String toStringWithAnswer() {
        return this.operand1 + "+" + this.operand2 + "=" + this.result;
    }

//    public boolean equals(Object o) {
//        if (this == o) {
//            return true;
//        } else if (o != null && this.getClass() == o.getClass()) {
//            AdditionEquation that = (AdditionEquation) o;
//            return this.result == that.result && (this.operand1 == that.operand1 || this.operand1 == that.operand2);
//        } else {
//            return false;
//        }
//    }
//
//    public int hashCode() {
//        int result1 = this.operand1;
//        result1 = 31 * result1 + this.operand2;
//        result1 = 31 * result1 + this.result;
//        return result1;
//    }
}
