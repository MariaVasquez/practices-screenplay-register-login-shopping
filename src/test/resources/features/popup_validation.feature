
Feature: Formulario popup validation

@CasoExitoso
Scenario: Diligenciamiento exitoso del formulario popup vaidation, no se presenta ningún mensaje de validación
    Given Autentico en la página colorib con usuario "demo" y password "demo"
    And Ingreso a la funcionalidad forms validation
    When Diligencio formulario popup validation
    Then Verifico ingreso exitoso