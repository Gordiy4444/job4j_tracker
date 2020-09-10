package ru.job4j.oop.inheritance;

public class JSONReport extends TextReport{
    @Override
    public String generate(String name, String body) {
        return "name" + name +
                "body" + body;
    }
    public static void main(String[] args) {
        JSONReport report = new JSONReport();
        String text = report.generate( " :  name ", " : body");
        System.out.println(text);
    }
}
