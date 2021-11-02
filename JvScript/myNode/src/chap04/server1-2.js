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

server.on('listening', ()=>{
    console.log('8080포트에서 서버 대기중')
});
server.on('error',(error)=>{
    console.error(error);
});

