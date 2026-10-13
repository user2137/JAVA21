//Q.1

import java.util.Scanner;

class AgeException extends Exception
{
    AgeException(String msg)
    {
        super(msg);
    }
}

class Driver
{
    int license_no, age;
    String name, address;

    Driver(int l, String n, String a, int age)
    {
        license_no = l;
        name = n;
        address = a;
        this.age = age;
    }

    void display() throws AgeException
    {
        if (age < 18)
            throw new AgeException("Age is below 18 years");

        System.out.println("License No: " + license_no);
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Age: " + age);
    }
}

public class SLIP7
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter license number: ");
        int l = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter name: ");
        String n = sc.nextLine();

        System.out.print("Enter address: ");
        String a = sc.nextLine();

        System.out.print("Enter age: ");
        int age = sc.nextInt();

        Driver d = new Driver(l, n, a, age);

        try
        {
            d.display();
        }
        catch (AgeException e)
        {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}

//Q.2
<!DOCTYPE html>
<html>
<head>
<title>Programming Languages</title>

<style>
body {
    background-color: #e6f2ff;
    font-family: Arial;
}

li:first-child {
    color: red;
    font-weight: bold;
}

li:last-child {
    color: blue;
    font-size: 22px;
}
</style>
</head>

<body>

<h2>Programming Languages</h2>

<ul>
    <li>C</li>
    <li>C++</li>
    <li>Java</li>
    <li>Python</li>
    <li>JavaScript</li>
</ul>

</body>
</html>