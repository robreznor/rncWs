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
 *         &lt;element name="Nacionalidad" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
 *               &lt;minInclusive value="1"/&gt;
 *               &lt;maxInclusive value="999"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PuebloOriginario" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
 *               &lt;minInclusive value="0"/&gt;
 *               &lt;maxInclusive value="12"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="EstadoConyugal" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
 *               &lt;minInclusive value="1"/&gt;
 *               &lt;maxInclusive value="9"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ReligionCulto" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
 *               &lt;minInclusive value="01"/&gt;
 *               &lt;maxInclusive value="11"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="NivelInstruccion" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
 *               &lt;minInclusive value="01"/&gt;
 *               &lt;maxInclusive value="15"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Ocupacion" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
 *               &lt;minInclusive value="1"/&gt;
 *               &lt;maxInclusive value="9999"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ActividadEconomica" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
 *               &lt;minInclusive value="1"/&gt;
 *               &lt;maxInclusive value="999999"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Prevision" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
 *               &lt;enumeration value="1"/&gt;
 *               &lt;enumeration value="2"/&gt;
 *               &lt;enumeration value="3"/&gt;
 *               &lt;enumeration value="5"/&gt;
 *               &lt;enumeration value="6"/&gt;
 *               &lt;enumeration value="7"/&gt;
 *               &lt;enumeration value="9"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BeneficiarioFonasa" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;length value="1"/&gt;
 *               &lt;enumeration value="A"/&gt;
 *               &lt;enumeration value="B"/&gt;
 *               &lt;enumeration value="C"/&gt;
 *               &lt;enumeration value="D"/&gt;
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
    "nacionalidad",
    "puebloOriginario",
    "estadoConyugal",
    "religionCulto",
    "nivelInstruccion",
    "ocupacion",
    "actividadEconomica",
    "prevision",
    "beneficiarioFonasa"
})
@XmlRootElement(name = "DatosDemograficos")
public class DatosDemograficos {

    @XmlElement(name = "Nacionalidad")
    protected Integer nacionalidad;
    @XmlElement(name = "PuebloOriginario")
    protected Integer puebloOriginario;
    @XmlElement(name = "EstadoConyugal")
    protected Integer estadoConyugal;
    @XmlElement(name = "ReligionCulto")
    protected Integer religionCulto;
    @XmlElement(name = "NivelInstruccion")
    protected Integer nivelInstruccion;
    @XmlElement(name = "Ocupacion")
    protected Integer ocupacion;
    @XmlElement(name = "ActividadEconomica")
    protected Integer actividadEconomica;
    @XmlElement(name = "Prevision")
    protected Integer prevision;
    @XmlElement(name = "BeneficiarioFonasa")
    protected String beneficiarioFonasa;

    /**
     * Obtiene el valor de la propiedad nacionalidad.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNacionalidad() {
        return nacionalidad;
    }

    /**
     * Define el valor de la propiedad nacionalidad.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNacionalidad(Integer value) {
        this.nacionalidad = value;
    }

    /**
     * Obtiene el valor de la propiedad puebloOriginario.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPuebloOriginario() {
        return puebloOriginario;
    }

    /**
     * Define el valor de la propiedad puebloOriginario.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPuebloOriginario(Integer value) {
        this.puebloOriginario = value;
    }

    /**
     * Obtiene el valor de la propiedad estadoConyugal.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEstadoConyugal() {
        return estadoConyugal;
    }

    /**
     * Define el valor de la propiedad estadoConyugal.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEstadoConyugal(Integer value) {
        this.estadoConyugal = value;
    }

    /**
     * Obtiene el valor de la propiedad religionCulto.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getReligionCulto() {
        return religionCulto;
    }

    /**
     * Define el valor de la propiedad religionCulto.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setReligionCulto(Integer value) {
        this.religionCulto = value;
    }

    /**
     * Obtiene el valor de la propiedad nivelInstruccion.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNivelInstruccion() {
        return nivelInstruccion;
    }

    /**
     * Define el valor de la propiedad nivelInstruccion.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNivelInstruccion(Integer value) {
        this.nivelInstruccion = value;
    }

    /**
     * Obtiene el valor de la propiedad ocupacion.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOcupacion() {
        return ocupacion;
    }

    /**
     * Define el valor de la propiedad ocupacion.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOcupacion(Integer value) {
        this.ocupacion = value;
    }

    /**
     * Obtiene el valor de la propiedad actividadEconomica.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getActividadEconomica() {
        return actividadEconomica;
    }

    /**
     * Define el valor de la propiedad actividadEconomica.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setActividadEconomica(Integer value) {
        this.actividadEconomica = value;
    }

    /**
     * Obtiene el valor de la propiedad prevision.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPrevision() {
        return prevision;
    }

    /**
     * Define el valor de la propiedad prevision.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPrevision(Integer value) {
        this.prevision = value;
    }

    /**
     * Obtiene el valor de la propiedad beneficiarioFonasa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBeneficiarioFonasa() {
        return beneficiarioFonasa;
    }

    /**
     * Define el valor de la propiedad beneficiarioFonasa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBeneficiarioFonasa(String value) {
        this.beneficiarioFonasa = value;
    }

}
