package cn.lucasma.design.pattern.behavioral.state;

public class StopState extends CourseVideoState {
    @Override
    public void play() {
        super.courseVideoContext.setCourseVideoState(CourseVideoContext.PLAY_STATE);
    }

    @Override
    public void speed() {
        System.out.println("无法快进");
    }

    @Override
    public void pause() {
        System.out.println("无法暂停");
    }

    @Override
    public void stop() {
        System.out.println("暂停状态");
    }
}
