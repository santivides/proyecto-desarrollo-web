package com.canchas_admin.administrador;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.canchas_admin.model.Canchas;
import com.canchas_admin.model.CanchasRepository;

@SpringBootTest
public class CanchasApplicationTests {
    
    @Autowired
    private CanchasRepository canchaService;

    @Test
    public void pruebaDeInsercionCanchas(){

        try{

            java.util.Iterator<Canchas>canchas = canchaService.findAll().iterator();

                int cantidad = 0;
                while( canchas.hasNext() ) {
                    canchas.next();
                    cantidad ++;
                }

                Canchas cancha = new Canchas();
                cancha.setValores("elCampin", "cancha grande para partidos con muchos jugadores", "elCampin.jpg");
                canchaService.save(cancha);

                Canchas cancha2 = new Canchas();
                cancha2.setValores("blink", "cancha mediana para partidos con una cantidad moderada de jugadores", "blink.jpg");
                canchaService.save(cancha2);

                Canchas cancha3 = new Canchas();
                cancha3.setValores("radioUno", "cancha pequeña para partidos con pocos jugadores", "radioUno.jpg");
                canchaService.save(cancha3);

                canchas = canchaService.findAll().iterator();
                int nuevaCantidad = 0;
                while(canchas.hasNext()){
                    canchas.next();
                    nuevaCantidad++;
                }
            

                assertTrue(cantidad + 3 == nuevaCantidad, "tres canchas fueron agregadas");
        }catch (Exception e) {
            e.printStackTrace();
            assertTrue( false, "Error en la aplicación" );
            
        }
    }
}