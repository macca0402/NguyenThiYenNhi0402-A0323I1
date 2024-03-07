package SS4_OOP.BT;


import java.time.LocalTime;

public class StopWatch {
    private LocalTime startTime;
    private LocalTime endTime;

    public LocalTime getStartTime() {
        return startTime;
    }

    public LocalTime getEndTime() {
        return endTime;
    }

    StopWatch() {
        startTime = LocalTime.now();
    }

    public void start() {
        this.startTime = LocalTime.now();
    }

    public void stop() {
        this.endTime = LocalTime.now();
    }

    public void getElapsedTime() {
        int ElapsedTime = (startTime.toSecondOfDay() - endTime.toSecondOfDay() * 100);
        System.out.println("Số mili giây đếm đc: " + ElapsedTime);
    }

    public static void main(String[] args) {
        StopWatch s = new StopWatch();
        s.start();
        int sum = 0;
        for (int i = 0; i < 10000000; i++) {
            sum = sum + i;
        }
        s.stop();
        s.getElapsedTime();
    }
}
