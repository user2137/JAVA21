//Q.1

import java.io.File;
import java.util.Scanner;

public class SLIP10
{
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(new File("abc.txt"));

        while (sc.hasNextLine())
        {
            String s = sc.nextLine();
            System.out.println(s.toUpperCase());
        }

        sc.close();
    }
}

//Q.2

<!DOCTYPE html>
<html>
<head>
<title>Student Report</title>

<style>
body {
    background-color: #e6f2ff;
    font-family: Arial;
    text-align: center;
}

#report {
    background-color: white;
    width: 300px;
    margin: 20px auto;
    padding: 15px;
    border-radius: 10px;
}
</style>
</head>

<body>

<h2>Student Report</h2>

<button onclick="showReport()">Generate Report</button>

<div id="report"></div>

<script>
function showReport() {
    let name = "MOHIT";
    let roll = 10;
    let m1 = 80, m2 = 75, m3 = 90;
    let total = m1 + m2 + m3;
    let average = total / 3;

    document.getElementById("report").innerHTML = `
        <h3>Student Details</h3>
        Name: ${name}<br>
        Roll No: ${roll}<br>
        Subject 1: ${m1}<br>
        Subject 2: ${m2}<br>
        Subject 3: ${m3}<br>
        Total: ${total}<br>
        Average: ${average.toFixed(2)}
    `;
}
</script>

</body>
</html>