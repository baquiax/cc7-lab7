cc7-lab7
=========
# Informacion general

 - Alexander Baquiax 
 - Galileo University 
 - [\[Repo - https://github.com/baquiax/cc7-lab7.git](https://github.com/baquiax/cc7-lab7.git)

# Modo de uso
`javac Runner.java && java Runner`

#Synchronizing threads

 1 ¿Qué significa que un método se declare como Synchonized?
> Permite bloquear el acceso al metodo cuando otro thread lo tiene en uso. Esto asegura no alterar informacion o crear inconsistencias. 

2 ¿Qué hace el método Wait()?
> El metodo wait pertenece a cualquier objeto que herede de `Object`. Este pausa la ejecucion del thread de donde se encuentre el objeto. Puede ser "despertado" al ejecutar el metodo `notify()` o `notifyAll()`.

3 ¿Qué hace el método Notify()?
> Como se menciono anteriormente, para volver a la ejecucion de un thread pausado por `wait()`, es necesario usar un notify. En el caso de la metodo `notify()`, este se encarga de despertar a **uno** de los N threads que pueden estar en espera del `wait()`.

4 ¿Cuál es la diferencia entre Notify() y NotifyAll()?
> En el caso del `notifyAll()`, como su nombre lo puede denotar, despierta a todo thread que haya estado esperando por la llamada de `wait()`.
 
5 ¿Cuál podría ser el comportamiento de este programa si los métodos Suma y Resta no son declarados como Synchronized?
> Pueden generarse excepciones al tener dos o mas threads accediendo al mismo espacio de memoria. En el caso de Java podria generarse una excepcion conocida: `InterruptedException`.
