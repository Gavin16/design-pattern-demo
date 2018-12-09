package templateMethod;

/**
 * 定义考试模板
 *
 * 考试可以大致分为一下几个步骤
 * (1) 考生按时来到考场(可以是走路,骑车,坐公交或者开车)
 * (2) 考生出示转考证及身份证
 * (3) 考生开始作答(考生根据自己偏好独立作答)
 * (4) 考生提交试卷离开考场
 */
public abstract class ExaminationTemplate {

    /**
     * 参加考试的统一模板
     *
     * 此外模板方法也可以增加传参用来让用户定制自己的调用
     *           也可以定义钩子 然后让子类来实现钩子从而定制自己在模板方法中的部分实现
     */
    public final void takeExamTemplate(){
        // 来到考场
        reachExaminationRoom();
        // 出示考试证件
        showAdmissionCard();
        // 阅卷作答
        answerQuestions();

        if(isSubmitAheadOfDeadline()){
            System.out.println("提前交卷");
        }
        // 提交试卷离场
        submitAnswerSheet();
    }

    protected abstract boolean isSubmitAheadOfDeadline();

    private void submitAnswerSheet() {
        System.out.println("考生在考试结束时间统一停止作答,提交答题卡并离开考场");
    }

    protected abstract void answerQuestions();

    private void showAdmissionCard() {
        System.out.println("考生统一出示准考证和身份证");
    }

    protected abstract void reachExaminationRoom();
}
