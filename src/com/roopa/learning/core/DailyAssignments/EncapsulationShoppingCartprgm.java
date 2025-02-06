package com.roopa.learning.core.DailyAssignments;

public class EncapsulationShoppingCartprgm {

    public static void main(String[] args) {
        Product tesla = new Product();
        tesla.setName("Tesla");
        tesla.setPrice(2000);
        tesla.setStockQuantity(20);

        System.out.println(tesla);

        tesla.updatePrice(3000);
        tesla.isStockAvailable(30);
        tesla.purchaseStock(40);

        Product mSoft = new Product();
        mSoft.setName("Microsoft");
        mSoft.setPrice(2500);
        mSoft.setStockQuantity(40);

        System.out.println(mSoft);

        mSoft.updatePrice(1000);
        mSoft.isStockAvailable(30);
        mSoft.purchaseStock(20);



    }
}


    class Product {

        private String name;
        private int price;
        private int stockQuantity;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getPrice() {
            return price;
        }

        public void setPrice(int price) {
            this.price = price;
        }

        public int getStockQuantity() {
            return stockQuantity;
        }

        public void setStockQuantity(int stockQuantity) {
            this.stockQuantity = stockQuantity;
        }
        //  }

        public void updatePrice(int newPrice) {
            if (newPrice > 0) {
                this.price = newPrice;
                System.out.println("price is Updated to : " + newPrice);
            } else {
                System.out.println("price is not valid");
            }
        }

        public boolean isStockAvailable(int quantity) {
            return stockQuantity >= quantity;
        }

        public boolean purchaseStock(int quantity){

            if(isStockAvailable(quantity)) {
                stockQuantity -= quantity;
                System.out.println(quantity + " " + name + "stocks purchased successfully");
                return true;
               } else{
                System.out.println("Insufficient Stocks for " +name);
                return  false;
            }
        }

        @Override
        public String toString() {
            return "Product{" +
                    "name='" + name + '\'' +
                    ", price=" + price +
                    ", stockQuantity=" + stockQuantity +
                    '}';
        }
    }

