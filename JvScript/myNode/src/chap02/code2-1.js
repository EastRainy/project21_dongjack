if (ture){
    var x1 = 3;
}
//var는 펑션 스콥만 적용되고 블락스콥은 적용되지 않음

console.log('x1: '+ x1);

if(true){
    const x2 = 4;
}
//const는 블락 스콥 안에서만 사용 가능 =>블락 밖에선 사용 불가

//console.log('x2: '+x2); 
//==> 오류발생

if(true){
    let x3 =5;
}

//console.log('x3 : ' +x3);
//오류 발생 ==> let도 블락 스콥 적용