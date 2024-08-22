package com.springboot.CRUD.beststore;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.annotation.Rollback;

import com.springboot.CRUD.beststore.models.User;
import com.springboot.CRUD.beststore.services.UserRepository;

@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
@Rollback(false)
public class UserRepositoryTests {

	@Autowired
	private UserRepository repo;

	@Autowired
	private TestEntityManager entityManager;

	@Test
	public void testCreateUser() {
		User user = new User();
		user.setEmail("testalo123@gmail.com");
		user.setPassword("123456789");
		user.setFirstName("Alexandros");
		user.setLastName("Great Emperor");

		User saveUser = repo.save(user);
		User existUser = entityManager.find(User.class, saveUser.getId());
		assertThat(existUser.getEmail()).isEqualTo(user.getEmail());
	}

	@Test
	public void testFindUserByEmail() {
		String email = "19huynhdanh19@gmail.com";

		User user = repo.findByEmail(email);

		assertThat(user).isNotNull();
	}

}
