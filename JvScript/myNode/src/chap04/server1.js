const http = require('http');

http.createServer((req, res) =>{
    //request, responce 요청/응답의 내용을 안에 기입

    //write로 응답 내용 적고

    res.writeHead(200, {'Content-Type':'text/html; charset=UTF-8'}); // =>코드 200, 성공적 처리
    res.write('<h1>hello Node!</h1>');
    //end로 응답 마무리
    res.end('<p>Hello Server! 8080</p>');
})
.listen(8080, ()=>{
     console.log('8080포트 서버 대기중');
});


//포트 추가
http.createServer((req, res) =>{
    //request, responce 요청/응답의 내용을 안에 기입

    //write로 응답 내용 적고

    res.writeHead(200, {'Content-Type':'text/html; charset=UTF-8'}); // =>코드 200, 성공적 처리
    res.write('<h1>hello Node!</h1>');
    //end로 응답 마무리
    res.end('<p>Hello Server! 8081</p>');
})
.listen(8081, ()=>{
     console.log('8081포트 서버 대기중');
});