package com.companyname.springapp.dao;

import java.util.List;
import javax.sql.DataSource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.companyname.springapp.model.Alumno;

@Repository
public class AlumnoDaoImpl implements AlumnoDao {

	@Autowired
	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public List<Alumno> getAlumnos() {

		Session session = null;

		session = sessionFactory.openSession();

		return session.createSQLQuery("SELECT a.nombre, a.apellidos, p.nombre as nombreProf, p.apellidos as apellidoProf, a.fecha_alta, p.asignatura FROM Alumnos a, Profesores p WHERE a.id_profesor = p.id_profesor").list();

	}
}
