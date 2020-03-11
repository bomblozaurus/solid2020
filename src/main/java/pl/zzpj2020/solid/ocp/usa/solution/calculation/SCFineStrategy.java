package pl.zzpj2020.solid.ocp.usa.solution.calculation;

public class SCFineStrategy implements FineStrategy {
    private static final int MAX_SPEED = 0;

    @Override
    public double calculateSpeedLimitFine(int speed) {

        return speed > MAX_SPEED ? speed * 1.1 : 0;
    }
}
