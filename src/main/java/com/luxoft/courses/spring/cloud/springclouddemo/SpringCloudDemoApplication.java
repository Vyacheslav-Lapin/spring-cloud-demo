package com.luxoft.courses.spring.cloud.springclouddemo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.experimental.NonFinal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import static lombok.AccessLevel.PRIVATE;

@RepositoryRestResource
interface CatRepository extends JpaRepository<Cat, Long> {
}

@SpringBootApplication
public class SpringCloudDemoApplication {

  public static void main(String[] args) {
    SpringApplication.run(SpringCloudDemoApplication.class, args);
  }

}

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = PRIVATE)
class Cat {

  @Id
  @GeneratedValue
  Long id;

  @NotNull
  String name;

  public Cat(String name) {
    this.name = name;
  }
}
