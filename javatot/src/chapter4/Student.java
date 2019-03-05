
package chapter4;
// pass variable by val vs by reference
// primitive + String = passing by value
// object always passing by reference

public class Student {
    void setName(String name){
        System.out.println(name);
        name = name + " bin Zakaria";
    }
    void changeBookTitle(Book b){
        b.title = "Java Advanced";
    }
    
    public static void main(String[] args){
        Student s1 = new Student(); // obj
        String nama = "Azman";
        // ini passing var by value
        s1.setName(nama);
        System.out.println(nama);
        // passing by referance
        Book b1 = new Book();
        b1.title = "Java for beginner";
        System.out.println(b1.title);
        s1.changeBookTitle(b1);
        System.out.println(b1.title);
    }
}

