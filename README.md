# DecemberLabsJava

_Explicacion: Se corren 2 test solicitados_

## Validar formulario “Get in touch”

### Test 1: Dentro de la web de December Labs, navegar hasta el form, completar el mismo
Con los datos detallados a continuación y enviar formulario. Validar que el
formulario se envió con éxito. Los datos a utilizar para completar el form son los
siguientes:
* Name, Company & Message = "Test"
* Email = "test@decemberlabs.com"

### Test 2: Dentro de la web de December Labs, navegar hasta el form, no completar
ningún campo y enviar formulario. Validar que se visualizan mensajes de error
indicando los campos obligatorios.


## Pasos Para ejecutar

1) Clonar el proyecto 
2) Si no se cuenta con Maven Instalado, instalar y configurar el PATH de sistema (https://www.youtube.com/watch?v=T4-nYT5ubK8&ab_channel=Framebits)
3) Descargar Chromedriver segun la version de tu navegador en: https://chromedriver.chromium.org/ y pegarlo en la carpeta driver
4) Abrir la consola, y pararse en la carpeta donde se encuentra el proyecto \DecemberLabsJava
5) Dentro de la carpeta del proyecto ejecutar el comando **nvm test**
 
