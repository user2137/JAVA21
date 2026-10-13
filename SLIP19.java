//Q.1

import java.io.*;
import java.util.Scanner;

public class SLIP19 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter file name: ");
        String name = sc.nextLine();

        BufferedReader br = new BufferedReader(new FileReader(name));

        int chars = 0, words = 0, lines = 0;
        String s;

        while ((s = br.readLine()) != null) {
            lines++;
            chars += s.length();
            words += s.trim().isEmpty() ? 0 : s.trim().split("\\s+").length;
        }

        br.close();

        System.out.println("Characters: " + chars);
        System.out.println("Words: " + words);
        System.out.println("Lines: " + lines);

        sc.close();
    }
}

//Q.2

<!DOCTYPE html>
<html>
<body style="background-color: lightcyan;">

<h3>User Login</h3>

<script>
async function login(username, password) {
    try {
        if (username === "admin" && password === "1234") {
            return "Login Successful!";
        } else {
            throw "Invalid Username or Password!";
        }
    } catch (error) {
        return error;
    }
}

async function checkLogin() {
    let username = prompt("Enter username:");
    let password = prompt("Enter password:");

    let result = await login(username, password);
    document.write(result);
}

checkLogin();
</script>

</body>
</html>