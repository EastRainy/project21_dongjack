const http = require('http');
const fs = require('fs').promises;

const users={};

http.createServer(async (req,res)=>{

    //console.log(req.method, req.url);

    try{
        if(req.method ==='GET'){
            if(req.url==='/'){
                const data = await fs.readFile('./src/chap04/restAPI/restFront.html');
                res.writeHead(200, {'Content-Type':'text/html; charset=UTF-8'});
                res.end(data);

                return;
            }
        }
        else{
            const data = await fs.readFile(`.${req.url}`, 'UTF-8');
            res.end(data);
        }

    }
    catch(err){
        res.writeHead(500, {'Content-Type':'text/html; charset=UTF-8'});
        res.end(err.message);
    }



})
.listen(8080, ()=>{
    console.log('http://localhost:8080 주소에서 restServer가 실행되었습니다.')
});