package groupExercise1;

public class T10 {
    public static void main(String[] args) {
        String [] names={"John","Jack","John","Stuart","Mike","Jordan","John","Mike"};

        for (int i = 0; i < names.length ; i++) {
            for (int j = i+1; j < names.length ; j++) {
                if (names[i].equals(names[j])){
                    System.out.println(names[j]);
                }
            }

        }

    }
}
