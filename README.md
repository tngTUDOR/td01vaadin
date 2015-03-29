# td01vaadin
This is a simplistic example of injecting a stateless EJB in a vaadin 7 application.

## Stateles Bean
A bean that does simple arithmetic operations. It is statless.
It includes a test that is built around openEJB embeddable container (it does not need a full tomee or glasfish to run the tests).

## Vaadin web app
A regular vaadin project, except that it has to use the CDIUI annotation to profit from using EJBs.
Also has a different WebServelt implementation.
