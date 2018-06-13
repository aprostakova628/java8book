class VivodIProbely {
    public static void main(String args[])
            throws java.io.IOException {

        char ch;
        int spaces = 0;

        System.out.println("Введите точку чтобы остановить.");

        do {
            ch = (char) System.in.read();
            if (ch == 1) spaces++;
        } while (ch != '.');
        System.out.println("Пробелы: " + spaces);
    }
}
