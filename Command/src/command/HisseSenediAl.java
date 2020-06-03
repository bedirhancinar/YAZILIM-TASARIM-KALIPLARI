package command;

public class HisseSenediAl implements Order {
    private HisseSenedi hisseSenedi;

    public HisseSenediAl(HisseSenedi hisseSenedi) {
        this.hisseSenedi = hisseSenedi;
    }

    @Override
    public void execute(){
        hisseSenedi.buy();
    }
}
