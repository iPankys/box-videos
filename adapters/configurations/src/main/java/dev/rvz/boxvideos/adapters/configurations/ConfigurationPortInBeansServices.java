package dev.rvz.boxvideos.adapters.configurations;


import dev.rvz.boxvideos.application.video.service.CreateVideoService;
import dev.rvz.boxvideos.application.video.service.GetAllVideoService;
import dev.rvz.boxvideos.port.out.CreateVideoPortout;
import dev.rvz.boxvideos.port.out.GetAllVideosPortOut;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigurationPortInBeansServices {

    @Bean
    CreateVideoService createVideoServiceBean(CreateVideoPortout createVideoPortout) {
        return new CreateVideoService(createVideoPortout);
    }

    @Bean
    GetAllVideoService getAllVideoServiceBean(GetAllVideosPortOut getAllVideosPortOut) {
        return new GetAllVideoService(getAllVideosPortOut);
    }
}
