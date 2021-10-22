

def gugu_type1():

    for i in range (2,10):
        for j in range (1,10):
            print(i, ' x ', j, ' = %2d' % (i*j))
        print('\n')


def gugu_type2():

    for i in range(0,5,4):
        for j in range(1,10):
            s = ''
            for k in range(1,5):
                front = i+k
                ans = front*j
                s = s + ('%d x %d = %2d    ' %(front,j,ans))
            print(s)
        print('\n')

gugu_type1()
print('------------------------------')
gugu_type2()


