//Q.1

import java.util.Scanner;

class InvalidDateException extends Exception {
    InvalidDateException(String msg) {
        super(msg);
    }
}

class MyDate {
    int Day, Month, year;

    void accept(int d, int m, int y) throws InvalidDateException {
        if (m < 1 || m > 12 || d < 1 || d > 31)
            throw new InvalidDateException("Invalid Date");

        int days[] = {31, (y % 400 == 0 || (y % 4 == 0 && y % 100 != 0)) ? 29 : 28,
                      31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if (d > days[m - 1])
            throw new InvalidDateException("Invalid Date");

        Day = d;
        Month = m;
        year = y;
    }

    void display() {
        System.out.printf("%02d/%02d/%04d%n", Day, Month, year);
    }
}

public class SLIP28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter date (dd mm yyyy): ");
        int d = sc.nextInt();
        int m = sc.nextInt();
        int y = sc.nextInt();

        try {
            MyDate date = new MyDate();
            date.accept(d, m, y);
            date.display();
        } catch (InvalidDateException e) {
            System.out.println("InvalidDateException: " + e.getMessage());
        }

        sc.close();
    }
}

//Q.2

const fs = require('fs');
const path = require('path');

let dir = '.';
let files = fs.readdirSync(dir);
let extensions = ['.txt', '.json', '.js'];

console.log("Matching Files:");

files.forEach(file => {
    if (extensions.includes(path.extname(file))) {
        console.log(file);
    }
});