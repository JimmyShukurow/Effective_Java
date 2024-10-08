package org.example.objectCreation.builder;

public class CalZone extends Pizza {
    private final boolean sauceInside;

    public static class Builder extends Pizza.Builder<Builder> {
        private boolean sauceInside = false;

        public Builder sauceInside() {
            sauceInside = true;
            return this;
        }

        @Override
        public CalZone build() {
            return new CalZone(this);
        }

        @Override
        protected Builder self() {
            return this;
        }
    }

    private CalZone(Builder builder) {
        super(builder);
        sauceInside = builder.sauceInside;
    }

    @Override
    public String toString() {
        return "CalZone{" + "\n" +
                "sauceInside=" + sauceInside + "\n" +
                "toppings=" + toppings + "\n" +
                '}';
    }
}
