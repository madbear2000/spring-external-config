package com.bearpaw;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix="my.hardware")
@Component
public class Hardware {
    

    String type;
    String diskType;
    
    public String getDiskType() {
        return diskType;
    }
    
    public void setDiskType(String diskType) {
        this.diskType = diskType;
    }
    
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
