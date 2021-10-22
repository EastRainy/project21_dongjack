#사원데이터 클래스
class Man():
    # ---------------------------------------------------
    # 클래스의 전역변수, 클래스변수, 정적변수
    # ---------------------------------------------------
    Max = 0     # 최대값
    # ---------------------------------------------------
    # 생성자(변수 초기화)
    # ---------------------------------------------------
    def __init__(self, id, name, age, gender):
        self.id = id            # 사원번호(객체의 전역변수, 인스턴스변수)
        self.name = name        # 사원이름(객체의 전역변수, 인스턴스변수)
        self.age = age          # 사원나이(객체의 전역변수, 인스턴스변수)
        self.gender = gender    # 사원성별(객체의 전역변수, 인스턴스변수)
    # ---------------------------------------------------
    # 사원정보 입력(클래스의 전역함수, 클래스함수, 정적함수)
    # ---------------------------------------------------
    @staticmethod
    def InputSawon(man:list):
        try:
            print('>'*50)
            id = input('사원번호를 입력하세요? ')
            name = input('사원이름을 입력하세요? ')
            age = input('사원나이를 입력하세요? ')
            gender = input('사원성별를 입력하세요? ')
            print('>'*50)

            man.append(Man(id, name, age, gender))
        except Exception as ex:
            print(ex)

        return man[-1]
    # ---------------------------------------------------
    # 사원정보 출력(클래스의 전역함수, 클래스함수, 정적함수)
    # ---------------------------------------------------
    @staticmethod
    def PrintSawon(man):
        print('-'*50)
        print('사원번호 : {0}'.format(man.id))
        print('사원이름 : {0}'.format(man.name))
        print('사원나이 : {0}'.format(man.age))
        print('사원성별 : {0}'.format(man.gender))
        print('-'*50)
    # ---------------------------------------------------
    # 사원정보 수정(객체의 전역함수, 인스턴스함수)
    # ---------------------------------------------------
    def UpdateSawon(self, id, name, age, gender):
        self.id = id
        self.name = name
        self.age = age
        self.gender = gender



