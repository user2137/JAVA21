//Q.1

<!DOCTYPE html>
<html>
<body style="background-color: lavender;">

<h2>Change Background Color</h2>

<button onclick="changeColor('red')">Red</button>
<button onclick="changeColor('green')">Green</button>
<button onclick="changeColor('blue')">Blue</button>

<p id="result"></p>

<script>
function changeColor(color) {
    document.body.style.backgroundColor = color;
    document.getElementById("result").innerHTML = "Selected Color: " + color;
}
</script>

</body>
</html>

//Q.2
const http = require('http');

const server = http.createServer((req, res) => {
    res.writeHead(200, { 'Content-Type': 'text/plain' });
    res.end('Welcome to Node.js Server');
});

server.listen(3000, () => {
    console.log('Server running on port 3000');
});
