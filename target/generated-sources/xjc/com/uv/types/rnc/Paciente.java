//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2018.10.26 a las 07:03:45 PM CLST 
//


package com.uv.types.rnc;

import java.math.BigInteger;
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
 *         &lt;element name="RUT"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *               &lt;minLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Nombre"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="50"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PrimerApellido"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="30"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SegundoApellido"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="30"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FechaDeNacimiento" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="Genero"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"&gt;
 *               &lt;enumeration value="1"/&gt;
 *               &lt;enumeration value="2"/&gt;
 *               &lt;enumeration value="9"/&gt;
 *               &lt;enumeration value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Ubicacion" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Region" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
 *                         &lt;minInclusive value="1"/&gt;
 *                         &lt;maxInclusive value="15"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="Provincia" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
 *                         &lt;minInclusive value="1"/&gt;
 *                         &lt;maxInclusive value="999"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="Comuna" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
 *                         &lt;minInclusive value="1"/&gt;
 *                         &lt;maxInclusive value="99999"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="Direccion" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;length value="100"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
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
    "rut",
    "nombre",
    "primerApellido",
    "segundoApellido",
    "fechaDeNacimiento",
    "genero",
    "ubicacion"
})
@XmlRootElement(name = "Paciente")
public class Paciente {

    @XmlElement(name = "RUT", required = true)
    protected String rut;
    @XmlElement(name = "Nombre", required = true)
    protected String nombre;
    @XmlElement(name = "PrimerApellido", required = true)
    protected String primerApellido;
    @XmlElement(name = "SegundoApellido", required = true)
    protected String segundoApellido;
    @XmlElement(name = "FechaDeNacimiento", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fechaDeNacimiento;
    @XmlElement(name = "Genero", required = true)
    protected BigInteger genero;
    @XmlElement(name = "Ubicacion")
    protected Paciente.Ubicacion ubicacion;

    /**
     * Obtiene el valor de la propiedad rut.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRUT() {
        return rut;
    }

    /**
     * Define el valor de la propiedad rut.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRUT(String value) {
        this.rut = value;
    }

    /**
     * Obtiene el valor de la propiedad nombre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Define el valor de la propiedad nombre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombre(String value) {
        this.nombre = value;
    }

    /**
     * Obtiene el valor de la propiedad primerApellido.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimerApellido() {
        return primerApellido;
    }

    /**
     * Define el valor de la propiedad primerApellido.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimerApellido(String value) {
        this.primerApellido = value;
    }

    /**
     * Obtiene el valor de la propiedad segundoApellido.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSegundoApellido() {
        return segundoApellido;
    }

    /**
     * Define el valor de la propiedad segundoApellido.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSegundoApellido(String value) {
        this.segundoApellido = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaDeNacimiento.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    /**
     * Define el valor de la propiedad fechaDeNacimiento.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaDeNacimiento(XMLGregorianCalendar value) {
        this.fechaDeNacimiento = value;
    }

    /**
     * Obtiene el valor de la propiedad genero.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getGenero() {
        return genero;
    }

    /**
     * Define el valor de la propiedad genero.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setGenero(BigInteger value) {
        this.genero = value;
    }

    /**
     * Obtiene el valor de la propiedad ubicacion.
     * 
     * @return
     *     possible object is
     *     {@link Paciente.Ubicacion }
     *     
     */
    public Paciente.Ubicacion getUbicacion() {
        return ubicacion;
    }

    /**
     * Define el valor de la propiedad ubicacion.
     * 
     * @param value
     *     allowed object is
     *     {@link Paciente.Ubicacion }
     *     
     */
    public void setUbicacion(Paciente.Ubicacion value) {
        this.ubicacion = value;
    }


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
     *         &lt;element name="Region" minOccurs="0"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
     *               &lt;minInclusive value="1"/&gt;
     *               &lt;maxInclusive value="15"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="Provincia" minOccurs="0"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
     *               &lt;minInclusive value="1"/&gt;
     *               &lt;maxInclusive value="999"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="Comuna" minOccurs="0"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
     *               &lt;minInclusive value="1"/&gt;
     *               &lt;maxInclusive value="99999"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="Direccion" minOccurs="0"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;length value="100"/&gt;
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
        "region",
        "provincia",
        "comuna",
        "direccion"
    })
    public static class Ubicacion {

        @XmlElement(name = "Region")
        protected Integer region;
        @XmlElement(name = "Provincia")
        protected Integer provincia;
        @XmlElement(name = "Comuna")
        protected Integer comuna;
        @XmlElement(name = "Direccion")
        protected String direccion;

        /**
         * Obtiene el valor de la propiedad region.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getRegion() {
            return region;
        }

        /**
         * Define el valor de la propiedad region.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setRegion(Integer value) {
            this.region = value;
        }

        /**
         * Obtiene el valor de la propiedad provincia.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getProvincia() {
            return provincia;
        }

        /**
         * Define el valor de la propiedad provincia.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setProvincia(Integer value) {
            this.provincia = value;
        }

        /**
         * Obtiene el valor de la propiedad comuna.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getComuna() {
            return comuna;
        }

        /**
         * Define el valor de la propiedad comuna.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setComuna(Integer value) {
            this.comuna = value;
        }

        /**
         * Obtiene el valor de la propiedad direccion.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDireccion() {
            return direccion;
        }

        /**
         * Define el valor de la propiedad direccion.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDireccion(String value) {
            this.direccion = value;
        }

    }

}
