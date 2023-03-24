package Test;

import model.txtReader;
import org.junit.Assert;

import static org.junit.jupiter.api.Assertions.*;

class txtReaderTest {




    @org.junit.jupiter.api.Test
    void returnPostFix() {
        txtReader txt = new txtReader("D:\\EstructuraDeDatosUVG\\DiccionarioArbolesBinarios\\src\\words.txt");
        assertEquals(txt.returnArrWords().toString(),"[house,casa,loger, dog,perro,chien, homework,tarea,devoirs, woman,mujer,femme, town,pueblo,ville, yes,si,Oui]");
    }

}