package campus;

public abstract class Person {//抽象一个类 人，因为人是一个抽象的大类，必须明确是学生，老师才能具体使用
   //保护：只有子类能用，外部不能直接修改
    protected String name;//保护一个字符串姓名
   protected int age;//保护一个整数年龄
   public static String campus = "njupt";//静态变量一个南京邮电大学
//以上属于人这一类都有的东西

//以下是构造方法：创建对象时用来”初始化属性“的一种特殊方法
   public Person() {//无参构造一个人的属性
    this.name = "未知姓名";//这个人的名字是未知姓名
    this.age = 0;//这个人的年龄是0
   }
   public Person(String name,int age){//有参构造一个人的属性
    this.name = name;//注意等号后面的name和age是传经来的参数
    this.age = age;
   }

   public abstract void work();//抽象一个工作方法，因为工作是一个抽象的大类，必须明确是学生工作，老师工作才能具体使用
//以下是具体方法：{}里面有内容，所有子类都能用
   public void showBasicInfo(){//具体构造一个显示基本信息的方法//Info：information的缩写
    System.out.println("姓名："+this.name);//System.out.println：打印输出，固定写法
    System.out.println("年龄："+this.age);
    System.out.println("所属校园："+Person.campus);
   }
   public String getName(){//然后用getname方法获取名字，Getter封装
    return this.name;
   }
   public int getAge(){
    return this.age;
   }
}
