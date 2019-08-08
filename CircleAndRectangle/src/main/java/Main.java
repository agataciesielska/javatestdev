public class Main {
​
    public static void main(String[] args) {
        System.out.println(policzPole(new Kolo(10)));
    }
​
    public static double policzPole(ZdolnyDoLiczeniaPola a) {
        return a.policzPole();
    }
}
​
interface ZdolnyDoLiczeniaPola {
    double policzPole();
}
​
class Kolo implements ZdolnyDoLiczeniaPola {
​
    private double promien;
​
    public Kolo(double promien) {
        this.promien = promien;
    }
​
    @Override
    public double policzPole() {
        return Math.PI * Math.pow(promien, 2);
    }
}
​
class Kwadrat implements ZdolnyDoLiczeniaPola {
​
    private int dlugoscBoku;
​
    public Kwadrat(int dlugoscBoku) {
        this.dlugoscBoku = dlugoscBoku;
    }
​
    @Override
    public double policzPole() {
        return Math.pow(dlugoscBoku, 2);
    }
}