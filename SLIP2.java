//Q.1

import java.util.Scanner;

public class SLIP2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter starting number: ");
        int start = sc.nextInt();

        System.out.print("Enter ending number: ");
        int end = sc.nextInt();

        System.out.println("Armstrong numbers are:");

        for (int i = start; i <= end; i++)
        {
            int num = i;
            int temp = i;
            int sum = 0;
            int digits = 0;

            while (temp > 0)
            {
                digits++;
                temp = temp / 10;
            }

            temp = i;

            while (temp > 0)
            {
                int digit = temp % 10;
                sum += Math.pow(digit, digits);
                temp = temp / 10;
            }

            if (sum == num)
            {
                System.out.println(num);
            }
        }

        sc.close();
    }
}

//Q.2

<!DOCTYPE html>
<html>
<head>
<title>Student Registration Form</title>

<style>
body {
    background-color: #ed2b15b1;
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
    margin: 6px;
}

input, select, textarea {
    margin: 5px;
}

textarea {
    width: 200px;
    height: 50px;
}

button {
    margin: 10px;
}
</style>
</head>

<body>

<h2>Student Registration Form</h2>

<form>

<label>Roll No:</label>
<input type="number" required>
<br>

<label>Student Name:</label>
<input type="text" placeholder="First Name" required>
<input type="text" placeholder="Last Name" required>
<br>

<label>Father's Name:</label>
<input type="text" required>
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

<label>Department:</label>
<input type="checkbox">CSE
<input type="checkbox">IT
<input type="checkbox">ECE
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

<label>City:</label>
<input type="text" required>
<br>

<label>Address:</label>
<textarea required></textarea>
<br>

<center>
<button type="submit">Register</button>
<button type="reset">Reset</button>
</center>

</form>

</body>
</html>