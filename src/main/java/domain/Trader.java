package domain;

public class Trader {
    private final String idTrader;
    private final String nameTrader;

    private Trader(String idTrader, String nameTrader) {
        this.idTrader = idTrader;
        this.nameTrader = nameTrader;
    }


    public static final class TraderBuilder {
        private String idTrader;
        private String nameTrader;

        private TraderBuilder() {
        }

        public static TraderBuilder aTrader() {
            return new TraderBuilder ( );
        }

        public TraderBuilder withIdTrader(String idTrader) {
            this.idTrader = idTrader;
            return this;
        }

        public TraderBuilder withNameTrader(String nameTrader) {
            this.nameTrader = nameTrader;
            return this;
        }

        public Trader build() {
            Trader trader = new Trader (idTrader, nameTrader);
            return trader;
        }
    }
}
