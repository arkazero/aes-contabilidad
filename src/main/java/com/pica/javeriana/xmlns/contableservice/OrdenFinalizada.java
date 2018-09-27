
package com.pica.javeriana.xmlns.contableservice;

import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import org.hibernate.validator.constraints.NotEmpty;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="transactionID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="transactionNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="transactionYear" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="transactionMonth" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="transactionDay" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="acountID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="withDrawalAmount" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="depositAmount" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "transactionID",
    "transactionNumber",
    "transactionYear",
    "transactionMonth",
    "transactionDay",
    "acountID",
    "withDrawalAmount",
    "depositAmount"
})
@XmlRootElement(name = "OrdenFinalizada")
public class OrdenFinalizada {
	
	@NotNull
	@NotEmpty
    @XmlElement(required = true, nillable = true)
    protected String transactionID;
	@NotNull
	@NotEmpty
	@XmlElement(required = true, nillable = true)
    protected String transactionNumber;
	@NotNull
	@NotEmpty
	@XmlElement(required = true, nillable = true)
    protected String transactionYear;
	@NotNull
	@NotEmpty
    @XmlElement(required = true, nillable = true)
    protected String transactionMonth;
	@NotNull
	@NotEmpty
	@XmlElement(required = true)
    protected String transactionDay;
	@NotNull
	@NotEmpty
	@XmlElement(required = true, nillable = true)
    protected String acountID;
	@NotNull
	@NotEmpty
	@XmlElement(required = true, nillable = true)
    protected String withDrawalAmount;
	@NotNull
	@NotEmpty
	@XmlElement(required = true, nillable = true)
    protected String depositAmount;

    /**
     * Obtiene el valor de la propiedad transactionID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionID() {
        return transactionID;
    }

    /**
     * Define el valor de la propiedad transactionID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionID(String value) {
        this.transactionID = value;
    }

    /**
     * Obtiene el valor de la propiedad transactionNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionNumber() {
        return transactionNumber;
    }

    /**
     * Define el valor de la propiedad transactionNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionNumber(String value) {
        this.transactionNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad transactionYear.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionYear() {
        return transactionYear;
    }

    /**
     * Define el valor de la propiedad transactionYear.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionYear(String value) {
        this.transactionYear = value;
    }

    /**
     * Obtiene el valor de la propiedad transactionMonth.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionMonth() {
        return transactionMonth;
    }

    /**
     * Define el valor de la propiedad transactionMonth.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionMonth(String value) {
        this.transactionMonth = value;
    }

    /**
     * Obtiene el valor de la propiedad transactionDay.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionDay() {
        return transactionDay;
    }

    /**
     * Define el valor de la propiedad transactionDay.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionDay(String value) {
        this.transactionDay = value;
    }

    /**
     * Obtiene el valor de la propiedad acountID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcountID() {
        return acountID;
    }

    /**
     * Define el valor de la propiedad acountID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcountID(String value) {
        this.acountID = value;
    }

    /**
     * Obtiene el valor de la propiedad withDrawalAmount.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWithDrawalAmount() {
        return withDrawalAmount;
    }

    /**
     * Define el valor de la propiedad withDrawalAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWithDrawalAmount(String value) {
        this.withDrawalAmount = value;
    }

    /**
     * Obtiene el valor de la propiedad depositAmount.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepositAmount() {
        return depositAmount;
    }

    /**
     * Define el valor de la propiedad depositAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepositAmount(String value) {
        this.depositAmount = value;
    }

}
