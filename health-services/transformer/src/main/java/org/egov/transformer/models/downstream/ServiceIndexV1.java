package org.egov.transformer.models.downstream;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
public class ServiceIndexV1 {
    @JsonProperty("id")
    private String id;
    @JsonProperty("createdTime")
    private Long createdTime;
    @JsonProperty("createdBy")
    private String createdBy;
    @JsonProperty("supervisorLevel")
    private String supervisorLevel;
    @JsonProperty("checklistName")
    private String checklistName;
    @JsonProperty("projectId")
    private String projectId;
    @JsonProperty("serviceDefinitionId")
    private String serviceDefinitionId;
    @JsonProperty("province")
    private String province;
    @JsonProperty("district")
    private String district;
    @JsonProperty("tenantId")
    private String tenantId;
}
