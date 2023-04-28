public class turtle {
    private boolean penIsUp = true;
    public boolean penIsUp(){
        return penIsUp;
    }
    public  void penDown(){
        penIsUp = false;
    }
    public  void penUp(){
        penIsUp = true;

    }
}
