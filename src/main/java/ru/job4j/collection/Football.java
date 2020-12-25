package ru.job4j.collection;

public class Football {
    private String name;

    private String surname;

    private int age;

    private String team ;

    private String league;

    private boolean activated;

    static class Builder {
        private String name;
        private String surname;
        private int age;
        private String team;
        private String league;
        private boolean activated;

        Builder buildName(String name) {
            this.name = name;
            return this;
        }

        Builder buildSurname(String surname) {
            this.surname = surname;
            return this;
        }

        Builder buildAge(int age) {
            this.age = age;
            return this;
        }

        Builder buildTeam(String team) {
            this.team = team;
            return this;
        }

        Builder buildLeague(String league) {
            this.league = league;
            return this;
        }

        Builder buildActivated(boolean activated) {
            this.activated = activated;
            return this;
        }

        @Override
        public String toString() {
            return "Builder{" +
                    "name='" + name + '\'' +
                    ", surname='" + surname + '\'' +
                    ", age=" + age +
                    ", team='" + team + '\'' +
                    ", league='" + league + '\'' +
                    ", activated=" + activated +
                    '}';
        }

        Football build() {
            Football player = new Football();
            player.name = name;
            player.surname = surname;
            player.age = age;
            player.team = team;
            player.league = league;
            player.activated = activated;
            return player;

        }

        public static void main(String[] args) {
            Football player = new Builder()
                    .buildName("Andrey")
                    .buildSurname("Arshavin")
                    .buildAge(39)
                    .buildTeam("VASHI OZHIDANIYA")
                    .buildLeague("VASHI PROBLEMY")
                    .buildActivated(false)
                    .build();
            System.out.println(player);
        }
    }
}
