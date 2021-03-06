package com.disney.preaceleracion.model;

import java.util.List;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Personaje {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column
	private String imagen;
	@Column
	private String nombre;
	@Column
	private int edad;
	@Column
	private int peso;
	@Column
	private String historia;
	
	@ManyToMany (mappedBy="personajes", fetch = FetchType.LAZY)
	private List<Pelicula> peliculas;

	
}
