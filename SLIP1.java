//Q.1

import java.util.Scanner;
import java.util.Arrays;

public class SLIP1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int a[] = new int[n];
        int sum = 0;

        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++)
        {
            a[i] = sc.nextInt();
            sum = sum + a[i];
        }

        System.out.println("Array elements:");

        for (int i = 0; i < n; i++)
        {
            System.out.print(a[i] + " ");
        }

        System.out.println("\nSum of array elements: " + sum);

        Arrays.sort(a);

        System.out.println("Array in ascending order:");

        for (int i = 0; i < n; i++)
        {
            System.out.print(a[i] + " ");
        }

        sc.close();
    }
}

//Q.2

<!DOCTYPE html>
<html>
<head>
<title>College Registration Form</title>

<style>
body {
    background-color: #ffe4e1;
    font-family: Arial;
}

form {
    width: 500px;
    margin: auto;
}

h2 {
    text-align: center;
}

label {
    display: inline-block;
    width: 130px;
    margin: 8px;
}

input, select, textarea {
    margin: 5px;
}

button {
    margin: 10px;
}
</style>
</head>

<body>

<h2>My-Future College / School</h2>

<form>
<label>Student Name:</label>
<input type="text" pattern="[A-Za-z ]{3,10}" required>
<br>

<label>Date of Birth:</label>
<input type="date" required>
<br>

<label>Mobile No:</label>
<input type="tel" pattern="[0-9]{10}" required>
<br>

<label>Email ID:</label>
<input type="email" required>
<br>

<label>Password:</label>
<input type="password" minlength="6" required>
<br>

<label>Gender:</label>
<input type="radio" name="gender" required>Male
<input type="radio" name="gender">Female
<br>

<label>Hobbies:</label>
<input type="checkbox">Drawing
<input type="checkbox">Singing
<input type="checkbox">Dancing
<br>

<label>Course:</label>
<select required>
<option value="">Select Course</option>
<option>BSc CS</option>
<option>BCA</option>
<option>BSc IT</option>
</select>
<br>

<label>Student Photo:</label>
<input type="file" accept="image/*">
<br>

<label>Register Time:</label>
<input type="time" required>
<br>

<label>Address:</label>
<textarea required></textarea>
<br>

<input type="checkbox" required>
I hereby declare that the information is correct.
<br>

<center>
<button type="submit">Register</button>
<button type="reset">Reset</button>
</center>

</form>

</body>
</html>