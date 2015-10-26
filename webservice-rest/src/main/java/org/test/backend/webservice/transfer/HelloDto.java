package org.test.backend.webservice.transfer;

import lombok.Getter;
import lombok.Setter;
import com.fasterxml.jackson.annotation.JsonAutoDetect;

/**
 * Created by achernysh on 26.10.2015.
 */
@Getter
@Setter
@JsonAutoDetect(
        isGetterVisibility = JsonAutoDetect.Visibility.NONE
)
public class HelloDto {

    private Long id;

    private String message;
}
