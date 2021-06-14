package HW.Task_Additoanal_3;

public enum Year {

        WINTER(-10),
        SPRING (9),
        SUMMER (23) {
                @Override
                public String seasonDescription () {
                        return "a warm season";
                }
        },
        AUTUMN(11);

        private int temp;

        Year (int t) {
                temp = t;
        }

        int getTemp() {
                return temp;
        }

        public String seasonDescription () {
                return "a cold season";
        }

        protected static void favoriteSeason1 (Year season) {
                switch (season) {
                        case WINTER -> System.out.println("\nI love winter\n");
                        case SPRING -> System.out.println("\nI don't love spring\n");
                        case SUMMER -> System.out.println("\nI don't love summer\n");
                        case AUTUMN -> System.out.println("\nI don't love autumn\n");
                }
        }

        protected void favoriteSeason2 (Year season) {
                switch (season) {
                        case WINTER -> System.out.println("\nI love winter\n");
                        case SPRING -> System.out.println("\nI don't love spring\n");
                        case SUMMER -> System.out.println("\nI don't love summer\n");
                        case AUTUMN -> System.out.println("\nI don't love autumn\n");
                }
        }

}