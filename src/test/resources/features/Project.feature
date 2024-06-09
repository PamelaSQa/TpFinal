
Feature: Projects

@AddNew @Smoke
  Scenario Outline: Add a new project
    Given base url https://api.clockify.me/api/
    And endpoint v1/workspaces/663d49ace45cba7471c01fe9/projects
    And header Content-Type = application/json
    And header x-api-key = YzI4ZjAyYjktMDcwYS00MzBmLWI4ZGItOGVkYzI2YjlkODNk
    And set value <proyecto> of key name in body jsons/bodies/projectbody.json
    When execute method POST
    Then the status code should be 201
    And validate schema jsons/schemas/proyecto.json
    Examples:
      | proyecto |
      | TestP5   |

  @NoName @Smoke @NoFeliz
  Scenario Outline: Add unnamed project
    Given base url https://api.clockify.me/api/
    And endpoint v1/workspaces/663d49ace45cba7471c01fe9/projects
    And header Content-Type = application/json
    And header x-api-key = YzI4ZjAyYjktMDcwYS00MzBmLWI4ZGItOGVkYzI2YjlkODNk
    And set value <proyecto> of key name in body jsons/bodies/projectbody.json
    When execute method POST
    Then the status code should be 400
    And validate schema jsons/schemas/proyecto.json
    Examples:
      | proyecto |

  @NoNameA @Smoke @NoFeliz
  Scenario Outline: Add unnamed project
    Given base url https://api.clockify.me/api/
    And endpoint v1/workspaces/663d49ace45cba7471c01fe9/projects
    And header Content-Type = application/json
    And header x-api-key = YzI4ZjAyYjktMDcwYS00MzBmLWI4ZGItOGVkYzI2YjlkODNk
    And set value <proyecto> of key name in body jsons/bodies/projectbody.json
    When execute method POST
    Then the status code should be 400
    And validate schema jsons/schemas/proyecto.json
    Examples:
      | proyecto |
      | proyecto |
    
  @E400 @NoFeliz @Smoke
  Scenario Outline: Add a project already exists
    Given base url https://api.clockify.me/api/
    And endpoint v1/workspaces/663d49ace45cba7471c01fe9/projects
    And header Content-Type = application/json
    And header x-api-key = YzI4ZjAyYjktMDcwYS00MzBmLWI4ZGItOGVkYzI2YjlkODNk
    And set value <proyecto> of key name in body jsons/bodies/projectbody.json
    When execute method POST
    Then the status code should be 400
    Examples:
      | proyecto |
      | TestP5   |

  @E401 @NoFeliz @Smoke
  Scenario: Add a new project without authorization
    Given base url https://api.clockify.me/api/
    And endpoint v1/workspaces/663d49ace45cba7471c01fe9/projects
    And header Content-Type = application/json
    And header x-api-key = none
    And set value <proyecto> of key name in body jsons/bodies/projectbody.json
    When execute method POST
    Then the status code should be 401

@E404 @NoFeliz @Smoke
  Scenario: Add a new project wrong id workspaces
  Given base url https://api.clockify.me/api/
    And endpoint v1/workspaces/663d49ace45cba7471c01fe9/projectos
    And header Content-Type = application/json
    And header x-api-key = YzI4ZjAyYjktMDcwYS00MzBmLWI4ZGItOGVkYzI2YjlkODNk
    And set value <proyecto> of key name in body jsons/bodies/projectbody.json
    When execute method POST
    Then the status code should be 404

@FindId @Smoke
  Scenario: Find project by id
    Given base url https://api.clockify.me/api/
    And endpoint /workspaces/663d49ace45cba7471c01fe9/projects/6658ec0f5ef4fd678d92fd83
    And header Content-Type = application/json
    And header x-api-key = YzI4ZjAyYjktMDcwYS00MzBmLWI4ZGItOGVkYzI2YjlkODNk
    When execute method GET
    Then the status code should be 200

  @ModificarValor
  Scenario: Modificar proyecto
    Given call @Project.feature@FindId
    And base url https://api.clockify.me/api/
    And endpoint /workspaces/663d49ace45cba7471c01fe9/projects/6658ec0f5ef4fd678d92fd83
    And header Content-Type = application/json
    And header x-api-key = YzI4ZjAyYjktMDcwYS00MzBmLWI4ZGItOGVkYzI2YjlkODNk
    And body jsons/bodies/proyectomod.json
    When execute method PUT
    Then the status code should be 200
    And response should be name = Modificar

@VerTodos @Smoke
  Scenario: Ver todos los proyectos
  Given base url https://api.clockify.me/api/
  And endpoint v1/workspaces/663d49ace45cba7471c01fe9/projects
  And header Content-Type = application/json
  And header x-api-key = YzI4ZjAyYjktMDcwYS00MzBmLWI4ZGItOGVkYzI2YjlkODNk
  When execute method GET
  Then the status code should be 200






