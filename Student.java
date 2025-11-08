package campus;//声明这个类在campus包下

public class Student extends Person{//extends:继承，延申//从人类里面继承一个学生类，即自动拥有人的属性和方法
    private int studentId;//学生类里面私有一个id和专业
    private String major;//专业
//以上只有student内部能改，外部可以通过set方法修改
    public Student(){//无参构造一个学生属性
        super();
        this.studentId = 0;//这个学生的id是0
        this.major = "未知专业";//这个学生的专业是未知专业
    }
public Student(String name,int age,int studentId,String major){//有参构造一个学生属性
    super(name,age);//调用父类的有参构造方法，初始化name和age//注意super()必须放在子类构造方法的第一行
    this.studentId = studentId;//注意等号后面的studentId和major是传经来的参数
    this.major = major;

}   
@Override//开始重写父类了
//重写规则：方法名，参数列表，返回值必须和父类一致
public void work(){//相同工作方法
    System.out.println("学生工作：学习专业课程（" + this.major + "）、参加校园活动");
//相同输出方法
} 
public void takeExam(){
    System.out.println("学生"+this.name+"(学号："+this.studentId+")正在参加考试");
}

@Override
public void showBasicInfo(){
    super.showBasicInfo();
    System.out.println("学号："+this.studentId);
    System.out.println("专业："+this.major);
    System.out.println("---------------");

}
//Setter修改一个private里的专业
public void setMajor(String major){
    this.major = major;
}
//Getter封装
public int getStudentId(){
    return studentId;
}
}
