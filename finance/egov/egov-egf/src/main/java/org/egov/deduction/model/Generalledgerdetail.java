/*
 *    eGov  SmartCity eGovernance suite aims to improve the internal efficiency,transparency,
 *    accountability and the service delivery of the government  organizations.
 *
 *     Copyright (C) 2017  eGovernments Foundation
 *
 *     The updated version of eGov suite of products as by eGovernments Foundation
 *     is available at http://www.egovernments.org
 *
 *     This program is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU General Public License as published by
 *     the Free Software Foundation, either version 3 of the License, or
 *     any later version.
 *
 *     This program is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU General Public License for more details.
 *
 *     You should have received a copy of the GNU General Public License
 *     along with this program. If not, see http://www.gnu.org/licenses/ or
 *     http://www.gnu.org/licenses/gpl.html .
 *
 *     In addition to the terms of the GPL license to be adhered to in using this
 *     program, the following additional terms are to be complied with:
 *
 *         1) All versions of this program, verbatim or modified must carry this
 *            Legal Notice.
 *            Further, all user interfaces, including but not limited to citizen facing interfaces,
 *            Urban Local Bodies interfaces, dashboards, mobile applications, of the program and any
 *            derived works should carry eGovernments Foundation logo on the top right corner.
 *
 *            For the logo, please refer http://egovernments.org/html/logo/egov_logo.png.
 *            For any further queries on attribution, including queries on brand guidelines,
 *            please contact contact@egovernments.org
 *
 *         2) Any misrepresentation of the origin of the material is prohibited. It
 *            is required that all modified versions of this material be marked in
 *            reasonable ways as different from the original version.
 *
 *         3) This license does not grant any rights to any user of the program
 *            with regards to rights under trademark law for use of the trade names
 *            or trademarks of eGovernments Foundation.
 *
 *   In case of any queries, you can reach eGovernments Foundation at contact@egovernments.org.
 *
 */
package org.egov.deduction.model;

// Generated Oct 10, 2007 10:09:09 AM by Hibernate Tools 3.2.0.b9

import org.egov.commons.Accountdetailtype;
import org.egov.commons.CGeneralLedger;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * Generalledgerdetail generated by hbm2java
 */
public class Generalledgerdetail implements java.io.Serializable
{

    /**
     *
     */
    private static final long serialVersionUID = 513977456112778611L;

    private Integer id;

    private Accountdetailtype accountdetailtype;

    private CGeneralLedger generalledger;

    private BigDecimal detailkeyid;

    private BigDecimal amount;

    private Set<EgRemittanceGldtl> egRemittanceGldtls = new HashSet<EgRemittanceGldtl>(
            0);

    public Generalledgerdetail()
    {
    }

    public Generalledgerdetail(final Accountdetailtype accountdetailtype,
            final CGeneralLedger generalledger, final BigDecimal detailkeyid)
    {
        this.accountdetailtype = accountdetailtype;
        this.generalledger = generalledger;
        this.detailkeyid = detailkeyid;
    }

    public Generalledgerdetail(final Accountdetailtype accountdetailtype,
            final CGeneralLedger generalledger, final BigDecimal detailkeyid,
            final BigDecimal amount, final Set<EgRemittanceGldtl> egRemittanceGldtls)
    {
        this.accountdetailtype = accountdetailtype;
        this.generalledger = generalledger;
        this.detailkeyid = detailkeyid;
        this.amount = amount;
        this.egRemittanceGldtls = egRemittanceGldtls;
    }

    public Integer getId()
    {
        return id;
    }

    private void setId(final Integer id)
    {
        this.id = id;
    }

    public CGeneralLedger getGeneralledger()
    {
        return generalledger;
    }

    public void setGeneralledger(final CGeneralLedger generalledger)
    {
        this.generalledger = generalledger;
    }

    public BigDecimal getDetailkeyid()
    {
        return detailkeyid;
    }

    public void setDetailkeyid(final BigDecimal detailkeyid)
    {
        this.detailkeyid = detailkeyid;
    }

    public BigDecimal getAmount()
    {
        return amount;
    }

    public void setAmount(final BigDecimal amount)
    {
        this.amount = amount;
    }

    public Set<EgRemittanceGldtl> getEgRemittanceGldtls()
    {
        return egRemittanceGldtls;
    }

    public void setEgRemittanceGldtls(final Set<EgRemittanceGldtl> egRemittanceGldtls)
    {
        this.egRemittanceGldtls = egRemittanceGldtls;
    }

    /**
     * @return the accountdetailtype
     */
    public Accountdetailtype getAccountdetailtype()
    {
        return accountdetailtype;
    }

    /**
     * @param accountdetailtype the accountdetailtype to set
     */
    public void setAccountdetailtype(final Accountdetailtype accountdetailtype)
    {
        this.accountdetailtype = accountdetailtype;
    }

}