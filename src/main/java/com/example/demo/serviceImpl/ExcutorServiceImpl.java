package com.example.demo.serviceImpl;


import com.example.demo.service.ExcutorService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class ExcutorServiceImpl implements ExcutorService {
    private static final Logger logger = LoggerFactory.getLogger(ExcutorServiceImpl.class);
    @Override
   // @Async("asyncServiceExecutor")
    public void executeAsync() {

        logger.info("start executeAsync");
        try{
            Thread.sleep(1000);
        }catch(Exception e){
            e.printStackTrace();
        }
        logger.info("end executeAsync");

    }
}
