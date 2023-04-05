package enums;

public enum StudyProfile {
    UNIVERSAL("Универсальный"),
    SECURITY("Безопасность"),
    MEDICINE("Медицина"),
    PHYSICS("Физика"),
    MATHEMATICS("Математика"),
    EDUCATION("Образование"),
    BUSINESS("Бизнес"),
    MANAGEMENT("Менеджмент"),
    LAW("Юриспруденция"),
    BIOLOGY("Биология"),
    CHEMISTRY("Химия"),
    SPORTS("Спорт"),
    NAVAL("Морское направление"),
    LINGUISTICS("Лингвистика"),
    ECONOMICS("Экономика");

    final String profileName;


    StudyProfile(String profile) {
        profileName = profile;
    }

    public String getProfileName() {
        return profileName;
    }
}
