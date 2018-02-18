//RETURN THE TYPE OF THE TRIANGLE, else INVALID
function typeOfTriangle(x, y, z) {
  if (check(x) == 'OK' && check(y) == 'OK' && check(z) == 'OK') {
    x = Number(x);
    y = Number(y);
    z = Number(z);
    if(isValidSideLength(x,y,z)){
      return getTriangle(x,y,z);
    }else{
      return 'INVALID SIDE LENGTH!';
    }
  } else {
    // let res = `invalid: [${x},${y},${z}]\n\n` + '1st: ' + check(x) + '\n2nd: ' + check(y) + '\n3rd: ' + check(z);
    return 'INVALID';
  }
}

//CHECK IF INPUT IS VALID
function check(num) {
  let stat = '';
  if (num != undefined) {
    num = Number(num);
    if (isNaN(num)) {
      stat += 'Not a Number! '
    }
  }else{
    stat += 'Missing side length! '
  }
  if(stat == ''){
    return 'OK'
  }
  return stat;
}

function isValidSideLength(a,b,c){
  if (a + b > c && a + c > b && b + c > a){
    return true;
  }else{
    return false;
  }
}

function getTriangle(x,y,z){
  if (x == y && y == z) {
    return 'equilateral';
  } else if (x != y && y != z && x != z) {
    return 'scalene';
  } else {
    return 'isosceles';
  }
}



//MAIN:
let input = process.argv;
// console.log('INPUT: ' + input);
let x = input[2];
let y = input[3];
let z = input[4];
let res = typeOfTriangle(x, y, z);
console.log('The triangle is ' + res);
