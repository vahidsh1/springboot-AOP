package ir.bki.aspect;

import org.springframework.stereotype.Service;

@Service
public class ShipmentService {
    @Log
    // this here is what's called a join point
    public void shipStuff(){
        System.out.println("In Service");
    }
}