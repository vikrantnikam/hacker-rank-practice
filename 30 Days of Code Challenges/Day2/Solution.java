process.stdin.resume();
process.stdin.setEncoding('ascii');

var input_stdin = "";
var input_stdin_array = "";
var input_currentline = 0;

process.stdin.on('data', function (data) {
    input_stdin += data;
});

process.stdin.on('end', function () {
    input_stdin_array = input_stdin.split("\n");
    main();    
});

function readLine() {
    return input_stdin_array[input_currentline++];
}

/////////////// ignore above this line ////////////////////
var tip = (mealCost*tipPercent)/100;
var tax = (mealCost*taxPercent)/100;
var cost = Math.round(mealCost + tip + tax);
console.log("The total meal cost is " + cost + " dollars.");
    

