package co.com.sk.exercise_1;

public class Email {

    private Integer id;

    private String nombre;

    private String dominio;

    private Boolean isSend;

    public Email() {
    }

    /**
     * Email's constructor
     *
     * @param id      Integer
     * @param nombre  String
     * @param dominio String
     * @param isSend  Boolean
     */
    public Email(Integer id, String nombre, String dominio, Boolean isSend) {
        this.id = id;
        this.nombre = nombre;
        this.dominio = dominio;
        this.isSend = isSend;
    }

    public Integer id() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String nombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String dominio() {
        return dominio;
    }

    public void setDominio(String dominio) {
        this.dominio = dominio;
    }

    public Boolean send() {
        return isSend;
    }

    public void setSend(Boolean send) {
        isSend = send;
    }

    @Override
    public String toString() {
        return "Email{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", dominio='" + dominio + '\'' +
                ", isSend=" + isSend +
                '}';
    }
}