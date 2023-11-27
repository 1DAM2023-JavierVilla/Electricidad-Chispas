public class Main {
    public static void main(String[] args) {
        Freelance freelance = new Freelance();
        freelance.setCustomerCode("1");
        freelance.setName("Andreu");
        freelance.setSurname("Revertonni Proscciutto");
        freelance.setDni("85432494A");
        freelance.setPostalAdress("Calle de la Iglesia, 25");
        freelance.setPopulation("Setenil de las Bodegas");
        freelance.setProvince("Cadiz");
        freelance.setEmail("andreu.revpros@gmail.com");
        freelance.setPhoneNumber(654321000);

        Society society = new Society();
        society.setCustomerCode("1");
        society.setName("Bombillas");
        society.setCif("B14507610");
        society.setPostalAdress("Calle Euphoria, 14");
        society.setPopulation("Castillejo de Robledo");
        society.setProvince("Soria");
        society.setEmail("bombillas@gmail.com");
        society.setPhoneNumber(601234567);

        Product product1 = new Product();
        product1.setProductCode(1);
        product1.setName("Cable trifasico");
        product1.setProductBrand("Latincasa");
        product1.setProductModel("NMC PVC + Ny");
        product1.setPrice("10€");
        product1.setIvaType("21%");

        Product product2 = new Product();
        product2.setProductCode(1);
        product2.setName("Bombilla");
        product2.setProductBrand("Cegasa");
        product2.setProductModel("E27");
        product2.setPrice("10€");
        product2.setIvaType("21%");

        Service service1 = new Service();
        service1.setServiceCode(1);
        service1.setName("Cableado habitacion");
        service1.setPrice("10€");
        service1.setIvaType("21%");

        Service service2 = new Service();
        service2.setServiceCode(2);
        service2.setName("Montaje");
        service2.setPrice("10€");
        service2.setIvaType("21%");

        Invoice invoice1 = new Invoice();
        invoice1.setInvoiceCode(1);
        invoice1.setInvoiceDate("12/10/2023");
        invoice1.setCustomer(freelance);
        invoice1.setItems(product1);
        invoice1.setItems(service1);
        invoice1.setTaxBase("21%");
        invoice1.setTotal("24,20€");

        Invoice invoice2 = new Invoice();
        invoice2.setInvoiceCode(2);
        invoice2.setInvoiceDate("12/10/2023");
        invoice2.setCustomer(society);
        invoice2.setItems(product2);
        invoice2.setItems(service2);
        invoice2.setTaxBase("21%");
        invoice2.setTotal("24,20€");

        new InvoicePrinter(invoice1);
        new InvoicePrinter(invoice2);

    }
}
