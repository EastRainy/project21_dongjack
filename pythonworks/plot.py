import numpy as np
import matplotlib.pyplot as plt
import random

# ------------------------------------------
def type1():
    count = 20 
    y = [random.randint(10,100) for i in range(0, count)]

    plt.plot(y)

    plt.show()
# ------------------------------------------
def type2():
    x = np.arange(-4.5, 5, 0.5)
    y1 = 2*x**2
    y2 = 5*x + 30
    y3 = 4*x**2 + 10

    plt.plot(x, y1)
    plt.plot(x, y2)
    plt.plot(x, y3)
    #plt.plot(x, y1, x, y2, x, y3)

    plt.show()
# ------------------------------------------
def type3():
    x = np.arange(-4.5, 5, 0.5)
    y1 = 2*x**2
    y2 = 5*x + 30

    plt.plot(x, y1)

    plt.figure()
    plt.plot(x, y2)

    plt.show()
# ------------------------------------------
def type4():
    x = np.arange(-5, 5, 0.1)
    y1 = x**2 - 2
    y2 = 20*np.cos(x)**2

    plt.figure(1)
    plt.plot(x, y1)

    plt.figure(2)
    plt.plot(x, y2)

    plt.figure(1)
    plt.plot(x, y2)

    plt.figure(2)
    plt.clf()
    plt.plot(x, y1)

    plt.show()
# ------------------------------------------
def type5():
    x = np.arange(0, 10, 0.1)
    y1 = 0.3*(x-5)**2 + 1
    y2 = -1.5*x + 3
    y3 = np.sin(x)**2
    y4 = 10*np.exp(-x) + 1

    plt.subplot(2, 2, 1)
    plt.plot(x, y1)

    plt.subplot(2, 2, 2)
    plt.plot(x, y2)

    plt.subplot(2, 2, 3)
    plt.plot(x, y3)

    plt.subplot(2, 2, 4)
    plt.plot(x, y4)

    plt.show()
# ------------------------------------------
def type6():
    x = np.linspace(-4, 4, 100)
    y1 = x**3
    y2 = 10*x**2 - 2

    plt.plot(x, y1, x, y2)

    plt.show()
# ------------------------------------------
def type7():
    x = np.linspace(-4, 4, 100)
    y1 = x**3
    y2 = 10*x**2 - 2

    plt.plot(x, y1, x, y2)
    plt.xlim(-1, 1)
    plt.ylim(-3, 3)
    
    plt.show()
# ------------------------------------------
def type8():
    x = np.arange(0, 5, 1)
    y1 = x
    y2 = x + 1
    y3 = x + 2
    y4 = x + 3

    plt.plot(x, y1, 'm-o', x, y2, 'y--^', x, y3, 'k:s', x, y4, 'c-.d')
    plt.xlabel('X-axis')
    plt.ylabel('Y-axis')
    plt.title('Graph title')
    plt.grid(True)
    plt.legend(['data1', 'data2', 'data3', 'data4'])
    
    plt.show()






    
