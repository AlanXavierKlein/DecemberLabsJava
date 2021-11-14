# DecemberLabsJava

Explicacion: Se corren 2 test solicitados
Validar formulario “Get in touch”,
 - Test1: Dentro de la web de December Labs, navegar hasta el form, completar el mismo
  con los datos detallados a continuación y enviar formulario. Validar que el
  formulario se envió con éxito. Los datos a utilizar para completar el form son los
  siguientes:
  ■ Name, Company & Message = "Test"
  ■ Email = "test@decemberlabs.com"

  - Test2: Dentro de la web de December Labs, navegar hasta el form, no completar
  ningún campo y enviar formulario. Validar que se visualizan mensajes de error
  indicando los campos obligatorios.

-Es necesario tener IntelliJ con la version comunitaria sirve.
-Tener JAVA instalado, con el jdk configurado en Intellij

1 - Clonar el proyecto y abrir la carpeta del proyecto con intellij
2 - Maven cargara el proyecto y se van a cargar las dependencias
3 - Reemplazar el chromedriver.exe de la carpeta drivers por uno compatible con el chrome de su maquina
4 - Abrir las opciones de Maven ubicadas arriba a la derecha y ejeutar el job compile
![image](https://user-images.githubusercontent.com/85079907/141702793-f6f23932-7839-4d19-8dbd-4d08238192ff.png)

5- Abrir la clase ubicada src/test/java/lab/project/pom/GetInTouchTest.java
6- Darle play al test desde la ide
![image](https://user-images.githubusercontent.com/85079907/141702772-5f2ba615-6990-460f-9ad8-41fdde10b0cf.png)
