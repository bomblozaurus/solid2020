package pl.zzpj2020.solid.ocp.usa.solution.calculation;

@FunctionalInterface
public interface FineStrategyResolver {
    FineStrategy resolve(String stateCode);
}
