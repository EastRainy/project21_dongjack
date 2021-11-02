
/*

노드로 http 서버 만들기

createServer로 요청 이벤트에 대기

특정 포트에 연결, listen대기

const http = require('http');

http.createServer((req, res) =>{
    //request, responce 요청/응답의 내용을 안에 기입

    //write로 응답 내용 적고

    res.writeHead(200, {'Content-Type':'text/html; charset=UTF-8'}); // =>코드 200, 성공적 처리
    res.write('<h1>hello Node!</h1>');
    //end로 응답 마무리
    res.end('<p>Hello Server!</p>');
})
.listen(8080, ()=>{
     console.log('8080포트 서버 대기중');
});




이벤트 리스너 붙이기

server.on('listening', ()=>{
    console.log('8080포트에서 서버 대기중')
});
server.on('error',(error)=>{
    console.error(error);
});


하나의 서버에 여러 포트를 열 수 있음.


http.createServer((req, res) =>{
    //request, responce 요청/응답의 내용을 안에 기입

    //write로 응답 내용 적고

    res.writeHead(200, {'Content-Type':'text/html; charset=UTF-8'}); // =>코드 200, 성공적 처리
    res.write('<h1>hello Node!</h1>');
    //end로 응답 마무리
    res.end('<p>Hello Server!</p>');
})
.listen(8081, ()=>{
     console.log('8081포트 서버 대기중');
});



보통 서버코딩단에서 html을 하드코딩하지 않음
=> fs모듈로 파일을 읽어서 전송
write는 버퍼도 전송 가능




ejs => 자바스크립트를 코딩해서 HTML로 푼 후 전송하는 외부 모듈

npm install --save ejs 로 설치해서 사용


REST API와 라우팅

RESTful
 - REST API를 사용한 주소 체계를 이용하는 서버
 - GET /user => 사용자 조회 요청
 - POST /user => 사용자 등록 요청

 CRUD를 리퀘스트 메서드로 규칙
 C      R       U       D
 POST   GET     PUT     DELETE

*/