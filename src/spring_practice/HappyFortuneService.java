package spring_practice;

public class HappyFortuneService implements FortuneService{

    @Override
    public String getFortune() {
        return "Today is a good day to win!";
    }
}
