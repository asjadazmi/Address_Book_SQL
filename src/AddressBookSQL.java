#UC1
        #--------Ability to create database-----------------
        create database Address_Book;
        use Address_Book;

        #UC2
        #-----------ability to create table------------------
        create table Address_Book_Table(firstName varchar(12) ,
        lastName varchar(15) , address varchar(50),city varchar(10),
        state varchar(15), zip int(15) , phoneNumber int(15) , email varchar(50));

        #UC3

        #-------------Ability to insert new contact------------
        insert into Address_Book_Table values("Asjad","Azmi","Madiwala","Benglore","karnatka",65008,87488,"asjad@gmail.com");
        insert into Address_Book_Table values("Owais","Arsalan","Maango","Jamshedpur","jharkhan",45008,95077,"owais@gmail.com");
        insert into Address_Book_Table values("Adeeb","Husnain","Marutinagar","chennai","Tamilnadu",34568,95033,"adeeb@gmail.com");

        #UC4
        #-------------------Ability to update the contact------------
        update Address_Book_Table SET state = "AndhraPardesh" where firstName="Adeeb";

        #UC5
        #-----------------------Ability to delete contact-------------
        delete from Address_Book_Table where firstName = "Adeeb";

        #UC6
        #----------------------Ability to retrive using city or state
        select * from Address_Book_Table where city="Benglore" or state="karnatka";

        #UC 7
        #------------------Size of address book by city or state---------
        select COUNT(firstName) from Address_Book_Table where city = "Benglore" or state = 'karnatka';

        #UC8
        #----------------------Sorted person name by city
        #--------------in ascending order---------
        select city , firstName from Address_Book_Table ORDER BY city ASC;
        #------------------in descending order---------------
        select city , firstName from Address_Book_Table ORDER BY city desc;

        #UC9

        #------------------ Ability to identify each Address Book with name and type

        ALTER TABLE Address_Book_Table
        ADD type varchar(50);

        update Address_Book_Table set type = "relative" where firstName = "Owais";
        select *from Address_Book_Table;

        #UC10
        #------------------Ability to get number of contact persons i.e. count by type----

        select COUNT(firstName) from Address_Book_Table;

        #UC11


        insert into Address_Book values("athar","azmi","kurma","Indore","MadhyaPardesh",4545,9875,"athar@gmail.com","brother");

