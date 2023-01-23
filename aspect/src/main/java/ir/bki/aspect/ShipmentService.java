package ir.bki.aspect;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
@Component
@Service
public class ShipmentService {
    @Log
    // this here is what's called a join point
    public void shipStuff(){
        System.out.println("In Service");
    }


    @Log
    // this here is what's called a join point
    public void shopStuff(){
        System.out.println("Out Service");
    }
}