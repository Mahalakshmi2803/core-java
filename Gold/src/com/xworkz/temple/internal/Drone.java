package com.xworkz.temple.internal;



    public class Drone {
        public Drone() {
            System.out.println("no-args constructor of Drone");
        }

        public void fly() {
            System.out.println("fly  running in Drone");

            batteryStatus();
        }

        void speed() {
            System.out.println("speed  running in Drone");
        }

        private void batteryStatus() {
            System.out.println("batteryStatus running in Drone");
        }


}
