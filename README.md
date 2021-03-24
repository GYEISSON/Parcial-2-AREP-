# Parcial segundo corte

Se realiz� el desarrollo de una aplicaci�n web cual busca calcular la arco tangente  y euler elevado a la n-esima potencia estandar de un n�mero. 
La aplicaci�n web retorna un objeto Json con los valores operaci�n,entrada y salida.



## Pre-requisitos

*  [MAVEN](https://maven.apache.org/) - Administrador de dependencias.

*  [GIT](https://git-scm.com/) - Control de versiones.

Para estar seguro de las versi�nes que posee de maven, git y de java ejecute los siguientes comandos:

```

mvn -version

```

```

git --version

```

```

java -version

```

## Instalaci�n

Para descargar el proyecto desde GitHub ejecute la siguiente linea:

```

git clone https://github.com/GYEISSON/Parcial-2-AREP-

```

## UML diagrams  

![](/recursos/classDiagram.png)  

## Docker repository   


![](/recursos/docker.png)   


## AWS Configuration  

![](/recursos/awsConfigure.png)   

## Ejecutar

Dentro del directorio parcial-app, para compilar ejecutamos la siguiente linea:

```

mvn package

```

Para ejecutar el proyecto ejecutamos la siguiente linea:

```

java -cp target\parcial-app-1.0-SNAPSHOT.jar edu.escuelaing.arem.arep.App

```

Para generar la documentaci�n ejecutamos la siguiente linea:

```

mvn javadoc:javadoc

```

La documentaci�n quedar� en la ruta \target\site\apidocs\edu\eci\escuelaing\arep

## Ejecutando las pruebas

Para correr las pruebas ejecutamos la siguiente linea:

```

mvn test

```

## Construido con

*  [MAVEN](https://maven.apache.org/) - Administrador de dependencias.

*  [GIT](https://git-scm.com/) - Control de versiones.

*  [JUNIT](https://junit.org/junit5/) - Framework para realizar y automatizar pruebas.

* Java - Lenguaje de programaci�n.  

## Autor

*  **Yeisson Gualdron** - [GYEISSON](https://github.com/GYEISSON)


## Licencia

Este proyecto est� bajo la Licencia GNU(General Public License) - mira el archivo [LICENSE](LICENSE) para detalles.

## Video  demostrativo   

[AWS y Docker](https://youtu.be/41PyBC47RH4)
