package pl.zzpj2020.solid.ocp.usa.solution.calculation;

public class SwitchFineStrategyResolver implements FineStrategyResolver {
    @Override
    public FineStrategy resolve(String stateCode) {
        switch (stateCode) {
            case "SC": {
                return new SCFineStrategy();
            }
            case "AL": {
                return new ALFineStrategy();
            }
            case "GA": {
                return new GAFineStrategy();
            }
            default:
                return new DefaultFineStrategy();
        }
    }
}
