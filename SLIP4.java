//Q.1

import java.util.Scanner;

public class SLIP4
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int ch;

        do
        {
            System.out.println("\n1.Addition");
            System.out.println("2.Multiplication");
            System.out.println("3.Transpose");
            System.out.println("4.Exit");
            System.out.print("Enter choice: ");
            ch = sc.nextInt();

            if (ch == 1 || ch == 2)
            {
                System.out.print("Enter rows and columns: ");
                int r = sc.nextInt();
                int c = sc.nextInt();

                int a[][] = new int[r][c];
                int b[][] = new int[r][c];

                System.out.println("Enter first matrix:");
                for (int i = 0; i < r; i++)
                    for (int j = 0; j < c; j++)
                        a[i][j] = sc.nextInt();

                System.out.println("Enter second matrix:");
                for (int i = 0; i < r; i++)
                    for (int j = 0; j < c; j++)
                        b[i][j] = sc.nextInt();

                System.out.println("Result:");
                for (int i = 0; i < r; i++)
                {
                    for (int j = 0; j < c; j++)
                    {
                        if (ch == 1)
                            System.out.print((a[i][j] + b[i][j]) + " ");
                        else
                        {
                            int sum = 0;
                            for (int k = 0; k < c; k++)
                                sum += a[i][k] * b[k][j];

                            System.out.print(sum + " ");
                        }
                    }
                    System.out.println();
                }
            }
            else if (ch == 3)
            {
                System.out.print("Enter rows and columns: ");
                int r = sc.nextInt();
                int c = sc.nextInt();
                int a[][] = new int[r][c];

                System.out.println("Enter matrix:");
                for (int i = 0; i < r; i++)
                    for (int j = 0; j < c; j++)
                        a[i][j] = sc.nextInt();

                for (int j = 0; j < c; j++)
                {
                    for (int i = 0; i < r; i++)
                        System.out.print(a[i][j] + " ");

                    System.out.println();
                }
            }

        } while (ch != 4);

        sc.close();
    }
}

//Q.2

<!DOCTYPE html>
<html>
<head>
<title>Change Heading</title>

<style>
body {
    background-color: lightblue;
    text-align: center;
    font-family: Arial;
}

button {
    padding: 10px;
}
</style>
</head>

<body>

<h1 id="h">Hello! Welcome</h1>

<button onclick="change()">Click Me</button>

<script>
function change() {
    document.getElementById("h").innerHTML =
    "Text Changed Successfully!";
}
</script>

</body>
</html>