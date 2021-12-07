package com.company.Basics_of_OOP.Task_1;

class TextFile extends File{

    public Text content;

    public TextFile(String name, String firstText) {
        super(name);
        content = new Text(firstText);
    }

    public void addText(String text){
        content.addText(text);
    }

    public void printText(){
        System.out.println(content.getText());
    }

    @Override
    public String toString() {
        return "TextFile{" +
                " nameFile = " + getName() +
                '}';
    }
}
