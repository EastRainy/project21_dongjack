def swap(a, b):
    tmp = a[0]
    a[0]=b[0]
    b[0]=tmp


s1 = ['abc']
s2 = ['def']

print('s1 = >', s1, ' s2 = >', s2)

swap(s1,s2)


print('s1 = >', s1, ' s2 = >', s2)


## 파이선에서 쉽게 바꾸는법

s1, s2 = s2, s1

print('s1 = >', s1, ' s2 = >', s2)


# 파이썬 함수 요령

def test(a:list)->None:
    # 함수 선언 test(param a:list)->리턴값 None: (없음)
    a[0] = a[0]+'10'
    #참조형 리스트 값을 받았을때
    print(a)

def test2(a:str)->None:
    a = a +'xxx'
    print(a)

# 스트링 값을 받았을때

s3= 'abc'
test(s1)
print(s1)

test2(s3)
print(s3)
