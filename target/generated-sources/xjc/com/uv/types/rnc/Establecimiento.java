//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2018.10.26 a las 07:03:45 PM CLST 
//


package com.uv.types.rnc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="NombreEstablecimiento"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="150"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CodigoEstablecimiento"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
 *               &lt;minInclusive value="1"/&gt;
 *               &lt;maxInclusive value="99999"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ServicioSalud"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
 *               &lt;minInclusive value="1"/&gt;
 *               &lt;maxInclusive value="99"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
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
    "nombreEstablecimiento",
    "codigoEstablecimiento",
    "servicioSalud"
})
@XmlRootElement(name = "Establecimiento")
public class Establecimiento {

    @XmlElement(name = "NombreEstablecimiento", required = true)
    protected String nombreEstablecimiento;
    @XmlElement(name = "CodigoEstablecimiento")
    protected int codigoEstablecimiento;
    @XmlElement(name = "ServicioSalud")
    protected int servicioSalud;

    /**
     * Obtiene el valor de la propiedad nombreEstablecimiento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreEstablecimiento() {
        return nombreEstablecimiento;
    }

    /**
     * Define el valor de la propiedad nombreEstablecimiento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreEstablecimiento(String value) {
        this.nombreEstablecimiento = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoEstablecimiento.
     * 
     */
    public int getCodigoEstablecimiento() {
        return codigoEstablecimiento;
    }

    /**
     * Define el valor de la propiedad codigoEstablecimiento.
     * 
     */
    public void setCodigoEstablecimiento(int value) {
        this.codigoEstablecimiento = value;
    }

    /**
     * Obtiene el valor de la propiedad servicioSalud.
     * 
     */
    public int getServicioSalud() {
        return servicioSalud;
    }

    /**
     * Define el valor de la propiedad servicioSalud.
     * 
     */
    public void setServicioSalud(int value) {
        this.servicioSalud = value;
    }

}
