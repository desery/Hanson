import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Bookstore {
    private String orderedBook; //存 储 用 户 存 储 的 图 书 名 称 。 存 储 为 字 符 串 。
    private LocalDate orderDate; //-这 是 订 单 成 功 放 置 的 日 期 。 该 程 序 自 己 生 成 这 个 值 。 它 将 通 过 使 用 LocalDate类 存 储 为 日 期
    private String orderID; //
    private double transactionAmount;// 存 储 所 订 购 图 书 的 价 格 。 它 将 被 存 储 为 double类 型 。
    private String firstName;// 存 储 订 购 图 书 的 用 户 的 名 字 。 它 是 一 个 字 符 串 。
    private String lastName;// 存 储 订 购 图 书 的 用 户 的 姓 氏 。 这 是 一 个 字 符 串 。
    private String emailAddress;// -存 储 用 户 的 电 子 邮 件 地 址 。 它 是 一 个 字 符 串 。
    private String userID;
    private String orderType;   //存 储 订 单 的 类 型 。 它 可 以 是 “ 租 赁 ” 或 “ 购 买 ” 。 这 将 被 存 储 为 一 个 字 符 串。
    private BookDetails selectBook;

    public Bookstore(String firstName, String lastName, String emailAddress) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailAddress = emailAddress;
        this.orderDate = LocalDate.now();
        this.userID = generateUserID();
    }


    public enum BookDetails {
        Book1("TANL01", "Carrie", "Stephen King", 272, "Horror", 3.98, 1974, "Wings", 14),
        Book2("TANL02", "The Firm", "Robin Waterfield / John Grisham", 448, "Thriller", 4.01, 1991, "Addison Wesley Publishing Company", 25),
        Book3("TANLO3", "Slaughterhouse-Five", "Kurt Vonnegut Jr", 275, "Sci-Fi", 4.1, 1969, "Dial Press", 18),
        Book4("TANL04", "The Great Gatsby", "F. Scott Fitzgerald", 188, "Classic", 3.91, 1925, "Scribner", 8),
        Book5("TANL05", "American Gods", "Neil Gaiman", 635, "Fantasy", 4.11, 2001, "Harper Collins", 11);
        private String bookID;  //将 图 书 ID存 储 为 字 符 串 。
        private String bookName;    //将 书 名 存 储 为 字 符 串 。
        private String bookAuthor;  //将 作 者 的 名 字 存 储 为 字 符 串 。
        private int bookPages;   //将 书 的 总 页 数 存 储 为 整 数 。
        private String bookGenre;  //将 书 的 类 型 (类 别 )存 储 为 字 符 串 。
        private double bookRating;  //将 图 书 的 评 级 存 储 为 double 。
        private int bookPublishedYear;  //以 整 数 形 式 存 储 图 书 出 版 的 年 份 。
        private String bookPublisher;  //将 出 版 该 书 的 出 版 商 的 名 称 存 储 为 字 符 串 。
        private double bookPrice;  //将 书 的 价 格 存 储 为 double 。

        // 构造方法
        private BookDetails(String bookID, String bookName, String bookAuthor, int bookPages, String bookGenre
                , double bookRating, int bookPublishedYear, String bookPublisher, double bookPrice) {
            this.bookID = bookID;
            this.bookName = bookName;
            this.bookAuthor = bookAuthor;
            this.bookPages = bookPages;
            this.bookGenre = bookGenre;
            this.bookRating = bookRating;
            this.bookPublishedYear = bookPublishedYear;
            this.bookPublisher = bookPublisher;
            this.bookPrice = bookPrice;
        }

        public String getBookID() {
            return bookID;
        }

        public String getBookName() {
            return bookName;
        }

        public String getBookAuthor() {
            return bookAuthor;
        }

        public int getBookPages() {
            return bookPages;
        }

        public String getBookGenre() {
            return bookGenre;
        }

        public double getBookRating() {
            return bookRating;
        }

        public int getBookPublishedYear() {
            return bookPublishedYear;
        }

        public String getBookPublisher() {
            return bookPublisher;
        }

        public double getBookPrice() {
            return bookPrice;
        }

        public void setBookID(String bookID) {
            this.bookID = bookID;
        }



        //展示书架
        public void displayBookDetails() {
            System.out.println("Book ID: " + bookID);
            System.out.println("Book Name: " + bookName);
            System.out.println("Author: " + bookAuthor);
            System.out.println("Pages: " + bookPages);
            System.out.println("Genre: " + bookGenre);
            System.out.println("Rating: " + bookRating);
            System.out.println("Published Year: " + bookPublishedYear);
            System.out.println("Publisher: " + bookPublisher);
            System.out.println("Price: $" + bookPrice);
            System.out.println(); // Empty line for better formatting
        }
    }

    //创建order id
    private String generateOrderID() {
        // 假设 orderDate 是一个 LocalDate 对象，表示订单日期
        // 假设 orderedBook 是一个 String 对象，表示书籍的标题

        // 将订单日期格式化为 YYYY-MM-DD 的形式
        String formattedDate = orderDate.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));

        // 提取书籍标题的前三个字符并转换为大写
        // 如果书籍标题长度不足三个字符，则使用整个标题并转换为大写

        String bookTitlePrefix = orderedBook.length() >= 3 ?   //orderedbook是选的书的名字
                orderedBook.substring(0, 3).toUpperCase() :
                orderedBook.toUpperCase();

        // 生成并返回订单ID
        return "TANLOD" + formattedDate + bookTitlePrefix;
    }


    //创建userid
    private String generateUserID() {
        String nameCombination = firstName.substring(0, Math.min(firstName.length(), 5)) +
                lastName.substring(0, Math.min(lastName.length(), 5 - firstName.length()));
        return "TANLUS" + nameCombination.toUpperCase();
    }

    public String getOrderedBook() {
        return orderedBook;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public String getOrderID() {
        return orderID;
    }

    public double getTransactionAmount() {
        return transactionAmount;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getUserID() {
        return userID;
    }

    public String getOrderType() {
        return orderType;

    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }


    public void setEmailAddress(String EmailAddress) {
        this.emailAddress = emailAddress;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }

    public BookDetails getSelectBook() {
        return selectBook;
    }

    public void setSelectBook(BookDetails selectBook) {
        this.selectBook = selectBook;
    }

    //查找书本
    public BookDetails searchBook(String bookID) {
        BookDetails selectBook = null;
        if (BookDetails.Book1.getBookID().equals(bookID)) {
            selectBook = BookDetails.Book1;
        } else if (BookDetails.Book2.getBookID().equals(bookID)) {
            selectBook = BookDetails.Book2;
        } else if (BookDetails.Book3.getBookID().equals(bookID)) {
            selectBook = BookDetails.Book3;
        } else if (BookDetails.Book4.getBookID().equals(bookID)) {
            selectBook = BookDetails.Book4;
        } else if (BookDetails.Book5.getBookID().equals(bookID)) {
            selectBook = BookDetails.Book5;
        }
        return selectBook;
    }

    //选择值 (1或 2)作为参数
    public void orderBook(int type) {
        if (type == 1) {
            //如果是租书
            this.orderType = "Rent";

            System.out.println("You have chosen to rent the book \"" + orderedBook + "\" for one month at a cost of 5 EUR.");
        } else if (type == 2) {
            //如果是买书
            this.orderType = "Purchase";
            this.transactionAmount = selectBook.getBookPrice();
            System.out.println("You have chosen to purchase the book \"" + orderedBook + "\" at a cost of " + transactionAmount + " EUR.");
        } else {
            System.out.println("该选择无效，请重新输入：");
            Scanner sc = new Scanner(System.in);
            int nextType = sc.nextInt();
            orderBook(nextType);
        }

        this.orderedBook = selectBook.getBookName();
    }

    //确认订单， 按要求打印
    public void orderConfirmation(BookDetails searchBook) {
        System.out.println("Dear" + getFirstName() + getLastName() + "\n");
        System.out.println("Thank you for ordering orderedBook from Turn-A-New-Leaf. Following are your order details: \n");
        System.out.println("Order ID:" + getUserID());
        System.out.println("Order Date" + getOrderDate());
        System.out.println("User ID:" + getOrderID());
        System.out.println("User contact:" + getEmailAddress());
        System.out.println("Transaction type:" + getTransactionAmount());
        System.out.println("Transaction amount:" + getOrderType());
    }

    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        //用户给出名字
        System.out.println("firstname？");
        String fname = scanner.nextLine();

        System.out.println("lastname？");
        String lname = scanner.nextLine();

        System.out.println("address？");
        String adrs = scanner.nextLine();

        //bookstore是你的书的数据
        Bookstore bookstore = new Bookstore(fname,lname,adrs);

        //打出书架
        for (BookDetails book : BookDetails.values()) {
            book.displayBookDetails();
        }
        //选书
        System.out.println("要什么书");
        String bkid = scanner.nextLine();
        //搜书
        bookstore.setSelectBook(bookstore.searchBook(bkid));

        System.out.println("是借还是买");
        int type = scanner.nextInt();
        bookstore.orderBook(type);

        //生成id
        bookstore.setUserID(bookstore.generateUserID());
        bookstore.setOrderID(bookstore.generateOrderID());

        //打印出书的订单
        bookstore.orderConfirmation(bookstore.selectBook);
    }
}
