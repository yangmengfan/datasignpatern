package behavepatern.TemplateMethod;
//定义一个操作中的算法骨架，而将一些步骤延迟到子类中。模板方法使得子类可以不改变一个算法的结构即可重定义该算法的
//
//某些特定步骤。也就是说：假如某些操作代码基本相同，只是其中一部分会经常改变，则可以使用模板方法，将不变的部分作为一个模板，将容易变动的
//
//部分让子类来实现。