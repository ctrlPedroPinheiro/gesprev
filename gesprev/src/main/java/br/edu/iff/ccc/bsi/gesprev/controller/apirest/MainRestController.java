package br.edu.iff.ccc.bsi.gesprev.controller.apirest;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/gesprev/v1")
@Tag(name = "GESPREV Main Rest", description = "Main Rest Controller")
public class MainRestController {
	
	// Segurados

    @Operation(
        summary = "Retorna os dados de um determinado segurado",
        description = "Este endpoint retorna os dados de um segurado específico com base no ID fornecido."
    )
    @ApiResponses({
        @ApiResponse(responseCode = "200", description = "Segurado encontrado com sucesso"),
        @ApiResponse(responseCode = "404", description = "Segurado não encontrado"),
        @ApiResponse(responseCode = "500", description = "Erro interno do servidor")
    })
    @GetMapping(path = "/segurados/{id}")
    public void getSeguradoId(
        @Parameter(description = "ID do segurado", example = "1", required = true) @PathVariable int id) {

    }

    @Operation(
        summary = "Retorna as opções disponíveis ao usuário",
        description = "Este endpoint retorna as opções disponíveis para o usuário em relação aos segurados."
    )
    @ApiResponses({
        @ApiResponse(responseCode = "200", description = "Opções retornadas com sucesso"),
        @ApiResponse(responseCode = "500", description = "Erro interno do servidor")
    })
    @GetMapping(path = "/segurados/{id}/opcoes")
    public void optionsSegurado(
        @Parameter(description = "ID do segurado", example = "1", required = true) @PathVariable int id) {
    	
    }

    @Operation(
        summary = "Retorna os contracheques do segurado",
        description = "Este endpoint retorna todos os contracheques associados a um segurado específico."
    )
    @ApiResponses({
        @ApiResponse(responseCode = "200", description = "Contracheques retornados com sucesso"),
        @ApiResponse(responseCode = "404", description = "Segurado não encontrado"),
        @ApiResponse(responseCode = "500", description = "Erro interno do servidor")
    })
    @GetMapping(path = "/segurados/{id}/consulta-contracheque")
    public void getContracheques(
        @Parameter(description = "ID do segurado", example = "1", required = true) @PathVariable int id) {
    	
    }

    @Operation(
        summary = "Retorna o contracheque do período selecionado",
        description = "Este endpoint retorna o contracheque de um segurado para um mês e ano específicos."
    )
    @ApiResponses({
        @ApiResponse(responseCode = "200", description = "Contracheque retornado com sucesso"),
        @ApiResponse(responseCode = "404", description = "Contracheque não encontrado"),
        @ApiResponse(responseCode = "500", description = "Erro interno do servidor")
    })
    @GetMapping(path = "/segurados/{id}/consulta-contracheque/{mm}-{yyyy}")
    public void getContrachequeMesAno(
        @Parameter(description = "ID do segurado", example = "1", required = true) @PathVariable int id,
        @Parameter(description = "Mês do contracheque", example = "12", required = true) @PathVariable String mm,
        @Parameter(description = "Ano do contracheque", example = "2023", required = true) @PathVariable String yyyy) {

    }
	
    // Requerimentos

    @Operation(
        summary = "Retorna todos os requerimentos cadastrados",
        description = "Este endpoint retorna uma lista de todos os requerimentos cadastrados no sistema."
    )
    @ApiResponses({
        @ApiResponse(responseCode = "200", description = "Requerimentos retornados com sucesso"),
        @ApiResponse(responseCode = "500", description = "Erro interno do servidor")
    })
    @GetMapping(path = "/requerimentos")
    public void getRequerimentos() {
    	
    }

    @Operation(
        summary = "Retorna um determinado requerimento",
        description = "Este endpoint retorna os dados de um requerimento específico com base no ID fornecido."
    )
    @ApiResponses({
        @ApiResponse(responseCode = "200", description = "Requerimento encontrado com sucesso"),
        @ApiResponse(responseCode = "404", description = "Requerimento não encontrado"),
        @ApiResponse(responseCode = "500", description = "Erro interno do servidor")
    })
    @GetMapping(path = "/requerimentos/{id}")
    public void getRequerimentoId(
        @Parameter(description = "ID do requerimento", example = "1", required = true) @PathVariable int id) {

    }

    @Operation(
        summary = "Retorna as opções disponíveis ao usuário",
        description = "Este endpoint retorna as opções disponíveis para o usuário em relação aos requerimentos."
    )
    @ApiResponses({
        @ApiResponse(responseCode = "200", description = "Opções retornadas com sucesso"),
        @ApiResponse(responseCode = "500", description = "Erro interno do servidor")
    })
    @GetMapping(path = "/requerimentos/{id}/opcoes")
    public void optionsRequerimento(
        @Parameter(description = "ID do requerimento", example = "1", required = true) @PathVariable int id) {

    }

    @Operation(
        summary = "Cria um novo requerimento",
        description = "Este endpoint permite a criação de um novo requerimento no sistema."
    )
    @ApiResponses({
        @ApiResponse(responseCode = "201", description = "Requerimento criado com sucesso"),
        @ApiResponse(responseCode = "400", description = "Dados inválidos fornecidos"),
        @ApiResponse(responseCode = "500", description = "Erro interno do servidor")
    })
    @PostMapping(path = "/requerimentos")
    public void postRequerimento() {

    }

    @Operation(
        summary = "Atualiza os dados de um requerimento",
        description = "Este endpoint permite a atualização dos dados de um requerimento existente com base no ID fornecido."
    )
    @ApiResponses({
        @ApiResponse(responseCode = "200", description = "Requerimento atualizado com sucesso"),
        @ApiResponse(responseCode = "400", description = "Dados inválidos fornecidos"),
        @ApiResponse(responseCode = "404", description = "Requerimento não encontrado"),
        @ApiResponse(responseCode = "500", description = "Erro interno do servidor")
    })
    @PutMapping(path = "/requerimentos/{id}")
    public void putRequerimento(
        @Parameter(description = "ID do requerimento", example = "1", required = true) @PathVariable int id) {

    }

    @Operation(
        summary = "Deleta um requerimento",
        description = "Este endpoint permite a exclusão de um requerimento existente com base no ID fornecido."
    )
    @ApiResponses({
        @ApiResponse(responseCode = "200", description = "Requerimento deletado com sucesso"),
        @ApiResponse(responseCode = "404", description = "Requerimento não encontrado"),
        @ApiResponse(responseCode = "500", description = "Erro interno do servidor")
    })
    @DeleteMapping(path = "/requerimentos/{id}")
    public void deleteRequerimento(
        @Parameter(description = "ID do requerimento", example = "1", required = true) @PathVariable int id) {

    }
	
    // Processos

    @Operation(
        summary = "Retorna todos os processos cadastrados",
        description = "Este endpoint retorna uma lista de todos os processos cadastrados no sistema."
    )
    @ApiResponses({
        @ApiResponse(responseCode = "200", description = "Processos retornados com sucesso"),
        @ApiResponse(responseCode = "500", description = "Erro interno do servidor")
    })
    @GetMapping(path = "/processos")
    public void getProcessos() {

    }

    @Operation(
        summary = "Retorna um determinado processo",
        description = "Este endpoint retorna os dados de um processo específico com base no ID fornecido."
    )
    @ApiResponses({
        @ApiResponse(responseCode = "200", description = "Processo encontrado com sucesso"),
        @ApiResponse(responseCode = "404", description = "Processo não encontrado"),
        @ApiResponse(responseCode = "500", description = "Erro interno do servidor")
    })
    @GetMapping(path = "/processos/{id}")
    public void getProcessoId(
        @Parameter(description = "ID do processo", example = "1", required = true) @PathVariable int id) {

    }

    @Operation(
        summary = "Retorna as opções disponíveis ao usuário",
        description = "Este endpoint retorna as opções disponíveis para o usuário em relação aos processos."
    )
    @ApiResponses({
        @ApiResponse(responseCode = "200", description = "Opções retornadas com sucesso"),
        @ApiResponse(responseCode = "500", description = "Erro interno do servidor")
    })
    @GetMapping(path = "/processos/{id}/opcoes")
    public void optionsProcesso(
        @Parameter(description = "ID do processo", example = "1", required = true) @PathVariable int id) {

    }

    @Operation(
        summary = "Cria um novo processo",
        description = "Este endpoint permite a criação de um novo processo no sistema."
    )
    @ApiResponses({
        @ApiResponse(responseCode = "201", description = "Processo criado com sucesso"),
        @ApiResponse(responseCode = "400", description = "Dados inválidos fornecidos"),
        @ApiResponse(responseCode = "500", description = "Erro interno do servidor")
    })
    @PostMapping(path = "/processos")
    public void postProcesso() {

    }

    @Operation(
        summary = "Atualiza os dados de um processo",
        description = "Este endpoint permite a atualização dos dados de um processo existente com base no ID fornecido."
    )
    @ApiResponses({
        @ApiResponse(responseCode = "200", description = "Processo atualizado com sucesso"),
        @ApiResponse(responseCode = "400", description = "Dados inválidos fornecidos"),
        @ApiResponse(responseCode = "404", description = "Processo não encontrado"),
        @ApiResponse(responseCode = "500", description = "Erro interno do servidor")
    })
    @PutMapping(path = "/processos/{id}")
    public void putProcesso(
        @Parameter(description = "ID do processo", example = "1", required = true) @PathVariable int id) {

    }

    @Operation(
        summary = "Deleta um processo",
        description = "Este endpoint permite a exclusão de um processo existente com base no ID fornecido."
    )
    @ApiResponses({
        @ApiResponse(responseCode = "200", description = "Processo deletado com sucesso"),
        @ApiResponse(responseCode = "404", description = "Processo não encontrado"),
        @ApiResponse(responseCode = "500", description = "Erro interno do servidor")
    })
    @DeleteMapping(path = "/processos/{id}")
    public void deleteProcesso(
        @Parameter(description = "ID do processo", example = "1", required = true) @PathVariable int id) {

    }
	
    // Relatórios

    @Operation(
        summary = "Retorna a lista de relatórios disponíveis ao usuário",
        description = "Este endpoint retorna uma lista de todos os relatórios disponíveis para o usuário."
    )
    @ApiResponses({
        @ApiResponse(responseCode = "200", description = "Relatórios retornados com sucesso"),
        @ApiResponse(responseCode = "500", description = "Erro interno do servidor")
    })
    @GetMapping(path = "/relatorios")
    public void getRelatorios() {

    }

    @Operation(
        summary = "Retorna o relatório selecionado",
        description = "Este endpoint retorna o relatório específico com base no código fornecido."
    )
    @ApiResponses({
        @ApiResponse(responseCode = "200", description = "Relatório retornado com sucesso"),
        @ApiResponse(responseCode = "404", description = "Relatório não encontrado"),
        @ApiResponse(responseCode = "500", description = "Erro interno do servidor")
    })
    @GetMapping(path = "/relatorios/{cod}")
    public void getRelatorioTipo(
        @Parameter(description = "Código do relatório", example = "REL001", required = true) @PathVariable int cod) {

    }

    @Operation(
        summary = "Retorna as opções disponíveis no relatório",
        description = "Este endpoint retorna as opções disponíveis para o usuário em relação ao relatório específico."
    )
    @ApiResponses({
        @ApiResponse(responseCode = "200", description = "Opções retornadas com sucesso"),
        @ApiResponse(responseCode = "404", description = "Relatório não encontrado"),
        @ApiResponse(responseCode = "500", description = "Erro interno do servidor")
    })
    @GetMapping(path = "/relatorios/{cod}/opcoes")
    public void optionsRelatorio(
        @Parameter(description = "Código do relatório", example = "REL001", required = true) @PathVariable int cod) {

    }
	
    // Usuários

    @Operation(
        summary = "Retorna todos os usuários cadastrados",
        description = "Este endpoint retorna uma lista de todos os usuários cadastrados no sistema."
    )
    @ApiResponses({
        @ApiResponse(responseCode = "200", description = "Usuários retornados com sucesso"),
        @ApiResponse(responseCode = "500", description = "Erro interno do servidor")
    })
    @GetMapping(path = "/usuarios")
    public void getUsuarios() {
        
    }

    @Operation(
        summary = "Retorna um determinado usuário",
        description = "Este endpoint retorna os dados de um usuário específico com base no ID fornecido."
    )
    @ApiResponses({
        @ApiResponse(responseCode = "200", description = "Usuário encontrado com sucesso"),
        @ApiResponse(responseCode = "404", description = "Usuário não encontrado"),
        @ApiResponse(responseCode = "500", description = "Erro interno do servidor")
    })
    @GetMapping(path = "/usuarios/{id}")
    public void getUsuarioId(
        @Parameter(description = "ID do usuário", example = "1", required = true) @PathVariable Long id) {
        
    }

    @Operation(
        summary = "Retorna as opções disponíveis ao usuário",
        description = "Este endpoint retorna as opções disponíveis para o usuário em relação aos usuários cadastrados."
    )
    @ApiResponses({
        @ApiResponse(responseCode = "200", description = "Opções retornadas com sucesso"),
        @ApiResponse(responseCode = "500", description = "Erro interno do servidor")
    })
    @GetMapping(path = "/usuarios/opcoes")
    public void optionsUsuario() {
      
    }

    @Operation(
        summary = "Cria um novo usuário",
        description = "Este endpoint permite a criação de um novo usuário no sistema."
    )
    @ApiResponses({
        @ApiResponse(responseCode = "201", description = "Usuário criado com sucesso"),
        @ApiResponse(responseCode = "400", description = "Dados inválidos fornecidos"),
        @ApiResponse(responseCode = "500", description = "Erro interno do servidor")
    })
    @PostMapping(path = "/usuarios")
    public void postUsuario() {
      
    }

    @Operation(
        summary = "Atualiza um usuário",
        description = "Este endpoint permite a atualização dos dados de um usuário existente com base no ID fornecido."
    )
    @ApiResponses({
        @ApiResponse(responseCode = "200", description = "Usuário atualizado com sucesso"),
        @ApiResponse(responseCode = "400", description = "Dados inválidos fornecidos"),
        @ApiResponse(responseCode = "404", description = "Usuário não encontrado"),
        @ApiResponse(responseCode = "500", description = "Erro interno do servidor")
    })
    @PutMapping(path = "/usuarios/{id}")
    public void putUsuario(
        @Parameter(description = "ID do usuário", example = "1", required = true) @PathVariable int id) {

    }

    @Operation(
        summary = "Deleta um usuário",
        description = "Este endpoint permite a exclusão de um usuário existente com base no ID fornecido."
    )
    @ApiResponses({
        @ApiResponse(responseCode = "200", description = "Usuário deletado com sucesso"),
        @ApiResponse(responseCode = "404", description = "Usuário não encontrado"),
        @ApiResponse(responseCode = "500", description = "Erro interno do servidor")
    })
    @DeleteMapping(path = "/usuarios/{id}")
    public void deleteUsuario(
        @Parameter(description = "ID do usuário", example = "1", required = true) @PathVariable int id) {
        
    }
}
