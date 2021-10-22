
import time

s = ''


i = 0
print('-loop start')
start=time.time()

while i<10000:
    s=s+str(i)+','
    i=i+1
end = time.time()

print('length = ', len(s),', time = ', end-start)



def fast(count:int)->None:
    str1 = []
    i = 1

    print('-Loop Start-')

    start = time.time()

    while i <= count:
        str1.append(str(i))
        i = i + 1

    str1 = ','.join(str1) + ','
    
    print('Loop Count : ', count)
    print('소요시간 : ', time.time() - start)
    print('length : ', len(str1))
    
    if len(str1) < 1000:
        print('str : ', str1)



fast(5000)