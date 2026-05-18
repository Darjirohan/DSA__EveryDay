class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int Student1 = 0;
        int Student2 = 0;
        for (int student : students) {
            if (student == 0) {
                Student1++;
            } else {
                Student2++;
            }
        }

        for (int sandwich : sandwiches) {
            if (sandwich == 0 && Student1 == 0) {
                return Student2;
            }
            if (sandwich == 1 && Student2 == 0) {
                return Student1;
            }

            if (sandwich == 0) {
                Student1--;
            } else {
                Student2--;
            }
        }
        return 0;
    }
}