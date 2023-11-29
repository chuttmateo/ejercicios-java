package org.example.enums;

public enum ComplexLevel {
    EASY(Level.EASY){
        @Override
        public String printValue() {
            return super.printValue() + " Overridden";
        }
    },
    NORMAL(Level.NORMAL){
        @Override
        public String printValue() {
            return super.printValue() + " Overridden";
        }
    },
    HARD(Level.HARD);

    private final Level level;

    ComplexLevel(Level level) {
        this.level = level;
    }

    public String printValue(){
        return level.getValue();
    }
}
