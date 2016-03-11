package com.bearpaw;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix = "my")
@Component
public class RunProps {

//    private Hardware hardware = new Hardware();
    private List<String> servers = new ArrayList<String>();
    private Map<String, String> mappings = new HashMap<String, String>();

    public Map<String, String> getMappings() {
        return mappings;
    }

//    public Hardware getHardware() {
//        return hardware;
//    }

    public List<String> getServers() {
        return servers;
    }
}