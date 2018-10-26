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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element name="FechaDiagnostico" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="DiagnosticoIngresoCentro" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="DiagnosticoComite" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="DiagnosticoCIE10"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;length value="6"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TNM" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Estadio"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="5"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DiagnosticoSOME" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="TipoComite" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ECOG" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
 *               &lt;minInclusive value="0"/&gt;
 *               &lt;maxInclusive value="4"/&gt;
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
    "fechaDiagnostico",
    "diagnosticoIngresoCentro",
    "diagnosticoComite",
    "diagnosticoCIE10",
    "tnm",
    "estadio",
    "diagnosticoSOME",
    "tipoComite",
    "ecog"
})
@XmlRootElement(name = "Diagnostico")
public class Diagnostico {

    @XmlElement(name = "FechaDiagnostico", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fechaDiagnostico;
    @XmlElement(name = "DiagnosticoIngresoCentro", required = true)
    protected String diagnosticoIngresoCentro;
    @XmlElement(name = "DiagnosticoComite", required = true)
    protected String diagnosticoComite;
    @XmlElement(name = "DiagnosticoCIE10", required = true)
    protected String diagnosticoCIE10;
    @XmlElement(name = "TNM", required = true)
    protected String tnm;
    @XmlElement(name = "Estadio", required = true)
    protected String estadio;
    @XmlElement(name = "DiagnosticoSOME", required = true)
    protected String diagnosticoSOME;
    @XmlElement(name = "TipoComite")
    protected String tipoComite;
    @XmlElement(name = "ECOG")
    protected Integer ecog;

    /**
     * Obtiene el valor de la propiedad fechaDiagnostico.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaDiagnostico() {
        return fechaDiagnostico;
    }

    /**
     * Define el valor de la propiedad fechaDiagnostico.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaDiagnostico(XMLGregorianCalendar value) {
        this.fechaDiagnostico = value;
    }

    /**
     * Obtiene el valor de la propiedad diagnosticoIngresoCentro.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiagnosticoIngresoCentro() {
        return diagnosticoIngresoCentro;
    }

    /**
     * Define el valor de la propiedad diagnosticoIngresoCentro.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiagnosticoIngresoCentro(String value) {
        this.diagnosticoIngresoCentro = value;
    }

    /**
     * Obtiene el valor de la propiedad diagnosticoComite.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiagnosticoComite() {
        return diagnosticoComite;
    }

    /**
     * Define el valor de la propiedad diagnosticoComite.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiagnosticoComite(String value) {
        this.diagnosticoComite = value;
    }

    /**
     * Obtiene el valor de la propiedad diagnosticoCIE10.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiagnosticoCIE10() {
        return diagnosticoCIE10;
    }

    /**
     * Define el valor de la propiedad diagnosticoCIE10.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiagnosticoCIE10(String value) {
        this.diagnosticoCIE10 = value;
    }

    /**
     * Obtiene el valor de la propiedad tnm.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTNM() {
        return tnm;
    }

    /**
     * Define el valor de la propiedad tnm.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTNM(String value) {
        this.tnm = value;
    }

    /**
     * Obtiene el valor de la propiedad estadio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstadio() {
        return estadio;
    }

    /**
     * Define el valor de la propiedad estadio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstadio(String value) {
        this.estadio = value;
    }

    /**
     * Obtiene el valor de la propiedad diagnosticoSOME.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiagnosticoSOME() {
        return diagnosticoSOME;
    }

    /**
     * Define el valor de la propiedad diagnosticoSOME.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiagnosticoSOME(String value) {
        this.diagnosticoSOME = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoComite.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoComite() {
        return tipoComite;
    }

    /**
     * Define el valor de la propiedad tipoComite.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoComite(String value) {
        this.tipoComite = value;
    }

    /**
     * Obtiene el valor de la propiedad ecog.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getECOG() {
        return ecog;
    }

    /**
     * Define el valor de la propiedad ecog.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setECOG(Integer value) {
        this.ecog = value;
    }

}
