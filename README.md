# Game
MyPlane 类

1.UML类图

![](http://thumbnail0.baidupcs.com/thumbnail/fb0d62a95824dfc599428dc447f54ba9?fid=1817384346-250528-690497777942691&time=1495087200&rt=sh&sign=FDTAER-DCb740ccc5511e5e8fedcff06b081203-GyoYgT2qkPUzgwvqJgSSYWmWkw4%3D&expires=8h&chkv=0&chkbd=0&chkpc=&dp-logid=3191675424964360478&dp-callid=0&size=c710_u400&quality=100)

2.详细分析

 (1). 成员变量
 
    - x，y是int类型的变量，用来记录我方战机的当前位置，进行位图绘制。
    - dl，du，dr，dd是Boolean类型的变量，用来判断我方战机正在向那一个方向前进，一直按下某一个方向，将会向那个方向一直行进，直到边界。
    - MYPLANE_XSPEED，MYPLANE_XSPEED是int类型的变量，作用是控制我方战机横向和纵向的运行速度，保证一定的速率移动。
    - live是Boolean类型的变量，作用是判断我方战机是否死亡。
(2). 成员方法
 
    - MYPlane(int x,int y)构造函数，初始化我方战机的位置，使其位于中央。
    - draw(Graphics g)绘图方法，我方战机位置改变时重新绘制。
    - keyPressed(KeyEvent e)按键方法，键盘上按下相应的键码进行相应的移动。
    - keyReleased(KeyEvent e)按键释放方法，按键释放使之不再移动。
    - move()战机移动方法，键按下后进行移动。
    - getX()获得战机的横向位置。
    - getY()获得战机的纵向位置。
    - isLive()战机是否存活。
    - setLive(boolean live)设置飞机存活状态。 
    
Bullet类
-------
1．UML类图

![bullet][1]


  [1]: http://thumbnail0.baidupcs.com/thumbnail/0dd436eb239b826205d5b0da861473db?fid=1817384346-250528-307662065856761&time=1495090800&rt=sh&sign=FDTAER-DCb740ccc5511e5e8fedcff06b081203-hPhnP15btCvxamjQ2sGalCX/a3o=&expires=8h&chkv=0&chkbd=0&chkpc=&dp-logid=3192471056056753460&dp-callid=0&size=c710_u400&quality=100

2.详细分析

(1) 成员变量

    - BULLET_SPEED为int类型变量，初始为15.战机发射子弹的速率。
    - x,y为int类型变量，记录子弹的位置。
    - live为boolean类型的变量，判断子弹是否为有效状态。
    - bullet为Image类型变量，加载的子弹类图。
(2) 成员方法

    - Bullet(int x,int y)构造方法，子弹位图绘制的位置。
    - draw(Graphics g)绘制子弹位图的方法。
    - isLive()判断子弹是否为有效状态。
    - setLive(boolean live)设置子弹是否有效。
    - getX(),getY()获得子弹的位置坐标。



 
