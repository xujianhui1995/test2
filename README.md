# Game
MyPlane 类

1.UML类图

![](https://github.com/xujianhui1995/Game/blob/master/MyPlane.jpg)

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


  [1]: https://github.com/xujianhui1995/Game/blob/master/Bullet.jpg

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

EnemyBullet
-----------
1．UML类图

![此处输入图片的描述][1]


  [1]: https://github.com/xujianhui1995/Game/blob/master/EnemyBullet.jpg

 - 详细分析

    (1)	成员变量
    
    - x,y为int类型变量，记录敌机位置坐标。
    - bulletspeed为int类型变量，初始值为15，用来设置子弹速度的变量。
    - live为boolean类型变量，判断子弹是否为有效状态。
    - enemyplanebullet为Image类型变量，敌机子弹所加载的位图。
    (2)	成员方法
    
    - EnemyBullet(int x,int y)构造方法，初始敌机子弹的位置。
    - draw(Graphics g)绘制敌机子弹的方法，用来重新绘制。
    - isLive()敌机子弹是否为存活状态。
    - setLive(boolean live)设置子弹的状态。
    - getX(),getY()获取敌机子弹的坐标，用来重新绘制。




 
