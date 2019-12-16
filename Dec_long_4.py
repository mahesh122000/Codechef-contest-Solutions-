# cook your dish here
def binaryToDecimal(n): 
    num = n; 
    dec_value = 0; 
    base1 = 1; 
    len1 = len(num); 
    for i in range(len1 - 1, -1, -1): 
        if (num[i] == '1'):      
            dec_value += base1; 
        base1 = base1 * 2; 
      
    return dec_value;

t=int(input())
while(t>0):
    a=binaryToDecimal(input())
    b=binaryToDecimal(input())
    count=0
    while(b>0):
        u=a & b
        v=a ^ b
        a=v
        b=2*u
        count+=1
    t-=1
    print(count)