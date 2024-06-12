Feature: Clockify

  @TPF @AgregarHoras
  Scenario Outline: Agregar horas a un proyecto
    Given base url $(env.base_url)
    And endpoint v1/workspaces/6668d2a635f4d65ffb593b6c/time-entries
    And header Content-Type = application/json
    And header x-api-key = $(env.x_api_key)
    And set value <inicio> of key start in body jsons/bodies/agregartiempo.json
    And set value <fin> of key end in body jsons/bodies/agregartiempo.json
    And set value <idProyecto> of key projectId in body jsons/bodies/agregartiempo.json
    When execute method POST
    Then the status code should be 201
    * define idTimeEntry = response.id
    Examples:
      | inicio               | fin                  | idProyecto               |
      | 2024-06-08T09:00:00Z | 2024-06-08T13:00:00Z | 6668d84287b54248994a7939 |


  @TPF @HorasRegistradas
  Scenario: Consultar horas registradas
    Given call @clockify.feature@AgregarHoras
    And base url $(env.base_url)
    And endpoint /v1/workspaces/6668d2a635f4d65ffb593b6c/time-entries/{{idTimeEntry}}
    And header Content-Type = application/json
    And header x-api-key = $(env.x_api_key)
    When execute method GET
    Then the status code should be 200


  @TPF @Editar
  Scenario: Editar campo en un registro
    Given call @clockify.feature@AgregarHoras
    And base url $(env.base_url)
    And endpoint /v1/workspaces/6668d2a635f4d65ffb593b6c/time-entries/{{idTimeEntry}}
    And header Content-Type = application/json
    And header x-api-key = $(env.x_api_key)
    And  body jsons/bodies/editarcampo.json
    When execute method PUT
    Then the status code should be 200


  @TPF @Borrar
  Scenario: Borrar horas ingresadas
    Given call @clockify.feature@AgregarHoras
    And base url $(env.base_url)
    And endpoint /v1/workspaces/6668d2a635f4d65ffb593b6c/time-entries/{{idTimeEntry}}
    And header Content-Type = application/json
    And header x-api-key = $(env.x_api_key)
    When execute method DELETE
    Then the status code should be 204
