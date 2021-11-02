
//프로미스 방식 fs 사용

const http = require('http');
const fs = require('fs').promises;

http.createServer((req, res)=>{

    fs.readFile('./src/chap04/server2.html')
    .then(data=>{
        res.writeHead(200, {'Content-Type':'text/html; charset=UTF-8'});
        res.end(data);
        
    })
    .catch(err =>{ 
        console.error(err);
    });
})
.listen(8080, ()=>{
    console.log('서버 2 실행');
});

