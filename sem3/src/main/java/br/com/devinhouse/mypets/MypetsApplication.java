package br.com.devinhouse.mypets;

import br.com.devinhouse.mypets.security.JwtProvider;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.Date;

@SpringBootApplication
@CrossOrigin(origins = "*")
public class MypetsApplication {

	public static void main(String[] args) {
		SpringApplication.run(MypetsApplication.class, args);

		System.out.println(new JwtProvider().generateToken("gilmar"));
	}

}
