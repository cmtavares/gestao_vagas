package br.com.carlostavares.gestao_vagas.modules.candidate.dto;

import java.util.UUID;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProfileCandidateResponseDTO {
    
    @Schema(example = "Desenvolvedora Java")
    private String description;

    @Schema(example = "julia")
    private String username;

    @Schema(example = "julia@gmail.com")
    private String email;
    private UUID id;

    @Schema(example = "Julia Pires")
    private String name;
}
