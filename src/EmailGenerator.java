public class EmailGenerator {
    public static void main(String[] args) {

        String fullName = "Simón González Quirós";
        String company = "KGS company";
        String domain = ".dev.es";

        // joining the words and converting to lower case
        String nameForEmail = fullName.strip().replace(" ", ".").toLowerCase();

        //replacing the accents with normal letters
        nameForEmail = nameForEmail.replace("á", "a");
        nameForEmail = nameForEmail.replace("é", "e");
        nameForEmail = nameForEmail.replace("í", "i");
        nameForEmail = nameForEmail.replace("ó", "o");
        nameForEmail = nameForEmail.replace("ú", "u");

        System.out.printf("User: %s\n", fullName);
        System.out.printf("User normalized: %s\n\n", nameForEmail);

        // COMPANY
        String companyNormalized = company.strip().replace(" ", "").toLowerCase();
        System.out.printf("Company: %s\n", company);
        System.out.printf("Company Normalized: %s\n\n", companyNormalized);

        // DOMAIN
        StringBuilder buildingDomain = new StringBuilder();
        buildingDomain.append("@").append(companyNormalized).append(domain.strip().toLowerCase());

        String domainNormalized = buildingDomain.toString().toLowerCase();
        System.out.printf("Domain normalized: %s\n\n", domainNormalized);

        // EMAIL FINAL
        String email = String.join("", nameForEmail, domainNormalized);
        System.out.println("Email = " + email);
    }
}