

def KnightMove()->None:

    #판 초기화
    Board = [[0]*5 for i in range(5)]
    MovedTime = 0

    #올바른 값 입력
    while(True):
        x = input("X의 위치를 입력해주세요. 0 ~ 4 : ")
        y = input("Y의 위치를 입력해주세요. 0 ~ 4 : ")

        if(int(x)<0 or int(x)>4):
            print("잘못된 위치입니다. 다시 입력해주세요.\n")
            continue
        if(int(y)<0 or int(y)>4):
            print("잘못된 위치입니다. 다시 입력해주세요.\n")
            continue
        
        break
    
    # 재귀함수를 사용하여 0(불가능)과 25(가능)을 판별, 가능하면 가능과 이동경로를, 불가능하면 불가능을 표시

    print(int(x), ' ', int(y),' 에서 시작')

    r = rIsCanMove(int(x),int(y),MovedTime,Board)

    if(r==25):
        print("이 지점은 완성 가능한 시작점입니다.")
        
        for i in range(0,5):
            print('-'*56)
            s = '|'
            for j in range(0,5):
               s = s+'    %2d    |'%(Board[i][j])
            print(s)
        print('-'*56)

    else:
        print("이 지점은 완성 불가능한 시작점입니다.")
    

def rIsCanMove(x:int, y:int, MovedTime:int, Board:list[list[int]])->int:

    #재귀함수. 

    #입력값이 보드 위에 가능한 자리인가? 불가능하면 0을 리턴
    if(x<0 or x>4):
        return 0
    if(y<0 or y>4):
        return 0

    #입력값이 보드 위의 자리라면 들어온 자리는 이미 지나갔던 자리인가? 갔던 자리면 0을 리턴
    if(Board[y][x]!=0):
        return 0

    #가능한 자리라면 이동횟수를 증가시키고 말을 위치함.

    check = MovedTime + 1
    Board[y][x] = check

    #마지막 이동인가?(판을 채우는 25번째 움직임) => 맞으면 가능하다는 뜻의 25 리턴
    if(check == 25):
        return check

    #내가 이 판의 마지막 이동이 아니라면, 하위 이동들이 이동하여 완성시킬수 있는 자리인지 확인(25가 리턴되는지 확인)

    #1번이동 우대상(x+2,y-1)
    if(rIsCanMove(x+2,y-1,check,Board)==25):
        return 25
    #2번이동 우대하(x+2,y+1)
    if(rIsCanMove(x+2,y+1,check,Board)==25):
        return 25
    #3번이동 하대우(x+1,y+2)
    if(rIsCanMove(x+1,y+2,check,Board)==25):
        return 25
    #4번이동 하대좌(x-1,y+2)
    if(rIsCanMove(x-1,y+2,check,Board)==25):
        return 25
    #5번이동 좌대하(x-2,y+1)
    if(rIsCanMove(x-2,y+1,check,Board)==25):
        return 25
    #6번이동 좌대상(x-2,y-1)
    if(rIsCanMove(x-2,y-1,check,Board)==25):
        return 25
    #7번이동 상대좌(x-1,y-2)
    if(rIsCanMove(x-1,y-2,check,Board)==25):
        return 25
    #8번이동 상대우(x+1,y-2)
    if(rIsCanMove(x+1,y-2,check,Board)==25):
        return 25


    #모든 이동에도 이 자리에서 완성 가능한 후위자리가 없다면 체스말을 돌리고 0을 리턴(완성 불가능한 자리)
    Board[y][x] = 0
    return 0
    


#함수실행
KnightMove()