package Lesson6;

import java.util.*;

class Laptop {
    private String ram; // ОЗУ
    private String hdd; // Объем ЖД
    private String os;  // Операционная система
    private String color; // Цвет

    public Laptop(String ram, String hdd, String os, String color) {
        this.ram = ram;
        this.hdd = hdd;
        this.os = os;
        this.color = color;
    }

    public String getRam() { return ram; }
    public String getHdd() { return hdd; }
    public String getOs() { return os; }
    public String getColor() { return color; }
}


