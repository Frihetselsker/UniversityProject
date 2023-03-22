public class Main {
    public static void main(String[] args) {
        University uni1 = new University("1", "Московский государственный университет им. М.В.Ломоносова", "МГУ", 1755, StudyProfile.UNIVERSAL);
        University uni2 = new University("2", "Московский физико-технический институт", "МФТИ", 1951, StudyProfile.TECH);
        University uni3 = new University("3", "Финансовый университет при Правительстве Российской Федерации", "ФУ", 1919, StudyProfile.ECONOMICS);
        Student s1 = new Student("Новиков Константин Андреевич", "3", 1, 90.6f);
        Student s2 = new Student("Гайворонский Дмитрий Николаевич", "2", 2, 80.6f);
        Student s3 = new Student("Дрыгин Роман Алексеевич", "1", 4, 99.9f);
        Student s4 = new Student("Стеба Владимир Владиславович", "1", 3, 95.8f);
        Student s5 = new Student("Мельница 3уул Икигарович", "3", 1, 60.8f);
        Student s6 = new Student("Бочкарев Тимур Мурзаевич", "2", 1, 90.9f);
        System.out.println("Universities: ");
        System.out.println(uni1);
        System.out.println(uni2);
        System.out.println(uni3);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        System.out.println(s5);
        System.out.println(s6);
    }
}
