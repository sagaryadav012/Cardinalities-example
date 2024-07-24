Cardinality represents the relation between two entities. There are 3 types of raltions.
1.OneToOne
2.OneToMany or ManyToOne
3.ManyToOne

OneToOne Mapping :- We can add any of the id in other table.
Scenario 1: Creates wife_id in Husband table.
class Husband{
    @OneToOne
    Wife wife;
}
class Wife{
}

Scenario 2: Creates husband_id in wife table.
class Husband{
}
class Wife{
    @OneToOne
    Husband husband;
}

Scenario 3: Creates wife_id in Husband table as well as creates husband_id in Wife table.
class Husband{
    @OneToOne
    Wife wife;
}
class Wife{
    @OneToOne
    Husband husband;
}

Scenario 4: It creates husband_id in Wife table.
class Husband{
    @OneToOne(mappedBy = "husband") // It indicates mapping is done by husband in Wife so don't add wife_id in Husband
    Wife wife;
}
class Wife{
    @OneToOne
    Husband husband;
}

OneToMany or ManyToOne :
-> In this we put one side on m side. For example one product has one category and one category has
   many products. From category perspective it is 1 : M and From product perspective it is M : 1.

Scenario 1 : Creates category_id in Product table.
class Category{

}
class Product{
    @ManyToOne
    Category category;
}

Scenario 2 : Creates new mapping table.
class Category{
    @OneToMany
    List<Product> products;
}
class Product{

}

Scenario 3 : Creates new mapping table as well as adds category_id in Product table.
             It leads to redundancy.
class Category{
    @OneToMany
    List<Product> products;
}
class Product{
   @ManyToOne
   Category category;
}


Scenario 4 : Creates category_id in product table.
class Category{
    @OneToMany(mappedBy = "category") // It tells mapping is done, so don't create new table
    List<Product> products;
}
class Product{
   @ManyToOne
   Category category;
}

ManyToMany : For example a product can have multiple tags like smartphone, ApplePhone, Costly.
And as well a Tag can have multiple products like smartPhone is Redmi, Vivo, ApplePhone.
So here relation between Product and Tag is many to many, so new mapping table will be created.


Scenario 1 : Creates new mapping table product_tags
class Product{
    @ManyToMany
    List<Tag> tags;
}
class Tag{
}

Scenario 2 : Creates new mapping table tag_products.
class Product{
}
class Tag{
    @ManyToMany
    List<Product> products;
}

Scenario 3 : Creates two mapping tables product_tags and tag_products. It leads to redundancy.
class Product{
    @ManyToMany
    List<Tag> tags;
}
class Tag{
    @ManyToMany
    List<Product> products;
}

Scenario 4 : Creates only one mapping table. that is tag_products.
class Product{
    @ManyToMany(mappedBy = "products")
    List<Tag> tags;
}
class Tag{
    @ManyToMany
    List<Product> products;
}