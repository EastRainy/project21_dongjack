
// 예전 방식

var relationship1 = {
    name:'zero',
    friends:['nero','hero','xero'],
    logFriends:function(){
        var that = this;
        this.friends.forEach(function(friend){
            console.log(that.name, friend);//노드에서 일반함수 안에서 this를 사용하면 글로벌 객체를 의미()
        })
    }
}

relationship1.logFriends();