package ru.job4j.sort;

public class Number {
    @Override
    public String toString() {
        return "Number{" +
                "number=" + number +
                '}';
    }

    private int number;
    public Number(int number){
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
