

const sayNode = function(){
    console.log('Node');
}

const es = 'ES';

const newObject = {
    sayJs(){
        console.log('JS');
    },
    sayNode,//속성명만 있고 속성값이 없음 => 똑같은 이름의 값을 찾아서 대입(sayNode : sayNode 를 축약 가능)
    [es+6] : 'Fantastic'
};
//const로 선언된 newObjecet는 상수라 재지정하려면 오류지만 이미 있는 내용에 더하고 빼는것은 문제가 없다.

newObject.sayJs();
newObject.sayNode();
newObject.log(newObject.ES6);