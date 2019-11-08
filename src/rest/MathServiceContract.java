package rest;
public interface MathServiceContract {
    public ServiceResponse addition(double num1, double num2);
    public ServiceResponse multiply(double num1, double num2, double num3);
    public ServiceResponse cube(int num);
}