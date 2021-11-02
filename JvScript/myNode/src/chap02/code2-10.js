/*
구조분해 할당

const {변수} = 객체; 로 객체 안의 속성을 변수명으로 사용  가능


*/

const candyMachine = {
    status:{
        name:'node',
        count:5
    },
    getCandy(){
        this.status.count--;
        return this.status.count;
    }
};

const {getCandy, status:{count}} = candyMachine; //candyMachine안의 getCandy()메서드를 getCandy 변수 안에 넣겠다.
//그 객체 안의 count라는 candyMachine속성을 getCandy변수를 사용할때 끌어오겠다.
/*
이것과 같은 문장
var getCandy = candyMachine.getCandy;
var count = candyMachine.status.count;
이것을 한줄로 끝내겠다는 표현
*/


console.log(getCandy);
console.log(count); //


