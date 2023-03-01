package org.egov.stock.validator.stockreconciliation;

import lombok.extern.slf4j.Slf4j;
import org.egov.common.models.Error;
import org.egov.common.validator.Validator;
import org.egov.stock.service.FacilityService;
import org.egov.stock.web.models.StockReconciliation;
import org.egov.stock.web.models.StockReconciliationBulkRequest;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static org.egov.common.utils.CommonUtils.notHavingErrors;
import static org.egov.stock.Constants.FACILITY;
import static org.egov.stock.Constants.GET_REFERENCE_ID;
import static org.egov.stock.util.ValidatorUtil.getStockReconciliationListMap;

@Component
@Order(value = 8)
@Slf4j
public class SrReferenceIdValidator implements Validator<StockReconciliationBulkRequest, StockReconciliation> {

    private final FacilityService facilityService;

    public SrReferenceIdValidator(FacilityService facilityService) {
        this.facilityService = facilityService;
    }

    @Override
    public Map<StockReconciliation, List<Error>> validate(StockReconciliationBulkRequest request) {
        log.info("validating for facility id");
        Map<StockReconciliation, List<Error>> errorDetailsMap = new HashMap<>();

        List<StockReconciliation> validEntities = request.getStockReconciliation().stream()
                .filter(notHavingErrors())
                .filter(entity -> FACILITY.equals(entity.getReferenceIdType()))
                .collect(Collectors.toList());
        return getStockReconciliationListMap(request, errorDetailsMap, validEntities, GET_REFERENCE_ID, facilityService);
    }
}
