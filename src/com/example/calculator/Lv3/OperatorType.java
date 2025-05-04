package com.example.calculator.Lv3;

public enum OperatorType {
    ADDITION('+'){
        @Override
        public double calculation(double a, double b){
            return a + b;
        }
    },

    SUBTRACTION('-'){
        @Override
        public double calculation (double a, double b){
            return a - b;
        }
    },

    MULTIPLICATION('*'){
        @Override
        public double calculation(double a, double b){
            return a * b;
        }
    },

    DIVISION('/'){
        @Override
        public double calculation(double a, double b){
            return a / b;
        }
    };

    public abstract double calculation(double a, double b);

    private final char operator;

    OperatorType(char operator){
        this.operator = operator;
    }

    public static OperatorType getOperatorType(char operator){
        if(operator == '+'){
            return OperatorType.ADDITION;
        } else if(operator == '-'){
            return OperatorType.SUBTRACTION;
        } else if(operator == '*'){
            return OperatorType.MULTIPLICATION;
        } else if(operator == '/'){
            return OperatorType.DIVISION;
        }
        return null;
    }

}
