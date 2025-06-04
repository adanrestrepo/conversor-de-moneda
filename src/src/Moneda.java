public record Moneda(String from, String to, double conversionRate) {

    @Override
    public String toString() {
        return "Moneda{" +
                "from='" + from + '\'' +
                ", to='" + to + '\'' +
                ", conversionRate=" + conversionRate +
                '}';
    }

    public double getConversionRate() {
        return 0;
    }
}

