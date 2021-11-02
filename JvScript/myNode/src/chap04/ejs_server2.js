
//서버에서 person데이터 넣어주기

const http = require('http');
const fs = require('fs');
const ejs = require('ejs');

let person ={
    name:'롱리',
    gender:'남자',
    age:'27',
    description:'ejs example 2'
}


http.createServer((req, res)=>{
    fs.readFile('./src/chap04/ejs_page2.ejs','UTF-8',(err,data)=>{

        if(err=>{
            throw err;
        });
        
        res.writeHead(200, {'Content-Type':'text/html; charset=UTF-8'});
        res.end(ejs.render(data, {person}));//{person} = {person:person}축약
      
    })    

})
.listen(8081, ()=>{
    console.log('ejs서버 실행');
});
