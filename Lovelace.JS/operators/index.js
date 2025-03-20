let x ='5';
let y ='5';

let looselyEqual = x == y? true : false;

console.log({looselyEqual})

// strictly equal
let strictlyEqual = x === y? true : false;
console.log({strictlyEqual})

// urany operataor
console.log(typeof x);

// compound assignment
let b = 6;
b+=5;
console.log({b});
console.log(b);

// increment and decrement
b++;
console.log({b});
b--;
console.log({b});

// comparison operators
let c = 5;
let d = 10;
let moreThanOrEqualsTo = (c>=d)? true : false;
console.log({moreThanOrEqualsTo});

// logical operators
let logicalAnd = x == y && c <= d ? true : false;
console.log({logicalAnd});

let logicalOR = x ==y || c >= d ?true:false;
console.log({logicalOR});

let userOnline = true;
let logicalNOT = !userOnline? true : false;
console.log({logicalNOT});

// implicit coersion

let num = 5;
num *= '5';
console.log({num});

let e = +'65';
console.log({e});

// explicit coersion

let item = 5;
console.log(typeof item);
item = String(item);
console.log({item});
item = Array(item);
console.log({item});

let obj = Object(5);
console.log({obj});
console.log(typeof obj);

// copy of strings
 let copy = 'I want to copy a string';
console.log(copy.repeat(3));

