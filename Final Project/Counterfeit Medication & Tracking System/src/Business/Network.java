/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Roles.Role;
import java.util.ArrayList;

/**
 *
 * @author srush
 */
public class Network extends Enterprise {

    private int networkID;
    private String networkName;
    public static int count = 0;
    EnterpriseDirectory enterpriseDirectory;
    TransactionHistory transactionHistory;

    public Network() {

        super("Network Management");
        count++;
        networkID = count;
        enterpriseDirectory = new EnterpriseDirectory();
         transactionHistory=new TransactionHistory();
    }

    public EnterpriseDirectory getEnterpriseDirectory() {
        return enterpriseDirectory;
    }

    public int getNetworkID() {
        return networkID;
    }

    public void setNetworkID(int networkID) {
        this.networkID = networkID;
    }

    public String getNetworkName() {
        return networkName;
    }

    public void setNetworkName(String networkName) {
        this.networkName = networkName;
    }

    public String toString() {
        return networkName;
    }

    public TransactionHistory getTransactionHistory() {
        return transactionHistory;
    }

    public void setTransactionHistory(TransactionHistory transactionHistory) {
        this.transactionHistory = transactionHistory;
    }

   
    @Override
    public ArrayList<Role> getSupportedRoles() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
