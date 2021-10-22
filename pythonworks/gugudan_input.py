def gugu_type3():

    start = int(input("시작단을 입력하세요."))
    end = int(input("끝단을 입력하세요."))
    dan = int(input("단수 입력하세요"))


    for i in range(start,end+1,dan):
        for j in range(1,10):
            s = ''
            for k in range(0,dan):
                front = i+k
                if(front > end):
                    break
                ans = front*j
                s = s + ('%d x %d = %2d    ' %(front,j,ans))
            print(s)
        print('\n')


gugu_type3()