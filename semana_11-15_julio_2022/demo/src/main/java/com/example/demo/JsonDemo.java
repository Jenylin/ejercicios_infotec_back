package com.example.demo;

import java.io.File;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonDemo {

	public static void main(String[] args) {

		try {

			// SIEMPRE USAMOS EL SIGUIENTE OBJETO
			ObjectMapper objectMapper = new ObjectMapper();

			// ESCRIBIR

			// ArchivoJSON archivoJson = new ArchivoJSON("archivo1", "tipo1", 50);

			// objectMapper.writeValue(new File("target/miArchivoJson.json"), archivoJson);

			// LEER

			// String archivoJson =
			// "{\"nombre\":\"archivo1\",\"tipo\":\"tipo1\",\"peso\":50}";

			// ArchivoJSON arch = objectMapper.readValue(archivoJson, ArchivoJSON.class);

			// System.out.println(arch.getTipo());

			// MODIFICAR

			String archivoJson = "{\"nombre\":\"archivo1\",\"tipo\":\"tipo1\",\"peso\":50}";

			JsonNode jsonNode = objectMapper.readTree(archivoJson);
			
			String archNombre = jsonNode.get("nombre").asText();
			String archTipo = jsonNode.get("tipo").asText();
			String archPeso = jsonNode.get("peso").asText();
			
			objectMapper.writeValue(new File ("target/archivoJsonNode.txt") , archNombre + "," + archTipo + "," + archPeso);
			

		} catch (final Exception e) {

			e.printStackTrace();

		}

	}

}
