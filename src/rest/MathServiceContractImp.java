package rest;
import javax.ws.rs.*;
import javax.xml.bind.annotation.XmlRootElement;

@Path("/mathservice")
@Consumes({ "application/json" })
@Produces({ "application/json" })
@XmlRootElement
public class MathServiceContractImp implements MathServiceContract {
    private ServiceResponse serviceResponse = new ServiceResponse();
    //http://localhost:8080/JaxRSNoMavenService_war_exploded/api/mathservice/addition/3/5
    @Override
    @GET
    @Path("/addition/{num1}/{num2}")
    public ServiceResponse addition(@PathParam("num1") double num1,@PathParam("num2") double num2) {
        serviceResponse.setResult(num1+num2);
        return serviceResponse;
    }

    //http://localhost:8080/JaxRSNoMavenService_war_exploded/api/mathservice/multiply/1/2/3
    @Override
    @GET
    @Path("/multiply/{num1}/{num2}/{num3}")
    public ServiceResponse multiply(@PathParam("num1") double num1,@PathParam("num2") double num2,@PathParam("num3") double num3) {
        serviceResponse.setResult(num1*num2*num3);
        return serviceResponse;
    }

    //http://localhost:8080/JaxRSNoMavenService_war_exploded/api/mathservice/cube/3
    @Override
    @GET
    @Path("/cube/{num}")
    public ServiceResponse cube(@PathParam("num") int num) {
        serviceResponse.setResult(num*num*num);
        return serviceResponse;
    }
}
