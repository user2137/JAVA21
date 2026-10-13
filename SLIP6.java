//Q.1

import java.util.Scanner;

class Account
{
    String custname;
    int accno;

    Account(String n, int a)
    {
        custname = n;
        accno = a;
    }
}

class SavingAccount extends Account
{
    double savingbal, minbal;

    SavingAccount(String n, int a, double s, double m)
    {
        super(n, a);
        savingbal = s;
        minbal = m;
    }
}

class AccountDetail extends SavingAccount
{
    double depositamt, withdrawalamt;

    AccountDetail(String n, int a, double s, double m, double d, double w)
    {
        super(n, a, s, m);
        depositamt = d;
        withdrawalamt = w;
    }

    void display()
    {
        System.out.println("Name: " + custname);
        System.out.println("Account No: " + accno);
        System.out.println("Saving Balance: " + savingbal);
        System.out.println("Minimum Balance: " + minbal);
        System.out.println("Deposit: " + depositamt);
        System.out.println("Withdrawal: " + withdrawalamt);
        System.out.println("Final Balance: " + (savingbal + depositamt - withdrawalamt));
    }
}

public class SLIP6
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter name: ");
        String n = sc.nextLine();

        System.out.print("Enter account number: ");
        int a = sc.nextInt();

        System.out.print("Enter saving balance: ");
        double s = sc.nextDouble();

        System.out.print("Enter minimum balance: ");
        double m = sc.nextDouble();

        System.out.print("Enter deposit: ");
        double d = sc.nextDouble();

        System.out.print("Enter withdrawal: ");
        double w = sc.nextDouble();

        AccountDetail obj = new AccountDetail(n, a, s, m, d, w);
        obj.display();

        sc.close();
    }
}

//Q.2

<!DOCTYPE html>
<html>
<head>
<title>Hover Effects</title>

<style>
body {
    background-color: #f0e6ff;
    text-align: center;
    font-family: Arial;
}

button {
    background-color: blue;
    color: white;
    padding: 10px 20px;
    border: none;
    cursor: pointer;
}

button:hover {
    background-color: green;
}

a {
    color: blue;
    text-decoration: none;
}

a:hover {
    color: red;
    text-decoration: underline;
}
</style>
</head>

<body>

<h2>CSS Hover Effects</h2>

<button>Click Me</button>

<br><br>

<a href="#">Visit Website</a>

</body>
</html>