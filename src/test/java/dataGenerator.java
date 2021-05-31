import java.util.List;

import com.github.javafaker.Faker;

public class dataGenerator {

    private static Faker faker = new Faker();

    public static String description() { return String.valueOf(faker.lorem().sentences(2)); }
    public static String email() { return faker.internet().emailAddress(); }
    public static String rating() { return faker.number().digits(1); }
    public static String title() { return faker.company().profession(); }
    public static String company() { return faker.company().name(); }
    public static String street() { return faker.address().streetName(); }
    public static String content() { return faker.animal().name(); }
    public static String keyword() { return faker.ancient().hero(); }
    public static String phone() { return "081" + faker.number().digits(9); }
    public static String lorem256() { return String.valueOf(faker.lorem().characters(256)); }
    public static String eCouponName(){ return "TE Coupon " + faker.number().digits(3) + " Test " + faker.number().digits(2);}
    public static String merchantName(){return "TE Merchant "+ faker.number().digits(5) + generateFirstName();}
    public static String generateFirstName() {

        return faker.name().firstName().replaceAll("[^a-zA-Z0-9]","");
    }

    public static String generateLastName() {

        return faker.name().lastName().replaceAll("[^a-zA-Z0-9]","");
    }

    public static String generateFullName() {

        return faker.name().fullName();
    }

    public static String generateUsername() {

        return faker.name().username();
    }

    public static String generateJobPosition() {

        return faker.job().position();
    }

    public static String generateSentence() {

        return faker.lorem().sentence();
    }

    public static String generateDepartment() {

        return faker.commerce().department();
    }

    public static String generateProfession() {

        return faker.company().profession();
    }

    public static String generateCity() {

        return faker.address().city();
    }

    public static String generateCreditCartNumber() {

        return faker.business().creditCardNumber();
    }

    public static String generateFullAddress() {

        return faker.address().fullAddress();
    }

    public static String generateProductName() {

        return faker.commerce().productName();
    }

    public static String generateTitle() {

        return faker.name().title();
    }

    public static List<String> generateSentences(int count) {

        return faker.lorem().sentences(count);
    }

    public static String generateNumber(int minNumber, int maxNumber) {

        return String.valueOf(faker.number().numberBetween(minNumber, maxNumber));
    }

    public static String generatePrice(String minPrice, String maxPrice) {

        return String.valueOf(faker.number().numberBetween(Integer.parseInt(minPrice), Long.valueOf(maxPrice)));
    }

    public static String generateValidCharacaters(int minLength, int maxLength) {

        return faker.lorem().characters(minLength, maxLength, true, true);
    }

    public static String generateFixCharacters(int fixLength) {

        return faker.lorem().characters(fixLength, true, true);
    }

    public static String generateSku(int maxSkuLength) {

        return faker.lorem().characters(2, maxSkuLength, true, true);
    }

    public static String generateDuration(String minDuration, String maxDuration) {

        return String.valueOf(faker.number().numberBetween(Integer.parseInt(minDuration), Integer.parseInt(maxDuration)));
    }

    public static String generateFixNumber(int fixDigits) {

        return String.valueOf(faker.number().digits(fixDigits));
    }

    public static String generateCharacterOnly(int minLength, int maxLength) {

        return faker.lorem().characters(minLength, maxLength, true, false);
    }
}
