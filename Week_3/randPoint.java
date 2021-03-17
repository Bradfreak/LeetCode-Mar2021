class Solution {
    double r, x, y;
    public Solution(double radius, double x_center, double y_center) {
        r = radius;
        x = x_center;
        y = y_center;
    }
    public double[] randPoint() {
        double temp = Math.random() * 2 * Math.PI,
            hyp = Math.sqrt(Math.random()) * r,
            adj = Math.cos(temp) * hyp,
            opp = Math.sin(temp) * hyp;
        return new double[]{x + adj, y + opp};
    }
}
