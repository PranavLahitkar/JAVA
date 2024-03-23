package demo1.practice;

interface InterfaceExample {
    public void a();
    void b();
}
interface aa  {
    void c();
    void d();
}
interface dd extends aa,InterfaceExample{
    void f();
}
class bb implements aa{

    @Override
    public void c() {

    }

    @Override
    public void d() {

    }
}
