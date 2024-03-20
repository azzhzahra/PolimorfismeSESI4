/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package namabuah;

/**
 *
 * @author User
 */

// Kelas utama yang merepresentasikan sebuah buah
class Fruit {
    private String name;

    public Fruit(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

// Kelas turunan yang merepresentasikan sebuah buah dengan warna
class ColoredFruit extends Fruit {
    private String color;

    public ColoredFruit(String name, String color) {
        super(name);
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}

// Kelas turunan yang merepresentasikan sebuah buah dengan rasa
class FlavoredFruit extends Fruit {
    private String flavor;

    public FlavoredFruit(String name, String flavor) {
        super(name);
        this.flavor = flavor;
    }

    public String getFlavor() {
        return flavor;
    }
}

public class NamaBuah {
    public static void main(String[] args) {
        // Membuat objek berbagai jenis buah
        Fruit fruit1 = new Fruit("Apple");
        ColoredFruit fruit2 = new ColoredFruit("Banana", "Yellow");
        FlavoredFruit fruit3 = new FlavoredFruit("Strawberry", "Sweet");

        // Memanggil metode untuk mendapatkan detail buah
        System.out.println("Fruit 1: " + fruit1.getName());
        System.out.println("Fruit 2: " + fruit2.getName() + ", Color: " + fruit2.getColor());
        System.out.println("Fruit 3: " + fruit3.getName() + ", Flavor: " + fruit3.getFlavor());
    }
}