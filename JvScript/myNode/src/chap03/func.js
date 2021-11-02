const {odd, even} = require('./var.js');

function checkOddEven(num){
    if( num %2 ){
        return odd;
    }
    else{
        return even;
    }
}

//아까 var에서 module.exports한 odd, even을 가져옴

module.exports = checkOddEven;
//