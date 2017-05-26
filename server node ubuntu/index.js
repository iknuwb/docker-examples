const http = require('http');

const port = 3000;

const server = http.createServer((req, res) => {
  res.end('Hello World\n');
});

server.listen(port, () => {
  console.log(`Server running at ${port}/`);
});

process.on('SIGINT', function() {
    console.log("test");
    process.exit();
});
