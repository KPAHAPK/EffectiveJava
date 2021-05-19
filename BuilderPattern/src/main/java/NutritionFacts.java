public class NutritionFacts {
    private final int servingSize;
    private final int servings;
    private final int calories;
    private final int fat;
    private final int sodium;
    private final int carbohydrate;
    private final String name;

    public static class Builder {
        private final int servingsSize;
        private final int servings;
        private final String name;

        private int calories = 0;
        private int fat = 0;
        private int sodium = 0;
        private int carbohydrate = 0;

        public Builder(int servingsSize, int servings, String name) {
            this.servingsSize = servingsSize;
            this.servings = servings;
            this.name = name;
        }

        public Builder calories(int val) {
            calories = val;
            return this;
        }


        public Builder fat(int val) {
            fat = val;
            return this;
        }

        public Builder sodium(int val) {
            sodium = val;
            return this;
        }

        public Builder carbohydrate(int val) {
            carbohydrate = val;
            return this;
        }
        public NutritionFacts build(){
            return new NutritionFacts(this);
        }

    }

    private NutritionFacts(Builder builder) {
        servingSize = builder.servingsSize;
        servings = builder.servings;
        name = builder.name;
        calories = builder.calories;
        fat = builder.fat;
        sodium = builder.sodium;
        carbohydrate = builder.carbohydrate;
    }

    @Override
    public String toString() {
        return  this.name + " nutritionFacts{" +
                "servingSize=" + servingSize +
                ", servings=" + servings +
                ", calories=" + calories +
                ", fat=" + fat +
                ", sodium=" + sodium +
                ", carbohydrate=" + carbohydrate +
                '}';
    }

    public static void main(String[] args) {
        NutritionFacts pizza = new NutritionFacts.Builder(34,3, "Pizza")
                .calories(34)
                .fat(323)
                .carbohydrate(34)
                .sodium(42)
                .build();
        NutritionFacts cocaCola = new NutritionFacts.Builder(66,324, "cocaCola")
                .calories(32)
                .sodium(1232)
                .build();

        System.out.println(pizza.toString());
        System.out.println(cocaCola.toString());

    }
}


