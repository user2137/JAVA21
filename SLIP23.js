//Q.1

import java.util.Scanner;

class Continent {
    String continent;

    void getContinent() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Continent: ");
        continent = sc.nextLine();
    }
}

class Country extends Continent {
    String country;

    void getCountry() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Country: ");
        country = sc.nextLine();
    }
}

class State extends Country {
    String state, place;

    void getDetails() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter State: ");
        state = sc.nextLine();

        System.out.print("Enter Place: ");
        place = sc.nextLine();
    }

    void display() {
        System.out.println("Place: " + place);
        System.out.println("State: " + state);
        System.out.println("Country: " + country);
        System.out.println("Continent: " + continent);
    }
}

public class SLIP23 {
    public static void main(String[] args) {
        State s = new State();

        s.getContinent();
        s.getCountry();
        s.getDetails();
        s.display();
    }
}

//Q.2

const fs = require('fs');

fs.writeFile('abc.txt', 'Hello Node.js', (err) => {
    if (err) throw err;
    console.log('File created and data written');

    fs.readFile('abc.txt', 'utf8', (err, data) => {
        if (err) throw err;
        console.log('File Content:', data);

        fs.appendFile('abc.txt', '\nWelcome to Node.js', (err) => {
            if (err) throw err;
            console.log('Data appended');

            fs.readFile('abc.txt', 'utf8', (err, data) => {
                if (err) throw err;
                console.log('Updated Content:\n' + data);
            });
        });
    });
});