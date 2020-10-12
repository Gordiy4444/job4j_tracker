package ru.job4j.sort;

public class Dop {
    private String name;

    private String gmail;

    private String login;

    public Dop(String name, String gmail, String login) {
        this.name = name;
        this.gmail = gmail;
        this.login = login;
    }

    public String geName() {
        return name;
    }

    public String getGmail() {
        return gmail;
    }

    public String getLogin() {
        return login;
    }

    @Override
    public String toString() {
        return name + ';' +
                gmail + ';' +
                login + ';'
                ;
    }


    public static void main(String[] args) {
        Dop dop = new Dop("Dima", "Dima@", "DimaG");
        System.out.println(dop);
    }
}