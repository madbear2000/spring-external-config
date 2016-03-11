package com.bearpaw;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SomeService {

    Logger log = LoggerFactory.getLogger("SomeService");
    
    @Autowired 
    RunProps props;
    
    @Autowired
    Hardware hardware;
    
    @PostConstruct
    public void printf() {
        
        log.error(hardware.getType());
        log.error(hardware.getDiskType());
        
//        log.error(props.getHardware().getType());
//        log.error(props.getHardware().getDiskType());
        props.getServers().forEach(s -> log.info(s));
        props.getMappings().forEach((f,k) -> log.warn(f + ":" + k));
    }
    
}
