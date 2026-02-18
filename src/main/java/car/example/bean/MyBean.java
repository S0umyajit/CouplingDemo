package car.example.bean;

public class MyBean {
    private String message;
    public void setMessages(String message){
        this.message=message;
    }

    public void getMessage(){
        System.out.println(message);
    }

    @Override
    public String toString() {
        return "message: "+message;
    }
}
