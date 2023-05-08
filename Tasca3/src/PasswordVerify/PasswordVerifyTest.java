package PasswordVerify;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PasswordVerifyTest {

    @Test
    void validaPassword() {
        PasswordResult esperado = new PasswordResult(false, "La contrasenya ha de tenir almenys 8 caràcters\n" +
                "La contrasenya ha de contenir almenys 2 números\n" + "La contrasenya ha de contenir almenys una lletra majúscula\n"
                + "La contrasenya ha de contenir almenys un caràcter especial");
        PasswordResult actual = PasswordVerify.validaPassword("");
        assertEquals(esperado.isValid(), actual.isValid());
        assertEquals(esperado.getMsjError(), actual.getMsjError());
    }

    @Test
    void validaPassword2() {
        PasswordResult esperado = new PasswordResult(false, "La contrasenya ha de tenir almenys 8 caràcters\n" +
                "La contrasenya ha de contenir almenys 2 números\n" + "La contrasenya ha de contenir almenys una lletra majúscula\n"
                + "La contrasenya ha de contenir almenys un caràcter especial");
        PasswordResult actual = PasswordVerify.validaPassword("hola");
        assertEquals(esperado.isValid(), actual.isValid());
        assertEquals(esperado.getMsjError(), actual.getMsjError());
    }

    @Test
    void validaPassword3() {
        PasswordResult esperado = new PasswordResult(false, "La contrasenya ha de contenir almenys 2 números\n"
                + "La contrasenya ha de contenir almenys una lletra majúscula\n"
                + "La contrasenya ha de contenir almenys un caràcter especial");
        PasswordResult actual = PasswordVerify.validaPassword("holacaracola");
        assertEquals(esperado.isValid(), actual.isValid());
        assertEquals(esperado.getMsjError(), actual.getMsjError());
    }

    @Test
    void validaPassword4() {
        PasswordResult esperado = new PasswordResult(false, "La contrasenya ha de tenir almenys 8 caràcters\n"
                + "La contrasenya ha de contenir almenys una lletra majúscula\n"
                + "La contrasenya ha de contenir almenys un caràcter especial");
        PasswordResult actual = PasswordVerify.validaPassword("hola12");
        assertEquals(esperado.isValid(), actual.isValid());
        assertEquals(esperado.getMsjError(), actual.getMsjError());
    }

    @Test
    void validaPassword5() {
        PasswordResult esperado = new PasswordResult(false, "La contrasenya ha de tenir almenys 8 caràcters\n"
                + "La contrasenya ha de contenir almenys 2 números\n"
                + "La contrasenya ha de contenir almenys una lletra majúscula\n");
        PasswordResult actual = PasswordVerify.validaPassword("hola!");
        assertEquals(esperado.isValid(), actual.isValid());
        assertEquals(esperado.getMsjError(), actual.getMsjError());
    }

    @Test
    void validaPassword6() {
        PasswordResult esperado = new PasswordResult(false, "La contrasenya ha de tenir almenys 8 caràcters\n"
                + "La contrasenya ha de contenir almenys una lletra majúscula\n");
        PasswordResult actual = PasswordVerify.validaPassword("hola12!");
        assertEquals(esperado.isValid(), actual.isValid());
        assertEquals(esperado.getMsjError(), actual.getMsjError());
    }

    @Test
    void validaPassword7() {
        PasswordResult esperado = new PasswordResult(false, "La contrasenya ha de tenir almenys 8 caràcters\n"
                + "La contrasenya ha de contenir almenys un caràcter especial");
        PasswordResult actual = PasswordVerify.validaPassword("hola12A");
        assertEquals(esperado.isValid(), actual.isValid());
        assertEquals(esperado.getMsjError(), actual.getMsjError());
    }

    @Test
    void validaPassword8() {
        PasswordResult esperado = new PasswordResult(false, "La contrasenya ha de contenir almenys una lletra majúscula\n"
                + "La contrasenya ha de contenir almenys un caràcter especial");
        PasswordResult actual = PasswordVerify.validaPassword("holacaracola12");
        assertEquals(esperado.isValid(), actual.isValid());
        assertEquals(esperado.getMsjError(), actual.getMsjError());
    }

    @Test
    void validaPassword9() {
        PasswordResult esperado = new PasswordResult(false, "La contrasenya ha de contenir almenys 2 números\n"
                + "La contrasenya ha de contenir almenys una lletra majúscula\n");
        PasswordResult actual = PasswordVerify.validaPassword("holacaracola!");
        assertEquals(esperado.isValid(), actual.isValid());
        assertEquals(esperado.getMsjError(), actual.getMsjError());
    }

    @Test
    void validaPassword10() {
        PasswordResult esperado = new PasswordResult(false, "La contrasenya ha de contenir almenys 2 números\n"
                + "La contrasenya ha de contenir almenys un caràcter especial");
        PasswordResult actual = PasswordVerify.validaPassword("holacaracolA");
        assertEquals(esperado.isValid(), actual.isValid());
        assertEquals(esperado.getMsjError(), actual.getMsjError());
    }

    @Test
    void validaPassword11() {
        PasswordResult esperado = new PasswordResult(false, "La contrasenya ha de tenir almenys 8 caràcters\n");
        PasswordResult actual = PasswordVerify.validaPassword("ho12A!");
        assertEquals(esperado.isValid(), actual.isValid());
        assertEquals(esperado.getMsjError(), actual.getMsjError());
    }

    @Test
    void validaPassword12() {
        PasswordResult esperado = new PasswordResult(false, "La contrasenya ha de contenir almenys 2 números\n");
        PasswordResult actual = PasswordVerify.validaPassword("holacaracolaA!");
        assertEquals(esperado.isValid(), actual.isValid());
        assertEquals(esperado.getMsjError(), actual.getMsjError());
    }

}