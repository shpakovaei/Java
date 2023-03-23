package lesson6;

public class Laptop {
        String producer;
        int operational;
        int storage;
        String color;
        int price;

        Laptop(String producer, int operational, int storage, String color, int price) {
            this.producer = producer;
            this.operational = operational;
            this.storage = storage;
            this.color = color;
            this.price = price;
        }

        Laptop() {
            producer = "default";
            operational = 0;
            storage = 0;
            color = "default";
            price = 0;
        }

        @Override
        public String toString() {
            return "Ноутбук " + producer + " с оперативной памятью " + operational + " гб." + ", цвет " + color + ", объём накопителя " + storage + " гб.," + " цена " + price + " руб.";
        }
    }

