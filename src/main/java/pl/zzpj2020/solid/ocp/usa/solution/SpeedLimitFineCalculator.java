package pl.zzpj2020.solid.ocp.usa.solution;

import pl.zzpj2020.solid.ocp.usa.solution.calculation.FineStrategy;
import pl.zzpj2020.solid.ocp.usa.solution.calculation.FineStrategyResolver;
import pl.zzpj2020.solid.ocp.usa.solution.calculation.SwitchFineStrategyResolver;

public class SpeedLimitFineCalculator {

    private FineStrategyResolver fineStrategyResolver;

    public SpeedLimitFineCalculator(SwitchFineStrategyResolver fineStrategyResolver) {
        this.fineStrategyResolver = fineStrategyResolver;
    }

    public double calculateSpeedLimitFine(String stateCode, int speed) {
        FineStrategy fineStrategy = fineStrategyResolver.resolve(stateCode);
        return fineStrategy.calculateSpeedLimitFine(speed);
    }
}
