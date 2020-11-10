public class SingleTonClass {
    /*
    Singleton Yapisi-->
    *Tek nesne olusturma
    *Bu sayede nesnenin kopyalanmasini ya da yeni bir tane olusturulmasi engellenir.
    *Nesneye ihtiyac duyuldugunda o nesnenin daha önceden olusturulan hali cagirilir.
     */
    private static SingleTonClass obj=null;
    private SingleTonClass(){
        //private constructor->dogrudan somutlastirma engellendi
    }
    public static SingleTonClass objectCreationMethod(){
        //ayni anda birden fazla nesnenin olusturulmamasi saglandi
        if(obj==null){
            obj= new SingleTonClass();
        }
        return obj;
    }
    public void display(){
        System.out.println("Singleton class Example");
    }
    public static void main(String args[]){
        //Private constructor ile dogrudan nesne olusturulamaz
        SingleTonClass myobject= SingleTonClass.objectCreationMethod();
        myobject.display();
    }
}