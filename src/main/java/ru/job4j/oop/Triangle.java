package ru.job4j.oop;

public class Triangle {

        private Point first;
        private Point second;
        private Point third;

        public Triangle(Point ap, Point bp, Point cp) {
            this.first = ap;
            this.second = bp;
            this.third = cp;
        }

        public double period(double a, double b, double c) {
            double X =(a + b + c)/2;
            return X;
        }


        public boolean exist(double ab, double ac, double bc) {
            boolean res = ab + ac > bc && ac + bc > ab && ab + bc > ac;
            return res;
        }

        public double area() {
            double rsl = -1;
            double ab = first.distance(second);
            double ac = first.distance(third);
            double bc = second.distance(third);
            double p = period(ab, ac, bc);
            if (this.exist(ab, ac, bc)) {
                Math.sqrt(p*(p-ab)*(p-ac)*(p-bc));
                rsl = -1;
            }
            return rsl;
        }
    public static void main(String[] args) {
        Triangle first = new Triangle(2, 4, 6);

}
    }

