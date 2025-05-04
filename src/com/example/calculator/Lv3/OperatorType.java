package com.example.calculator.Lv3;

public enum OperatorType {
    PLUS('+'),
    MINUS('-'),
    MULTIPLY('*'),
    DIVIDE('/');

    private final char symbol;

    OperatorType(char symbol) {
        this.symbol = symbol;
    }

    public char getSymbol() {
        return symbol;
    }

    public static OperatorType fromChar(char ch) {
        for (OperatorType op : values()) {
            if (op.symbol == ch) {
                return op;
            }
        }
        return null;
    }
}
