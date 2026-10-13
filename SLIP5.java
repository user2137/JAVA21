//Q.1

import java.io.File;
import java.util.Scanner;

public class SLIP5
{
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter file name: ");
        String name = sc.nextLine();

        Scanner fs = new Scanner(new File(name));
        String text = "";

        while (fs.hasNextLine())
            text += fs.nextLine() + "\n";

        System.out.println("Reverse Order:");

        for (int i = text.length() - 1; i >= 0; i--)
            System.out.print(text.charAt(i));

        System.out.println("\nChanged Case:");
        for (int i = 0; i < text.length(); i++)
        {
            char ch = text.charAt(i);

            if (Character.isUpperCase(ch))
                System.out.print(Character.toLowerCase(ch));
            else
                System.out.print(Character.toUpperCase(ch));
        }

        fs.close();
        sc.close();
    }
}

//Q.2

<!DOCTYPE html>
<html>
<head>
<title>Image Gallery</title>

<style>
body {
    background-color: #e8f5e9;
    font-family: Arial;
    text-align: center;
}

.gallery {
    display: grid;
    grid-template-columns: repeat(3, 1fr);
    gap: 15px;
    padding: 20px;
}

.gallery div {
    background-color: lightblue;
    height: 180px;
    display: flex;
    align-items: center;
    justify-content: center;
    font-size: 30px;
    border-radius: 10px;
}

.gallery div:hover {
    transform: scale(1.05);
}

@media (max-width: 600px) {
    .gallery {
        grid-template-columns: 1fr;
    }
}
</style>
</head>

<body>

<h1>My Image Gallery</h1>

<div class="gallery">
    <div>1</div>
    <div>2</div>
    <div>3</div>
    <div>4</div>
    <div>5</div>
    <div>6</div>
</div>

</body>
</html>