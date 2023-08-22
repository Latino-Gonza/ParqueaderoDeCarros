# ParqueaderoDeCarros
DIAGRAMA UML
https://miro.com/welcomeonboard/NVlEOFlIRzVJVW9Jb281UVFxcHlLZkVVb2w2OGFvNGdoWE5Rcll2WlBpa1JqdGNZaldKVm5tMTdQa0Framk0bXwzNDU4NzY0NTYxOTI2MDkxNTc5fDI=?share_link_id=795979167221


Crea un programa en Java que simule un sistema de parqueadero u4lizando matrices para 
almacenar objetos de carros y siguiendo los principios de la programación orientada a objetos. 
Deberás implementar las siguientes funcionalidades:
Clase Carro:
1. Atributos:
2. Placa (String)
3. Marca (String)
4. Modelo (String)
Clase Parqueadero:
Atributos:
1. Matriz de objetos Carro para representar los espacios de estacionamiento. La matriz 
debe tener dimensiones fijas (por ejemplo, 5 filas y 10 columnas).
2. Tarifa por hora (double).
Métodos:
1) parquearCarro(carro: Carro, fila: int, columna: int): boolean: Estaciona un carro en una 
posición específica de la matriz. Si el espacio está ocupado o los límites de la matriz se 
exceden, debe retornar false. Si se pudo estacionar exitosamente, retorna true.
2) cobrarPorTiempo(carro: Carro, horas: int): double: Calcula y retorna el costo a cobrar por 
el 4empo de estacionamiento del carro, mul4plicando las horas por la tarifa por hora.
3) mostrarEstadoParqueadero(): Muestra el estado actual del parqueadero, indicando con 
"X" los espacios ocupados y con un espacio en blanco los espacios vacíos.
Función Main:
• Crea una instancia de la clase Parqueadero.
• Crea varios objetos de la clase Carro con diferentes placas, marcas y modelos.
• Estaciona algunos carros en diferentes posiciones del parqueadero, verificando si el 
estacionamiento fue exitoso.
• Intenta estacionar un carro en un espacio ya ocupado y muestra el mensaje 
correspondiente.
• Realiza el cálculo del costo por 4empo de estacionamiento para algunos carros y 
muestra el resultado.
• Muestra el estado del parqueadero después de algunas operaciones.
Este ejercicio te permi4rá aplicar conceptos de programación orientada a objetos, uso de 
matrices y lógica de parqueadero. Asegúrate de seguir buenas prác4cas de diseño de clases y 
encapsulamient
