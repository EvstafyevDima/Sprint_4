package ru.yandex.architect;

public class Account {
    private final String name;

    public Account(String name) {
        this.name = name;
    }

    public boolean checkNameToEmboss() {

        if (name == null) {
                return false;
            }

        int count = name.length(); // Подсчет количество знаков
        boolean isNoSpaceAtTheBeginning = !name.startsWith(" ");// нет пробела в начале
        boolean isNoSpaceAtTheEnd = !name.endsWith(" "); // нет пробела в конц


        if(count >= 3 && count <= 19 && isNoSpaceAtTheBeginning  && isNoSpaceAtTheEnd){

            int counter = 0;
            char[] chArray = name.toCharArray();
            for(int i = 0; i < chArray.length; i++){
                if(chArray[i] == ' '){
                    counter++;
                }
            }

            if (counter == 1) {
                System.out.println("true");
                return true;
            }


                System.out.println("false!");
                return false;
        }

        return false;
    }
}
