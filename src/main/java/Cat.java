public class Cat {
    private String name = "Безымянный кот";
    private String speak = "Вы коту не интересны";



    public String getCatSpeak() {
        switch (name) {
            case "Васька" :
                speak = "Мяяяса!";
                return String.format("\n%s", speak);
            case "Барсик" :
                speak = "Водыыы!";
                return String.format("\n%s", speak);
        }
        return String.format("\n%s", this.speak);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {this.name = name;}
}
