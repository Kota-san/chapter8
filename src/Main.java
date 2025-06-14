//TIP コードを<b>実行</b>するには、<shortcut actionId="Run"/> を押すか
// ガターの <icon src="AllIcons.Actions.Execute"/> アイコンをクリックします。
public class Main {
    public static void main(String[] args) {
        Sword s = new Sword();
        s.name = "炎の剣";
        s.damage = 10;

        Hero h = new Hero();
        h.name = "ミナト";
        //h.hp = 100;
        h.sword = s;
        System.out.println(h.name + "のHP:" + h.hp);
        System.out.println(s.name);
        System.out.println("現在の武器は" + h.sword.name);

        Hero h2 = new Hero();
        h2.name = "アサカ";
        h2.hp = 100;
        Wizard w = new Wizard();
        w.name = "スガワラ";
        w.hp = 50;
        //ここから動きを書ける
        w.heal(h);
        w.heal(h2);
        w.heal(h2);

        Matango m1 = new Matango();
        m1.hp = 50;
        m1.suffix = 'A';

        Matango m2 = new Matango();
        m2.hp = 48;
        m2.suffix = 'B';

        h.slip();
        m1.run();
        m2.run();
        h.run();
    }
}