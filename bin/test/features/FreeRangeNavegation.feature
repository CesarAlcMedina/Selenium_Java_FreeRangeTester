Feature: La barra de navegacion me permite navegar a todas las subsecciones
    para ver la paginas de FRT
    sin haber logeado
    puedo hacer click en los links

  #  Scenario Outline: Puedo acceder en las subsecciones de la barra de navegacion superior
  #     Given I navigate to www.freerangetester.com
  #      When I go to <section> using the navigation bar
  #      Examples:
  #          | section   |
  #          | Academia  |
  #          | Cursos    |
  #          | Mentorías |
  #          | Talleres  |
  #          | Blog      |
  #          | Recursos  |

  #  Scenario: Courses are presented correctly to potencial customers
  #      Given I navigate to www.freerangetester.com
  #      When I go to Cursos using the navigation bar 
  #      And Select Introducción al Testing
 
      Scenario: Users can select a plan when signing up
         Given I navigate to www.freerangetester.com
         When I go to Elegir plan
         Then I can validate the options in  the checkout page



