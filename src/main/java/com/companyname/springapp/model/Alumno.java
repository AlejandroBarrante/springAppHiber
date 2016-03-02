package com.companyname.springapp.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ALUMNO")
public class Alumno {

	@Id
	@Column(name = "ID")
	@GeneratedValue
	private Integer idAlumno;

	@Column(name = "NOMBRE")
	private String nombre;

	@Column(name = "APELLIDOS")
	private String apellidos;

	@Column(name = "FECHAALTA")
	private Date fechaAlta;

	@Column(name = "IDPROFESOR")
	private Integer idProfesor;

	@Column(name = "ASIGNATURA")
	private String asignatura;

	@Column(name = "NOMBREPROF")
	private String nombreProf;

	@Column(name = "APELLIDOPROF")
	private String apellidoProf;

	@Column(name = "NOMBRECOMPLETOPROF")
	private String nombreCompletoProf;

	@Column(name = "NOMBRECOMPLETOALUMNO")
	private String nombreCompletoAlumno;

	// -----------------

	public Integer getIdAlumno() {
		return idAlumno;
	}

	public void setIdAlumno(Integer idAlumno) {
		this.idAlumno = idAlumno;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public Date getFechaAlta() {
		return fechaAlta;
	}

	public void setFechaAlta(Date fechaAlta) {
		this.fechaAlta = fechaAlta;
	}

	public Integer getIdProfesor() {
		return idProfesor;
	}

	public void setIdProfesor(Integer idProfesor) {
		this.idProfesor = idProfesor;
	}

	public String getAsignatura() {
		return asignatura;
	}

	public void setAsignatura(String asignatura) {
		this.asignatura = asignatura;
	}

	public String getNombreProf() {
		return nombreProf;
	}

	public void setNombreProf(String nombreProf) {
		this.nombreProf = nombreProf;
	}

	public String getApellidoProf() {
		return apellidoProf;
	}

	public void setApellidoProf(String apellidoProf) {
		this.apellidoProf = apellidoProf;
	}

	public String getNombreCompletoProf() {
		return nombreCompletoProf;
	}

	public void setNombreCompletoProf(String nombreCompletoProf) {
		this.nombreCompletoProf = nombreProf + " " + apellidoProf;
	}

	public String getNombreCompletoAlumno() {
		return nombreCompletoAlumno;
	}

	public void setNombreCompletoAlumno(String nombreCompletoAlumno) {
		this.nombreCompletoAlumno = nombre + " " + apellidos;
	}

}
