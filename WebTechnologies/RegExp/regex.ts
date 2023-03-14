// A pattern that matches two letters only string
const pattern1: RegExp = /^[a-zA-z]{2}$/;

// A pattern that matches a string that begins with four numbers and end with four letters
const pattern2: RegExp = /^\d{4}[a-zA-Z]{4}$/;

// any number of any characters followed by 2 digits
const pattern3: RegExp = /^.+\d{2}$/;

// any digit, followed by any number of digits, followed by exactly 3 letters
const pattern4: RegExp = /^\d\d*[a-zA-Z]{3}/;

// A pattern for card numbers(Visa, MasterCard, etc..)
const cardPattern: RegExp = /(?:\d{4}\-){3}(\d{4}$)/;

// A pattern for an email adress
const emailPattern: RegExp = /^[\w\-\.\+]+\@\w+\.\w{2,4}$/;
