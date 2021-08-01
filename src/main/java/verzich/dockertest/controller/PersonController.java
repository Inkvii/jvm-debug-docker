package verzich.dockertest.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

	@GetMapping("/")
	public ResponseEntity<String> getIndexPage() {
		String msg = "This is an index page";
//		msg += " which became Highjacked!";
		return ResponseEntity.ok(msg);
	}

	@GetMapping("/first")
	public ResponseEntity<String> getFirst() {
		return ResponseEntity.ok("First");
	}

	@GetMapping("/second")
	public ResponseEntity<String> getSecond() {
		return ResponseEntity.ok("Second");
	}
}
