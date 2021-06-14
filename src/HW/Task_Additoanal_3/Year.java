package HW.Task_Additoanal_3;

public enum Year {

        WINTER(-10),
        SPRING (9),
        SUMMER (23) {
                public String seasonDescription () {
                        return "a warm season";
                }
        },
        AUTUMN(11);

        private int temp;

        Year (int temp) {
                this.temp = temp;
        }

        int getTemp() {
                return temp;
        }

        public String seasonDescription () {
                return "a cold season";
        }

        protected static void favoriteSeason (Year season) {
                switch (season) {
                        case WINTER -> System.out.println("\nI love winter\n");
                        case SPRING -> System.out.println("\nI don't love spring\n");
                        case SUMMER -> System.out.println("\nI don't love summer\n");
                        case AUTUMN -> System.out.println("\nI don't love autumn\n");
                }
        }
}