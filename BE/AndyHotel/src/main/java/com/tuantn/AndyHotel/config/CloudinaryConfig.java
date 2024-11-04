package com.tuantn.AndyHotel.config;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CloudinaryConfig {

    @Bean
    public Cloudinary cloudinary() {
        return new Cloudinary(ObjectUtils.asMap(
                "cloud_name", "dld6zt8jn",
                "api_key", "553193636156677",
                "api_secret", "srvH_WSyymGx18TdyLjSb3xW94o"
        ));
    }
}
