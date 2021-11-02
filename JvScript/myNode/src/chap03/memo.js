

/*


global 객체

node 프로그램 전체에서 딱 하나만 존재 => 글로벌에 속성을 추가하면 모든 모듈에서 사용 가능



console 객체

브라우저의 console객체와 매우 유사


파일 입출력
파일 시스템에 접근하는 fs모듈을 사용하여 가능
브라우저는 제한적이었으나 노드는 권한이 있음

const fs = require('fs');

fs.readFile('./cahp03/readme.txt',(err,data)=>{  ==> VScode에서는 myNode가 ./이 되기때문에 오류. 일반환경에선 ./readme.txt로 실행
    if(err){
        throw err;
    }=

console.log(data);  => bufferString형태로 나옴
console.log(data.toString());
});

콜백방식 대신 프로미스 방식으로 사용가능
프로미스 방식이 더 쉬워서 프로미스 방식을 추천

const fs = require('fs').promises;

fs.readFile('.readme.txt')
.then((data)=>{ //then <- readFile 이 성공적으로 작동했을때만 발동
    console.log(data);
    console.log(data.toString());
})
.catch((err) =>{ //then이 실패하고 err가 나왔을때 catch가 실행
    console.error(err);
})


파일쓰기

const fs = require('fs').promises;

fs.writeFile('./writeme.txt'.~저장할내용)
.then(()=>{
 return fs.readFile('./writeme.txt');
})
.then((data)=>{ 
    console.log(data.toString());
})
.catch((err) =>{ 
    console.error(err);
});

프로미스 말고 콜백으로 하면 쌓여서 불편



동기/비동기 메서드

 - 노드는 대부분 내장 모듈 메서드를 비동기 방식으로 처리
 - 따라서 실행 순서가 코드의 순서와 같지 않음
 - 일부 함수는 동기 방식으로 사용가능


 정 순서대로 사용하기 위해선 동기 메소드 사용
 대신 서버에서는 성능을 보장하지 않음(다른 작업을 막아버리므로)

 fs.readFileSync('./writeme.txt',(err,data))


*/