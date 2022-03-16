package IoC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoDemoSingletonPrototype {
    public static void main(String[] args) {
        //Carga de XML de configuración
        ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext2.xml");

        //Petición de Beans al contenedor Spring
        SecretarioEmpleado Maria = contexto.getBean("miSecretarioEmpleado", SecretarioEmpleado.class);
        SecretarioEmpleado Pedro = contexto.getBean("miSecretarioEmpleado", SecretarioEmpleado.class);
        System.out.println(Maria);
        System.out.println(Pedro);
        String resultado = (Maria==Pedro)?"Apuntan al mismo objeto":"No se trata del mismo objeto";
        System.out.println(resultado);
    }
}
