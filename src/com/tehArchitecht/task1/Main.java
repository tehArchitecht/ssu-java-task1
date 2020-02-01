package com.tehArchitecht.task1;

import static java.lang.Math.sqrt;

public class Main {
    private static final InputHandler in = new InputHandler();

    public static void main(String[] args) {
        System.out.print("Введите номер группы заданий (1-4): ");
        int groupIndex = in.nextInt();

        switch (groupIndex) {
            case 1:
                System.out.print("Введите номер задания (1-6): ");
                break;
            case 2:
                System.out.print("Введите номер задания (1-4): ");
                break;
            case 3:
                System.out.print("Введите номер задания (1-4): ");
                break;
            case 4:
                System.out.print("Введите номер задания (1-7): ");
                break;
            default:
                System.err.println("Ошибка. Группы с номером " + groupIndex + " не существует.");
                return;
        }
        int exerciseIndex = in.nextInt();

        boolean failed = false;
        switch (groupIndex) {
            case 1:
                switch (exerciseIndex) {
                    case 1: exercise11(); break;
                    case 2: exercise12(); break;
                    case 3: exercise13(); break;
                    case 4: exercise14(); break;
                    case 5: exercise15(); break;
                    case 6: exercise16(); break;
                    default: failed = true; break;
                }
                break;
            case 2:
                switch (exerciseIndex) {
                    case 1: exercise21(); break;
                    case 2: exercise22(); break;
                    case 3: exercise23(); break;
                    case 4: exercise24(); break;
                    default: failed = true; break;
                }
                break;
            case 3:
                switch (exerciseIndex) {
                    case 1: exercise31(); break;
                    case 2: exercise32(); break;
                    case 3: exercise33(); break;
                    case 4: exercise34(); break;
                    default: failed = true; break;
                }
                break;
            case 4:
                switch (exerciseIndex) {
                    case 1: exercise41(); break;
                    case 2: exercise42(); break;
                    case 3: exercise43(); break;
                    case 4: exercise44(); break;
                    case 5: exercise45(); break;
                    case 6: exercise46(); break;
                    case 7: exercise47(); break;
                    default: failed = true; break;
                }
                break;
        }

        if (failed) {
            System.err.println("Ошибка. Задания с номером " + exerciseIndex + " не существует.");
        }
    }

    private static void exercise11() {
        System.out.print("Введите первое число: ");
        double a = in.nextDouble();

        System.out.print("Введите второе число: ");
        double b = in.nextDouble();

        double sumOfSquares = a*a + b*b;
        double squareOfSums = (a + b)*(a + b);

        if (sumOfSquares < squareOfSums) {
            System.out.println("Больше квадрат суммы" + " (" + squareOfSums + " > " + sumOfSquares + ")" + ".");
        } else if (sumOfSquares == squareOfSums) {
            System.out.println("Они равны" + " (" + sumOfSquares + " = " + squareOfSums + ")" + ".");
        } else {
            System.out.println("Больше сумма квадратов" + " (" + sumOfSquares + " > " + squareOfSums + ")" + ".");
        }
    }

    private static void exercise12() {
        System.out.print("Введите зарплату: ");
        double salary = in.nextDouble();

        System.out.print("Введите стаж: ");
        double experience = in.nextDouble();

        if (experience < 2 || experience > 10) {
            System.err.println("Ошибка. Ожидается, что стаж принадлежит диапазону [2, 10] лет.");
        } else if (experience < 5) {
            System.out.println("Надбавка составит 2%, а сумма - " + salary*1.02);
        } else {
            System.out.println("Надбавка составит 5%, а сумма - " + salary*1.05);
        }
    }

    private static void exercise13() {
        System.out.println("Введите координаты точки A:");
        System.out.print("x0 = ");
        double x0 = in.nextDouble();
        System.out.print("y0 = ");
        double y0 = in.nextDouble();

        System.out.println("Введите координаты точки B:");
        System.out.print("x1 = ");
        double x1 = in.nextDouble();
        System.out.print("y1 = ");
        double y1 = in.nextDouble();

        double aDist = sqrt(x0*x0 + y0*y0);
        double bDist = sqrt(x1*x1 + y1*y1);

        if (aDist < bDist) {
            System.out.println("Вторая точка более удалена.");
        } else if (aDist == bDist) {
            System.out.println("Точки равноудалены.");
        } else {
            System.out.println("Первая точка более удалена.");
        }
    }

    private static void exercise14() {
        System.out.print("Введите длину стороны a: ");
        double a = in.nextDouble();
        System.out.print("Введите длину стороны b: ");
        double b = in.nextDouble();
        System.out.print("Введите длину стороны c: ");
        double c = in.nextDouble();

        if (a*a + b*b == c*c || c*c + a*a == b*b || b*b + c*c == a*a) {
            System.out.println("Треугольник прямоугольный.");
        } else {
            System.out.println("Треугольник не прямоугольный.");
        }
    }

    private static void exercise15() {
        System.out.println("Введите 3 числа:");
        double a = in.nextDouble();
        double b = in.nextDouble();
        double c = in.nextDouble();

        if (a > 0.0) a = a*a;
        if (b > 0.0) b = b*b;
        if (c > 0.0) c = c*c;

        System.out.println("Результат:");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }

    private static void exercise16() {
        System.out.print("Введите число от 1 до 12: ");
        int n = in.nextInt();

        switch (n) {
            case 12: case  1: case  2: System.out.println("Время года - зима.");  break;
            case  3: case  4: case  5: System.out.println("Время года - весна."); break;
            case  6: case  7: case  8: System.out.println("Время года - лето.");  break;
            case  9: case 10: case 11: System.out.println("Время года - осень."); break;
            default: System.out.println("Число " + n + " не принадлежит диапазону от 1 до 12."); break;
        }
    }

    private static void exercise21() {
        System.out.print("Введите N (верхнюю границу на поиск): ");
        int n = in.nextInt();

        System.out.println("Ответ:");
        // Раздел называется "Операторы цикла с предусловием и постусловием", поэтому while.
        int i = 0;
        while (i < n) {
            if (i % 5 == 0 || i % 3 != 0) {
                i++;
                continue;
            }

            int sum = sumDigits(i);
            if (sum % 5 != 0 && sum % 3 == 0) {
                System.out.println(i);
            }

            i++;
        }
    }

    private static int sumDigits(int num) {
        int sum = 0;
        while (num != 0) {
            int digit = num % 10;
            sum += digit;

            num = num / 10;
        }

        return sum;
    }

    private static void exercise22() {
        System.out.print("Введите N: ");
        int n = in.nextInt();

        System.out.println("Ответ:");
        // Раздел называется "Операторы цикла с предусловием и постусловием", поэтому while.
        int i = 5;
        while (i <= n) {
            System.out.println(i);
            i += 5;
        }
    }

    private static void exercise23() {
        System.out.print("Введите N: ");
        int n = in.nextInt();

        int curr = 1;
        while (curr < n) {
            curr *= 2;
        }

        if (curr == n) {
            System.out.println(n + " - степень двойки.");
        } else {
            System.out.println(n + " - не степень двойки.");
        }
    }

    private static void exercise24() {
        System.out.print("Введите N: ");
        int n = in.nextInt();

        int curr = 1;
        int prev = 1;

        System.out.println("Числа Фибоначчи:");
        System.out.println(prev);

        while (curr < n) {
            System.out.println(curr);
            int tmp = prev;
            prev = curr;
            curr += tmp;
        }
    }

    private static void exercise31() {
        System.out.print("Введите число A: ");
        int a = in.nextInt();
        System.out.print("Введите число B: ");
        int b = in.nextInt();

        if (a >= b) {
            System.err.println("Ошибка. A >= B.");
            return;
        }

        int n = b - a + 1;
        System.out.println("Количество чисел: " + n);

        System.out.println("Числа:");
        for (int i = a; i <= b; i++) {
            System.out.println(i);
        }
    }

    private static void exercise32() {
        System.out.print("Введите число A: ");
        int a = in.nextInt();
        System.out.print("Введите число B: ");
        int b = in.nextInt();

        if (a >= b) {
            System.err.println("Ошибка. A >= B.");
            return;
        }

        int n = b - a + 1;
        System.out.println("Количество чисел: " + n);

        System.out.println("Числа:");
        for (int i = b; i >= a; i--) {
            System.out.println(i);
        }
    }

    private static void exercise33() {
        System.out.print("Введите вещественное число A: ");
        double a = in.nextDouble();
        System.out.print("Введите целое число N: ");
        int n = in.nextInt();

        if (n <= 0) {
            System.err.println("Ошибка. N <= 0.");
            return;
        }

        double pow = 1.0;
        for (int i = 0; i < n; i++) {
            pow *= a;
        }

        System.out.println("A в степени " + n + ": " + pow);
    }

    private static void exercise34() {
        System.out.print("Введите вещественное число A: ");
        double a = in.nextDouble();
        System.out.print("Введите целое число N: ");
        int n = in.nextInt();

        if (n <= 0) {
            System.err.println("Ошибка. N <= 0.");
            return;
        }

        double pow = 1.0;
        for (int i = 1; i <= n; i++) {
            pow *= a;
            System.out.println("A в степени " + i + ": " + pow);
        }
    }

    private static void exercise41() {
        System.out.print("Введите n: ");
        int n = in.nextInt();

        System.out.println("Введите целые числа: ");
        int[] integers = new int[n];
        for (int i = 0; i < n; i++) {
            integers[i] = in.nextInt();
        }

        System.out.println("Чётные числа:");
        for (int curr : integers) {
            if (curr % 2 == 0) {
                System.out.println(curr);
            }
        }

        System.out.println("Нечётные числа:");
        for (int curr : integers) {
            if (curr % 2 != 0) {
                System.out.println(curr);
            }
        }
    }

    private static void exercise42() {
        System.out.print("Введите n: ");
        int n = in.nextInt();

        System.out.println("Введите целые числа: ");
        int[] integers = new int[n];
        for (int i = 0; i < n; i++) {
            integers[i] = in.nextInt();
        }

        System.out.println("Числа, которые делятся на 3 или на 9:");
        for (int curr : integers) {
            // a % 9 == 0 <=> a = 3*3*n (n = 1,2,...) = 3*k (k = 3,6,...)
            // b % 3 == 0 <=> b = 3*n (n = 1,2,...)
            // => c % 3 == 0 || c % 9 == 0 <=> c = 3*n (k = 1,2,...) || c = 3*k (k = 3,6,...)
            // <=> c = 3*n (k = 1,2,..) <=> c % 3 == 0
            // But i'll leave it this way.
            if (curr % 3 == 0 || curr % 9 == 0) {
                System.out.println(curr);
            }
        }
    }

    private static void exercise43() {
        System.out.print("Введите n: ");
        int n = in.nextInt();

        System.out.println("Введите целые числа: ");
        int[] integers = new int[n];
        for (int i = 0; i < n; i++) {
            integers[i] = in.nextInt();
        }

        System.out.println("Числа, которые делятся на 5 или на 10:");
        for (int curr : integers) {
            // Same argument holds true for this.
            if (curr % 5 == 0 || curr % 10 == 0) {
                System.out.println(curr);
            }
        }
    }

    private static void exercise44() {
        System.out.print("Введите n: ");
        int n = in.nextInt();

        if (n == 0) {
            System.err.println("Ошибка. n <= 0.");
            return;
        }

        int[] integers = new int[n];
        for (int i = 0; i < n; i++) {
            integers[i] = in.nextInt();
        }

        // GCD and LCM require for their arguments to be non-negative.
        int first = Math.abs(integers[0]);
        int gcd = first;
        int lcm = first;

        for (int i = 1; i < n; i++) {
            int curr = Math.abs(integers[i]);
            gcd = exercise44GCD(curr, gcd);
            lcm = exercise44LCM(curr, lcm);
        }

        System.out.println("НОД: " + gcd);
        System.out.println("НОК: " + lcm);
    }

    // Assumes the numbers are positive.
    private static int exercise44GCD(int a, int b) {
        if (a < b) {
            int tmp = a;
            a = b;
            b = tmp;
        }

        while (b > 0) {
            int r = a % b;
            a = b;
            b = r;
        }

        return a;
    }

    // Same (assumes the numbers are positive).
    private static int exercise44LCM(int a, int b) {
        return a*b/exercise44GCD(a, b);
    }

    private static void exercise45() {
        System.out.print("Введите n: ");
        int n = in.nextInt();

        int[] integers = new int[n];
        for (int i = 0; i < n; i++) {
            integers[i] = in.nextInt();
        }

        System.out.println("Простые числа:");
        for (int curr : integers) {
            if (exercise45IsPrime(curr)) {
                System.out.println(curr);
            }
        }
    }

    private static boolean exercise45IsPrime(int num) {
        if (num <= 1) return false;
        if (num == 2) return true;

        double boundary = Math.ceil(Math.sqrt(Math.abs(num)));
        for (int i = 2; i <= boundary; i++) {
            if (num % i == 0) return false;
        }

        return true;
    }

    private static void exercise46() {
        System.out.print("Введите n: ");
        int n = in.nextInt();

        int[] integers = new int[n];
        for (int i = 0; i < n; i++) {
            integers[i] = in.nextInt();
        }

        System.out.println("\"Счастливые\" числа:");
        for (int curr : integers) {
            int numDigits = (int) (Math.log10(curr) + 1.0);
            if (numDigits % 2 == 1) continue;

            int mask = (int) Math.pow(10.0, (double) (numDigits/2));
            int firstHalf  = curr / mask;
            int secondHalf = curr % mask;

            if (sumDigits(firstHalf) == sumDigits(secondHalf)) {
                System.out.println(curr);
            }
        }
    }

    private static void exercise47() {
        System.out.print("Введите цифру: ");
        int n = in.nextInt();

        if (n < 0 || n > 9) {
            System.err.println("Ошибка. Введите цифру от 0 до 9.");
            return;
        }

        String[] values = {"Ноль", "Один", "Два", "Три", "Четыре", "Пять", "Шесть", "Семь", "Восемь", "Девять"};
        System.out.println(values[n]);
    }
}
