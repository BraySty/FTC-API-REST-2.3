package com.ftc.rest.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.ErrorResponse;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ftc.rest.classes.Article;
import com.ftc.rest.classes.User;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

@RestController
@RequestMapping("/V0")
public class UserController {
	
	@GetMapping("/users")
	@Operation(summary = "GET con todos los usuarios.", description = "Regresa todos usuarios.")
	@ApiResponses(value = {
		@ApiResponse(responseCode = "200", description = "OK", 
		content = {
			@Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = User.class)))
		}),
		@ApiResponse(responseCode = "404", description = "No hay ningun usuario.", 
		content = {
			@Content(mediaType = "String", schema = @Schema(implementation = ErrorResponse.class))
		})})
	public  ResponseEntity<String> getDetails() {
		return ResponseEntity.ok("GET users endpoint");
	}
	
	@GetMapping("/users/{id}")
	@Operation(summary = "GET de un usuario.", description = "Busca un usuario por su ID.")
	@ApiResponses(value = {
	        @ApiResponse(responseCode = "200", description = "OK", 
			content = {
				@Content(mediaType = "application/json", schema = @Schema(implementation = User.class))
			}),
	        @ApiResponse(responseCode = "404", description = "El usuario no existe", 
			content = {
				@Content(mediaType = "String", schema = @Schema(implementation = ErrorResponse.class))
			})})
	public  ResponseEntity<String> getUser(@PathVariable("id") @Parameter(name = "id", description = "ID del articulo", example = "1") String line) {
		return ResponseEntity.ok("GET user: " + line);
	}
	
	@PostMapping("/users/{id}")
	@Operation(summary = "POST de un usuario.", description = "Crea un usuario por su ID.")
	@ApiResponses(value = {
	        @ApiResponse(responseCode = "200", description = "OK", 
			content = {
				@Content(mediaType = "String", schema = @Schema(implementation = String.class))
			}),
	        @ApiResponse(responseCode = "404", description = "El usuario no existe", 
			content = {
				@Content(mediaType = "String", schema = @Schema(implementation = ErrorResponse.class))
			})})
	public  ResponseEntity<String> postUser(@PathVariable("id") @Parameter(name = "id", description = "Un objeto articulo", example = 
	"{\r\n" +
	"  \"id\": \"12\",\r\n" +
	"  \"nick\": \"Joshn\",\r\n" +
	"  \"name\": \"Pedro\"\r\n" +
	"}"
	) String line) {
		return ResponseEntity.ok("POST user: " + line);
	}
	
	@PutMapping("/users/{id}")
	public  ResponseEntity<String> putUser(@PathVariable("id") String line) {
		return ResponseEntity.ok("PUT user: " + line);
	}
	
	@DeleteMapping("/users/{id}")
	public  ResponseEntity<String> deleteUser(@PathVariable("id") String line) {
		return ResponseEntity.ok("DELETE user: " + line);
	}
	
}
