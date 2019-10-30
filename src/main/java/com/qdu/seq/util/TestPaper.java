
package com.qdu.seq.util;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class TestPaper implements IPaper {
    private Set<IEquation> paper = new HashSet();

    public TestPaper(int questionNumber, int bound, int type) {
        Random random = new Random();
        int operand1;
        int operand2;
        if (type == 1) {
            while(this.paper.size() < questionNumber) {
                operand1 = random.nextInt(bound);
                operand2 = random.nextInt(bound - operand1 + 1);
                this.paper.add(new AdditionEquation(operand1, operand2));
            }
        } else if (type == 0) {
            while(this.paper.size() < questionNumber) {
                operand1 = random.nextInt(bound);
                operand2 = random.nextInt(operand1 + 1);
                this.paper.add(new SubtractionEquation(operand1, operand2));
            }
        } else if (type == 3) {
            while(this.paper.size() < questionNumber) {
                operand1 = random.nextInt(bound);
                int operator = random.nextInt(2);
                if (operator == 0) {
                    operand2 = random.nextInt(operand1 + 1);
                    this.paper.add(new SubtractionEquation(operand1, operand2));
                } else if (operator == 1) {
                    operand2 = random.nextInt(bound - operand1 + 1);
                    this.paper.add(new AdditionEquation(operand1, operand2));
                }
            }
        }

    }

    public Set<IEquation> getEquations() {
        return this.paper;
    }

    public boolean contains(IEquation equation) {
        return this.paper.contains(equation);
    }

    public String toString() {
        return "TestPaper{paper=" + this.paper + '}';
    }
}
