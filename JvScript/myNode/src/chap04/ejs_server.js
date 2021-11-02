
const http = require('http');
const fs = require('fs');
const ejs = require('ejs');

http.createServer((req, res)=>{
    fs.readFile('./src/chap04/ejs_page1.ejs','UTF-8',(err,data)=>{

        if(err=>{
            throw err;
        });
        
        res.writeHead(200, {'Content-Type':'text/html; charset=UTF-8'});
        res.end(ejs.render(data));
      
    })    

})
.listen(8080, ()=>{
    console.log('ejs서버 실행');
});
