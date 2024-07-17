package com.green.miracle.domain.entity;

import org.hibernate.annotations.DynamicUpdate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@DynamicUpdate
@Entity
@Table(name = "department")
public class DepartmentEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	private int depCode; //부서코드(pk)
	
	@Column(nullable = false)
	private String depName; //부서이름
	
	@Column(nullable = false)
	private String depNum; //부서내선전화번호
}
