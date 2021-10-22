
fp = None
FilePath = 'C:\\Users\\user\\Desktop\\python'
FileName = 'Test.txt'

fp = open('{0}\\{1}'.format(FilePath, FileName), 'wt')

if fp != None:
    s=''
    for i in range(0,1000):
        s = s+'7 x {0} = {1}\n'.format(i, 7*i)
    fp.write(s)

    fp.close()

