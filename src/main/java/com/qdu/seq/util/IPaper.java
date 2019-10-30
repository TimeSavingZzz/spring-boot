//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.qdu.seq.util;

import java.util.Set;

public interface IPaper {
    byte ADD = 1;
    byte MINUS = 0;
    byte BOTH = 3;

    Set<IEquation> getEquations();

    boolean contains(IEquation var1);
}
