package dev.patika.fifthhomeworkozanclk.util;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@Component
@SessionScope
public class ClientRequestInfo {


    private String clientIpAdress;
    private String clientUrl;
    private String sessionActivityId;
    private LocalDate requestDate;

}
