package org.egov.project.web.models;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
* Collection of audit related fields used by most models
*/
    @ApiModel(description = "Collection of audit related fields used by most models")
@Validated
@javax.annotation.Generated(value = "org.egov.codegen.SpringBootCodegen", date = "2022-12-02T17:32:25.406+05:30")

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AuditDetails   {
        @JsonProperty("createdBy")
    


    private String createdBy = null;

        @JsonProperty("lastModifiedBy")
    


    private String lastModifiedBy = null;

        @JsonProperty("createdTime")
    


    private Long createdTime = null;

        @JsonProperty("lastModifiedTime")
    


    private Long lastModifiedTime = null;


}

