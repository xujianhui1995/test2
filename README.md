# Game
MyPlane 类
-------

1.UML类图

![MyPlane 类](https://github.com/xujianhui1995/Game/blob/master/MyPlane.jpg)

2.详细分析

 (1). 成员变量

-  x，y是int类型的变量，用来记录我方战机的当前位置，进行位图绘制。
- dl，du，dr，dd是Boolean类型的变量，用来判断我方战机正在向那一个方向前进，一直按下某一个方向，将会向那个方向一直行进，直到边界。
- MYPLANE_XSPEED，MYPLANE_XSPEED是int类型的变量，作用是控制我方战机横向和纵向的运行速度，保证一定的速率移动。
- live是Boolean类型的变量，作用是判断我方战机是否死亡

(2). 成员方法

-   MYPlane(int x,int y)构造函数，初始化我方战机的位置，使其位于中央 
-   draw(Graphics g)绘图方法，我方战机位置改变时重新绘制
-   keyPressed(KeyEvent e)按键方法，键盘上按下相应的键码进行相应的移动
-   keyReleased(KeyEvent e)按键释放方法，按键释放使之不再移动
-   move()战机移动方法，键按下后进行移动
-   getX()获得战机的横向位置
-   getY()获得战机的纵向位置
-   isLive()战机是否存活
-   setLive(boolean live)设置飞机存活状态。

Bullet 类
-------
1．UML类图

![Bullet类][1]


  [1]: https://github.com/xujianhui1995/Game/blob/master/Bullet.jpg

2.详细分析

(1) 成员变量

  -   BULLET_SPEED为int类型变量，初始为15.战机发射子弹的速率。
    -   x,y为int类型变量，记录子弹的位置。
    -   live为boolean类型的变量，判断子弹是否为有效状态。
    -   bullet为Image类型变量，加载的子弹类图。 
 
(2) 成员方法

   -   Bullet(int x,int y)构造方法，子弹位图绘制的位置。
    -   draw(Graphics g)绘制子弹位图的方法。
    -   isLive()判断子弹是否为有效状态。
    -   setLive(boolean live)设置子弹是否有效。
-   getX(),getY()获得子弹的位置坐标。

EnemyBullet 类
-----------
1．UML类图

![EnemyBullet 类][1]


  [1]: https://github.com/xujianhui1995/Game/blob/master/EnemyBullet.jpg

2. 详细分析    
    
(1)	成员变量
    
   -   x,y为int类型变量，记录敌机位置坐标。
    -   bulletspeed为int类型变量，初始值为15，用来设置子弹速度的变量。
    -   live为boolean类型变量，判断子弹是否为有效状态。
    -   enemyplanebullet为Image类型变量，敌机子弹所加载的位图。
    (2)	成员方法
    
    -   EnemyBullet(int x,int y)构造方法，初始敌机子弹的位置。
    -   draw(Graphics g)绘制敌机子弹的方法，用来重新绘制。
    -   isLive()敌机子弹是否为存活状态。
    -   setLive(boolean live)设置子弹的状态。
- getX(),getY()获取敌机子弹的坐标，用来重新绘制

Explode 类
-------
1．UML类图

![Explode 类][1]


  [1]: https://github.com/xujianhui1995/Game/blob/master/Explode.jpg
 
2. 详细分析

(1)	成员变量       

-    x,y为int类型变量，记录爆炸位置。        	
-    live 为boolean类型变量，判断爆炸状态。        
-    Explode1为Image类型对象，用来加载爆炸的位图。

(2)	成员方法

-   Explode(int x,int y)构造方法，初始化爆炸位置及位图。
-   draw(Graphics g)绘制方法，用来绘制爆炸位图。
-   isLive()是否为存活状态。
-   setLive(boolean live)设置是否为存活状态。
-   getCount()得到爆炸次数。
-   setCount()设置爆炸次数。

PlayMusic 类
------------
1．UML类图

![EnemyBullet 类][1]


[1]: https://github.com/xujianhui1995/Game/blob/master/PlayMusic.jpg
2. 详细分析

(1)	成员变量

-  musicFile为File类型对象，用来播放的文件。
-  clip为 AudioClip类型对象，进行播放的对象。
-  fileURI 为URI类型对象，文件的URI路径。
-   fileURL 为URL类型对象，文件的URL路径

(2)	成员方法

-   PlayMusic(String music)构造方法，初始化播放的音频文件。
-   play()播放方法，进行音频播放。
-   stop()停止方法，音频停止方法。
-   loop()循环方法，使音频循环播放。
 
GameBox 类
-------------

1．UML类图

![](https://github.com/xujianhui1995/Game/blob/master/GameBox.jpg)

2. 详细分析

(1)	成员变量

- GAME_WIDTH是int型变量 设置游戏面板的宽度为800。
- GAME_HEIGHT 是int型变量设置面板的高度为600。
-  f1I Image类型的对象，用来设置字体的颜色大小和行间距。
- backgroundimage 用来加载背景图片。
- plane Image类型变量，用来设置加载飞机的图片。
- PLANE_WIDTH int类型变量，用来设置飞机的高度。
- PLANE_HEIGHT int类型变量 用来设置飞机的宽度。
- Explode1 Image类型的对象。用来加载爆炸的图片。
- EXPLODE1_WIDTH int类型变量，用来设置爆炸的范围的高度。
- EXPLODE1_HEIGHT int类型变量，用来设置爆炸范围的宽度。
- Bullet Image类型的对象，用来设置子弹需要加载的图片。
- BULLET_WIDTH int型变量，用来设置子弹的宽度。
- BULLET_HEIGHT int 型变量，用来设置子弹的高度。
- enemy1 Image类型的对象，用来设置敌机的宽度。
- enemy2 Image类型的对象，用来设置敌机的高度。
- enemybullet Image类型的对象，用来加载敌机发出的子弹。
- ENEMYBULLET_WIDTH int类型的变量，用来设置子弹的大小。
- ENEMYBULLET_HEIGHT int 类型的变量，用来设置子弹的大小。
- back_music 字符串类型变量，加载背景音乐。
- bomb_music字符串类型变量，加载子弹爆炸音乐。

DB 类
---------

1．UML类图

![](https://github.com/xujianhui1995/Game/blob/master/DB.jpg)

2. 详细分析

(1)	成员变量

- url为String类型对象，数据库URL路径。用来连接数据库。
- driver为String类型对象，加载数据库的驱动。
- conn为Connection类型对象，用来与数据库进行连接。
- stmt为Statement类型对象，用来操作Sql语句从而操纵数据库。

(2)	成员方法

- DB()构造方法，加载数据库驱动，实现数据库连接。
- excuteWrite(String name,String score)将数据写入数据库方法。
- excuteRead()从数据库中读取数据方法。

StartFrame 类
-----
1．UML类图



2. 详细分析
(1)	成员变量

- bk为Image类型对象，用来加载游戏的背景位图。
- myplane为MyPlane类型对象，建立我方战机。
- sourse 为float类型变量，存储分数。
- death, life为我方战机死亡次数和生命值。
- bulletlist为 ArrayList<Bullet>对象，用来存储子弹的线性表。
-  	explodelist 为ArrayList<Explode>对象，用来存储爆炸对象的线性表。
- enemybulletlist为 ArrayList<EnemyBullet>对象，用来存储敌机子弹对象的线性表。
- exItem,score为Jmenu类型对象，菜单条目。
- jp为Jpanel对象，框架类的面板对象。
- db为DB对象，用来进行数据库操作。
- musicBackground musicBomb为PlayMusic对象，用来播放背景音乐。
(2)	成员方法
- StartFrame()构造方法，初始化面板及位图。加载游戏界面。
- queryRecord()查询分数记录方法。
- void run()游戏进行线程方法，实现游戏的运行。
- clearEnemyBullet()清除无效的敌机子弹。
- clearBullet()清除无效的子弹。
- createBullet()创建子弹。
- clearEnemyplane()清除敌机状态为False的对象。
- clearExplode()清除爆炸状态为False的对象。
- hitPlane()攻击敌机的方法。
- impactMyplane()判断是否碰撞。
- hitMyplane()我方战机被攻击的方法。
- endGame()结束游戏，扫尾方法。
- recored()记录成绩方法。
- ifEnd()判断是否结束。
- actionPerformed(ActionEvent e)菜单条目的动作事件实现方法。
