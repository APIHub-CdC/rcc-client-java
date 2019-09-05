package io.apihub.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;

import io.apihub.client.model.PersonaRespuesta;

public class Respuesta {
	@SerializedName("folioConsulta")
	private String folioConsulta = null;
	@SerializedName("persona")
	private PersonaRespuesta persona = null;

	public Respuesta folioConsulta(String folioConsulta) {
		this.folioConsulta = folioConsulta;
		return this;
	}

	public String getFolioConsulta() {
		return folioConsulta;
	}

	public void setFolioConsulta(String folioConsulta) {
		this.folioConsulta = folioConsulta;
	}

	public Respuesta persona(PersonaRespuesta persona) {
		this.persona = persona;
		return this;
	}

	public PersonaRespuesta getPersona() {
		return persona;
	}

	public void setPersona(PersonaRespuesta persona) {
		this.persona = persona;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Respuesta respuesta = (Respuesta) o;
		return Objects.equals(this.folioConsulta, respuesta.folioConsulta)
				&& Objects.equals(this.persona, respuesta.persona);
	}

	@Override
	public int hashCode() {
		return Objects.hash(folioConsulta, persona);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Respuesta {\n");
		sb.append("    folioConsulta: ").append(toIndentedString(folioConsulta)).append("\n");
		sb.append("    persona: ").append(toIndentedString(persona)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	private String toIndentedString(java.lang.Object o) {
		if (o == null) {
			return "null";
		}
		return o.toString().replace("\n", "\n    ");
	}
}
