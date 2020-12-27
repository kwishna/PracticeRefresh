package test.java.Tools;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.DatabaseMetaData;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;

public class FillioLearn {

    public static void main(String[] args) throws FilloException {

        Fillo f = new Fillo();
        Connection conn = f.getConnection(System.getProperty("user.dir")+"\\TestDataNew.xlsx");
//        DatabaseMetaData meta = conn.getMetaData();
//        System.out.println(meta.getTableNames());

        Recordset set = conn.executeQuery("SELECT * FROM GB");

    }
}
