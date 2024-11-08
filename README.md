# Taller-1-para

1. **¿Qué es paralelismo y cómo se diferencia de la concurrencia?**
   El paralelismo es la ejecución simultánea de múltiples tareas, mientras que la concurrencia se refiere a la capacidad de un sistema para gestionar múltiples tareas que pueden no ejecutarse al mismo tiempo. En resumen, el paralelismo es un tipo de concurrencia donde las tareas se ejecutan en paralelo.

2. **¿Cuál es el propósito principal del paralelismo en sistemas informáticos?**
   El propósito principal del paralelismo es mejorar el rendimiento y la eficiencia de los programas al permitir que múltiples operaciones se realicen simultáneamente, aprovechando mejor los recursos del sistema.

3. **Explica qué es un núcleo de procesamiento en el contexto de paralelismo.**
   Un núcleo de procesamiento es una unidad de procesamiento dentro de un CPU que puede ejecutar instrucciones. En sistemas paralelos, múltiples núcleos pueden trabajar en diferentes tareas al mismo tiempo.

4. **¿Qué significa que una operación sea “thread-safe” en programación paralela?**
   Una operación es “thread-safe” si puede ser ejecutada por múltiples hilos simultáneamente sin causar condiciones de carrera o inconsistencias en los datos.

5. **Define el concepto de “balanceo de carga” y su importancia en sistemas paralelos.**
   El balanceo de carga es la distribución equitativa de tareas entre los recursos disponibles para evitar que algunos se sobrecarguen mientras otros están inactivos. Es importante para maximizar el rendimiento y la eficiencia del sistema.

6. **¿Qué es una “condición de carrera” y cómo afecta a la programación en un sistema paralelo?**
   Una condición de carrera ocurre cuando dos o más hilos acceden a recursos compartidos y tratan de cambiar su estado al mismo tiempo, lo que puede llevar a resultados inesperados o errores.

7. **¿Cuál es la diferencia entre memoria compartida y paso de mensajes en paralelismo?**
   La memoria compartida permite que múltiples hilos accedan a la misma área de memoria, mientras que el paso de mensajes implica que los hilos se comunican enviando mensajes entre sí, evitando el acceso directo a la memoria compartida.

8. **Define el término “overhead” en el contexto de paralelismo.**
   El “overhead” se refiere al tiempo y recursos adicionales requeridos para gestionar la ejecución paralela, como la creación de hilos, la sincronización y la comunicación entre ellos.

9. **¿Qué es un “deadlock” y cómo puede ocurrir en sistemas paralelos?**
   Un deadlock es una situación en la que dos o más hilos están bloqueados indefinidamente, esperando que el otro libere un recurso. Puede ocurrir cuando los hilos adquieren recursos en un orden que causa un ciclo de espera.

10. **¿Cuál es el rol de un “scheduler” en la administración de tareas en paralelismo?**
    Un scheduler es responsable de asignar recursos de CPU a las tareas en ejecución, optimizando el uso del procesador y asegurando que las tareas se completen de manera eficiente.

11. **Describe cómo el paralelismo puede mejorar el rendimiento de un programa. Da un ejemplo general.**
    El paralelismo puede mejorar el rendimiento al permitir que múltiples tareas se ejecuten simultáneamente. Por ejemplo, en un programa que procesa grandes volúmenes de datos, dividir el trabajo en partes más pequeñas que se procesan en paralelo puede reducir significativamente el tiempo total de ejecución.

12. **Explica qué es una “condición de carrera” y proporciona un ejemplo de cómo podría ocurrir.**
    Una condición de carrera ocurre cuando dos hilos intentan modificar el mismo recurso al mismo tiempo. Por ejemplo, si dos hilos intentan incrementar un contador compartido sin sincronización, el resultado final puede ser incorrecto.

13. **¿Por qué es importante la sincronización en programación paralela? Menciona alguna técnica de sincronización.**
    La sincronización es importante para evitar condiciones de carrera y asegurar la consistencia de los datos. Una técnica común es el uso de mutexes (bloqueos) para controlar el acceso a recursos compartidos.

14. **Describe los posibles efectos del “overhead” en la ejecución de tareas en paralelo.**
    El overhead puede reducir el rendimiento general al consumir tiempo y recursos que podrían haberse utilizado para ejecutar tareas. Esto puede incluir el tiempo de creación de hilos, la sincronización y la comunicación entre hilos.

15. **Explica cómo se pueden evitar los deadlocks en un sistema paralelo.**
    Los deadlocks se pueden evitar mediante técnicas como la asignación ordenada de recursos, donde los hilos adquieren recursos en un orden predefinido, o utilizando algoritmos de detección y recuperación de deadlocks.

16. **¿Cuáles son las ventajas y desventajas de utilizar memoria compartida en lugar de paso de mensajes en paralelismo?**
    Ventajas de la memoria compartida incluyen un acceso más rápido a los datos, mientras que las desventajas incluyen la complejidad de la sincronización. El paso de mensajes es más seguro y evita condiciones de carrera, pero puede ser más lento debido a la sobrecarga de comunicación.

17. **¿Qué estrategias existen para gestionar la asignación de tareas en un sistema con múltiples núcleos?**
    Estrategias incluyen el balanceo de carga, donde las tareas se distribuyen equitativamente entre los núcleos, y la asignación dinámica, donde las tareas se asignan a los núcleos disponibles en tiempo de ejecución.

18. **Describe un caso en el que el balanceo de carga sea esencial en un sistema paralelo.**
    En un servidor web que maneja múltiples solicitudes de usuarios, el balanceo de carga es esencial para asegurar que ninguna instancia del servidor se sobrecargue, lo que podría llevar a tiempos de respuesta lentos o fallos en el servicio.

19. **Explica cómo la latencia y el ancho de banda afectan el rendimiento en paralelismo.**
    La latencia se refiere al tiempo que tarda en enviarse un mensaje entre hilos, mientras que el ancho de banda es la cantidad de datos que se pueden transferir en un tiempo determinado. Alta latencia o bajo ancho de banda puede limitar la eficiencia de la comunicación entre hilos, afectando el rendimiento general.

20. **¿Cuáles son los desafíos principales en la implementación de sistemas paralelos y cómo se pueden mitigar?**
    Los desafíos incluyen la complejidad de la sincronización, la gestión de recursos y la detección de condiciones de carrera. Estos se pueden mitigar mediante el uso de bibliotecas de alto nivel que abstraen la complejidad, así como técnicas de diseño cuidadosas que minimizan la dependencia entre hilos.
