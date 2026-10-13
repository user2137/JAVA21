//Q.1

import java.util.Scanner;

class NumberException extends Exception {
    NumberException(String msg) {
        super(msg);
    }
}

class Prime {
    static void check(int n) throws NumberException {
        if (n == 0)
            throw new NumberException("Number is 0");

        if (n < 2) {
            System.out.println("Not Prime");
            return;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                System.out.println("Not Prime");
                return;
            }
        }

        System.out.println("Prime Number");
    }
}

public class SLIP29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        try {
            Prime.check(n);
        } catch (NumberException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}

//Q.2

const fs = require('fs');

let file = 'abc.txt';

fs.stat(file, (err, stats) => {
    if (err) {
        console.log("Error:", err.message);
        return;
    }

    console.log("File Size:", stats.size, "bytes");
    console.log("Is File:", stats.isFile());
    console.log("Is Directory:", stats.isDirectory());
    console.log("Created:", stats.birthtime);
    console.log("Last Accessed:", stats.atime);
    console.log("Last Modified:", stats.mtime);
    console.log("Last Status Changed:", stats.ctime);
});