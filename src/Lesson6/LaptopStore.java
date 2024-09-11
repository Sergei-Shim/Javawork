package Lesson6;

import java.util.*;

public class LaptopStore {
    private List<Laptop> laptops = new ArrayList<>();

    public void addLaptop(Laptop laptop) {
        laptops.add(laptop);
    }

    public void filterLaptops(Map<String, String> criteria) {
        for (Laptop laptop : laptops) {
            boolean matches = true;
            if (criteria.containsKey("RAM") && Integer.parseInt(laptop.getRam()) < Integer.parseInt(criteria.get("RAM"))) matches = false;
            if (criteria.containsKey("HDD") && Integer.parseInt(laptop.getHdd()) < Integer.parseInt(criteria.get("HDD"))) matches = false;
            if (criteria.containsKey("OS") && !laptop.getOs().equals(criteria.get("OS"))) matches = false;
            if (criteria.containsKey("Color") && !laptop.getColor().equals(criteria.get("Color"))) matches = false;

            if (matches) {
                System.out.println("Laptop: " + laptop.getRam() + "GB RAM, " + laptop.getHdd() + "GB HDD, OS: " + laptop.getOs() + ", Color: " + laptop.getColor());
            }
        }
    }

    public static void main(String[] args) {
        LaptopStore store = new LaptopStore();
        store.addLaptop(new Laptop("8", "512", "Windows", "Black"));
        store.addLaptop(new Laptop("16", "256", "Linux", "Silver"));

        Scanner scanner = new Scanner(System.in);
        Map<String, String> criteria = new HashMap<>();

        System.out.println("Введите минимальные значения для фильтрации:\\n1 - ОЗУ\\n2 - Объем ЖД\\n3 - Операционная система\\n4 - Цвет");

        criteria.put("RAM", "8");
        criteria.put("HDD", "256");
        store.filterLaptops(criteria);
    }
}
