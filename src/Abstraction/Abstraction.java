package Abstraction;

abstract class Phone{

    public void HomeButton(){
        System.out.println("Brings you to main  window");
    }
    public  void VolumeButtons(){
        System.out.println("Get volume up or volume down");
    }
   public void ChargeInput(){
       System.out.println("Charge the phone");
   }

  static class User extends Phone{}
    public static void main(String[] args) {
        User u=new User();

        u.ChargeInput();
        u.HomeButton();
        u.VolumeButtons();
    }
}

