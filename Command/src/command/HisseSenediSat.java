package command;

public class HisseSenediSat implements Order {
    private HisseSenedi hisseSenedi;

    public HisseSenediSat(HisseSenedi hisseSenedi){
        this.hisseSenedi = hisseSenedi;
    }

    @Override
    public void execute() {
        hisseSenedi.sell();
    }
}
