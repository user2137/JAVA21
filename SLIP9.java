//Q.1

import java.util.Scanner;

class Employee
{
    int id;
    String name;
    double salary;

    Employee(int i, String n, double s)
    {
        id = i;
        name = n;
        salary = s;
    }
}

public class SLIP9
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();

        Employee e[] = new Employee[n];

        for (int i = 0; i < n; i++)
        {
            System.out.print("Enter id, name and salary: ");
            int id = sc.nextInt();
            String name = sc.next();
            double salary = sc.nextDouble();

            e[i] = new Employee(id, name, salary);
        }

        Employee max = e[0];

        for (int i = 1; i < n; i++)
        {
            if (e[i].salary > max.salary)
                max = e[i];
        }

        System.out.println("Employee with Maximum Salary: " + max.name);

        sc.close();
    }
}

//Q.2

<!DOCTYPE html>
<html>
<head>
<title>Arrow Functions</title>

<style>
body {
    background-color: #e6f2ff;
    font-family: Arial;
    text-align: center;
}

input {
    padding: 8px;
    margin: 5px;
}

button {
    padding: 8px;
    margin: 5px;
}
</style>
</head>

<body>

<h2>Arithmetic Operations</h2>

<input type="number" id="a" placeholder="First Number">
<input type="number" id="b" placeholder="Second Number">

<br>

<button onclick="calculate()">Calculate</button>

<h3 id="result"></h3>

<script>
const add = (a, b) => a + b;
const sub = (a, b) => a - b;
const mul = (a, b) => a * b;
const div = (a, b) => b != 0 ? a / b : "Cannot divide by zero";

function calculate() {
    let a = Number(document.getElementById("a").value);
    let b = Number(document.getElementById("b").value);

    document.getElementById("result").innerHTML =
        "Addition: " + add(a, b) + "<br>" +
        "Subtraction: " + sub(a, b) + "<br>" +
        "Multiplication: " + mul(a, b) + "<br>" +
        "Division: " + div(a, b);
}
</script>

</body>
</html>