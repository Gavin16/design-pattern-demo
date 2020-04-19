package patterns.decorator;

import java.util.Random;

/** 程序繁琐的英语课 */
public class StrictClass implements Course {

    // 被包装对象
    private Course course;

    //装饰者模式
//    public StrictClass(Course course){
//        this.course = course;
//    }

    // 静态代理模式
    public StrictClass(){
        this.course = new OtherCourse();
    }


    public void takeClass() {
        if(!isAbsenceOver8Times()){
            signInBeforeClass();
            course.takeClass();
        }
    }

    private boolean isAbsenceOver8Times(){
        // 取数据计算缺课次数; 下面瞎写个返回结果的逻辑
        System.out.println("check in for student's record");
        if(new Random().nextBoolean()){
            return false;
        }
        return true;
    }

    private void signInBeforeClass(){
        System.out.println("every student should sign before get sited..");
        // 记录签到数据
    }
}
