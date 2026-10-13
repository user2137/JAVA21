import java.util.Scanner;

class Clock {
    int h, m, s;

    Clock() {
        h = 0;
        m = 0;
        s = 0;
    }

    Clock(int h, int m, int s) {
        this.h = h;
        this.m = m;
        this.s = s;
    }

    void display() {
        if (h >= 0 && h <= 23 && m >= 0 && m <= 59 && s >= 0 && s <= 59) {
            String period = (h >= 12) ? "PM" : "AM";
            int hour = h % 12;

            if (hour == 0)
                hour = 12;

            System.out.printf("%02d:%02d:%02d %s%n", hour, m, s, period);
        } else {
            System.out.println("Invalid Time");
        }
    }
}

public class SLIP13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter hours: ");
        int h = sc.nextInt();

        System.out.print("Enter minutes: ");
        int m = sc.nextInt();

        System.out.print("Enter seconds: ");
        int s = sc.nextInt();

        Clock c = new Clock(h, m, s);
        c.display();

        sc.close();
    }
}

//Q.2

<!DOCTYPE html>
<html>
<body style="background-color: light;">

<h3>Swap Two Numbers</h3>

<script>
let a = Number(prompt("Enter first number:"));
let b = Number(prompt("Enter second number:"));

document.write(`Before Swap: a = ${a}, b = ${b}<br>`);

[a, b] = [b, a];

document.write(`After Swap: a = ${a}, b = ${b}`);
</script>

</body>
</html>