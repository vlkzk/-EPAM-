import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

    public class CustomerList {
        public static void main(String[] args) {
            Shop shop = new Shop("Evroopt");
            shop.addCustomerToList(new Customer("Иван", "Дроздов", "Михайлович", "Украина", 11_22_33_44, 12345));
            shop.addCustomerToList(new Customer("Олег", "Фамилия", "Иванович", "Россия", 22_33_44_55, 23456));
            shop.addCustomerToList(new Customer("Игорь", "Мухоедов", "Викторович", "Европа", 66_77_88_99, 34567));
            shop.addCustomerToList(new Customer("Алексей", "Федотов", "Васильевич", "Германия", 44_33_55_66, 45678));
            shop.addCustomerToList(new Customer("Александр", "Александров", "Александрович", "Беларусь", 99_22_11_55, 56789));
            shop.addCustomerToList(new Customer("Петр", "Первый", "Убица", "Россия", 77_88_66_77, 67890));
            shop.addCustomerToList(new Customer("Петр", "Второй", "Васильевич", "Россия", 22_11_88_99, 78901));
            shop.addCustomerToList(new Customer("Иван", "Грозный", "Михайлович", "Россия", 11_00_22_33, 890123));
            shop.addCustomerToList(new Customer("Александр", "Пушкин", "Сергеевич", "Россия", 55_00_00_44, 901234));
            shop.addCustomerToList(new Customer("Сергей", "Нестюк", "Игоревич", "Беларусь", 66_77_22_33, 987566));
            shop.addCustomerToList(new Customer("Владислав", "Казак", "Николаевич", "Беларусь", 22_44_00_99, 652411));

            System.out.println("\nСортировка по имени: ");
            List<Customer> listSortByFirstName = shop.getListByFirstName();
            for (Customer c : listSortByFirstName) {
                System.out.println(c);
            }

            System.out.println("\nСортировка по фамилии: ");
            List<Customer> listSortByMiddleName = shop.getListByMiddleName();
            for (Customer c : listSortByMiddleName) {
                System.out.println(c);
            }

            System.out.println("\nСписок покупателей, у которых номер кредитной карточки находится в заданном интервале: ");
            List<Customer> listSortByDiapazonCreditCard = shop.getListByDiapasonCreaditCard(22_33_44_55, 66_77_88_99);
            for (Customer c : listSortByDiapazonCreditCard) {
                System.out.println(c);
            }
        }
    }

    class Shop {
        private ArrayList<Customer> customerList = new ArrayList<>();

        Shop(String shopName) {
        }

        void addCustomerToList(Customer customer) {
            customerList.add(customer);
        }

        List<Customer> getListByFirstName() {
            List<Customer> list = new ArrayList<>(customerList);
            list.sort(new Comparator<Customer>() {
                @Override
                public int compare(Customer o1, Customer o2) {
                    return o1.getFirstName().compareToIgnoreCase(o2.getFirstName());
                }
            });
            return list;
        }

        List<Customer> getListByMiddleName() {
            List<Customer> list = new ArrayList<>(customerList);
            list.sort(new Comparator<Customer>() {
                @Override
                public int compare(Customer o1, Customer o2) {
                    return o1.getMiddleName().compareToIgnoreCase(o2.getMiddleName());
                }
            });
            return list;
        }

        List<Customer> getListByDiapasonCreaditCard(int diapazonStart, int diapazonEnd) {
            List<Customer> list = new ArrayList<>();
            for (Customer c : customerList) {
                if (c.getCreditCardId() >= diapazonStart && c.getCreditCardId() <= diapazonEnd) {
                    list.add(c);
                }
            }

            return list;
        }
    }

    class Customer {
        {
            idGenerator++;
        }

        private static int idGenerator = 0;
        private int id = idGenerator;
        private String firstName;
        private String middleName;
        private String lastName;
        private String address;

        Customer(String name, String name2, String name3, String address, int creditCardId, int bankNumberCard) {
            this.firstName = name;
            this.middleName = name2;
            this.lastName = name3;
            this.address = address;
            this.creditCardId = creditCardId;
            this.bankNumberCard = bankNumberCard;
        }

        public String getFirstName() {
            return firstName;
        }

        public String getMiddleName() {
            return middleName;
        }

        public int getCreditCardId() {
            return creditCardId;
        }

        private int creditCardId;

        private int bankNumberCard;

        @Override
        public String toString() {
            return "Покупатели: " +
                    "id = " + id +
                    ", Имя = " + firstName +
                    ", Фамилия = " + middleName +
                    ", Отчество = " + lastName +
                    ", Адресс = " + address +
                    ", Номер кредитной карты = " + creditCardId +
                    ", Номер банковского счета = " + bankNumberCard;
        }
    }
