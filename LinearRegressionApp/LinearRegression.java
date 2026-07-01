public class LinearRegression {
    //private firstData;
    //private secondData;
    public static void main(String[] args) {
        //java.util.Scanner inputCollector = new java.util.Scanner(System.in);
        //LinearRegression model = new LinearRegression();

        //double firstData[] = {100.0, 20.0, 30.0, 40.0, 99.0};
        //double secondData[] = {89.0, 100.0, 55.0, 54.0, 43.0};

        double xBar = model.calculateMean(firstData);
        double yBar = model.calculateMean(secondData);

        System.out.println("X BAR: " + xBar);
        System.out.println("Y BAR: " + yBar);

        double betaOne = model.calculateBetaOne(firstData, secondData, xBar, yBar);
        System.out.println("Beta One: " + betaOne);

        double betaZero = model.calculateBetaZero(yBar, xBar, betaOne);
        System.out.println("Beat Zero:  " + betaZero);

        System.out.print("Enter A Number To Get Prediction: ");
        int userInput = inputCollector.nextInt();

        double prediction = model.showPrediction(betaZero, betaOne, userInput);
        System.out.println("Prediction " + prediction);
    }

    public double calculateMean(double[] firstData) {
        double total = 0.0;
        int count = 0;

        for(int data = 0; data < firstData.length; data++) {
            total += firstData[data];
            count += 1;
        }
        return total / count;
    }

    public double calculateBetaOne(double[] firstData, double[] secondData, double xBar, double yBar) {
        double numerator = 0.0;
        double denominator = 0.0;

        for(int betas = 0; betas < firstData.length; betas++) {
            numerator += (firstData[betas] - xBar) * (secondData[betas] - yBar);
            denominator += (firstData[betas] - xBar) * (firstData[betas] - xBar);
        }
        return numerator / denominator;
    }

    public double calculateBetaZero(double yBar, double xBar, double betaOne) {
        return yBar - (betaOne * xBar);
    }

    public double showPrediction(double betaZero, double betaOne, double userInput) {
        return betaZero + (betaOne * userInput);
    }
}