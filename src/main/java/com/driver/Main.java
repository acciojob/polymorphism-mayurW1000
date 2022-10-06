package com.driver;

public class Main {

    public static class Product{

        public int product(int x, int y){
            int z = x * y;
            return z;
        }

        public int product(int x, int y, int z){
            int ans = x * y * z;
            return ans;
        }

        public double product(double x, double y){
            double ans = x * y;
            return ans;
        }

    }

    public static void main(String[]args){
        Product p = new Product();
        int ans = p.product(10,5);
        int ans2 = p.product(10,5,2);
        double ans3 =p.product(2.5,4.5);
    }
}