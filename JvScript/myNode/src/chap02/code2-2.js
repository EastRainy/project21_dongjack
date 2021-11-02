/*
const와 let의 차이

const는 상수를 만들때 사용
 - 재할당하려면 오류발생
 - 선언과 동시에 초기화를 해야 함
let은 블락스콥을 가지는 변수를 만듬

*/

const a = 10;
console.log('a: '+a);

//const a = 11;
//==>오류 : 상수를 재할당하려 했으므로 오류


let b;
b=12;

console.log('b: '+b);

