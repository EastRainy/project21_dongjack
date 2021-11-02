/*
Arrow 함수 



*/

function add1(x,y){
    return x+y;
}
//이것과 동일한 역할의 arrow함수 형태 만들기

add2 = (x,y)=>{
    return x+y;
}
//function키워드의 생략
console.log(add2(3,5));


//더 간단한 애로우 함수
add3 = (x,y) => x+y;
