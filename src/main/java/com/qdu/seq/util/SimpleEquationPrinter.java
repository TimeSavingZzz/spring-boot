//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.qdu.seq.util;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SimpleEquationPrinter implements IEquationPrinter {
    public SimpleEquationPrinter() {
    }
    public List printPaper(IPaper paper, int questionsEachLine, boolean answer) {
        Iterator<IEquation> iterator = paper.getEquations().iterator();
        List list = new ArrayList();
        if (!answer) {
            while(iterator.hasNext()) {
                list.add(String.format("%-5s", ((IEquation)iterator.next()).toStringWithoutAnswer()));
            }
            return list;
        } else {
            while(iterator.hasNext()) {
                list.add(String.format("%-8s", ((IEquation)iterator.next()).toStringWithAnswer()));
            }
            return list;
        }
    }
}
