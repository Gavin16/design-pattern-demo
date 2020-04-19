package patterns.templateMethod;

/**
 * 模板方法模式的基本实现
 */
public class StudentATakeExam extends ExaminationTemplate{
    @Override
    protected boolean isSubmitAheadOfDeadline() {
        return false;
    }

    @Override
    protected void answerQuestions() {
        System.out.println("studentA-小明同学先做大题再做选择题");
    }

    @Override
    protected void reachExaminationRoom() {
        System.out.println("studentA-小明同学 骑共享单车来参加的考试");
    }
}
