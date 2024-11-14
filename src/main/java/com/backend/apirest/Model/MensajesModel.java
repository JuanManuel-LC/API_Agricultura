package com.backend.apirest.Model;

import java.util.ArrayList;
import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

import com.backend.apirest.Model.Arrays.DocumentoElectronicoMensajes;
import com.backend.apirest.Model.Arrays.RecursoMultimedia;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document("Mensajes")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class MensajesModel {
    private ObjectId id;
    private ObjectId emisorId;
    private ObjectId receptoId;
    private List<RecursoMultimedia> recursoMultimedia = new ArrayList<>();       
    private List<DocumentoElectronicoMensajes> documentoElectronico = new ArrayList<>();  
}
