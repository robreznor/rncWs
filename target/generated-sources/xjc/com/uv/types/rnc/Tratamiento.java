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
 *         &lt;element name="TipoTratamiento"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
 *               &lt;minInclusive value="1"/&gt;
 *               &lt;maxInclusive value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="IntencionTratamiento"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
 *               &lt;minInclusive value="1"/&gt;
 *               &lt;maxInclusive value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FechaIntencion" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="FechaComite" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="Medicamentos" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Medicamento" type="{http://www.w3.org/2001/XMLSchema}anyType" maxOccurs="unbounded"/&gt;
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
    "tipoTratamiento",
    "intencionTratamiento",
    "fechaIntencion",
    "fechaComite",
    "medicamentos"
})
@XmlRootElement(name = "Tratamiento")
public class Tratamiento {

    @XmlElement(name = "TipoTratamiento")
    protected int tipoTratamiento;
    @XmlElement(name = "IntencionTratamiento")
    protected int intencionTratamiento;
    @XmlElement(name = "FechaIntencion", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fechaIntencion;
    @XmlElement(name = "FechaComite", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fechaComite;
    @XmlElement(name = "Medicamentos")
    protected Tratamiento.Medicamentos medicamentos;

    /**
     * Obtiene el valor de la propiedad tipoTratamiento.
     * 
     */
    public int getTipoTratamiento() {
        return tipoTratamiento;
    }

    /**
     * Define el valor de la propiedad tipoTratamiento.
     * 
     */
    public void setTipoTratamiento(int value) {
        this.tipoTratamiento = value;
    }

    /**
     * Obtiene el valor de la propiedad intencionTratamiento.
     * 
     */
    public int getIntencionTratamiento() {
        return intencionTratamiento;
    }

    /**
     * Define el valor de la propiedad intencionTratamiento.
     * 
     */
    public void setIntencionTratamiento(int value) {
        this.intencionTratamiento = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaIntencion.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaIntencion() {
        return fechaIntencion;
    }

    /**
     * Define el valor de la propiedad fechaIntencion.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaIntencion(XMLGregorianCalendar value) {
        this.fechaIntencion = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaComite.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaComite() {
        return fechaComite;
    }

    /**
     * Define el valor de la propiedad fechaComite.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaComite(XMLGregorianCalendar value) {
        this.fechaComite = value;
    }

    /**
     * Obtiene el valor de la propiedad medicamentos.
     * 
     * @return
     *     possible object is
     *     {@link Tratamiento.Medicamentos }
     *     
     */
    public Tratamiento.Medicamentos getMedicamentos() {
        return medicamentos;
    }

    /**
     * Define el valor de la propiedad medicamentos.
     * 
     * @param value
     *     allowed object is
     *     {@link Tratamiento.Medicamentos }
     *     
     */
    public void setMedicamentos(Tratamiento.Medicamentos value) {
        this.medicamentos = value;
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
     *         &lt;element name="Medicamento" type="{http://www.w3.org/2001/XMLSchema}anyType" maxOccurs="unbounded"/&gt;
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
        "medicamento"
    })
    public static class Medicamentos {

        @XmlElement(name = "Medicamento", required = true)
        protected List<Object> medicamento;

        /**
         * Gets the value of the medicamento property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the medicamento property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMedicamento().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Object }
         * 
         * 
         */
        public List<Object> getMedicamento() {
            if (medicamento == null) {
                medicamento = new ArrayList<Object>();
            }
            return this.medicamento;
        }

    }

}
