package ru.job4j.pojo;


public class Library {
    public static void main(String[] args) {
        Book bo = new Book("Clean code",500);
        Book go = new Book("Hed First java", 600);
        Book so = new Book("Grocking algorithms", 400);
        Book jo = new Book("Java 8", 700);
        Book[] boo = new Book[4];
boo[0] = bo;
boo[1] = go;
boo[2] = so;
boo[3] = jo;
for (int index = 0; index < boo.length; index ++){
    Book oo = boo[index];
    System.out.println(oo.getName() + " - " + oo.getCount());
}
        System.out.println("Rearrange 3 from 0");
        Book bucket = boo[0];
        boo[0] = boo[3];
        boo[3] = bucket;
        for (int index = 0; index < boo.length; index++)
            Book oo = boo[index];
            System.out.println(oo.getName() + " - " + oo.getCount());
    }

}
