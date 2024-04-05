package com.ftc.rest.controller;

import org.springframework.http.HttpStatus;
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

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

@RestController
@RequestMapping("/V0")
public class ArticleController {
	
	String comparador = "error";
	String line;
	
	@GetMapping("/articles")
	@Operation(summary = "GET con todos los articulos.", description = "Regresa todos articulos.")
	@ApiResponses(value = {
		@ApiResponse(responseCode = "200", description = "OK", 
		content = {
			@Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = Article.class)))
		}),
		@ApiResponse(responseCode = "404", description = "No hay ningun articulo.", 
		content = {
			@Content(mediaType = "String", schema = @Schema(implementation = ErrorResponse.class))
		})})
	public  ResponseEntity<String> getArticles() {
		return ResponseEntity.status(HttpStatus.OK).body("GET articles endpoint");
	}
	
	@GetMapping("/articles/{id}")
	@Operation(summary = "GET de un articulo.", description = "Busca un articulo por su ID.")
	@ApiResponses(value = {
	        @ApiResponse(responseCode = "200", description = "OK", 
			content = {
				@Content(mediaType = "application/json", schema = @Schema(implementation = Article.class))
			}),
	        @ApiResponse(responseCode = "404", description = "El articulo no existe", 
			content = {
				@Content(mediaType = "String", schema = @Schema(implementation = ErrorResponse.class))
			})})
	public ResponseEntity<String> getBlog(@PathVariable("id") @Parameter(name = "id", description = "ID del articulo", example = "1") String line) {
		if (line.equalsIgnoreCase(comparador)) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("El articulo: " + line + " no existe.");
		} else  {
			return ResponseEntity.status(HttpStatus.OK).body("GET article: " + line);
		}
		
	}
	
	
	@PostMapping("/articles/{article}")
	@Operation(summary = "POST de un articulo.", description = "Crea un articulo por su ID.")
	@ApiResponses(value = {
	        @ApiResponse(responseCode = "200", description = "OK", 
			content = {
				@Content(mediaType = "String", schema = @Schema(implementation = String.class))
			}),
	        @ApiResponse(responseCode = "404", description = "El articulo no existe", 
			content = {
				@Content(mediaType = "String", schema = @Schema(implementation = ErrorResponse.class))
			})})
	public  ResponseEntity<String> postArticle(@PathVariable("article") @Parameter(name = "article", description = "Un objeto articulo", example = 
				"{\r\n" +
				"  \"id\": \"AN93\",\r\n" +
				"  \"title\": \"Titulo\",\r\n" +
				"  \"abstractString\": \"Abstrac\",\r\n" +
				"  \"content\": \"Contenido\"\r\n" +
				"}"
				) Article article) {
		line = article.toString();
		if (line.equalsIgnoreCase(comparador)) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("El articulo: " + line + " no existe.");
		} else  {
			return ResponseEntity.status(HttpStatus.OK).body("POST article: " + line);
		}
	}
	
	@PutMapping("/articles/{article}")
	@Operation(summary = "PUT de un articulo.", description = "Actualiza un articulo por su ID.")
	@ApiResponses(value = {
	        @ApiResponse(responseCode = "200", description = "OK", 
			content = {
				@Content(mediaType = "application/json", schema = @Schema(implementation = String.class))
			}),
	        @ApiResponse(responseCode = "404", description = "El articulo no existe", 
			content = {
				@Content(mediaType = "String", schema = @Schema(implementation = ErrorResponse.class))
			})})
	public  ResponseEntity<String> putArticle(@PathVariable("article") @Parameter(name = "article", description = "Un objeto articulo", example = 
				"{\r\n" +
				"  \"id\": \"AN93\",\r\n" +
				"  \"title\": \"Titulo\",\r\n" +
				"  \"abstractString\": \"Abstrac\",\r\n" +
				"  \"content\": \"Contenido\"\r\n" +
				"}"
			) Article article) {
		line = article.toString();
		if (line.equalsIgnoreCase(comparador)) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("El articulo: " + line + " no existe.");
		} else  {
			return ResponseEntity.status(HttpStatus.OK).body("PUT article: " + line);
		}
	}
	
	@DeleteMapping("/articles/{id}")
	@Operation(summary = "DELETE de un articulo.", description = "Elimina un articulo por su ID.")
	@ApiResponses(value = {
	        @ApiResponse(responseCode = "200", description = "OK", 
			content = {
				@Content(mediaType = "application/json", schema = @Schema(implementation = String.class))
			}),
	        @ApiResponse(responseCode = "404", description = "El articulo no existe", 
			content = {
				@Content(mediaType = "String", schema = @Schema(implementation = ErrorResponse.class))
			})})
	public  ResponseEntity<String> deleteArticle(@PathVariable("id") @Parameter(name = "id", description = "ID del articulo", example = "1") String line) {
		if (line.equalsIgnoreCase(comparador)) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("El articulo: " + line + " no existe.");
		} else  {
			return ResponseEntity.status(HttpStatus.OK).body("DELETE article: " + line);
		}
	}
	
}
