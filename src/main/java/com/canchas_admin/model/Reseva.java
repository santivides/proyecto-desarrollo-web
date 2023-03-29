package com.canchas_admin.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "Reserva")
public class Reseva {

    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)


	@Column(name = "idReserva")
	private int idReserva;

    @ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="idCancha")
	private Canchas cancha;
    
	@Temporal(TemporalType.DATE)	
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm")
	@Column(name ="fechaReserva", nullable=false)
	private Date fechaReserva;

	@Column(name ="estadoReserva", nullable=false)
	private Boolean estadoReserva; 
	
	
	public void Reserva() {
		
		this.estadoReserva = true;
		
	}

	public int getIdReserva() {
		return idReserva;
	}

    public Canchas getCancha() {
		return cancha;
	}

	public void setCancha(Canchas cancha) {
		this.cancha = cancha;
	}

    public Date getFechaReserva() {
		return fechaReserva;
	}

	public void setFechaReserva(Date fechaReserva) {
		this.fechaReserva = fechaReserva;
	}

	
	public Boolean getEstadoReserva() {
		return estadoReserva;
	}

	public void setEstadoReserva(Boolean estadoReserva) {
		this.estadoReserva = estadoReserva;
	}

    public void  setGeneral(Canchas cancha, Date fechaReserva, Boolean estadoReserva){
        this.cancha = cancha;
        this.estadoReserva = estadoReserva; 
        this.fechaReserva = fechaReserva;
    }

    
}
