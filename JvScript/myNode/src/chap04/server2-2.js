
//서버를 구현하는 다른 방법

const http = require('http');
const fs = require('fs').promises;

http.createServer(async (req, res)=>{//뒤에서 비동기 방식으로 await 사용할것이라고 async를 선언

    try{
       const data = await fs.readFile('./src/chap04/server2.html');//데이터가 들어오길 기다리도록 하는것이 await, 비동기 방식일때만 사용가능

       res.writeHead(200, {'Content-Type':'text/html; charset=UTF-8'});
       res.end(data);
    }
    catch(err){
        res.writeHead(500, {'Content-Type': 'text/html; charset=UTF-8'});
        res.end(err.message);
    }

})
.listen(8082, ()=>{
    console.log('서버 2-2 실행');
});

