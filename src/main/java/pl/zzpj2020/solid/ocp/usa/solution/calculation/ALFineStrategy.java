package pl.zzpj2020.solid.ocp.usa.solution.calculation;

public class ALFineStrategy implements FineStrategy {
    private static final int MAX_SPEED = 0;

    @Override
    public double calculateSpeedLimitFine(int speed) {

        return speed > MAX_SPEED ? speed * 3.3 : 0;
    }
}
