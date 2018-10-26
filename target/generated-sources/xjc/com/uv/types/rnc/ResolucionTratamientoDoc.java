//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2018.10.26 a las 07:03:45 PM CLST 
//


package com.uv.types.rnc;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="MedicoTratante"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;length value="120"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TratamientoGeneral"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="DescripcionTratamiento"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="150"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="EstadoTratamiento"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
 *                         &lt;minInclusive value="1"/&gt;
 *                         &lt;maxInclusive value="1"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="ResolucionComite" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="DescripcionResolucionComite" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="150"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="Comite"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="MedicoParticipante" maxOccurs="unbounded"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;length value="120"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Tratamientos"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://uv.com/types/rnc}Tratamiento" maxOccurs="unbounded"/&gt;
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
    "medicoTratante",
    "tratamientoGeneral",
    "tratamientos"
})
@XmlRootElement(name = "ResolucionTratamientoDoc")
public class ResolucionTratamientoDoc {

    @XmlElement(name = "MedicoTratante", required = true)
    protected String medicoTratante;
    @XmlElement(name = "TratamientoGeneral", required = true)
    protected ResolucionTratamientoDoc.TratamientoGeneral tratamientoGeneral;
    @XmlElement(name = "Tratamientos", required = true)
    protected ResolucionTratamientoDoc.Tratamientos tratamientos;

    /**
     * Obtiene el valor de la propiedad medicoTratante.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMedicoTratante() {
        return medicoTratante;
    }

    /**
     * Define el valor de la propiedad medicoTratante.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMedicoTratante(String value) {
        this.medicoTratante = value;
    }

    /**
     * Obtiene el valor de la propiedad tratamientoGeneral.
     * 
     * @return
     *     possible object is
     *     {@link ResolucionTratamientoDoc.TratamientoGeneral }
     *     
     */
    public ResolucionTratamientoDoc.TratamientoGeneral getTratamientoGeneral() {
        return tratamientoGeneral;
    }

    /**
     * Define el valor de la propiedad tratamientoGeneral.
     * 
     * @param value
     *     allowed object is
     *     {@link ResolucionTratamientoDoc.TratamientoGeneral }
     *     
     */
    public void setTratamientoGeneral(ResolucionTratamientoDoc.TratamientoGeneral value) {
        this.tratamientoGeneral = value;
    }

    /**
     * Obtiene el valor de la propiedad tratamientos.
     * 
     * @return
     *     possible object is
     *     {@link ResolucionTratamientoDoc.Tratamientos }
     *     
     */
    public ResolucionTratamientoDoc.Tratamientos getTratamientos() {
        return tratamientos;
    }

    /**
     * Define el valor de la propiedad tratamientos.
     * 
     * @param value
     *     allowed object is
     *     {@link ResolucionTratamientoDoc.Tratamientos }
     *     
     */
    public void setTratamientos(ResolucionTratamientoDoc.Tratamientos value) {
        this.tratamientos = value;
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
     *         &lt;element name="DescripcionTratamiento"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="150"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="EstadoTratamiento"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
     *               &lt;minInclusive value="1"/&gt;
     *               &lt;maxInclusive value="1"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="ResolucionComite" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="DescripcionResolucionComite" minOccurs="0"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="150"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="Comite"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="MedicoParticipante" maxOccurs="unbounded"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;length value="120"/&gt;
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
        "descripcionTratamiento",
        "estadoTratamiento",
        "resolucionComite",
        "descripcionResolucionComite",
        "comite"
    })
    public static class TratamientoGeneral {

        @XmlElement(name = "DescripcionTratamiento", required = true)
        protected String descripcionTratamiento;
        @XmlElement(name = "EstadoTratamiento")
        protected int estadoTratamiento;
        @XmlElement(name = "ResolucionComite", required = true)
        protected String resolucionComite;
        @XmlElement(name = "DescripcionResolucionComite")
        protected String descripcionResolucionComite;
        @XmlElement(name = "Comite", required = true)
        protected ResolucionTratamientoDoc.TratamientoGeneral.Comite comite;

        /**
         * Obtiene el valor de la propiedad descripcionTratamiento.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDescripcionTratamiento() {
            return descripcionTratamiento;
        }

        /**
         * Define el valor de la propiedad descripcionTratamiento.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDescripcionTratamiento(String value) {
            this.descripcionTratamiento = value;
        }

        /**
         * Obtiene el valor de la propiedad estadoTratamiento.
         * 
         */
        public int getEstadoTratamiento() {
            return estadoTratamiento;
        }

        /**
         * Define el valor de la propiedad estadoTratamiento.
         * 
         */
        public void setEstadoTratamiento(int value) {
            this.estadoTratamiento = value;
        }

        /**
         * Obtiene el valor de la propiedad resolucionComite.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getResolucionComite() {
            return resolucionComite;
        }

        /**
         * Define el valor de la propiedad resolucionComite.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setResolucionComite(String value) {
            this.resolucionComite = value;
        }

        /**
         * Obtiene el valor de la propiedad descripcionResolucionComite.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDescripcionResolucionComite() {
            return descripcionResolucionComite;
        }

        /**
         * Define el valor de la propiedad descripcionResolucionComite.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDescripcionResolucionComite(String value) {
            this.descripcionResolucionComite = value;
        }

        /**
         * Obtiene el valor de la propiedad comite.
         * 
         * @return
         *     possible object is
         *     {@link ResolucionTratamientoDoc.TratamientoGeneral.Comite }
         *     
         */
        public ResolucionTratamientoDoc.TratamientoGeneral.Comite getComite() {
            return comite;
        }

        /**
         * Define el valor de la propiedad comite.
         * 
         * @param value
         *     allowed object is
         *     {@link ResolucionTratamientoDoc.TratamientoGeneral.Comite }
         *     
         */
        public void setComite(ResolucionTratamientoDoc.TratamientoGeneral.Comite value) {
            this.comite = value;
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
         *         &lt;element name="MedicoParticipante" maxOccurs="unbounded"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;length value="120"/&gt;
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
            "medicoParticipante"
        })
        public static class Comite {

            @XmlElement(name = "MedicoParticipante", required = true)
            protected List<String> medicoParticipante;

            /**
             * Gets the value of the medicoParticipante property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the medicoParticipante property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getMedicoParticipante().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link String }
             * 
             * 
             */
            public List<String> getMedicoParticipante() {
                if (medicoParticipante == null) {
                    medicoParticipante = new ArrayList<String>();
                }
                return this.medicoParticipante;
            }

        }

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
     *         &lt;element ref="{http://uv.com/types/rnc}Tratamiento" maxOccurs="unbounded"/&gt;
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
        "tratamiento"
    })
    public static class Tratamientos {

        @XmlElement(name = "Tratamiento", required = true)
        protected List<Tratamiento> tratamiento;

        /**
         * Gets the value of the tratamiento property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the tratamiento property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTratamiento().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Tratamiento }
         * 
         * 
         */
        public List<Tratamiento> getTratamiento() {
            if (tratamiento == null) {
                tratamiento = new ArrayList<Tratamiento>();
            }
            return this.tratamiento;
        }

    }

}
