//static Method

class User{
    constructor(first, last){
        this.firstName = first;
        this.lastName = last;
    }
    
    getFullName = function(){
        return `${this.firstName} ${this.lastName}`;
    }

    static isUser(user) {
        if (user.firstName && user.lastName){
            return true
        } else {
            return false;
        }
    }
}

const hwang = new User('InGyu', 'hwang');
User.isUser(hwang);