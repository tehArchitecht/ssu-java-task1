package com.tehArchitecht.task1;

import java.util.InputMismatchException;
import java.util.Scanner;

// I asked around a couple of people from my group and they said they're
// handling invalid input exceptions. So I decided to move all the checks into
// a separate class.
class InputHandler {
    private Scanner in;

    InputHandler() {
        in = new Scanner(System.in);
    }

    double nextDouble() {
        try {
            return in.nextDouble();
        } catch (InputMismatchException e) {
            System.err.println("Ошибка. Введено не вещественное число.");
            System.exit(1);
        }
        return Double.NaN;
    }

    int nextInt() {
        try {
            return in.nextInt();
        } catch (InputMismatchException e) {
            System.err.println("Ошибка. Введено не целое число.");
            System.exit(1);
        }
        return 0;
    }
}
