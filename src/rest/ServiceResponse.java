package rest;
import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement
public class ServiceResponse {
    private double result;

    public ServiceResponse() {
    }
    public double getResult() {
        return result;
    }
    public void setResult(double result) {
        this.result = result;
    }
}
