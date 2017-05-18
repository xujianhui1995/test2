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
    - 
