package com.company;
//import org.apache.log4j.Logger;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Logger;

public class MVCMain {

    private static final Logger logger = Logger.getLogger(MVCMain.class.getName());

    public static void main(String[] args) throws Exception {
        Handler fileh= new FileHandler();
logger.addHandler(fileh);
   // logger.info("message");


        Train model = new Train();
        View view = new View();
        TrainController controller = new TrainController(model,view);
        controller.Update();



    }
}
