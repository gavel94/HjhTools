## 我自己项目的一个工具类
*	CUtils.class需要在自定义的application的onCreate()进行初始化CUtils.init(this);
*	Arith.class由于Java的简单类型不能够精确的对浮点数进行运算，这个工具类提供精确的浮点数运算，包括加减乘除和四舍五入。
*	BaseRecyclerViewAdapter.class 一个RecyclerView的通用适配器。需要实现item的单击或长按监听需要添加RecyclerView的addOnItemTouchListener(),并且创建自定义的OnRecyclerItemClickListener抽象类。
*	Logutil.class是一个自定义的log工具，修改LEVEL值可以选择log的打印输出，开始时候设置为VERBOSE，上线设置为NOTHING。
*	SPUtils.class是一个sp工具类，单列模式设计

## 预期
*	自定义控件的更新
*	常用布局的定义