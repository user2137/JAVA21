//Q.1

import java.util.Scanner;

class MyNumber {
    private int n;

    MyNumber() {
        n = 0;
    }

    MyNumber(int n) {
        this.n = n;
    }

    boolean isNegative() {
        return n < 0;
    }

    boolean isPositive() {
        return n > 0;
    }

    boolean isOdd() {
        return n % 2 != 0;
    }

    boolean isEven() {
        return n % 2 == 0;
    }

    void display() {
        System.out.println("Negative: " + isNegative());
        System.out.println("Positive: " + isPositive());
        System.out.println("Odd: " + isOdd());
        System.out.println("Even: " + isEven());
    }
}

public class SLIP30 {
    public static void main(String[] args) {
        MyNumber m;

        if (args.length > 0)
            m = new MyNumber(Integer.parseInt(args[0]));
        else
            m = new MyNumber();

        m.display();
    }
}

//Q.2

const fs = require('fs');
const path = require('path');
const readline = require('readline');

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

function menu() {
    console.log("\n1. Create File");
    console.log("2. Read File");
    console.log("3. Rename File");
    console.log("4. Delete File");
    console.log("5. Exit");

    rl.question("Enter choice: ", (ch) => {
        if (ch === '1') {
            rl.question("Enter file name: ", (name) => {
                fs.writeFile(name, "Hello Node.js", (err) => {
                    console.log(err ? err.message : "File Created");
                    menu();
                });
            });
        } else if (ch === '2') {
            rl.question("Enter file name: ", (name) => {
                fs.readFile(name, 'utf8', (err, data) => {
                    console.log(err ? err.message : data);
                    menu();
                });
            });
        } else if (ch === '3') {
            rl.question("Enter old file name: ", (oldName) => {
                rl.question("Enter new file name: ", (newName) => {
                    fs.rename(oldName, newName, (err) => {
                        console.log(err ? err.message : "File Renamed");
                        menu();
                    });
                });
            });
        } else if (ch === '4') {
            rl.question("Enter file name: ", (name) => {
                fs.unlink(name, (err) => {
                    console.log(err ? err.message : "File Deleted");
                    menu();
                });
            });
        } else if (ch === '5') {
            rl.close();
        } else {
            console.log("Invalid Choice");
            menu();
        }
    });
}

menu();