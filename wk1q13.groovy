
int num = 2
int num2 = num - 1
int notprime = 0
while (num < 1001) {
    
    
    while (num2 > 1) {
        
        if (num % num2 == 0){
            notprime = 1
            break;
        } 
        
        
        num2 = num2 - 1
    }   
    if (notprime == 0) {
        print num + ", "
    }
    notprime = 0
    num = num + 1
    num2 = num - 1
