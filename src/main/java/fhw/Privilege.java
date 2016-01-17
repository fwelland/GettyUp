package fhw;

import java.util.Arrays;
import lombok.Getter;
import static fhw.PrivilegeCategory.CRUD;

@Getter
public enum Privilege
{
    ViewAccount(1, "Display Accounts", PrivilegeCategory.VIEW),
    EditAccount(2, "Create, Edit, and Delete Accounts", PrivilegeCategory.CRUD),
    ViewTransaction(4, "Display Transactions", PrivilegeCategory.VIEW),
    EditTransaction(5,"Create, Edit, and Delete Transactions", PrivilegeCategory.CRUD);

    private Integer id;
    private String description;
    private PrivilegeCategory category;

    Privilege(Integer eyeD, String desc, PrivilegeCategory cat)
    {
        id = eyeD;
        description = desc;
        category = cat;
    }

    public Boolean isCrudPrivilege()
    {
        return(Arrays.stream(values()).filter( p -> p.category == CRUD).anyMatch(p -> p == this));
    }
}
