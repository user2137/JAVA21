//Q.1

import java.util.Scanner;

abstract class Shape
{
    int a, b;

    abstract void printArea();
}

class Rectangle extends Shape
{
    Rectangle(int l, int w)
    {
        a = l;
        b = w;
    }

    void printArea()
    {
        System.out.println("Rectangle Area: " + (a * b));
    }
}

class Triangle extends Shape
{
    Triangle(int b, int h)
    {
        a = b;
        this.b = h;
    }

    void printArea()
    {
        System.out.println("Triangle Area: " + (0.5 * a * b));
    }
}

class Circle extends Shape
{
    Circle(int r)
    {
        a = r;
    }

    void printArea()
    {
        System.out.println("Circle Area: " + (3.14 * a * a));
    }
}

public class SLIP8
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rectangle length and width: ");
        Shape s = new Rectangle(sc.nextInt(), sc.nextInt());
        s.printArea();

        System.out.print("Enter triangle base and height: ");
        s = new Triangle(sc.nextInt(), sc.nextInt());
        s.printArea();

        System.out.print("Enter circle radius: ");
        s = new Circle(sc.nextInt());
        s.printArea();

        sc.close();
    }
}

//Q.2
<!DOCTYPE html>
<html>
<head>
<title>Change Image</title>

<style>
body {
    background-color: #fff0e6;
    text-align: center;
    font-family: Arial;
}

#box {
    width: 200px;
    height: 150px;
    margin: 20px auto;
    background-color: lightblue;
    display: flex;
    align-items: center;
    justify-content: center;
    font-size: 40px;
}

button {
    padding: 10px;
}
</style>
</head>

<body>

<h2>Image Change</h2>

<div id="box">Image 1</div>

<button onclick="changeImage()">Change Image</button>

<script>
function changeImage() {
    document.getElementById("box").innerHTML = "Image 2";
    document.getElementById("box").style.backgroundColor = "lightgreen";
}
</script>

</body>
</html>