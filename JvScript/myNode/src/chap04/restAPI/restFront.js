
function submitHandler(e){
    e.preventDefualt();//기본동작을 막음

    const name= document.querySelector('#username').value;

    if(!name){
        alert('이름을 입력하세요.');
        return;
    }

    try{
        //AJAX를 이용하여 POST 방식으로 서버에게 /user경로로 요청을 보낸다.
        asios.post('/user',{name:name}); 
    }
    catch(err){
        console.error(err);
    }


}
function init(){

    document.querySelector('#form').addEventListener('submit', submitHandler);


}

window.addEventListener('load',init);