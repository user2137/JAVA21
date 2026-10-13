//Q.1

import game.*;

public class SLIP12 {
    public static void main(String[] args) {
        Indoor i = new Indoor();
        Outdoor o = new Outdoor();

        i.display();
        o.display();
    }
}

//Q.2

<!DOCTYPE html>
<html>
<body style="background-color: lightcyan;">

<h3>Product Bill</h3>

<script>
let name = prompt("Enter product name:");
let price = Number(prompt("Enter product price:"));
let quantity = Number(prompt("Enter quantity:"));

const bill = (price, quantity) => {
    let total = price * quantity;
    document.write(`Product: ${name}<br>`);
    document.write(`Total Price: ₹${total}`);
};

bill(price, quantity);
</script>

</body>
</html>