const OperationParser = require('./operations/operation_parser.js')
const Database = require('./models/database.js')


var fs = require('fs');

fs.writeFile('output.txt', '', function(err) {
    if (err) return console.log(err);
});

fs.readFile('input.txt', 'utf8', function(err, data) {
    if (err) throw err;
    operation = OperationParser.parseCommand(data, new Database());
    operation.execute();
    operation.revert();
});