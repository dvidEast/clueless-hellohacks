public class Model {
    private Double height;
    private Double weight;
    private Double waist;
    private Double chest;

    public Model(double height, double weight, double waist, double chest) {
        this.height = height;
        this.weight = weight;
        this.waist = waist;
        this.chest = chest;
    }

    public double calculateBMI() {
        Double heightIntoMeters = (height/100);
        Double bmi = weight/heightIntoMeters*heightIntoMeters;
        return bmi;
    }

    public double calculateNeck() {
        Double bmi = this.calculateBMI();

        if (bmi <= 22.5){
            return 37.2;
        } else if (bmi <= 25.0){
            return 38.7;
        } else if (bmi <= 27.5){
            return 40.0;
        } else if (bmi <= 30.0){
            return 41.2;
        } else if (bmi <= 32.5){
            return 42.2;
        } else if (bmi <= 35.0){
            return 43.2;
        } else if (bmi <= 37.5){
            return 44.2;
        } else if (bmi <= 40.0) {
            return 45.3;
        } else {
            return 35.7;
        }
    }

    public double calculateArmCircumference() {
        Double height = this.height; //height in meters
        if (height > 194) {
            return 32.0;
        } else if (height > 193) {
            return 31.5;
        } else if (height > 191) {
            return 30.0;
        } else if (height > 189) {
            return 29.5;
        } else if (height > 187) {
            return 29.0;
        } else if (height > 185) {
            return 28.5;
        } else if (height > 184) {
            return 27.5;
        } else if (height > 182) {
            return 27.0;
        } else if (height > 180) {
            return 26.5;
        } else if (height > 178) {
            return 26.0;
        } else if (height > 176) {
            return 25.5;
        } else if (height > 175) {
            return 25.0;
        } else if (height > 173) {
            return 24.5;
        } else if (height > 171) {
            return 24.0;
        } else {
            return 25.0;
        }
    }

    public double calculateHips() {
        double waist = this.waist;

        return waist * 1.04; //average hip-to-waist ratio for men
    }

    public String calculateMeasurements() {
        String measurement;
        Double neck = this.calculateNeck();
        Double arm = this.calculateArmCircumference();
        Double hips = this.calculateHips();

        measurement = "Your model measurements:\n" +
                "Height: " + this.height + " cm\n" +
                "Waist circumference: " + this.waist + " cm\n" +
                "Chest circumference: " + this.chest + " cm\n" +
                "Neck circumference: " + neck + " cm\n" +
                "Arm (ulna): " + arm + " cm\n" +
                "Hip circumference: " + hips + " cm";

        return measurement;
    }
}