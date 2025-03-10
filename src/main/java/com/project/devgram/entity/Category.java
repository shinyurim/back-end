package com.project.devgram.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Category {

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	Long category_Seq;
	String name;
	String color;

}
