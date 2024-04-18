package org.example.registrodecursos.dto;

import org.example.registrodecursos.model.Estudante;

public record EstudanteRequest(String name, String emailAdress, String phoneNumber, String country, String postalCode) {

    public Estudante toEstudante(){
            return new Estudante(this.name(), this.emailAdress(), this.phoneNumber(), this.country(), this.postalCode());
    }

}
