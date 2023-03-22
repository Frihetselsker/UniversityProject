public enum StudyProfile {
    UNIVERSAL("Универсальный"),
    SECURITY("Безопасность"),
    MEDICINE("Медицина"),
    TECH("Физтех"),
    EDUCATION("Образование"),
    BUSINESS("Бизнес"),
    MANAGEMENT("Менеджмент"),
    LAW("Юриспруденция"),
    BIOLOGY("Биология"),
    CHEMISTRY("Химия"),
    SPORTS("Спорт"),
    NAVAL("Морское направление"),
    ECONOMICS("Экономика");

    final String profileName;


    StudyProfile(String profile) {
        profileName = profile;
    }

    public String getProfileName() {
        return profileName;
    }
}
