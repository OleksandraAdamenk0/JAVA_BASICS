package Task3;

import Task3.AbstractClass.SinFunction;
import Task3.AbstractClass.SquareFunction;

import Task3.Interface.InterfaceFunction;
import Task3.Interface.MinFinder;

import Task3.Reference.Methods;

public class Main {
    public static void main(String[] args) {
        // first variant
        System.out.println("Abstract class: ");
        SquareFunction squareFunction = new SquareFunction();
        System.out.println(squareFunction.findMin(-10, 10, 0.5));
        SinFunction sinFunction = new SinFunction();
        System.out.println(sinFunction.findMin(-10, 10, 0.5));

        // second variant
        System.out.println("Interface: ");
        Task3.Interface.SquareFunction squareFunction1 = new Task3.Interface.SquareFunction();
        System.out.println(MinFinder.findMin(-10, 10, 0.5, squareFunction1));
        Task3.Interface.SinFunction sinFunction1 = new Task3.Interface.SinFunction();
        System.out.println(MinFinder.findMin(-10, 10, 0.5, sinFunction1));

        // third variant
        System.out.println("Anonymous class: ");
        System.out.println(MinFinder.findMin(-10, 10, 0.5, new InterfaceFunction() {
            @Override
            public double f(double x) { return x * x; }
        }));
        System.out.println(MinFinder.findMin(-10, 10, 0.5, new InterfaceFunction() {
            @Override
            public double f(double x) { return Math.sin(x); }
        }));

        // fourth variant
        System.out.println("Lambda expression: ");
        System.out.println(MinFinder.findMin(-10, 10, 0.5, (double x) -> x * x));
        System.out.println(MinFinder.findMin(-10, 10, 0.5, (double x) -> Math.sin(x)));

        // fifth variant
        System.out.println("Method reference: ");
        System.out.println(MinFinder.findMin(-10, 10, 0.5, Methods::squareFunction));
        System.out.println(MinFinder.findMin(-10, 10, 0.5, Methods::sinFunction));
    }
}
